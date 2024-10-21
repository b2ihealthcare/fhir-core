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
import java.util.List;
import java.util.SortedSet;

import org.hl7.fhir.r5.model.*;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1
 */
public class ValueSetValidateCodeParameters extends BaseParameters {

	private static final String PARAM_URL = "url";
	private static final String PARAM_CONTEXT = "context";
	private static final String PARAM_VALUE_SET = "valueSet";
	private static final String PARAM_VALUE_SET_VERSION = "valueSetVersion";
	private static final String PARAM_CODE = "code";
	private static final String PARAM_SYSTEM = "system";
	private static final String PARAM_SYSTEM_VERSION = "systemVersion";
	private static final String PARAM_DISPLAY = "display";
	private static final String PARAM_CODING = "coding";
	private static final String PARAM_CODEABLE_CONCEPT = "codeableConcept";
	private static final String PARAM_DATE = "date";
	private static final String PARAM_ABSTRACT = "abstract";
	private static final String PARAM_DISPLAY_LANGUAGE = "displayLanguage";
	private static final String PARAM_USE_SUPPLEMENT = "useSupplement";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_URL,
		PARAM_CONTEXT,
		PARAM_VALUE_SET,
		PARAM_VALUE_SET_VERSION,
		PARAM_CODE,
		PARAM_SYSTEM,
		PARAM_SYSTEM_VERSION,
		PARAM_DISPLAY,
		PARAM_CODING,
		PARAM_CODEABLE_CONCEPT,
		PARAM_DATE,
		PARAM_ABSTRACT,
		PARAM_DISPLAY_LANGUAGE,
		PARAM_USE_SUPPLEMENT
	);

	public ValueSetValidateCodeParameters() {
		super(new Parameters());
	}
	
	public ValueSetValidateCodeParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue(PARAM_URL, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public UriType getContext() {
		return getParameterValue(PARAM_CONTEXT, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public ValueSet getValueSet() {
		return getParameterValue(PARAM_VALUE_SET, value -> (ValueSet) value.getResource());
	}
	
	public StringType getValueSetVersion() {
		return getParameterValue(PARAM_VALUE_SET_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeType getCode() {
		return getParameterValue(PARAM_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue(PARAM_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType); 
	}
	
	public StringType getSystemVersion() {
		return getParameterValue(PARAM_SYSTEM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getDisplay() {
		return getParameterValue(PARAM_DISPLAY, Parameters.ParametersParameterComponent::getValueStringType);
	}

	public Coding getCoding() {
		return getParameterValue(PARAM_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getCodeableConcept() {
		return getParameterValue(PARAM_CODEABLE_CONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}

	public DateTimeType getDate() {
		return getParameterValue(PARAM_DATE, Parameters.ParametersParameterComponent::getValueDateTimeType);
	}
	
	public BooleanType getIsAbstract() {
		return getParameterValue(PARAM_ABSTRACT, Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public CodeType getDisplayLanguage() {
		return getParameterValue(PARAM_DISPLAY_LANGUAGE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public List<CanonicalType> getUseSupplement() {
		return getParameters(PARAM_USE_SUPPLEMENT).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}

	public ValueSetValidateCodeParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}

	public ValueSetValidateCodeParameters setUrl(UriType url) {
		addParameter(PARAM_URL, url);
		return this;
	}
	
	public ValueSetValidateCodeParameters setContext(String context) {
		return setContext(new UriType(context));
	}
	
	public ValueSetValidateCodeParameters setContext(UriType context) {
		addParameter(PARAM_CONTEXT, context);
		return this;
	}
	
	public ValueSetValidateCodeParameters setValueSet(ValueSet valueSet) {
		if (valueSet != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent(PARAM_VALUE_SET).setResource(valueSet));
		}
		return this;
	}
	
	public ValueSetValidateCodeParameters setValueSetVersion(String valueSetVersion) {
		return setValueSetVersion(new StringType(valueSetVersion));
	}
	
	public ValueSetValidateCodeParameters setValueSetVersion(StringType valueSetVersion) {
		addParameter(PARAM_VALUE_SET_VERSION, valueSetVersion);
		return this;
	}
	
	public ValueSetValidateCodeParameters setCode(String code) {
		return setCode(new CodeType(code));
	}

	public ValueSetValidateCodeParameters setCode(CodeType code) {
		addParameter(PARAM_CODE, code);
		return this;
	}
	
	public ValueSetValidateCodeParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public ValueSetValidateCodeParameters setSystem(UriType system) {
		addParameter(PARAM_SYSTEM, system);
		return this;
	}
	
	public ValueSetValidateCodeParameters setSystemVersion(String systemVersion) {
		return setSystemVersion(new StringType(systemVersion));
	}
	
	public ValueSetValidateCodeParameters setSystemVersion(StringType systemVersion) {
		addParameter(PARAM_SYSTEM_VERSION, systemVersion);
		return this;
	}
	
	public ValueSetValidateCodeParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}

	public ValueSetValidateCodeParameters setDisplay(StringType display) {
		addParameter(PARAM_DISPLAY, display);
		return this;
	}
	
	public ValueSetValidateCodeParameters setCoding(Coding coding) {
		addParameter(PARAM_CODING, coding);
		return this;
	}
	
	public ValueSetValidateCodeParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter(PARAM_CODEABLE_CONCEPT, codeableConcept);
		return this;
	}
	
	public ValueSetValidateCodeParameters setDate(String date) {
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetValidateCodeParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetValidateCodeParameters setDate(DateTimeType date) {
		addParameter(PARAM_DATE, date);
		return this;
	}
	
	public ValueSetValidateCodeParameters setAbstract(Boolean isAbstract) {
		return isAbstract == null ? this : setAbstract(new BooleanType(isAbstract));
	}
	
	public ValueSetValidateCodeParameters setAbstract(BooleanType isAbstract) {
		addParameter(PARAM_ABSTRACT, isAbstract);
		return this;
	}
	
	public ValueSetValidateCodeParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public ValueSetValidateCodeParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter(PARAM_DISPLAY_LANGUAGE, displayLanguage);
		return this;
	}
	
	public ValueSetValidateCodeParameters setUseSupplement(List<?> useSupplements) {
		if (useSupplements != null && !useSupplements.isEmpty()) {
			useSupplements.stream().map(u -> {
				if (u instanceof CanonicalType) {
					return (CanonicalType) u;
				} else if (u instanceof String) {
					return new CanonicalType((String) u);
				} else {
					throw new IllegalArgumentException(String.format("'useSupplement' is not of string type. Got: ", u.getClass()));
				}
			}).forEach(useSupplement -> addParameter(PARAM_USE_SUPPLEMENT, useSupplement));
		}
		return this;
	}
	
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

}
