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

import org.hl7.fhir.r4.model.codesystems.ConceptSubsumptionOutcome;
import org.hl7.fhir.r4b.model.CodeType;
import org.hl7.fhir.r4b.model.Parameters;

/**
 * @since 9.2 
 */
public class CodeSystemSubsumptionResultParameters extends BaseParameters {

	public CodeSystemSubsumptionResultParameters() {
		this(new Parameters());
	}
	
	public CodeSystemSubsumptionResultParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getOutcome() {
		return getParameterValue("outcome", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public CodeSystemSubsumptionResultParameters setOutcome(ConceptSubsumptionOutcome outcome) {
		addParameter("outcome", new CodeType(outcome.toCode()));
		return this;
	}
	
	public static CodeSystemSubsumptionResultParameters equivalent() {
		return new CodeSystemSubsumptionResultParameters().setOutcome(ConceptSubsumptionOutcome.EQUIVALENT);
	}
	
	public static CodeSystemSubsumptionResultParameters subsumedBy() {
		return new CodeSystemSubsumptionResultParameters().setOutcome(ConceptSubsumptionOutcome.SUBSUMEDBY);
	}
	
	public static CodeSystemSubsumptionResultParameters subsumes() {
		return new CodeSystemSubsumptionResultParameters().setOutcome(ConceptSubsumptionOutcome.SUBSUMES);
	}
	
	public static CodeSystemSubsumptionResultParameters notSubsumed() {
		return new CodeSystemSubsumptionResultParameters().setOutcome(ConceptSubsumptionOutcome.NOTSUBSUMED);
	}

}
