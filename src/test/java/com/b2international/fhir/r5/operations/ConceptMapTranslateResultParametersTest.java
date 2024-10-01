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
public class ConceptMapTranslateResultParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void result() throws Exception {
		String 	json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true);
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void message() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "message",
					"valueString": "testMessage"
				}
			]
		}	
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMessage("testMessage");
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_relationship() throws Exception {
		String json = """		
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "relationship",
							"valueCode": "testRelationship"
						}
					]
				}
			]	
		}		
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match().setRelationship("testRelationship")));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_concept() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "concept",
							"valueCoding": {
								"system": "testCodingSystem",
								"code": "testCodingCode",
								"display": "testCodingDisplay"
							}
						}
					]
				}
			]	
		}	
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match()
						.setConcept(new Coding()
								.setSystem("testCodingSystem")
								.setCode("testCodingCode")
								.setDisplay("testCodingDisplay"))));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_property() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "property",
							"part": [
								{
									"name": "uri",
									"valueUri": "testPropertyUri"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testCodingPropertySystem",
										"code": "testCodingPropertyCode",
										"display": "testCodingPropertyDisplay"
									}
								}
							]
						}
					]
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match()
						.setProperty(List.of(new ConceptMapTranslateResultParameters.Match.Property()
								.setUri("testPropertyUri")
								.setValue(new Coding()
										.setSystem("testCodingPropertySystem")
										.setCode("testCodingPropertyCode")
										.setDisplay("testCodingPropertyDisplay"))))));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_product() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "product",
							"part": [
								{
									"name": "attribute",
									"valueUri": "testAttributeUri"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testCodingProductSystem",
										"code": "testCodingProductCode",
										"display": "testCodingProductDisplay"
									}
								}
							]
						}
					]
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match()
						.setProduct(List.of(new ConceptMapTranslateResultParameters.Match.Product()
								.setAttribute("testAttributeUri")
								.setValue(new Coding()
										.setSystem("testCodingProductSystem")
										.setCode("testCodingProductCode")
										.setDisplay("testCodingProductDisplay"))))));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_dependsOn() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "dependsOn",
							"part": [
								{
									"name": "attribute",
									"valueUri": "testDependsOnUri"
								},
								{
									"name": "value",
									"valueCoding": {
										"system": "testCodingDependsOnSystem",
										"code": "testCodingDependsOnCode",
										"display": "testCodingDependsOnDisplay"
									}
								}
							]
						}
					]
				}
			]
		}
		""";
				
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match()
						.setDependsOn(List.of(new ConceptMapTranslateResultParameters.Match.Product()
								.setAttribute("testDependsOnUri")
								.setValue(new Coding()
										.setSystem("testCodingDependsOnSystem")
										.setCode("testCodingDependsOnCode")
										.setDisplay("testCodingDependsOnDisplay"))))));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void match_with_originMap() throws Exception {
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "result",
					"valueBoolean": true
				},
				{
					"name": "match",
					"part": [
						{
							"name": "originMap",
							"valueUri": "testOriginMap"
						}
					]
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
				.setResult(true)
				.setMatch(List.of(new ConceptMapTranslateResultParameters.Match()
						.setOriginMap("testOriginMap")));
		
		ConceptMapTranslateResultParameters actual = new ConceptMapTranslateResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
}
