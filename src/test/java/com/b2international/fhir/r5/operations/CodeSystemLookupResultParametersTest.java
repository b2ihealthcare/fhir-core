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

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;


/**
 * @since 0.1
 */
public class CodeSystemLookupResultParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void name() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "name",
					"valueString": "testName" 
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setName("testName");
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void version() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "version",
					"valueString": "testVersion" 
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setVersion("testVersion");
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void display() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "display",
					"valueString": "testDisplay" 
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setDisplay("testDisplay");
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void definition() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "definition",
					"valueString": "testDefinition" 
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setDefinition("testDefinition");
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void designation() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
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
								"system": "addTestCodingSystem",
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
		}
		""";
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setDesignation(List.of(
				new CodeSystemLookupResultParameters.Designation()
					.setLanguage("en")
					.setUse(new Coding()
							.setSystem("testCodingSystem")
							.setCode("testCodingCode")
							.setDisplay("Display test"))
					.setAdditionalUse(new Coding()
							.setSystem("addTestCodingSystem")
							.setCode("addTestCodingCode")
							.setDisplay("Additional Display test"))
					.setValue("testValue")
		));
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_designations() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
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
								"system": "testCodingSystem1",
								"code": "testCodingCode1",
								"display": "Display test1"
							}
						},
						{
							"name": "additionalUse",
							"valueCoding": {
								"system": "addTestCodingSystem1",
								"code": "addTestCodingCode1",
								"display": "Additional Display test1"
							}
						},
						{
							"name": "value",
							"valueString": "testValue1"
						}
					]
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
								"system": "testCodingSystem2",
								"code": "testCodingCode2",
								"display": "Display test2"
							}
						},
						{
							"name": "additionalUse",
							"valueCoding": {
								"system": "addTestCodingSystem2",
								"code": "addTestCodingCode2",
								"display": "Additional Display test2"
							}
						},
						{
							"name": "value",
							"valueString": "testValue2"
						}
					]
				}
			]
		}
		""";
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setDesignation(List.of(
				new CodeSystemLookupResultParameters.Designation()
					.setLanguage("en")
					.setUse(new Coding()
							.setSystem("testCodingSystem1")
							.setCode("testCodingCode1")
							.setDisplay("Display test1"))
					.setAdditionalUse(new Coding()
							.setSystem("addTestCodingSystem1")
							.setCode("addTestCodingCode1")
							.setDisplay("Additional Display test1"))
					.setValue("testValue1"),
				new CodeSystemLookupResultParameters.Designation()
					.setLanguage("en")
					.setUse(new Coding()
							.setSystem("testCodingSystem2")
							.setCode("testCodingCode2")
							.setDisplay("Display test2"))
					.setAdditionalUse(new Coding()
							.setSystem("addTestCodingSystem2")
							.setCode("addTestCodingCode2")
							.setDisplay("Additional Display test2"))
					.setValue("testValue2")
		));
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void property() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
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
						}
					]
				}
			]
		}
		""";
				
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setProperty(List.of(
				new CodeSystemLookupResultParameters.Property()
					.setCode("testPropertyCode")
					.setValue(new Coding()
							.setSystem("testCodingSystem")
							.setCode("testCodingCode")
							.setDisplay("Display test"))
					.setDescription("Test description")
					.setSource("testUri")
		));
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_properties() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "property",
					"part": [
						{
							"name": "code",
							"valueCode": "testPropertyCode1"
						},
						{
							"name": "value",
							"valueCoding": {
								"system": "testCodingSystem1",
								"code": "testCodingCode1",
								"display": "Display test1"
							}
						},
						{
							"name": "description",
							"valueString": "Test description1"
						},
						{
							"name": "source",
							"valueCanonical": "testUri1"
						}
					]
				},
				{
					"name": "property",
					"part": [
						{
							"name": "code",
							"valueCode": "testPropertyCode2"
						},
						{
							"name": "value",
							"valueCoding": {
								"system": "testCodingSystem2",
								"code": "testCodingCode2",
								"display": "Display test2"
							}
						},
						{
							"name": "description",
							"valueString": "Test description2"
						},
						{
							"name": "source",
							"valueCanonical": "testUri2"
						}
					]
				}
			]
		}
		""";
				
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setProperty(List.of(
				new CodeSystemLookupResultParameters.Property()
					.setCode("testPropertyCode1")
					.setValue(new Coding()
							.setSystem("testCodingSystem1")
							.setCode("testCodingCode1")
							.setDisplay("Display test1"))
					.setDescription("Test description1")
					.setSource("testUri1"), 
				new CodeSystemLookupResultParameters.Property()
					.setCode("testPropertyCode2")
					.setValue(new Coding()
							.setSystem("testCodingSystem2")
							.setCode("testCodingCode2")
							.setDisplay("Display test2"))
					.setDescription("Test description2")
					.setSource("testUri2"))
		);
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void property_with_subproperty() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
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
		}
		""";
				
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setProperty(List.of(
				new CodeSystemLookupResultParameters.Property()
					.setCode("testPropertyCode")
					.setValue(new Coding()
							.setSystem("testCodingSystem")
							.setCode("testCodingCode")
							.setDisplay("Display test"))
					.setDescription("Test description")
					.setSource("testUri")
					.setSubProperty(List.of(new CodeSystemLookupResultParameters.Property()
							.setCode("testSubPropertyCode")
							.setValue(new Coding()
									.setSystem("testSubCodingSystem")
									.setCode("testSubCodingCode")
									.setDisplay("Sub Display test"))
							.setDescription("Test subdescription").setSource("testSubUri")))
		));
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void property_with_multiple_subproperties() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
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
									"valueCode": "testSubPropertyCode1"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testSubCodingSystem1",
										"code": "testSubCodingCode1",
										"display": "Sub Display test1"
									}
								},
								{
									"name": "description",
									"valueString": "Test subdescription1"
								},
								{
									"name": "source",
									"valueCanonical": "testSubUri1"
								}
							]
						},
						{
							"name": "subproperty",
							"part": [
								{
									"name": "code",
									"valueCode": "testSubPropertyCode2"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testSubCodingSystem2",
										"code": "testSubCodingCode2",
										"display": "Sub Display test2"
									}
								},
								{
									"name": "description",
									"valueString": "Test subdescription2"
								},
								{
									"name": "source",
									"valueCanonical": "testSubUri2"
								}
							]
						}
					]
				}
			]		
		}
		""";
				
		Resource resource = parser.parse(json);
		
		CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters().setProperty(List.of(
				new CodeSystemLookupResultParameters.Property()
					.setCode("testPropertyCode")
					.setValue(new Coding()
							.setSystem("testCodingSystem")
							.setCode("testCodingCode")
							.setDisplay("Display test"))
					.setDescription("Test description")
					.setSource("testUri")
					.setSubProperty(List.of(
							new CodeSystemLookupResultParameters.Property()
								.setCode("testSubPropertyCode1")
								.setValue(new Coding()
										.setSystem("testSubCodingSystem1")
										.setCode("testSubCodingCode1")
										.setDisplay("Sub Display test1"))
								.setDescription("Test subdescription1")
								.setSource("testSubUri1"),  
							new CodeSystemLookupResultParameters.Property()
								.setCode("testSubPropertyCode2")
								.setValue(new Coding()
										.setSystem("testSubCodingSystem2")
										.setCode("testSubCodingCode2")
										.setDisplay("Sub Display test2"))
								.setDescription("Test subdescription2")
								.setSource("testSubUri2")))
		));
		
		CodeSystemLookupResultParameters actual = new CodeSystemLookupResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
}
