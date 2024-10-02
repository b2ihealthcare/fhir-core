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
import org.hl7.fhir.r5.model.CodeableConcept;
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ValueSetValidateCodeResultParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void result() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setResult(true);
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void message() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "message",
					"valueString": "testMessage"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setMessage("testMessage");
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
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
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setDisplay("testDisplay");
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
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
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setCode("testCode");
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
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
					"valueUri": "tesUrl"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setSystem("tesUrl");
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
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
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters().setVersion("testVersion");
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
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
		
		ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters()
				.setCodeableConcept(new CodeableConcept()
						.setCoding(List.of(
								new Coding()
									.setSystem("testSystem")
									.setCode("testCode")
									.setDisplay("testDisplay")))
						.setText("Codeable conept test"));
		
		ValueSetValidateCodeResultParameters actual = new ValueSetValidateCodeResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	
	//TODO: test case for issues, when implemented
}