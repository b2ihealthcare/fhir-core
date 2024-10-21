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

import java.util.List;
import java.util.SortedSet;

import org.hl7.fhir.r5.model.*;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1
 */
public class ConceptMapTranslateParameters extends BaseParameters {

	private static final String PARAM_URL = "url";
	private static final String PARAM_CONCEPT_MAP = "conceptMap";
	private static final String PARAM_CONCEPT_MAP_VERSION = "conceptMapVersion";
	private static final String PARAM_SOURCE_CODE = "sourceCode";
	private static final String PARAM_SYSTEM = "system";
	private static final String PARAM_VERSION = "version";
	private static final String PARAM_SOURCE_SCOPE = "sourceScope";
	private static final String PARAM_SOURCE_CODING = "sourceCoding";
	private static final String PARAM_SOURCE_CODEABLE_CONCEPT = "sourceCodeableConcept";
	private static final String PARAM_TARGET_CODE = "targetCode";
	private static final String PARAM_TARGET_CODING = "targetCoding";
	private static final String PARAM_TARGET_CODEABLECONCEPT = "targetCodeableConcept";
	private static final String PARAM_TARGET_SCOPE = "targetScope";
	private static final String PARAM_TARGET_SYSTEM = "targetSystem"; // camelCase fixed in R5
	private static final String PARAM_DEPENDENCY = "dependency";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_URL,
		PARAM_CONCEPT_MAP,
		PARAM_CONCEPT_MAP_VERSION,
		PARAM_SOURCE_CODE,
		PARAM_SYSTEM,
		PARAM_VERSION,
		PARAM_SOURCE_SCOPE,
		PARAM_SOURCE_CODING,
		PARAM_SOURCE_CODEABLE_CONCEPT,
		PARAM_TARGET_CODE,
		PARAM_TARGET_CODING,
		PARAM_TARGET_CODEABLECONCEPT,
		PARAM_TARGET_SCOPE,
		PARAM_TARGET_SYSTEM,
		PARAM_DEPENDENCY,
		String.join(".", PARAM_DEPENDENCY, Dependency.PARAM_ATTRIBUTE),
		String.join(".", PARAM_DEPENDENCY, Dependency.PARAM_VALUE)
	);

	public ConceptMapTranslateParameters() {
		super(new Parameters());
	}
	
	public ConceptMapTranslateParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue(PARAM_URL, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public ConceptMap getConceptMap() {
		return getParameterValue(PARAM_CONCEPT_MAP, value -> (ConceptMap) value.getResource());
	}
	
	public StringType getConceptMapVersion() {
		return getParameterValue(PARAM_CONCEPT_MAP_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeType getSourceCode() {
		return getParameterValue(PARAM_SOURCE_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue(PARAM_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue(PARAM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public UriType getSourceScope() {
		return getParameterValue(PARAM_SOURCE_SCOPE, Parameters.ParametersParameterComponent::getValueUriType);
	}

	public Coding getSourceCoding() {
		return getParameterValue(PARAM_SOURCE_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getSourceCodeableConcept() {
		return getParameterValue(PARAM_SOURCE_CODEABLE_CONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public CodeType getTargetCode() {
		return getParameterValue(PARAM_TARGET_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}

	public Coding getTargetCoding() {
		return getParameterValue(PARAM_TARGET_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getTargetCodeableConcept() {
		return getParameterValue(PARAM_TARGET_CODEABLECONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public UriType getTargetScope() {
		return getParameterValue(PARAM_TARGET_SCOPE, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public UriType getTargetSystem() {
		return getParameterValue(PARAM_TARGET_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public List<Dependency> getDependency() {
		return getParameters(PARAM_DEPENDENCY).stream().map(param -> new Dependency(param.getPart())).toList();
	}
	
	public ConceptMapTranslateParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}
	
	public ConceptMapTranslateParameters setUrl(UriType url) {
		addParameter(PARAM_URL, url);
		return this;
	}
	
	public ConceptMapTranslateParameters setConceptMap(ConceptMap conceptMap) {
		if (conceptMap != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent(PARAM_CONCEPT_MAP).setResource(conceptMap));
		}
		return this;
	}
	
	public ConceptMapTranslateParameters setConceptMapVersion(String conceptMapVersion) {
		return setConceptMapVersion(new StringType(conceptMapVersion));
	}
	
	public ConceptMapTranslateParameters setConceptMapVersion(StringType conceptMapVersion) {
		addParameter(PARAM_CONCEPT_MAP_VERSION, conceptMapVersion);
		return this;
	}
	
	public ConceptMapTranslateParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public ConceptMapTranslateParameters setSystem(UriType system) {
		addParameter(PARAM_SYSTEM, system);
		return this;
	}
	
	public ConceptMapTranslateParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public ConceptMapTranslateParameters setVersion(StringType version) {
		addParameter(PARAM_VERSION, version);
		return this;
	}

	public ConceptMapTranslateParameters setSourceCode(String sourceCode) {
		return setSourceCode(new CodeType(sourceCode));
	}
	
	public ConceptMapTranslateParameters setSourceCode(CodeType sourceCode) {
		addParameter(PARAM_SOURCE_CODE, sourceCode);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceCoding(Coding sourceCoding) {
		addParameter(PARAM_SOURCE_CODING, sourceCoding);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceCodeableConcept(CodeableConcept sourceCodeableConcept) {
		addParameter(PARAM_SOURCE_CODEABLE_CONCEPT, sourceCodeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceScope(String sourceScope) {
		return setSourceScope(new UriType(sourceScope));
	}
	
	public ConceptMapTranslateParameters setSourceScope(UriType sourceScope) {
		addParameter(PARAM_SOURCE_SCOPE, sourceScope);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCode(String targetCode) {
		return setTargetCode(new CodeType(targetCode));
	}
	
	public ConceptMapTranslateParameters setTargetCode(CodeType targetCode) {
		addParameter(PARAM_TARGET_CODE, targetCode);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCoding(Coding targetCoding) {
		addParameter(PARAM_TARGET_CODING, targetCoding);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCodeableConcept(CodeableConcept targetCodeableConcept) {
		addParameter(PARAM_TARGET_CODEABLECONCEPT, targetCodeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetScope(String targetScope) {
		return setTargetScope(new UriType(targetScope));
	}
	
	public ConceptMapTranslateParameters setTargetScope(UriType targetScope) {
		addParameter(PARAM_TARGET_SCOPE, targetScope);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetSystem(String targetSystem) {
		return setTargetSystem(new UriType(targetSystem));
	}
	
	public ConceptMapTranslateParameters setTargetSystem(UriType targetSystem) {
		addParameter(PARAM_TARGET_SYSTEM, targetSystem);
		return this;
	}
	
	public ConceptMapTranslateParameters setDependency(List<Dependency> dependencies) {
		if (dependencies == null) {
			return this;
		}
		
		dependencies.stream()
			.map(dependency -> new Parameters.ParametersParameterComponent().setName(PARAM_DEPENDENCY).setPart(dependency.getPart()))
			.forEach(getParameters()::addParameter);
		
		return this;
	}
	
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

	public static final class Dependency extends BasePart  {
		
		private static final String PARAM_ATTRIBUTE = "attribute";
		private static final String PARAM_VALUE = "value";

		public Dependency() {
			super(null);
		}
		
		public Dependency(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public final UriType getAttribute() {
			return getParameterValue(PARAM_ATTRIBUTE, Parameters.ParametersParameterComponent::getValueUriType);
		}
		
		public final DataType getValue() {
			return getParameterValue(PARAM_VALUE, Parameters.ParametersParameterComponent::getValue);
		}
		
		public Dependency setAttribute(String attribute) {
			return setAttribute(new UriType(attribute));
		}
		
		public Dependency setAttribute(UriType attribute) {
			addParameter(PARAM_ATTRIBUTE, attribute);
			return this;
		}
		
		public Dependency setValue(String value) {
			return setValue(new StringType(value));
		}
		
		public Dependency setValue(DataType value) {
			addParameter(PARAM_VALUE, value);
			return this;
		}
	}
}
