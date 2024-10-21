/*
 * Copyright 2024 B2i Healthcare, https://b2ihealthcare.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.fhir.r4b.operations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.r4b.model.Parameters;
import org.hl7.fhir.r4b.model.Parameters.ParametersParameterComponent;
import org.hl7.fhir.r4b.model.Resource;
import org.hl7.fhir.r4b.model.StringType;

import com.b2international.fhir.operations.OperationParametersFactory;

public abstract class InputParametersTest<T extends BaseParameters> {

	private final OperationParametersFactory factory;
	
	protected InputParametersTest(OperationParametersFactory factory) {
		this.factory = factory;
	}
	
	@SuppressWarnings("unchecked")
	protected T createFromResource(Resource parameters) {
		return (T) factory.create((Parameters) parameters, true);
	}
	
	protected void assertInvalidParameterThrows(Resource parameters) {
		Parameters invalidParameters = ((Parameters) parameters).copy().addParameter("invalidKey", "invalidValue");
		FHIRFormatError formatError = assertThrows(FHIRFormatError.class, () -> createFromResource(invalidParameters));
		assertThat(formatError).hasMessageContaining("invalidKey");
	}
	
	protected void assertInvalidPartThrows(Resource parameters) {
		Parameters invalidParameters = ((Parameters) parameters).copy();
		
		ParametersParameterComponent invalidPartParent = invalidParameters.addParameter()
			.setName("invalidPart");
		ParametersParameterComponent partA = invalidPartParent.addPart();
		ParametersParameterComponent partB = invalidPartParent.addPart();
		
		partA.setName("nameA")
			.setValue(new StringType("valueA"));
		partB.setName("nameB")
			.setValue(new StringType("valueB"));
		
		FHIRFormatError formatError = assertThrows(FHIRFormatError.class, () -> createFromResource(invalidParameters));
		assertThat(formatError)
			.hasMessageContaining("invalidPart.nameA")
			.hasMessageContaining("invalidPart.nameB");
	}
}
