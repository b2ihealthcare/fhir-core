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

import org.hl7.fhir.r4b.model.*;

/**
 * @since 0.1
 */
public class CodeSystemSubsumptionParameters extends BaseParameters {

	public CodeSystemSubsumptionParameters() {
		super(new Parameters());
	}
	
	public CodeSystemSubsumptionParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getCodeA() {
		return getParameterValue("codeA", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public CodeType getCodeB() {
		return getParameterValue("codeB", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue("system", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public Coding getCodingA() {
		return getParameterValue("codingA", Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public Coding getCodingB() {
		return getParameterValue("codingB", Parameters.ParametersParameterComponent::getValueCoding);
	}

	public CodeSystemSubsumptionParameters setCodeA(String codeA) {
		return setCodeA(new CodeType(codeA));
	}
	
	public CodeSystemSubsumptionParameters setCodeA(CodeType codeA) {
		addParameter("codeA", codeA);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodeB(String codeB) {
		return setCodeB(new CodeType(codeB));
	}
	
	public CodeSystemSubsumptionParameters setCodeB(CodeType codeB) {
		addParameter("codeB", codeB);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public CodeSystemSubsumptionParameters setSystem(UriType system) {
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
