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
import java.util.Set;

import org.hl7.fhir.r4.model.codesystems.ConceptProperties;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent;

/**
 * @since 0.1
 */
public final class CodeSystemLookupParameters extends BaseParameters {
	
	public static final String PROPERTY_SYSTEM = "system";
	public static final String PROPERTY_NAME = "name";
	public static final String PROPERTY_VERSION = "version";
	public static final String PROPERTY_DISPLAY = "display";
	public static final String PROPERTY_DESIGNATION = "designation";
	public static final String PROPERTY_PARENT = ConceptProperties.PARENT.toCode();
	public static final String PROPERTY_CHILD = ConceptProperties.CHILD.toCode();
	
	//how to represent LANG.X here, just lang or lang.*?
	public static final Set<String> OFFICIAL_R5_PROPERTY_VALUES = Set.of(PROPERTY_SYSTEM, PROPERTY_NAME, PROPERTY_VERSION, PROPERTY_DISPLAY, PROPERTY_DESIGNATION, PROPERTY_PARENT, PROPERTY_CHILD);

	public CodeSystemLookupParameters() {
		this(new Parameters());
	}
	
	public CodeSystemLookupParameters(Parameters parameters) {
		super(parameters);
	}
	
	public CodeType getCode() {
		return getParameterValue("code", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue("system", Parameters.ParametersParameterComponent::getValueUriType);
	}

	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}

	public Coding getCoding() {
		return getParameterValue("coding", Parameters.ParametersParameterComponent::getValueCoding);
	}

	public DateTimeType getDate() {
		return getParameterValue("date", Parameters.ParametersParameterComponent::getValueDateTimeType);
	}

	public CodeType getDisplayLanguage() {
		return getParameterValue("displayLanguage", Parameters.ParametersParameterComponent::getValueCodeType);
	}

	public List<CodeType> getProperty() {
		return getParameters("property").stream().map(ParametersParameterComponent::getValueCodeType).toList();
	}
	
	public List<CanonicalType> getUseSupplement() {
		return getParameters("useSupplement").stream().map(ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public CodeSystemLookupParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public CodeSystemLookupParameters setCode(CodeType code) {
		addParameter("code", code);
		return this;
	}
	
	public CodeSystemLookupParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public CodeSystemLookupParameters setSystem(UriType system) {
		addParameter("system", system);
		return this;
	}
	
	public CodeSystemLookupParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemLookupParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public CodeSystemLookupParameters setCoding(Coding coding) {
		addParameter("coding", coding);
		return this;
	}
	
	public CodeSystemLookupParameters setDate(String date) {
		return setDate(new DateTimeType(date));
	}
	
	public CodeSystemLookupParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public CodeSystemLookupParameters setDate(DateTimeType date) {
		addParameter("date", date);
		return this;
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public CodeSystemLookupParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter("displayLanguage", displayLanguage);
		return this;
	}
	
	/**
	 * Helper to get access to the raw property values.
	 * @return the list of actual values instead of a list with wrapped {@link CodeType} instances.
	 */
	public List<String> getPropertyValues() {
		return getParameters("property").stream().map(ParametersParameterComponent::getValueCodeType).map(CodeType::getValueAsString).toList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CodeSystemLookupParameters setProperty(List propertyValues) {
		var list = propertyValues == null ? List.of() : propertyValues;
		list.forEach(propertyValue -> {
			if (propertyValue instanceof CodeType) {
				addParameter("property", (CodeType) propertyValue);
			} else if (propertyValue instanceof String) {
				addParameter("property", new CodeType((String) propertyValue));
			} else {
				throw new UnsupportedOperationException();
//				throw new BadRequestException(String.format("Value type '%s' is not supported in property values. Need to be String or StringType.", propertyValue));
			}
		});
		return this;
	}
	
	public boolean isPropertyRequested(String propertyValue) {
		return hasParameterWithValue("property", param -> param.getValueStringType().getValue(), propertyValue);
	}
	
	/**
	 * Helper to get access to the raw use supplement values.
	 * @return the list of actual values instead of a list with wrapped {@link CanonicalType} instances.
	 */
	public List<String> getUseSupplementValues() {
		return getParameters("useSupplement").stream().map(ParametersParameterComponent::getValueCanonicalType).map(CanonicalType::getValueAsString).toList();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CodeSystemLookupParameters setUseSupplement(List useSupplementValues) {
		var list = useSupplementValues == null ? List.of() : useSupplementValues;
		list.forEach(useSupplementValue -> {
			if (useSupplementValue instanceof CanonicalType) {
				addParameter("useSupplement", (CanonicalType) useSupplementValue);
			} else if (useSupplementValue instanceof String) {
				addParameter("useSupplement", new CanonicalType((String) useSupplementValue));
			} else {
				throw new UnsupportedOperationException();
//				throw new BadRequestException(String.format("Value type '%s' is not supported in property values. Need to be String or CanonicalType.", propertyValue));
			}
		});
		return this;
	}

	// Extractors that extract information from multiple parameters depending on which one they have value
	
	public String extractSystem() {
		if (getSystem() != null) {
			return getSystem().getValue();
		} else if (getCoding() != null && getCoding().getSystem() != null) {
			return getCoding().getSystem();
		} else {
			return null;
		}
	}
	
	public String extractSystemVersion() {
		if (getVersion() != null) {
			return getVersion().getValue();
		} else if (getCoding() != null && getCoding().getVersion() != null) {
			return getCoding().getVersion();
		} else {
			return null;
		}
	}
	
	public String extractCode() {
		if (getCode() != null) {
			return getCode().getCode();
		} else if (getCoding() != null) {
			return getCoding().getCode();
		} else {
			return null;
		}
	}

}
