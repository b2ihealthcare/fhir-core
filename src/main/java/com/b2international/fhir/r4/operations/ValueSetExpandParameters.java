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

import org.hl7.fhir.r4.model.*;

/**
 * This class represents a FHIR ValueSet$expand operation request in the R5 version.
 * 
 * @see <a href="https://www.hl7.org/fhir/valueset-operations.html#expand">FHIR:ValueSet:Operations:expand</a>
 * 
 * @since 0.1
 */
public final class ValueSetExpandParameters extends BaseParameters {

	public ValueSetExpandParameters() {
		super(new Parameters());
	}
	
	public ValueSetExpandParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return (UriType) getParameterValue("url", Parameters.ParametersParameterComponent::getValue);
	}
	
	public ValueSet getValueSet() {
		return getParameterValue("valueSet", value -> (ValueSet) value.getResource());
	}
	
	public StringType getValueSetVersion() {
		return (StringType) getParameterValue("valueSetVersion", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getContext() {
		return (UriType) getParameterValue("context", Parameters.ParametersParameterComponent::getValue);
	}
	
	public CodeType getContextDirection() {
		return (CodeType) getParameterValue("contextDirection", Parameters.ParametersParameterComponent::getValue);
	}
	
	public StringType getFilter() {
		return (StringType) getParameterValue("filter", Parameters.ParametersParameterComponent::getValue);
	}

	public DateTimeType getDate() {
		return (DateTimeType) getParameterValue("date", Parameters.ParametersParameterComponent::getValue);
	}

	public IntegerType getOffset() {
		return (IntegerType) getParameterValue("offset", Parameters.ParametersParameterComponent::getValue);
	}

	public IntegerType getCount() {
		return (IntegerType) getParameterValue("count", Parameters.ParametersParameterComponent::getValue);
	}

	public BooleanType getIncludeDesignations() {
		return (BooleanType) getParameterValue("includeDesignations", Parameters.ParametersParameterComponent::getValue);
	}
	
	public List<StringType> getDesignation() {
		return getParameters("designation").stream().map(param -> {
			return (StringType) param.getValue();
		}).toList();
	}

	public BooleanType getIncludeDefinition() {
		return (BooleanType) getParameterValue("includeDefinition", Parameters.ParametersParameterComponent::getValue);
	}

	public BooleanType getActiveOnly() {
		return (BooleanType) getParameterValue("activeOnly", Parameters.ParametersParameterComponent::getValue);
	}
	
	public BooleanType getExcludeNested() {
		return (BooleanType) getParameterValue("excludeNested", Parameters.ParametersParameterComponent::getValue);
	}

	public BooleanType getExcludeNotForUI() {
		return (BooleanType) getParameterValue("excludeNotForUI", Parameters.ParametersParameterComponent::getValue);
	}

	public BooleanType getExcludePostCoordinated() {
		return (BooleanType) getParameterValue("excludePostCoordinated", Parameters.ParametersParameterComponent::getValue);
	}
	
	public CodeType getDisplayLanguage() {
		return (CodeType) getParameterValue("displayLanguage", Parameters.ParametersParameterComponent::getValue);
	}
	
	public List<CanonicalType> getExcludeSystem() {
		return getParameters("exclude-system").stream().map(param -> {
			return (CanonicalType) param.getValue();
		}).toList();
	}
	
	public List<CanonicalType> getSystemVersion() {
		return getParameters("system-version").stream().map(param -> {
			return (CanonicalType) param.getValue();
		}).toList();
	}
	
	public List<CanonicalType> getCheckSystemVersion() {
		return getParameters("check-system-version").stream().map(param -> {
			return (CanonicalType) param.getValue();
		}).toList();
	}
	
	public List<CanonicalType> getForceSystemVersion() {
		return getParameters("force-system-version").stream().map(param -> {
			return (CanonicalType) param.getValue();
		}).toList();
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
			getParameters().addParameter(new Parameters.ParametersParameterComponent().setName("valueSet").setResource(valueSet));
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
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetExpandParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetExpandParameters setDate(DateTimeType date) {
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
	
	public ValueSetExpandParameters setExcludeNested(Boolean excludeNested) {
		return excludeNested == null ? this : setExcludeNested(new BooleanType(excludeNested));
	}
	
	public ValueSetExpandParameters setExcludeNested(BooleanType excludeNested) {
		addParameter("excludeNested", excludeNested);
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNotForUI(Boolean excludeNotForUI) {
		return excludeNotForUI == null ? this : setExcludeNotForUI(new BooleanType(excludeNotForUI));
	}
	
	public ValueSetExpandParameters setExcludeNotForUI(BooleanType excludeNotForUI) {
		addParameter("excludeNotForUI", excludeNotForUI);
		return this;
	}
	
	public ValueSetExpandParameters setExcludePostCoordinated(Boolean excludePostCoordinated) {
		return excludePostCoordinated == null ? this : setExcludePostCoordinated(new BooleanType(excludePostCoordinated));
	}
	
	public ValueSetExpandParameters setExcludePostCoordinated(BooleanType excludePostCoordinated) {
		addParameter("excludePostCoordinated", excludePostCoordinated);
		return this;
	}
	
	public ValueSetExpandParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public ValueSetExpandParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter("displayLanguage", displayLanguage);
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
					throw new IllegalArgumentException(String.format("'exclude-system' is not of canonical type. Got: ", es.getClass()));
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
					throw new IllegalArgumentException(String.format("'system-version' is not of canonical type. Got: ", sv.getClass()));
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
					throw new IllegalArgumentException(String.format("'check-system-version' is not of canonical type. Got: ", csv.getClass()));
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
					throw new IllegalArgumentException(String.format("'force-system-version' is not of canonical type. Got: ", fsv.getClass()));
				}
			}).forEach(forceSystemVersion -> addParameter("force-system-version", forceSystemVersion));
		}
		return this;
	}
	
	// XXX Snowy specific parameters
	
	public StringType getAfter() {
		return (StringType) getParameterValue("after", Parameters.ParametersParameterComponent::getValue);
	}
	
	public BooleanType getWithHistorySupplements() {
		return (BooleanType) getParameterValue("withHistorySupplements", Parameters.ParametersParameterComponent::getValue);
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
