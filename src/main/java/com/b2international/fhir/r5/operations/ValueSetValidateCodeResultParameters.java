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
 * @since 0.1
 */
public class ValueSetValidateCodeResultParameters extends BaseParameters {

	public ValueSetValidateCodeResultParameters() {
		this(new Parameters());
	}
	
	public ValueSetValidateCodeResultParameters(Parameters parameters) {
		super(parameters);
	}
	
	public BooleanType getResult() {
		return getParameterValue("result", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public StringType getMessage() {
		return getParameterValue("message", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public StringType getDisplay() {
		return getParameterValue("display", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeType getCode() {
		return getParameterValue("code", Parameters.ParametersParameterComponent::getValueCodeType);
	}
	
	public UriType getSytem() {
		return getParameterValue("system", Parameters.ParametersParameterComponent::getValueUriType);
	}
	
	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeableConcept getCodeableConcept() {
		return getParameterValue("codeableConcept", Parameters.ParametersParameterComponent::getValueCodeableConcept);
	}

	public ValueSetValidateCodeResultParameters setResult(Boolean result) {
		return setResult(new BooleanType(result));
	}
	
	public ValueSetValidateCodeResultParameters setResult(BooleanType result) {
		addParameter("result", result);
		return this;
	}
	
	public ValueSetValidateCodeResultParameters setMessage(String message) {
		return setMessage(new StringType(message));
	}
	
	public ValueSetValidateCodeResultParameters setMessage(StringType message) {
		addParameter("message", message);
		return this;
	}
	
	public ValueSetValidateCodeResultParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}
	
	public ValueSetValidateCodeResultParameters setDisplay(StringType display) {
		addParameter("display", display);
		return this;
	}
	
	public ValueSetValidateCodeResultParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public ValueSetValidateCodeResultParameters setCode(CodeType codeType) {
		addParameter("code", codeType);
		return this;
	}
	
	public ValueSetValidateCodeResultParameters setSystem(String system) {
		return setSysytem(new UriType(system));
	}

	public ValueSetValidateCodeResultParameters setSysytem(UriType uriType) {
		addParameter("system", uriType);
		return this;
	}

	public ValueSetValidateCodeResultParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public ValueSetValidateCodeResultParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public ValueSetValidateCodeResultParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter("codeableConcept", codeableConcept);
		return this;
	}
	// TODO add issues
}
