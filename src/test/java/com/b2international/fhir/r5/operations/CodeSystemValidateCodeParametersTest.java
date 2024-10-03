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
public class CodeSystemValidateCodeParametersTest {
	
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
					"valueUri": "tesUrl"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setUrl("tesUrl");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void codeSystem() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codeSystem",
					"resource" : {
						"resourceType" : "CodeSystem",
						"url" : "testResourceUri", 
						"version" : "testResourceVersion",
						"name" : "testCS",
						"title" : "Test CodeSystem"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters()
				.setCodeSystem(new CodeSystem()
						.setUrl("testResourceUri")
						.setVersion("testResourceVersion")
						.setName("testCS")
						.setTitle("Test CodeSystem"));
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void code() throws Exception {
		
		String json = 
		"""
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setCode("testCode");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void version() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "version",
					"valueString": "testVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setVersion("testVersion");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setDisplay("testDisplay");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters()
				.setCoding(new Coding()
						.setSystem("testCodingSystem")
						.setCode("testCodingCode")
						.setDisplay("testCodingDisplay"));
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters()
				.setCodeableConcept(new CodeableConcept()
						.setCoding(List.of(
								new Coding()
									.setSystem("testSystem")
									.setCode("testCode")
									.setDisplay("testDisplay")))
						.setText("Codeable conept test"));
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
					"valueDate": "2024-10-02"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters()
				.setDate("2024-10-02");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setAbstract(true);
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
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
		
		CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters().setDisplayLanguage("en");
		
		CodeSystemValidateCodeParameters actual = new CodeSystemValidateCodeParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
}