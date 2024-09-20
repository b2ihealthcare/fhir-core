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
package com.b2international.fhir.r5.codesystem.operations.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

import com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters;


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
				},
				{
					"name": "definition",
					"valueString": "Test definition"
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
		
		// Definition
		assertThat(parameters.getDefinition().getValueAsString()).isEqualTo("Test definition");
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
					"name": "definition",
					"valueString": "Test definition"
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
							"name": "additionalUse",
							"valueCoding": {
								"system": "addTestCodingSystem2",
								"code": "addTestCodingCode",
								"display": "Additional Display test"
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
		
		// Definition
		assertThat(parameters.getDefinition().getValueAsString()).isEqualTo("Test definition");
		
		// Designation.language
		assertThat(parameters.getDesignation().get(0).getLanguage().getValueAsString()).isEqualTo("en");
		
		// Designation.use
		assertThat(parameters.getDesignation().get(0).getUse().getSystem()).isEqualTo("testCodingSystem");
		assertThat(parameters.getDesignation().get(0).getUse().getCode()).isEqualTo("testCodingCode");
		assertThat(parameters.getDesignation().get(0).getUse().getDisplay()).isEqualTo("Display test");
		
		
		// Designation.additionalUse
		assertThat(parameters.getDesignation().get(0).getAdditionalUse().get(0).getSystem()).isEqualTo("addTestCodingSystem2");
		assertThat(parameters.getDesignation().get(0).getAdditionalUse().get(0).getCode()).isEqualTo("addTestCodingCode");
		assertThat(parameters.getDesignation().get(0).getAdditionalUse().get(0).getDisplay()).isEqualTo("Additional Display test");
		
		// Designation.value
		assertThat(parameters.getDesignation().get(0).getValue().getValueAsString()).isEqualTo("testValue");
	}
	
	@Test
	public void property_without_designation() throws Exception {
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
		
		var parameters = new CodeSystemLookupResultParameters((Parameters) resource);
		
		// Name
		assertThat(parameters.getName().getValueAsString()).isEqualTo("testName");
		
		// Version
		assertThat(parameters.getVersion().getValueAsString()).isEqualTo("testVersion");
		
		// Display
		assertThat(parameters.getDisplay().getValueAsString()).isEqualTo("testDisplay");
		
		// Property.code
		assertThat(parameters.getProperty().get(0).getCode().getValueAsString()).isEqualTo("testPropertyCode");
		
		// Property.value
		Coding coding = (Coding) parameters.getProperty().get(0).getValue();
		assertThat(coding.getSystem()).isEqualTo("testCodingSystem");
		assertThat(coding.getCode()).isEqualTo("testCodingCode");
		assertThat(coding.getDisplay()).isEqualTo("Display test");
		
		// Property.description
		assertThat(parameters.getProperty().get(0).getDescription().getValueAsString()).isEqualTo("Test description");
		
		// Property.source
		assertThat(parameters.getProperty().get(0).getSource().getValueAsString()).isEqualTo("testUri");
		
		// Property.subproperty.code
		assertThat(parameters.getProperty().get(0).getSubProperty().get(0).getCode().getValueAsString()).isEqualTo("testSubPropertyCode");
		
		//Property.subproperty.value
		Coding subpropertyCoding = (Coding) parameters.getProperty().get(0).getSubProperty().get(0).getValue();
		assertThat(subpropertyCoding.getSystem()).isEqualTo("testSubCodingSystem");
		assertThat(subpropertyCoding.getCode()).isEqualTo("testSubCodingCode");
		assertThat(subpropertyCoding.getDisplay()).isEqualTo("Sub Display test");
		
		// Property.subproperty.description
		assertThat(parameters.getProperty().get(0).getSubProperty().get(0).getDescription().getValueAsString()).isEqualTo("Test subdescription");
		
		// Property.subproperty.source
		assertThat(parameters.getProperty().get(0).getSubProperty().get(0).getSource().getValueAsString()).isEqualTo("testSubUri");
	}
}
