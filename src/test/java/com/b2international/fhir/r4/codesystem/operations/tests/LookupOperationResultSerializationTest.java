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
public class LookupOperationResultSerializationTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void basic_parameters() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "name",
					"valueString": "testName" 
				},
				{
					"name": "version",
					"valueString": "testVersion"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new CodeSystemLookupResultParameters((Parameters) resource);
		
		// Name
		assertThat(parameters.getName().getValueAsString()).isEqualTo("testName");
		
		// Version
		assertThat(parameters.getVersion().getValueAsString()).isEqualTo("testVersion");
		
		// Display
		assertThat(parameters.getDisplay().getValueAsString()).isEqualTo("testDisplay");
	}
	
	@Test
	public void designation_without_property() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "name",
					"valueString": "testName" 
				},
				{
					"name": "version",
					"valueString": "testVersion"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				},
				{
					"name": "designation",
					"part": [
						{
							"name": "language",
							"valueCode": "en"
						},
						{
							"name": "use",
							"valueCoding": {
								"system": "testCodingSystem",
								"code": "testCodingCode",
								"display": "Display test"
							}
						},
						{
							"name": "value",
							"valueString": "testValue"
						}
					]
				}
			]
		}""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new CodeSystemLookupResultParameters((Parameters) resource);
		
		// Name
		assertThat(parameters.getName().getValueAsString()).isEqualTo("testName");
		
		// Version
		assertThat(parameters.getVersion().getValueAsString()).isEqualTo("testVersion");
		
		// Display
		assertThat(parameters.getDisplay().getValueAsString()).isEqualTo("testDisplay");
		
		// Designation.language
		assertThat(parameters.getDesignation().get(0).getLanguage().getValueAsString()).isEqualTo("en");
		
		// Designation.use
		assertThat(parameters.getDesignation().get(0).getUse().getSystem()).isEqualTo("testCodingSystem");
		assertThat(parameters.getDesignation().get(0).getUse().getCode()).isEqualTo("testCodingCode");
		assertThat(parameters.getDesignation().get(0).getUse().getDisplay()).isEqualTo("Display test");
		
		// Designation.value
		assertThat(parameters.getDesignation().get(0).getValue()).isEqualTo("testValue");
		
	}
	
	@Test
	public void property_without_designation() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "code",
					"valueString": "testCode" 
				},
				{
					"name": "system",
					"valueString": "testSystem"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				},
				{
					"name": "definition",
					"valueString": "Test definition"
				},
				{
					"name": "property",
					"part": [
						{
							"name": "code",
							"valueCode": "testPropertyCode"
						},
						{
							"name": "value",
							"valueCoding": {
								"system": "testCodingSystem",
								"code": "testCodingCode",
								"display": "Display test"
							}
						},
						{
							"name": "description",
							"valueString": "Test description"
						},
						{
							"name": "source",
							"valueCanonical": "testUri"
						},
						{
							"name": "subproperty",
							"part": [
								{
									"name": "code",
									"valueCode": "testSubPropertyCode"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testSubCodingSystem",
										"code": "testSubCodingCode",
										"display": "Sub Display test"
									}
								},
								{
									"name": "description",
									"valueString": "Test subdescription"
								},
								{
									"name": "source",
									"valueCanonical": "testSubUri"
								}
							]
						}
					]
				}
			]
		}""";
				
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
	}
}
