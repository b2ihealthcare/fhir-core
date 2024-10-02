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

import org.hl7.fhir.r5.model.*;

/**
 * This class represents a FHIR ValueSet$expand operation request in the R5 version.
 * 
 * @see <a href="https://www.hl7.org/fhir/valueset-operations.html#expand">FHIR:ValueSet:Operations:expand</a>
 * 
 * @since 9.2
 */
public final class ValueSetExpandParameters extends BaseParameters {

	public ValueSetExpandParameters() {
		super(new Parameters());
	}
	
	public ValueSetExpandParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue("url", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public ValueSet getValueSet() {
		return getParameterValue("valueSet", value -> (ValueSet) value.getResource());
	}
	
	public StringType getValueSetVersion() {
		return getParameterValue("valueSetVersion", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public UriType getContext() {
		return getParameterValue("context", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public CodeType getContextDirection() {
		return getParameterValue("contextDirection", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public StringType getFilter() {
		return getParameterValue("filter", Parameters.ParametersParameterComponent::getValueStringType);
	}

	public DateType getDate() {
		return getParameterValue("date", Parameters.ParametersParameterComponent::getValueDateType);
	}

	public IntegerType getOffset() {
		return getParameterValue("offset", Parameters.ParametersParameterComponent::getValueIntegerType);
	}

	public IntegerType getCount() {
		return getParameterValue("count", Parameters.ParametersParameterComponent::getValueIntegerType);
	}

	public BooleanType getIncludeDesignations() {
		return getParameterValue("includeDesignations", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public List<StringType> getDesignation() {
		return getParameters("designation").stream().map(Parameters.ParametersParameterComponent::getValueStringType).toList();
	}

	public BooleanType getIncludeDefinition() {
		return getParameterValue("includeDefinition", Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getActiveOnly() {
		return getParameterValue("activeOnly", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public List<CanonicalType> getUseSupplement() {
		return getParameters("useSupplement").stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}

	public BooleanType getExcludeNested() {
		return getParameterValue("excludeNested", Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getExcludeNotForUI() {
		return getParameterValue("excludeNotForUI", Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getExcludePostCoordinated() {
		return getParameterValue("excludePostCoordinated", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public CodeType getDisplayLanguage() {
		return getParameterValue("displayLanguage", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public List<StringType> getProperty() {
		return getParameters("property").stream().map(Parameters.ParametersParameterComponent::getValueStringType).toList();
	}
	
	public List<CanonicalType> getExcludeSystem() {
		return getParameters("exclude-system").stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getSystemVersion() {
		return getParameters("system-version").stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getCheckSystemVersion() {
		return getParameters("check-system-version").stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getForceSystemVersion() {
		return getParameters("force-system-version").stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}

	public ValueSetExpandParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}
	
	public ValueSetExpandParameters setUrl(UriType url) {
		addParameter("url", url);
		return this;
	}
	
	public ValueSetExpandParameters setValueSet(ValueSet valueSet) {
		if (valueSet != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent("valueSet").setResource(valueSet));
		}
		return this;
	}
	
	public ValueSetExpandParameters setValueSetVersion(String valueSetVersion) {
		return setValueSetVersion(new StringType(valueSetVersion));
	}
	
	public ValueSetExpandParameters setValueSetVersion(StringType valueSetVersion) {
		addParameter("valueSetVersion", valueSetVersion);
		return this;
	}
	
	public ValueSetExpandParameters setContext(String context) {
		return setContext(new UriType(context));
	}

	public ValueSetExpandParameters setContext(UriType context) {
		addParameter("context", context);
		return this;
	}
	
	public ValueSetExpandParameters setContextDirection(String contextDirection) {
		return setContextDirection(new CodeType(contextDirection));
	}
	
	public ValueSetExpandParameters setContextDirection(CodeType contextDirection) {
		addParameter("contextDirection", contextDirection);
		return this;
	}
	
	public ValueSetExpandParameters setFilter(String filter) {
		return setFilter(new StringType(filter));
	}
	
	public ValueSetExpandParameters setFilter(StringType filter) {
		addParameter("filter", filter);
		return this;
	}
	
	public ValueSetExpandParameters setDate(String date) {
		return setDate(new DateType(date));
	}
	
	public ValueSetExpandParameters setDate(Date date) {
		return setDate(new DateType(date));
	}
	
	public ValueSetExpandParameters setDate(DateType date) {
		addParameter("date", date);
		return this;
	}
	
	public ValueSetExpandParameters setOffset(Integer offset) {
		return setOffset(new IntegerType(offset));
	}
	
	public ValueSetExpandParameters setOffset(IntegerType offset) {
		addParameter("offset", offset);
		return this;
	}
	
	public ValueSetExpandParameters setCount(Integer count) {
		return setCount(new IntegerType(count));
	}
	
	public ValueSetExpandParameters setCount(IntegerType count) {
		addParameter("count", count);
		return this;
	}
	
	public ValueSetExpandParameters setIncludeDesignations(Boolean includeDesignations) {
		return includeDesignations == null ? this : setIncludeDesignations(new BooleanType(includeDesignations));
	}
	
	public ValueSetExpandParameters setIncludeDesignations(BooleanType includeDesignations) {
		addParameter("includeDesignations", includeDesignations);
		return this;
	}
	
	public ValueSetExpandParameters setDesignation(List<?> designation) {
		if (designation != null && !designation.isEmpty()) {
			designation.stream().map(d -> {
				if (d instanceof StringType) {
					return (StringType) d;
				} else if (d instanceof String) {
					return new StringType((String) d);
				} else {
					throw new IllegalArgumentException(String.format("'designation' is not of string type. Got: ", d.getClass()));
				}
			}).forEach(designationValue -> addParameter("designation", designationValue));
		}
		return this;
	}
	
	public ValueSetExpandParameters setIncludeDefinition(Boolean includeDefinition) {
		return setIncludeDefinition(new BooleanType(includeDefinition));
	}
	
	public ValueSetExpandParameters setIncludeDefinition(BooleanType includeDefinition) {
		addParameter("includeDefinition", includeDefinition);
		return this;
	}
	
	public ValueSetExpandParameters setActiveOnly(Boolean activeOnly) {
		return activeOnly == null ? this : setActiveOnly(new BooleanType(activeOnly));
	}
	
	public ValueSetExpandParameters setActiveOnly(BooleanType activeOnly) {
		addParameter("activeOnly", activeOnly);
		return this;
	}
	
	public ValueSetExpandParameters setUseSupplement(List<?> useSupplements) {
		if (useSupplements != null && !useSupplements.isEmpty()) {
			useSupplements.stream().map(u -> {
				if (u instanceof CanonicalType) {
					return (CanonicalType) u;
				} else if (u instanceof String) {
					return new CanonicalType((String) u);
				} else {
					throw new IllegalArgumentException(String.format("'useSupplement' is not of string type. Got: ", u.getClass()));
				}
			}).forEach(useSupplement -> addParameter("useSupplement", useSupplement));
		}
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNested(Boolean excludeNested) {
		return excludeNested == null ? this : setExcludeNested(new BooleanType(excludeNested));
	}
	
	public ValueSetExpandParameters setExcludeNested(BooleanType excludeNested) {
		addParameter("excludeNested", excludeNested);
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNestedForUI(Boolean excludeNestedForUI) {
		return excludeNestedForUI == null ? this : setExcludeNestedForUI(new BooleanType(excludeNestedForUI));
	}
	
	public ValueSetExpandParameters setExcludeNestedForUI(BooleanType excludeNestedForUI) {
		addParameter("excludeNestedForUI", excludeNestedForUI);
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNestedPostCoordinated(Boolean excludeNestedPostCoordinated) {
		return excludeNestedPostCoordinated == null ? this : setExcludeNestedPostCoordinated(new BooleanType(excludeNestedPostCoordinated));
	}
	
	public ValueSetExpandParameters setExcludeNestedPostCoordinated(BooleanType excludeNestedPostCoordinated) {
		addParameter("excludeNestedPostCoordinated", excludeNestedPostCoordinated);
		return this;
	}
	
	public ValueSetExpandParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public ValueSetExpandParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter("displayLanguage", displayLanguage);
		return this;
	}
	
	public ValueSetExpandParameters setProperty(List<?> property) {
		if (property != null && !property.isEmpty()) {
			property.stream().map(prop -> {
				if (prop instanceof StringType) {
					return (StringType) prop;
				} else if (prop instanceof String) {
					return new StringType((String) prop);
				} else {
					throw new IllegalArgumentException(String.format("'property' is not of string type. Got: ", prop.getClass()));
				}
			}).forEach(propertyparam -> addParameter("designation", propertyparam));
		}
		return this;
	}
	
	public ValueSetExpandParameters setExcludeSystem(List<?> excludeSystems) {
		if (excludeSystems != null && !excludeSystems.isEmpty()) {
			excludeSystems.stream().map(es -> {
				if (es instanceof CanonicalType) {
					return (CanonicalType) es;
				} else if (es instanceof String) {
					return new CanonicalType((String) es);
				} else {
					throw new IllegalArgumentException(String.format("'exclude-system' is not of string type. Got: ", es.getClass()));
				}
			}).forEach(excludeSystem -> addParameter("exclude-system", excludeSystem));
		}
		return this;
	}
	
	public ValueSetExpandParameters setSystemVersion(List<?> systemVersions) {
		if (systemVersions != null && !systemVersions.isEmpty()) {
			systemVersions.stream().map(sv -> {
				if (sv instanceof CanonicalType) {
					return (CanonicalType) sv;
				} else if (sv instanceof String) {
					return new CanonicalType((String) sv);
				} else {
					throw new IllegalArgumentException(String.format("'system-version' is not of string type. Got: ", sv.getClass()));
				}
			}).forEach(systemVersion -> addParameter("system-version", systemVersion));
		}
		return this;
	}
	
	public ValueSetExpandParameters setCheckSystemVersion(List<?> checkSystemVersions) {
		if (checkSystemVersions != null && !checkSystemVersions.isEmpty()) {
			checkSystemVersions.stream().map(csv -> {
				if (csv instanceof CanonicalType) {
					return (CanonicalType) csv;
				} else if (csv instanceof String) {
					return new CanonicalType((String) csv);
				} else {
					throw new IllegalArgumentException(String.format("'check-system-version' is not of string type. Got: ", csv.getClass()));
				}
			}).forEach(checkSystemVersion -> addParameter("check-system-version", checkSystemVersion));
		}
		return this;
	}
	
	public ValueSetExpandParameters setForceSystemVersion(List<?> forceSystemVersions) {
		if (forceSystemVersions != null && !forceSystemVersions.isEmpty()) {
			forceSystemVersions.stream().map(fsv -> {
				if (fsv instanceof CanonicalType) {
					return (CanonicalType) fsv;
				} else if (fsv instanceof String) {
					return new CanonicalType((String) fsv);
				} else {
					throw new IllegalArgumentException(String.format("'force-system-version' is not of string type. Got: ", fsv.getClass()));
				}
			}).forEach(forceSystemVersion -> addParameter("force-system-version", forceSystemVersion));
		}
		return this;
	}
	
	// XXX Snowy specific parameters
	
	public StringType getAfter() {
		return getParameterValue("after", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public BooleanType getWithHistorySupplements() {
		return getParameterValue("withHistorySupplements", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public ValueSetExpandParameters setAfter(String after) {
		return setAfter(new StringType(after));
	}
	
	public ValueSetExpandParameters setAfter(StringType after) {
		addParameter("after", after);
		return this;
	}
	
	public ValueSetExpandParameters setWithHistorySupplements(Boolean withHistorySupplements) {
		return withHistorySupplements == null ? this : setWithHistorySupplements(new BooleanType(withHistorySupplements));
	}
	
	public ValueSetExpandParameters setWithHistorySupplements(BooleanType withHistorySupplements) {
		addParameter("withHistorySupplements", withHistorySupplements);
		return this;
	}
 
}
