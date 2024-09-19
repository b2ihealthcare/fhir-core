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

import org.hl7.fhir.r5.model.*;

/**
 * @since 9.3 
 */
public class ConceptMapTranslateParameters extends BaseParameters {

	public ConceptMapTranslateParameters() {
		super(new Parameters());
	}
	
	public ConceptMapTranslateParameters(Parameters parameters) {
		super(parameters);
	}
	
	public UriType getUrl() {
		return getParameterValue("url", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public ConceptMap getConceptMap() {
		return getParameterValue("conceptMap", value -> (ConceptMap) value.getResource());
	}
	
	public StringType getConceptMapVersion() {
		return getParameterValue("conceptMapVersion", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public UriType getSystem() {
		return getParameterValue("system", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeType getSourceCode() {
		return getParameterValue("sourceCode", Parameters.ParametersParameterComponent::getValueCodeType);
	}

	public Coding getSourceCoding() {
		return getParameterValue("sourceCoding", Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getSourceCodeableConcept() {
		return getParameterValue("sourceCodeableConcept", Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public UriType getSourceScope() {
		return getParameterValue("sourceScope", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public CodeType getTargetCode() {
		return getParameterValue("targetCode", Parameters.ParametersParameterComponent::getValueCodeType);
	}

	public Coding getTargetCoding() {
		return getParameterValue("targetCoding", Parameters.ParametersParameterComponent::getValueCoding);
	}
	
	public CodeableConcept getTargetCodeableConcept() {
		return getParameterValue("targetCodeableConcept", Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}
	
	public UriType getTargetScope() {
		return getParameterValue("targetScope", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	// TODO add Dependency getters
	
	public ConceptMapTranslateParameters setUrl(String url) {
		return setUrl(new UriType(url));
	}
	
	public ConceptMapTranslateParameters setUrl(UriType url) {
		addParameter("url", url);
		return this;
	}
	
	public ConceptMapTranslateParameters setConceptMap(ConceptMap conceptMap) {
		if (conceptMap != null) {
			getParameters().addParameter(new Parameters.ParametersParameterComponent("conceptMap").setResource(conceptMap));
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
	
	public ConceptMapTranslateParameters setSystem(String system) {
		return setSystem(new StringType(system));
	}
	
	public ConceptMapTranslateParameters setSystem(StringType system) {
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

	public ConceptMapTranslateParameters setSourceCode(String sourceCode) {
		return setSourceCode(new CodeType(sourceCode));
	}
	
	public ConceptMapTranslateParameters setSourceCode(CodeType sourceCode) {
		addParameter("sourceCode", sourceCode);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceCoding(Coding sourceCoding) {
		addParameter("sourceCoding", sourceCoding);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceCodeableConcept(CodeableConcept sourceCodeableConcept) {
		addParameter("sourceCodeableConcept", sourceCodeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setSourceScope(String sourceScope) {
		return setSourceScope(new UriType(sourceScope));
	}
	
	public ConceptMapTranslateParameters setSourceScope(UriType sourceScope) {
		addParameter("sourceScope", sourceScope);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCode(String targetCode) {
		return setTargetCode(new CodeType(targetCode));
	}
	
	public ConceptMapTranslateParameters setTargetCode(CodeType targetCode) {
		addParameter("targetCode", targetCode);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCoding(Coding targetCoding) {
		addParameter("targetCoding", targetCoding);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetCodeableConcept(CodeableConcept targetCodeableConcept) {
		addParameter("targetCodeableConcept", targetCodeableConcept);
		return this;
	}
	
	public ConceptMapTranslateParameters setTargetScope(String targetScope) {
		return setTargetScope(new UriType(targetScope));
	}
	
	public ConceptMapTranslateParameters setTargetScope(UriType targetScope) {
		addParameter("targetScope", targetScope);
		return this;
	}
	
	// TODO add Dependency setters
	
}
