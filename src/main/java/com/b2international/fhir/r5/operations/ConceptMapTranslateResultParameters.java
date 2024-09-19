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

import org.hl7.fhir.r5.model.Parameters;

/**
 * @since 9.3 
 */
public class ConceptMapTranslateResultParameters extends BaseParameters {

	public ConceptMapTranslateResultParameters() {
		this(new Parameters());
	}
	
	public ConceptMapTranslateResultParameters(Parameters parameters) {
		super(parameters);
	}

	public ConceptMapTranslateResultParameters setResult(boolean result) {
		getParameters().addParameter("result", result);
		return this;
	}
	
	public ConceptMapTranslateResultParameters setMessage(String message) {
		getParameters().addParameter("message", message);
		return this;
	}
	
	// TODO add Match object support
	
}
