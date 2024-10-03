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

import org.hl7.fhir.r4b.model.*;

/**
 * @since 0.1
 */
public class CodeSystemValidateCodeResultParameters extends BaseParameters {
	
	public CodeSystemValidateCodeResultParameters() {
		this(new Parameters());
	}
	
	public CodeSystemValidateCodeResultParameters(Parameters parameters) {
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
	
	public CodeSystemValidateCodeResultParameters setResult(Boolean isResult) {
		return isResult == null ? this : setResult(new BooleanType(isResult));
	}
	
	public CodeSystemValidateCodeResultParameters setResult(BooleanType result) {
		addParameter("result", result);
		return this;
	}
	
	public CodeSystemValidateCodeResultParameters setMessage(String message) {
		return setMessage(new StringType(message));
	}
	
	public CodeSystemValidateCodeResultParameters setMessage(StringType message) {
		addParameter("message", message);
		return this;
	}
	
	public CodeSystemValidateCodeResultParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}
	
	public CodeSystemValidateCodeResultParameters setDisplay(StringType display) {
		addParameter("display", display);
		return this;
	}
}
