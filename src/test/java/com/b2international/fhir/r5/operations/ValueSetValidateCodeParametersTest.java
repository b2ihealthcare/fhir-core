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
import org.hl7.fhir.r5.model.*;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ValueSetValidateCodeParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void url() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "url",
					"valueUri": "testUrl"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setUrl("testUrl");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void context() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "context",
					"valueUri": "testContextUrl"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setContext("testContextUrl");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueSet() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "valueSet",
					"resource" : {
						"resourceType" : "ValueSet",
						"url" : "testResourceUri", 
						"version" : "testResourceVersion",
						"name" : "testVS",
						"title" : "Test value set"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setValueSet(new ValueSet()
						.setUrl("testResourceUri")
						.setVersion("testResourceVersion")
						.setName("testVS")
						.setTitle("Test value set"));
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueSetVersion() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "valueSetVersion",
					"valueString": "testVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setValueSetVersion("testVersion");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void code() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "code",
					"valueCode": "testCode"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setCode("testCode");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void system() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "system",
					"valueUri": "testSystemUri"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setSystem("testSystemUri");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void systemVersion() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "systemVersion",
					"valueString": "testSystemVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setSystemVersion("testSystemVersion");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void display() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setDisplay ("testDisplay");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void coding() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "coding",
					"valueCoding": {
						"system": "testCodingSystem",
						"code": "testCodingCode",
						"display": "testCodingDisplay"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setCoding(new Coding()
						.setSystem("testCodingSystem")
						.setCode("testCodingCode")
						.setDisplay("testCodingDisplay"));
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void codeableConcept() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codeableConcept",
					"valueCodeableConcept": {
						"coding": [
							{
								"system": "testSystem",
								"code": "testCode",
								"display": "testDisplay"
							}
						],
						"text": "Codeable conept test"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setCodeableConcept(new CodeableConcept()
						.setCoding(List.of(
								new Coding()
									.setSystem("testSystem")
									.setCode("testCode")
									.setDisplay("testDisplay")))
						.setText("Codeable conept test"));
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void date() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "date",
					"valueDateTime": "2024-10-02"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setDate("2024-10-02");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void abstractParam() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "abstract",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setAbstract(true);
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void displayLanguage() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "displayLanguage",
					"valueCode": "en"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters().setDisplayLanguage("en");
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void useSupplement() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "useSupplement",
					"valueCanonical": "testUseSupplement"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setUseSupplement(List.of("testUseSupplement"));
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_useSupplements() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "useSupplement",
					"valueCanonical": "testUseSupplement1"
				},
				{
					"name": "useSupplement",
					"valueCanonical": "testUseSupplement2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
				.setUseSupplement(List.of("testUseSupplement1", "testUseSupplement2"));
		
		ValueSetValidateCodeParameters actual = new ValueSetValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
}