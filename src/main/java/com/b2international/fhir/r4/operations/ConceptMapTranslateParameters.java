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



import java.util.List;

import org.hl7.fhir.r4.model.*;

/**
 * @since 0.1 
 */
public class ConceptMapTranslateParameters extends BaseParameters {

	public ConceptMapTranslateParameters() {
		super(new Parameters());
	}
	
	public ConceptMapTranslateParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return (UriType) getParameterValue("url", Parameters.ParametersParameterComponent::getValue);
	}
	
	public ConceptMap getConceptMap() {
		return getParameterValue("conceptMap", value -> (ConceptMap) value.getResource());
	}
	
	public StringType getConceptMapVersion() {
		return (StringType) getParameterValue("conceptMapVersion", Parameters.ParametersParameterComponent::getValue);
	}
	
	public StringType getCode() {
		return (StringType) getParameterValue("code", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getSystem() {
		return (UriType) getParameterValue("system", Parameters.ParametersParameterComponent::getValue);
	}
	
	public StringType getVersion() {
		return (StringType) getParameterValue("version", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getSource() {
		return (UriType) getParameterValue("source", Parameters.ParametersParameterComponent::getValue);
	}
	
	public Coding getCoding() {
		return (Coding) getParameterValue("coding", Parameters.ParametersParameterComponent::getValue);
	}
	
	public CodeableConcept getCodeableConcept() {
		return (CodeableConcept) getParameterValue("codeableConcept", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getTarget() {
		return (UriType) getParameterValue("target", Parameters.ParametersParameterComponent::getValue);
	}
	
	public UriType getTargetSystem() {
		return (UriType) getParameterValue("targetsystem", Parameters.ParametersParameterComponent::getValue);
	}
	
	public List<Dependency> getDependency() {
		return getParameters("dependency").stream().map(param -> new Dependency(param.getPart())).toList();
	}
	
	public BooleanType getReverse() {
		return (BooleanType) getParameterValue("reverse", Parameters.ParametersParameterComponent::getValue);
	}
	
	public ConceptMapTranslateParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}
	
	public ConceptMapTranslateParameters setUrl(UriType url) {
		addParameter("url", url);
		return this;
	}
	
	public ConceptMapTranslateParameters setConceptMap(ConceptMap conceptMap) {
		if (conceptMap != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent().setName("conceptMap").setResource(conceptMap));
		}
		return this;
	}
	
	public ConceptMapTranslateParameters setConceptMapVersion(String conceptMapVersion) {
		return setConceptMapVersion(new StringType(conceptMapVersion));
	}
	
	public ConceptMapTranslateParameters setConceptMapVersion(StringType conceptMapVersion) {
		addParameter("conceptMapVersion", conceptMapVersion);
		return this;
	}
	
	public ConceptMapTranslateParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public ConceptMapTranslateParameters setCode(CodeType code) {
		addParameter("code", code);
		return this;
	}
	
	public ConceptMapTranslateParameters setSystem(String system) {
		return setSystem(new UriType(system));
	}
	
	public ConceptMapTranslateParameters setSystem(UriType system) {
		addParameter("system", system);
		return this;
	}
	
	public ConceptMapTranslateParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public ConceptMapTranslateParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public ConceptMapTranslateParameters setSource(String source) {
		return setSource(new UriType(source));
	}
	
	public ConceptMapTranslateParameters setSource(UriType source) {
		addParameter("source", source);
		return this;
	}

	public ConceptMapTranslateParameters setCoding(Coding coding) {
		addParameter("coding", coding);
		return this;
	}
	
	public ConceptMapTranslateParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter("codeableConcept", codeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setTarget(String target) {
		return setTarget(new UriType(target));
	}
	
	public ConceptMapTranslateParameters setTarget(UriType target) {
		addParameter("target", target);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetSystem(String targetSystem) {
		return setTargetSystem(new UriType(targetSystem));
	}
	
	public ConceptMapTranslateParameters setTargetSystem(UriType targetSystem) {
		addParameter("targetsystem", targetSystem);
		return this;
	}
	
	public ConceptMapTranslateParameters setDependency(List<Dependency> dependencies) {
		if (dependencies == null) {
			return this;
		}
		
		dependencies.stream()
			.map(dependency -> new Parameters.ParametersParameterComponent().setName("dependency").setPart(dependency.getPart()))
			.forEach(getParameters()::addParameter);
		
		return this;
	}
	
	public ConceptMapTranslateParameters setReverse(Boolean isReverse) {
		return isReverse == null ? this : setReverse(new BooleanType(isReverse));
	}
	
	public ConceptMapTranslateParameters setReverse(BooleanType isReverse) {
		addParameter("reverse", isReverse);
		return this;
	}
	
	public static final class Dependency extends BasePart  {
		
		public Dependency() {
			super(null);
		}
		
		public Dependency(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public final UriType getElement() {
			return (UriType) getParameterValue("element", Parameters.ParametersParameterComponent::getValue);
		}
		
		public final CodeableConcept getConcept() {
			return (CodeableConcept) getParameterValue("concept", Parameters.ParametersParameterComponent::getValue);
		}
		
		public Dependency setElement(String element) {
			return setElement(new UriType(element));
		}
		
		public Dependency setElement(UriType element) {
			addParameter("element", element);
			return this;
		}
		
		public Dependency setConcept(CodeableConcept concept) {
			addParameter("concept", concept);
			return this;
		}
	}
}
