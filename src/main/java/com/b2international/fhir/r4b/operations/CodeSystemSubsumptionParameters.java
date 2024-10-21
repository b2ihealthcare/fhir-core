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

import java.util.SortedSet;

import org.hl7.fhir.r4b.model.*;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1
 */
public class CodeSystemSubsumptionParameters extends BaseParameters {

	private static final String PARAM_CODE_A = "codeA";
	private static final String PARAM_CODE_B = "codeB";
	private static final String PARAM_SYSTEM = "system";
	private static final String PARAM_VERSION = "version";
	private static final String PARAM_CODING_A = "codingA";
	private static final String PARAM_CODING_B = "codingB";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_CODE_A,
		PARAM_CODE_B,
		PARAM_SYSTEM,
		PARAM_VERSION,
		PARAM_CODING_A,
		PARAM_CODING_B
	);
	
	public CodeSystemSubsumptionParameters() {
		super(new Parameters());
	}
	
	public CodeSystemSubsumptionParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getCodeA() {
		return getParameterValue(PARAM_CODE_A, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public CodeType getCodeB() {
		return getParameterValue(PARAM_CODE_B, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue(PARAM_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue(PARAM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public Coding getCodingA() {
		return getParameterValue(PARAM_CODING_A, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public Coding getCodingB() {
		return getParameterValue(PARAM_CODING_B, Parameters.ParametersParameterComponent::getValueCoding);
	}

	public CodeSystemSubsumptionParameters setCodeA(String codeA) {
		return setCodeA(new CodeType(codeA));
	}
	
	public CodeSystemSubsumptionParameters setCodeA(CodeType codeA) {
		addParameter(PARAM_CODE_A, codeA);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodeB(String codeB) {
		return setCodeB(new CodeType(codeB));
	}
	
	public CodeSystemSubsumptionParameters setCodeB(CodeType codeB) {
		addParameter(PARAM_CODE_B, codeB);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public CodeSystemSubsumptionParameters setSystem(UriType system) {
		addParameter(PARAM_SYSTEM, system);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemSubsumptionParameters setVersion(StringType version) {
		addParameter(PARAM_VERSION, version);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodingA(Coding codingA) {
		addParameter(PARAM_CODING_A, codingA);
		return this;
	}
	
	public CodeSystemSubsumptionParameters setCodingB(Coding codingB) {
		addParameter(PARAM_CODING_B, codingB);
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
	
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}
	
}
