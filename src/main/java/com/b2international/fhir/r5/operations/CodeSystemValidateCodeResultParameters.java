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
	
	// TODO: revise issues parameter
//	public OperationOutcome getIssues() {
//		OperationOutcome operationOutcome = new OperationOutcome();
//		getParameter("issues");
//	}
	
	public CodeSystemValidateCodeResultParameters setResult(boolean result) {
		addParameter("result", new BooleanType(result));
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
	
	public CodeSystemValidateCodeResultParameters setCode(String code) {
		return setCode(new CodeType(code));
	}
	
	public CodeSystemValidateCodeResultParameters setCode(CodeType codeType) {
		addParameter("code", codeType);
		return this;
	}
	
	public CodeSystemValidateCodeResultParameters setSystem(String system) {
		return setSysytem(new UriType(system));
	}

	public CodeSystemValidateCodeResultParameters setSysytem(UriType uriType) {
		addParameter("system", uriType);
		return this;
	}

	public CodeSystemValidateCodeResultParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemValidateCodeResultParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public CodeSystemValidateCodeResultParameters setCodeableConcept(CodeableConcept codeableConcept) {
		addParameter("codeableConcept", codeableConcept);
		return this;
	}
	
	// TODO: revise issues parameter
//	public CodeSystemValidateCodeResultParameters setIssues(OperationOutcome issues) {
//		if (issues == null) {
//			return this;
//		}
//		
//		List<OperationOutcomeIssueComponent> issue = issues.getIssue();
//		
//		List<ParametersParameterComponent> issueList = issue.stream()
//			.map(iss -> {
//				var issueParameter = new Parameters.ParametersParameterComponent().setName("issue");
//				
//				issueParameter.addPart(new Parameters.ParametersParameterComponent()
//						.setName("severity")
//						.setValue(new CodeType(iss.getSeverity().toString())));
//				
//				issueParameter.addPart(new Parameters.ParametersParameterComponent()
//						.setName("code")
//						.setValue(new CodeType(iss.getCode().toString())));
//				
//				issueParameter.addPart(new Parameters.ParametersParameterComponent()
//						.setName("details")
//						.setValue(iss.getDetails()));
//				
//				issueParameter.addPart(new Parameters.ParametersParameterComponent()
//						.setName("diagnostics")
//						.setValue(new StringType(iss.getDiagnostics())));
//				
//				iss.getLocation().stream().forEach(location -> issueParameter.addPart(
//						new Parameters.ParametersParameterComponent()
//							.setName("location")
//							.setValue(location)
//				));
//				
//				iss.getLocation().stream().forEach(expression -> issueParameter.addPart(
//						new Parameters.ParametersParameterComponent()
//							.setName("expression")
//							.setValue(expression)
//				));
//				
//				return issueParameter;
//			})
//			.collect(Collectors.toList());
//		
//		getParameters().addParameter(new ParametersParameterComponent("issues").setPart(issueList));
//		return this;
//	}
}
