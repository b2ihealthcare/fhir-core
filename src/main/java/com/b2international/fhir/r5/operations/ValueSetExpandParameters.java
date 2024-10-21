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
 * This class represents a FHIR ValueSet$expand operation request in the R5 version.
 * 
 * @see <a href="https://hl7.org/fhir/R5/valueset-operation-expand.html">FHIR:ValueSet:Operations:expand</a>
 * 
 * @since 0.1
 */
public final class ValueSetExpandParameters extends BaseParameters {

	private static final String PARAM_URL = "url";
	private static final String PARAM_VALUE_SET = "valueSet";
	private static final String PARAM_VALUE_SET_VERSION = "valueSetVersion";
	private static final String PARAM_CONTEXT = "context";
	private static final String PARAM_CONTEXT_DIRECTION = "contextDirection";
	private static final String PARAM_FILTER = "filter";
	private static final String PARAM_DATE = "date";
	private static final String PARAM_OFFSET = "offset";
	private static final String PARAM_COUNT = "count";
	private static final String PARAM_INCLUDE_DESIGNATIONS = "includeDesignations";
	private static final String PARAM_DESIGNATION = "designation";
	private static final String PARAM_INCLUDE_DEFINITION = "includeDefinition";
	private static final String PARAM_ACTIVE_ONLY = "activeOnly";
	private static final String PARAM_USE_SUPPLEMENT = "useSupplement";
	private static final String PARAM_EXCLUDE_NESTED = "excludeNested";
	private static final String PARAM_EXCLUDE_NOT_FOR_UI = "excludeNotForUI";
	private static final String PARAM_EXCLUDE_POST_COORDINATED = "excludePostCoordinated";
	private static final String PARAM_DISPLAY_LANGUAGE = "displayLanguage";
	private static final String PARAM_PROPERTY = "property";
	private static final String PARAM_EXCLUDE_SYSTEM = "exclude-system";
	private static final String PARAM_SYSTEM_VERSION = "system-version";
	private static final String PARAM_CHECK_SYSTEM_VERSION = "check-system-version";
	private static final String PARAM_FORCE_SYSTEM_VERSION = "force-system-version";

	private static final String PARAM_AFTER = "after";
	private static final String PARAM_WITH_HISTORY_SUPPLEMENTS = "withHistorySupplements";

	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_URL,
		PARAM_VALUE_SET,
		PARAM_VALUE_SET_VERSION,
		PARAM_CONTEXT,
		PARAM_CONTEXT_DIRECTION,
		PARAM_FILTER,
		PARAM_DATE,
		PARAM_OFFSET,
		PARAM_COUNT,
		PARAM_INCLUDE_DESIGNATIONS,
		PARAM_DESIGNATION,
		PARAM_INCLUDE_DEFINITION,
		PARAM_ACTIVE_ONLY,
		PARAM_USE_SUPPLEMENT,
		PARAM_EXCLUDE_NESTED,
		PARAM_EXCLUDE_NOT_FOR_UI,
		PARAM_EXCLUDE_POST_COORDINATED,
		PARAM_DISPLAY_LANGUAGE,
		PARAM_PROPERTY,
		PARAM_EXCLUDE_SYSTEM,
		PARAM_SYSTEM_VERSION,
		PARAM_CHECK_SYSTEM_VERSION,
		PARAM_FORCE_SYSTEM_VERSION,
		
		PARAM_AFTER,
		PARAM_WITH_HISTORY_SUPPLEMENTS
	);

	public ValueSetExpandParameters() {
		super(new Parameters());
	}
	
	public ValueSetExpandParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue(PARAM_URL, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public ValueSet getValueSet() {
		return getParameterValue(PARAM_VALUE_SET, value -> (ValueSet) value.getResource());
	}
	
	public StringType getValueSetVersion() {
		return getParameterValue(PARAM_VALUE_SET_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public UriType getContext() {
		return getParameterValue(PARAM_CONTEXT, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public CodeType getContextDirection() {
		return getParameterValue(PARAM_CONTEXT_DIRECTION, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public StringType getFilter() {
		return getParameterValue(PARAM_FILTER, Parameters.ParametersParameterComponent::getValueStringType);
	}

	public DateTimeType getDate() {
		return getParameterValue(PARAM_DATE, Parameters.ParametersParameterComponent::getValueDateTimeType);
	}

	public IntegerType getOffset() {
		return getParameterValue(PARAM_OFFSET, Parameters.ParametersParameterComponent::getValueIntegerType);
	}

	public IntegerType getCount() {
		return getParameterValue(PARAM_COUNT, Parameters.ParametersParameterComponent::getValueIntegerType);
	}

	public BooleanType getIncludeDesignations() {
		return getParameterValue(PARAM_INCLUDE_DESIGNATIONS, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public List<StringType> getDesignation() {
		return getParameters(PARAM_DESIGNATION).stream().map(Parameters.ParametersParameterComponent::getValueStringType).toList();
	}

	public BooleanType getIncludeDefinition() {
		return getParameterValue(PARAM_INCLUDE_DEFINITION, Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getActiveOnly() {
		return getParameterValue(PARAM_ACTIVE_ONLY, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public List<CanonicalType> getUseSupplement() {
		return getParameters(PARAM_USE_SUPPLEMENT).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}

	public BooleanType getExcludeNested() {
		return getParameterValue(PARAM_EXCLUDE_NESTED, Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getExcludeNotForUI() {
		return getParameterValue(PARAM_EXCLUDE_NOT_FOR_UI, Parameters.ParametersParameterComponent::getValueBooleanType);
	}

	public BooleanType getExcludePostCoordinated() {
		return getParameterValue(PARAM_EXCLUDE_POST_COORDINATED, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public CodeType getDisplayLanguage() {
		return getParameterValue(PARAM_DISPLAY_LANGUAGE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public List<StringType> getProperty() {
		return getParameters(PARAM_PROPERTY).stream().map(Parameters.ParametersParameterComponent::getValueStringType).toList();
	}
	
	public List<CanonicalType> getExcludeSystem() {
		return getParameters(PARAM_EXCLUDE_SYSTEM).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getSystemVersion() {
		return getParameters(PARAM_SYSTEM_VERSION).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getCheckSystemVersion() {
		return getParameters(PARAM_CHECK_SYSTEM_VERSION).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}
	
	public List<CanonicalType> getForceSystemVersion() {
		return getParameters(PARAM_FORCE_SYSTEM_VERSION).stream().map(Parameters.ParametersParameterComponent::getValueCanonicalType).toList();
	}

	public ValueSetExpandParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}
	
	public ValueSetExpandParameters setUrl(UriType url) {
		addParameter(PARAM_URL, url);
		return this;
	}
	
	public ValueSetExpandParameters setValueSet(ValueSet valueSet) {
		if (valueSet != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent(PARAM_VALUE_SET).setResource(valueSet));
		}
		return this;
	}
	
	public ValueSetExpandParameters setValueSetVersion(String valueSetVersion) {
		return setValueSetVersion(new StringType(valueSetVersion));
	}
	
	public ValueSetExpandParameters setValueSetVersion(StringType valueSetVersion) {
		addParameter(PARAM_VALUE_SET_VERSION, valueSetVersion);
		return this;
	}
	
	public ValueSetExpandParameters setContext(String context) {
		return setContext(new UriType(context));
	}

	public ValueSetExpandParameters setContext(UriType context) {
		addParameter(PARAM_CONTEXT, context);
		return this;
	}
	
	public ValueSetExpandParameters setContextDirection(String contextDirection) {
		return setContextDirection(new CodeType(contextDirection));
	}
	
	public ValueSetExpandParameters setContextDirection(CodeType contextDirection) {
		addParameter(PARAM_CONTEXT_DIRECTION, contextDirection);
		return this;
	}
	
	public ValueSetExpandParameters setFilter(String filter) {
		return setFilter(new StringType(filter));
	}
	
	public ValueSetExpandParameters setFilter(StringType filter) {
		addParameter(PARAM_FILTER, filter);
		return this;
	}
	
	public ValueSetExpandParameters setDate(String date) {
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetExpandParameters setDate(Date date) {
		return setDate(new DateTimeType(date));
	}
	
	public ValueSetExpandParameters setDate(DateTimeType date) {
		addParameter(PARAM_DATE, date);
		return this;
	}
	
	public ValueSetExpandParameters setOffset(Integer offset) {
		return setOffset(new IntegerType(offset));
	}
	
	public ValueSetExpandParameters setOffset(IntegerType offset) {
		addParameter(PARAM_OFFSET, offset);
		return this;
	}
	
	public ValueSetExpandParameters setCount(Integer count) {
		return setCount(new IntegerType(count));
	}
	
	public ValueSetExpandParameters setCount(IntegerType count) {
		addParameter(PARAM_COUNT, count);
		return this;
	}
	
	public ValueSetExpandParameters setIncludeDesignations(Boolean includeDesignations) {
		return includeDesignations == null ? this : setIncludeDesignations(new BooleanType(includeDesignations));
	}
	
	public ValueSetExpandParameters setIncludeDesignations(BooleanType includeDesignations) {
		addParameter(PARAM_INCLUDE_DESIGNATIONS, includeDesignations);
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
			}).forEach(designationValue -> addParameter(PARAM_DESIGNATION, designationValue));
		}
		return this;
	}
	
	public ValueSetExpandParameters setIncludeDefinition(Boolean includeDefinition) {
		return setIncludeDefinition(new BooleanType(includeDefinition));
	}
	
	public ValueSetExpandParameters setIncludeDefinition(BooleanType includeDefinition) {
		addParameter(PARAM_INCLUDE_DEFINITION, includeDefinition);
		return this;
	}
	
	public ValueSetExpandParameters setActiveOnly(Boolean activeOnly) {
		return activeOnly == null ? this : setActiveOnly(new BooleanType(activeOnly));
	}
	
	public ValueSetExpandParameters setActiveOnly(BooleanType activeOnly) {
		addParameter(PARAM_ACTIVE_ONLY, activeOnly);
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
			}).forEach(useSupplement -> addParameter(PARAM_USE_SUPPLEMENT, useSupplement));
		}
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNested(Boolean excludeNested) {
		return excludeNested == null ? this : setExcludeNested(new BooleanType(excludeNested));
	}
	
	public ValueSetExpandParameters setExcludeNested(BooleanType excludeNested) {
		addParameter(PARAM_EXCLUDE_NESTED, excludeNested);
		return this;
	}
	
	public ValueSetExpandParameters setExcludeNotForUI(Boolean excludeNotForUI) {
		return excludeNotForUI == null ? this : setExcludeNotForUI(new BooleanType(excludeNotForUI));
	}
	
	public ValueSetExpandParameters setExcludeNotForUI(BooleanType excludeNotForUI) {
		addParameter(PARAM_EXCLUDE_NOT_FOR_UI, excludeNotForUI);
		return this;
	}
	
	public ValueSetExpandParameters setExcludePostCoordinated(Boolean excludePostCoordinated) {
		return excludePostCoordinated == null ? this : setExcludePostCoordinated(new BooleanType(excludePostCoordinated));
	}
	
	public ValueSetExpandParameters setExcludePostCoordinated(BooleanType excludePostCoordinated) {
		addParameter(PARAM_EXCLUDE_POST_COORDINATED, excludePostCoordinated);
		return this;
	}
	
	public ValueSetExpandParameters setDisplayLanguage(String displayLanguage) {
		return setDisplayLanguage(new CodeType(displayLanguage));
	}
	
	public ValueSetExpandParameters setDisplayLanguage(CodeType displayLanguage) {
		addParameter(PARAM_DISPLAY_LANGUAGE, displayLanguage);
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
			}).forEach(propertyparam -> addParameter(PARAM_PROPERTY, propertyparam));
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
					throw new IllegalArgumentException(String.format("'exclude-system' is not of canonical type. Got: ", es.getClass()));
				}
			}).forEach(excludeSystem -> addParameter(PARAM_EXCLUDE_SYSTEM, excludeSystem));
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
			}).forEach(systemVersion -> addParameter(PARAM_SYSTEM_VERSION, systemVersion));
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
			}).forEach(checkSystemVersion -> addParameter(PARAM_CHECK_SYSTEM_VERSION, checkSystemVersion));
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
			}).forEach(forceSystemVersion -> addParameter(PARAM_FORCE_SYSTEM_VERSION, forceSystemVersion));
		}
		return this;
	}
	
	// XXX Snowy specific parameters
	
	public StringType getAfter() {
		return getParameterValue(PARAM_AFTER, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public BooleanType getWithHistorySupplements() {
		return getParameterValue(PARAM_WITH_HISTORY_SUPPLEMENTS, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public ValueSetExpandParameters setAfter(String after) {
		return setAfter(new StringType(after));
	}
	
	public ValueSetExpandParameters setAfter(StringType after) {
		addParameter(PARAM_AFTER, after);
		return this;
	}
	
	public ValueSetExpandParameters setWithHistorySupplements(Boolean withHistorySupplements) {
		return withHistorySupplements == null ? this : setWithHistorySupplements(new BooleanType(withHistorySupplements));
	}
	
	public ValueSetExpandParameters setWithHistorySupplements(BooleanType withHistorySupplements) {
		addParameter(PARAM_WITH_HISTORY_SUPPLEMENTS, withHistorySupplements);
		return this;
	}
 
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

}
