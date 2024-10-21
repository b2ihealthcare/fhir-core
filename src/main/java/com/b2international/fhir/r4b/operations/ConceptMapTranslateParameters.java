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

import java.util.List;
import java.util.SortedSet;

import org.hl7.fhir.r4b.model.*;

import com.google.common.collect.ImmutableSortedSet;

/**
 * @since 0.1 
 */
public class ConceptMapTranslateParameters extends BaseParameters {

	private static final String PARAM_URL = "url";
	private static final String PARAM_CONCEPT_MAP = "conceptMap";
	private static final String PARAM_CONCEPT_MAP_VERSION = "conceptMapVersion";
	private static final String PARAM_CODE = "code";
	private static final String PARAM_SYSTEM = "system";
	private static final String PARAM_VERSION = "version";
	private static final String PARAM_SOURCE = "source";
	private static final String PARAM_CODING = "coding";
	private static final String PARAM_CODEABLE_CONCEPT = "codeableConcept";
	private static final String PARAM_TARGET = "target";
	private static final String PARAM_TARGET_SYSTEM = "targetsystem";
	private static final String PARAM_DEPENDENCY = "dependency";
	private static final String PARAM_REVERSE = "reverse";
	
	private static final SortedSet<String> ACCEPTED_PARAMETER_NAMES = ImmutableSortedSet.of(
		PARAM_URL,
		PARAM_CONCEPT_MAP,
		PARAM_CONCEPT_MAP_VERSION,
		PARAM_CODE,
		PARAM_SYSTEM,
		PARAM_VERSION,
		PARAM_SOURCE,
		PARAM_CODING,
		PARAM_CODEABLE_CONCEPT,
		PARAM_TARGET,
		PARAM_TARGET_SYSTEM,
		PARAM_DEPENDENCY,
		String.join(".", PARAM_DEPENDENCY, Dependency.PARAM_ELEMENT),
		String.join(".", PARAM_DEPENDENCY, Dependency.PARAM_CONCEPT),
		PARAM_REVERSE
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
	
	public StringType getCode() {
		return getParameterValue(PARAM_CODE, Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSystem() {
		return getParameterValue(PARAM_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue(PARAM_VERSION, Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public UriType getSource() {
		return getParameterValue(PARAM_SOURCE, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public Coding getCoding() {
		return getParameterValue(PARAM_CODING, Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getCodeableConcept() {
		return getParameterValue(PARAM_CODEABLE_CONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public UriType getTarget() {
		return getParameterValue(PARAM_TARGET, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public UriType getTargetSystem() {
		return getParameterValue(PARAM_TARGET_SYSTEM, Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public List<Dependency> getDependency() {
		return getParameters(PARAM_DEPENDENCY).stream().map(param -> new Dependency(param.getPart())).toList();
	}
	
	public BooleanType getReverse() {
		return getParameterValue(PARAM_REVERSE, Parameters.ParametersParameterComponent::getValueBooleanType);
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
	
	public ConceptMapTranslateParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public ConceptMapTranslateParameters setCode(CodeType code) {
		addParameter(PARAM_CODE, code);
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
	
	public ConceptMapTranslateParameters setSource(String source) {
		return setSource(new UriType(source));
	}
	
	public ConceptMapTranslateParameters setSource(UriType source) {
		addParameter(PARAM_SOURCE, source);
		return this;
	}

	public ConceptMapTranslateParameters setCoding(Coding coding) {
		addParameter(PARAM_CODING, coding);
		return this;
	}
	
	public ConceptMapTranslateParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter(PARAM_CODEABLE_CONCEPT, codeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setTarget(String target) {
		return setTarget(new UriType(target));
	}
	
	public ConceptMapTranslateParameters setTarget(UriType target) {
		addParameter(PARAM_TARGET, target);
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
	
	public ConceptMapTranslateParameters setReverse(Boolean isReverse) {
		return isReverse == null ? this : setReverse(new BooleanType(isReverse));
	}
	
	public ConceptMapTranslateParameters setReverse(BooleanType isReverse) {
		addParameter(PARAM_REVERSE, isReverse);
		return this;
	}
	
	@Override
	protected SortedSet<String> getAcceptedParameterNames() {
		return ACCEPTED_PARAMETER_NAMES;
	}

	public static final class Dependency extends BasePart  {
		
		private static final String PARAM_ELEMENT = "element";
		private static final String PARAM_CONCEPT = "concept";

		public Dependency() {
			super(null);
		}
		
		public Dependency(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public final UriType getElement() {
			return getParameterValue(PARAM_ELEMENT, Parameters.ParametersParameterComponent::getValueUriType);
		}
		
		public final CodeableConcept getConcept() {
			return getParameterValue(PARAM_CONCEPT, Parameters.ParametersParameterComponent::getValueCodeableConcept);
		}
		
		public Dependency setElement(String element) {
			return setElement(new UriType(element));
		}
		
		public Dependency setElement(UriType element) {
			addParameter(PARAM_ELEMENT, element);
			return this;
		}
		
		public Dependency setConcept(CodeableConcept concept) {
			addParameter(PARAM_CONCEPT, concept);
			return this;
		}
	}
}
