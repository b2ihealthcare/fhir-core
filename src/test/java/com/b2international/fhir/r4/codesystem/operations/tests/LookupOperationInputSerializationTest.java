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
package com.b2international.fhir.r4.codesystem.operations.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r4.formats.JsonParser;
import org.hl7.fhir.r4.model.Parameters;
import org.hl7.fhir.r4.model.Resource;
import org.junit.Test;

/**
 * @since 0.1
 */
public class LookupOperationInputSerializationTest {
	
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
					"valueCode": "testSystem"
				}	
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
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
					"valueCode": "testSystem"
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
				},
				{
					"name": "useSupplement",
					"valueCanonical": "testUri"
				}
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
	}
	
}
