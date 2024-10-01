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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.*;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ConceptMapTranslateParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void url() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "url",
					"valueUri": "testuri" 
				}
			]
		}		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setUrl("testuri");
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void conceptMap() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "conceptMap",
					"resource" : {
						"resourceType" : "ConceptMap",
						"url" : "testResourceUri", 
						"version" : "testResourceVersion",
						"name" : "testCM",
						"title" : "Test concept map"
					}
				}
			]
		}		
		""";
				
		Resource resource = parser.parse(json);
				
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setConceptMap(
				new ConceptMap()
					.setUrl("testResourceUri")
					.setVersion("testResourceVersion")
					.setName("testCM").setTitle("Test concept map"));
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void conceptMapVersion() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "conceptMapVersion",
					"valueString": "testConceptMapVersion"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setConceptMapVersion("testConceptMapVersion");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void sourceCode() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "sourceCode",
					"valueCode": "testSourceCode"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setSourceCode("testSourceCode");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void system() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "system",
					"valueUri": "testSystemUri"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setSystem("testSystemUri");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
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
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setVersion("testVersion");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sourceScope() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "sourceScope",
					"valueUri": "testSourceScope"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setSourceScope("testSourceScope");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sourceCoding() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "sourceCoding",
					"valueCoding": {
						"system": "testCodingSourceSystem",
						"code": "testCodingSourceCode",
						"display": "testCodingSourceDisplay"
					}	
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setSourceCoding(new Coding()
				.setSystem("testCodingSourceSystem")
				.setCode("testCodingSourceCode")
				.setDisplay("testCodingSourceDisplay"));
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sourceCodeableConcept() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "sourceCodeableConcept",
					"valueCodeableConcept": {
						"coding": [
						{
							"system": "sourceSystem",
							"code": "sourceCode",
							"display": "sourceDisplay"
						}],
						"text": "Test source codeableconcept text"
					}
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setSourceCodeableConcept(
				new CodeableConcept()
					.setCoding(List.of(
							new Coding()
								.setSystem("sourceSystem")
								.setCode("sourceCode")
								.setDisplay("sourceDisplay")))
					.setText("Test source codeableconcept text"));
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void targetCode() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "targetCode",
					"valueCode": "testTargetCode"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setTargetCode("testTargetCode");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void targetCoding() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "targetCoding",
					"valueCoding": {
						"system": "testCodingTargetSystem",
						"code": "testCodingTargetCode",
						"display": "testCodingTargetDisplay"
					}	
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setTargetCoding(new Coding()
				.setSystem("testCodingTargetSystem")
				.setCode("testCodingTargetCode")
				.setDisplay("testCodingTargetDisplay"));
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void targetCodeableConcept() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "targetCodeableConcept",
					"valueCodeableConcept": {
						"coding": [
						{
							"system": "targetSystem",
							"code": "targetCode",
							"display": "targetDisplay"
						}],
						"text": "Test target codeableconcept text"
					}
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setTargetCodeableConcept(
				new CodeableConcept()
					.setCoding(List.of(
							new Coding()
								.setSystem("targetSystem")
								.setCode("targetCode")
								.setDisplay("targetDisplay")))
					.setText("Test target codeableconcept text"));
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void targetScope() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "targetScope",
					"valueUri": "testTargetScope"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setTargetScope("testTargetScope");
				
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void targetSystem() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "targetSystem",
					"valueUri": "testTargetSystem"
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setTargetSystem("testTargetSystem");
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void dependency() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "dependency",
					"part": [
						{
							"name": "attribute",
							"valueUri": "testDepAttribute"
						},
						{
							"name": "value",
							"valueCoding": {
								"system": "testDepCodingValue",
								"code": "testDepCodingCode",
								"display": "Dependency Display test"
							}
						}
					]
				}
			]
		}
		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters().setDependency(
				List.of(new ConceptMapTranslateParameters.Dependency()
						.setAttribute("testDepAttribute")
						.setValue(new Coding()
								.setSystem("testDepCodingValue")
								.setCode("testDepCodingCode")
								.setDisplay("Dependency Display test")))
				);
		
		ConceptMapTranslateParameters actual = new ConceptMapTranslateParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
}