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
package com.b2international.fhir.r4.operations;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.Parameters.ParametersParameterComponent;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	public CodeSystemLookupParameters() {
		this(new Parameters());
	}
	
	public CodeSystemLookupParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getCode() {
//		if (code != null) {
//			return code.getCodeValue();
//		} else if (coding != null) {
//			return coding.getCode().getCodeValue();
//		}
		return (CodeType) getParameterValue("code", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getSystem() {
//		if (system != null) {
//			return system.getUriValue();
//		} else if (coding != null && coding.getSystem() != null) {
//			return coding.getSystem().getUriValue();
//		}
		return (UriType) getParameterValue("system", Parameters.ParametersParameterComponent::getValue);
	}

	public StringType getVersion() {
		return (StringType) getParameterValue("version", Parameters.ParametersParameterComponent::getValue);
	}

	public Coding getCoding() {
		return (Coding) getParameterValue("coding", Parameters.ParametersParameterComponent::getValue);
	}

	public DateType getDate() {
		return (DateType) getParameterValue("date", Parameters.ParametersParameterComponent::getValue);
	}

	public CodeType getDisplayLanguage() {
		return (CodeType) getParameterValue("displayLanguage", Parameters.ParametersParameterComponent::getValue);
	}
	
	public CodeSystemLookupParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public CodeSystemLookupParameters setCode(CodeType code) {
		getParameters().addParameter("code", code);
		return this;
	}
	
	public CodeSystemLookupParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public CodeSystemLookupParameters setSystem(UriType system) {
		getParameters().addParameter("system", system);
		return this;
	}
	
	public CodeSystemLookupParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemLookupParameters setVersion(StringType version) {
		getParameters().addParameter("version", version);
		return this;
	}
	
	public CodeSystemLookupParameters setCoding(Coding coding) {
		getParameters().addParameter("coding", coding);
		return this;
	}
	
	public CodeSystemLookupParameters setDate(Date date) {
		return setDate(new DateType(date));
	}
	
	public CodeSystemLookupParameters setDate(DateType date) {
		getParameters().addParameter("date", date);
		return this;
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(CodeType displayLanguage) {
		getParameters().addParameter("displayLanguage", displayLanguage);
		return this;
	}

	public List<StringType> getProperty() {
		return getParameters("property").stream().map(ParametersParameterComponent::getValue).map(t -> (StringType) t).toList();
	}
	
	/**
	 * Helper to get access to the raw property values.
	 * @return the list of actual values instead of a list with wrapped {@link StringType} instances.
	 */
	@JsonIgnore
	public List<String> getPropertyValues() {
		return getParameters("property").stream().map(ParametersParameterComponent::getValue).map(t -> ((StringType) t).getValueNotNull()).toList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CodeSystemLookupParameters setProperty(List propertyValues) {
		var list = propertyValues == null ? List.of() : propertyValues;
		list.forEach(propertyValue -> {
			if (propertyValue instanceof StringType) {
				getParameters().addParameter("property", (StringType) propertyValue);
			} else if (propertyValue instanceof String) {
				getParameters().addParameter("property", new StringType((String) propertyValue));
			} else {
				throw new UnsupportedOperationException();
//				throw new BadRequestException(String.format("Value type '%s' is not supported in property values. Need to be String or StringType.", propertyValue));
			}
		});
		return this;
	}
	
	public boolean isPropertyRequested(String propertyValue) {
		return hasParameterWithValue("property", Parameters.ParametersParameterComponent::getValue, propertyValue);
	}

}
