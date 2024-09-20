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

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r4b.formats.JsonParser;
import org.hl7.fhir.r4b.model.Parameters;
import org.hl7.fhir.r4b.model.Resource;
import org.junit.Test;

import com.b2international.fhir.r4b.operations.CodeSystemLookupParameters;

/**
 * @since 0.1
 */
public class CodeSystemLookupParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void code_and_system_param() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "code",
					"valueCode": "testCode" 
				},
				{
					"name": "system",
					"valueUri": "testSystem"
				}	
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new CodeSystemLookupParameters((Parameters) resource);
		
		// Code
		assertThat(parameters.getCode().getValueAsString()).isEqualTo("testCode");
		
		// System
		assertThat(parameters.getSystem().getValueAsString()).isEqualTo("testSystem");
	}
	
	@Test
	public void all_params() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "code",
					"valueCode": "testCode" 
				},
				{
					"name": "system",
					"valueUri": "testSystem"
				},
				{
					"name": "version",
					"valueString": "testVersion"
				},
				{
					"name": "coding",
					"valueCoding": {
							"system": "testValueCodingSystem",
							"code": "testCodingValueCode",
							"display": "testDisplay"
					}
				},
				{
					"name": "date",
					"valueDate": "2024"
				},
				{
					"name": "displayLanguage",
					"valueCode": "en"
				},
				{
					"name": "property",
					"valueCode": "testCode"
				}
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new CodeSystemLookupParameters((Parameters) resource);
		
		// Code
		assertThat(parameters.getCode().getValueAsString()).isEqualTo("testCode");
		
		// System
		assertThat(parameters.getSystem().getValueAsString()).isEqualTo("testSystem");
		
		// Version
		assertThat(parameters.getVersion().getValueAsString()).isEqualTo("testVersion");
		
		// Coding
		assertThat(parameters.getCoding().getSystem()).isEqualTo("testValueCodingSystem");
		assertThat(parameters.getCoding().getCode()).isEqualTo("testCodingValueCode");
		assertThat(parameters.getCoding().getDisplay()).isEqualTo("testDisplay");
		
		// Date
		assertThat(parameters.getDate().getValueAsString()).isEqualTo("2024");
		
		// Display language
		assertThat(parameters.getDisplayLanguage().getValueAsString()).isEqualTo("en");
		
		// Property
		assertThat(parameters.getProperty().get(0).getValueAsString()).isEqualTo("testCode");
	}
	
}
