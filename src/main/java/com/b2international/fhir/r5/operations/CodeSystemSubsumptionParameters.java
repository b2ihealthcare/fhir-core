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
package com.b2international.fhir.r5.operations;

import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.StringType;

/**
 * @since 9.2
 */
public class CodeSystemSubsumptionParameters extends BaseParameters {

	public CodeSystemSubsumptionParameters() {
		super(new Parameters());
	}
	
	public CodeSystemSubsumptionParameters(Parameters parameters) {
		super(parameters);
	}
	
	public StringType getSystem() {
		return getParameterValue("system", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getCodeA() {
		return getParameterValue("codeA", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getCodeB() {
		return getParameterValue("codeB", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public Coding getCodingA() {
		return getParameterValue("codingA", Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public Coding getCodingB() {
		return getParameterValue("codingB", Parameters.ParametersParameterComponent::getValueCoding);
	}

	public CodeSystemSubsumptionParameters setSystem(String system) {
		return setSystem(new StringType(system));
	}
	
	public CodeSystemSubsumptionParameters setSystem(StringType system) {
		addParameter("system", system);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemSubsumptionParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodeA(String codeA) {
		return setCodeA(new StringType(codeA));
	}
	
	public CodeSystemSubsumptionParameters setCodeA(StringType codeA) {
		addParameter("codeA", codeA);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodeB(String codeB) {
		return setCodeB(new StringType(codeB));
	}
	
	public CodeSystemSubsumptionParameters setCodeB(StringType codeB) {
		addParameter("codeB", codeB);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodingA(Coding codingA) {
		addParameter("codingA", codingA);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodingB(Coding codingB) {
		addParameter("codingB", codingB);
		return this;
	}
	
	// Extractors that extract information from multiple parameters depending on which one they have value
	
	public String extractSystem() {
		if (getSystem() != null) {
			return getSystem().getValue();
		} else if (getCodingA() != null && getCodingA().getSystem() != null) {
			return getCodingA().getSystem();
		} else if (getCodingB() != null && getCodingB().getSystem() != null) {
			return getCodingB().getSystem();
		} else {
			return null;
		}
	}
	
	public String extractSystemVersion() {
		if (getVersion() != null) {
			return getVersion().getValue();
		} else if (getCodingA() != null && getCodingA().getVersion() != null) {
			return getCodingA().getVersion();
		} else if (getCodingB() != null && getCodingB().getVersion() != null) {
			return getCodingB().getVersion();
		} else {
			return null;
		}
	}
	
}
