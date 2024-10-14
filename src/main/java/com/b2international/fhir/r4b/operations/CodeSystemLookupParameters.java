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

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import org.hl7.fhir.r4b.model.*;
import org.hl7.fhir.r4b.model.Parameters.ParametersParameterComponent;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1
 */
public final class CodeSystemLookupParameters extends BaseParameters {
	
	public static final String PROPERTY_SYSTEM = "system";
	public static final String PROPERTY_NAME = "name";
	public static final String PROPERTY_VERSION = "version";
	public static final String PROPERTY_DISPLAY = "display";
	public static final String PROPERTY_DESIGNATION = "designation";
	public static final String PROPERTY_PARENT = "parent";
	public static final String PROPERTY_CHILD = "child";
	
	//how to represent LANG.X here, just lang or lang.*?
	public static final Set<String> OFFICIAL_R5_PROPERTY_VALUES = Set.of(PROPERTY_SYSTEM, PROPERTY_NAME, PROPERTY_VERSION, PROPERTY_DISPLAY, PROPERTY_DESIGNATION, PROPERTY_PARENT, PROPERTY_CHILD);

	private static final String PARAM_CODE = "code";
	private static final String PARAM_SYSTEM = "system";
	private static final String PARAM_VERSION = "version";
	private static final String PARAM_CODING = "coding";
	private static final String PARAM_DATE = "date";
	private static final String PARAM_DISPLAY_LANGUAGE = "displayLanguage";
	private static final String PARAM_PROPERTY = "property";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_CODE,
		PARAM_SYSTEM,
		PARAM_VERSION,
		PARAM_CODING,
		PARAM_DATE,
		PARAM_DISPLAY_LANGUAGE,
		PARAM_PROPERTY
	);
	
	public CodeSystemLookupParameters() {
		this(new Parameters());
	}
	
	public CodeSystemLookupParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getCode() {
		return getParameterValue(PARAM_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue(PARAM_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}

	public StringType getVersion() {
		return getParameterValue(PARAM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}

	public Coding getCoding() {
		return getParameterValue(PARAM_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}

	public DateTimeType getDate() {
		return getParameterValue(PARAM_DATE, Parameters.ParametersParameterComponent::getValueDateTimeType);
	}

	public CodeType getDisplayLanguage() {
		return getParameterValue(PARAM_DISPLAY_LANGUAGE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public List<CodeType> getProperty() {
		return getParameters(PARAM_PROPERTY).stream().map(ParametersParameterComponent::getValueCodeType).toList();
	}
	
	public CodeSystemLookupParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public CodeSystemLookupParameters setCode(CodeType code) {
		getParameters().addParameter(PARAM_CODE, code);
		return this;
	}
	
	public CodeSystemLookupParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public CodeSystemLookupParameters setSystem(UriType system) {
		getParameters().addParameter(PARAM_SYSTEM, system);
		return this;
	}
	
	public CodeSystemLookupParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemLookupParameters setVersion(StringType version) {
		getParameters().addParameter(PARAM_VERSION, version);
		return this;
	}
	
	public CodeSystemLookupParameters setCoding(Coding coding) {
		getParameters().addParameter(PARAM_CODING, coding);
		return this;
	}
	
	public CodeSystemLookupParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public CodeSystemLookupParameters setDate(DateTimeType date) {
		getParameters().addParameter(PARAM_DATE, date);
		return this;
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(CodeType displayLanguage) {
		getParameters().addParameter(PARAM_DISPLAY_LANGUAGE, displayLanguage);
		return this;
	}
	
	/**
	 * Helper to get access to the raw property values.
	 * @return the list of actual values instead of a list with wrapped {@link StringType} instances.
	 */
	public List<String> getPropertyValues() {
		return getParameters(PARAM_PROPERTY).stream().map(ParametersParameterComponent::getValueStringType).map(StringType::getValue).toList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CodeSystemLookupParameters setProperty(List propertyValues) {
		var list = propertyValues == null ? List.of() : propertyValues;
		list.forEach(propertyValue -> {
			if (propertyValue instanceof StringType) {
				getParameters().addParameter(PARAM_PROPERTY, (StringType) propertyValue);
			} else if (propertyValue instanceof String) {
				getParameters().addParameter(PARAM_PROPERTY, new StringType((String) propertyValue));
			} else {
				throw new UnsupportedOperationException();
//				throw new BadRequestException(String.format("Value type '%s' is not supported in property values. Need to be String or StringType.", propertyValue));
			}
		});
		return this;
	}
	
	public boolean isPropertyRequested(String propertyValue) {
		return hasParameterWithValue(PARAM_PROPERTY, Parameters.ParametersParameterComponent::getValueStringType, propertyValue);
	}
	
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

}
