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

import java.util.Date;
import java.util.SortedSet;

import org.hl7.fhir.r5.model.*;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1
 */
public class CodeSystemValidateCodeParameters extends BaseParameters {

	private static final String PARAM_URL = "url";
	private static final String PARAM_CODE_SYSTEM = "codeSystem";
	private static final String PARAM_CODE = "code";
	private static final String PARAM_VERSION = "version";
	private static final String PARAM_DISPLAY = "display";
	private static final String PARAM_CODING = "coding";
	private static final String PARAM_CODEABLE_CONCEPT = "codeableConcept";
	private static final String PARAM_DATE = "date";
	private static final String PARAM_ABSTRACT = "abstract";
	private static final String PARAM_DISPLAY_LANGUAGE = "displayLanguage";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_URL,
		PARAM_CODE_SYSTEM,
		PARAM_CODE,
		PARAM_VERSION,
		PARAM_DISPLAY,
		PARAM_CODING,
		PARAM_CODEABLE_CONCEPT,
		PARAM_DATE,
		PARAM_ABSTRACT,
		PARAM_DISPLAY_LANGUAGE
	);

	public CodeSystemValidateCodeParameters() {
		super(new Parameters());
	}
	
	public CodeSystemValidateCodeParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue(PARAM_URL, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public CodeSystem getCodeSystem() {
		return getParameterValue(PARAM_CODE_SYSTEM, parameter -> (CodeSystem) parameter.getResource());
	}
	
	public CodeType getCode() {
		return getParameterValue(PARAM_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}

	public Coding getCoding() {
		return getParameterValue(PARAM_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getCodeableConcept() {
		return getParameterValue(PARAM_CODEABLE_CONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public StringType getVersion() {
		return getParameterValue(PARAM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getDisplay() {
		return getParameterValue(PARAM_DISPLAY, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public DateTimeType getDate() {
		return getParameterValue(PARAM_DATE, Parameters.ParametersParameterComponent::getValueDateTimeType);
	}
	
	public BooleanType getAbstract() {
		return getParameterValue(PARAM_ABSTRACT, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public CodeType getDisplayLanguage() {
		return getParameterValue(PARAM_DISPLAY_LANGUAGE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public CodeSystemValidateCodeParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}

	public CodeSystemValidateCodeParameters setUrl(UriType url) {
		addParameter(PARAM_URL, url);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setCodeSystem(CodeSystem codeSystem) {
		if (codeSystem != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent(PARAM_CODE_SYSTEM).setResource(codeSystem));
		}
		return this;
	}
	
	public CodeSystemValidateCodeParameters setCode(String code) {
		return setCode(new CodeType(code));
	}

	public CodeSystemValidateCodeParameters setCode(CodeType code) {
		addParameter(PARAM_CODE, code);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setCoding(Coding coding) {
		addParameter(PARAM_CODING, coding);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter(PARAM_CODEABLE_CONCEPT, codeableConcept);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}

	public CodeSystemValidateCodeParameters setVersion(StringType version) {
		addParameter(PARAM_VERSION, version);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}

	public CodeSystemValidateCodeParameters setDisplay(StringType display) {
		addParameter(PARAM_DISPLAY, display);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setDate(String date) {
		return setDate(new DateTimeType(date));
	}
	
	public CodeSystemValidateCodeParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public CodeSystemValidateCodeParameters setDate(DateTimeType date) {
		addParameter(PARAM_DATE, date);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setAbstract(Boolean isAbstract) {
		return isAbstract == null ? this : setAbstract(new BooleanType(isAbstract));
	}
	
	public CodeSystemValidateCodeParameters setAbstract(BooleanType isAbstract) {
		addParameter(PARAM_ABSTRACT, isAbstract);
		return this;
	}
	
	public CodeSystemValidateCodeParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public CodeSystemValidateCodeParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter(PARAM_DISPLAY_LANGUAGE, displayLanguage);
		return this;
	}
	
	// Extractors that extract information from multiple parameters depending on which one they have value
	
	public String extractUrl() {
		if (getUrl() != null) {
			return getUrl().getValue();
		} else if (getCoding() != null) {
			return getCoding().getSystem();
		} else {
			return null;
		}
	}
	
	public String extractVersion() {
		if (getVersion() != null) {
			return getVersion().getValue();
		} else if (getCoding() != null) {
			return getCoding().getVersion();
		} else {
			return null;
		}
	}

	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

}
