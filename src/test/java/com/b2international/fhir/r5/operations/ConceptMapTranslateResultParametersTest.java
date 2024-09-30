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

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ConceptMapTranslateResultParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void all_params() throws Exception {
		
		String 	json = """
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
				},
				{
					"name": "match",
					"part": [
						{
							"name": "relationship",
							"valueCode": "testRelationship"
						},
						{
							"name": "concept",
							"valueCoding": {
								"system": "testCodingSystem",
								"code": "testCodingCode",
								"display": "testCodingDisplay"
							}
						},
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
						},
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
						},
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
						},
						{
							"name": "originMap",
							"valueUri": "testOriginMap"
						},
					]
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new ConceptMapTranslateResultParameters((Parameters) resource);
	}
}