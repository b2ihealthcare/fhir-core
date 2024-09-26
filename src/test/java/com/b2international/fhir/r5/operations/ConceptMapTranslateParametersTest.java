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
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.DataType;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ConceptMapTranslateParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void all_params() throws Exception {
	
		String json = """
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "url",
					"valueUri": "testuri" 
				},
				{
					"name": "conceptMap",
					"resource" : {
						"resourceType" : "ConceptMap",
						"url" : "testResourceUri", 
						"version" : "testResourceVersion",
						"name" : "testCM",
						"title" : "Test concept map"
					}
				},
				{
					"name": "conceptMapVersion",
					"valueString": "testConceptMapVersion"
				},
				{
					"name": "sourceCode",
					"valueCode": "testSourceCode"
				},
				{
					"name": "system",
					"valueUri": "testSystemUri"
				},
				{
					"name": "version",
					"valueString": "testVersion"
				},
				{
					"name": "sourceScope",
					"valueUri": "testSourceScope"
				},
				{
					"name": "sourceCoding",
					"valueCoding": {
						"system": "testCodingSourceSystem",
						"code": "testCodingSourceCode",
						"display": "testCodingSourceDisplay"
					}	
				},
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
				},
				{
					"name": "targetCode",
					"valueCode": "testTargetCode"
				},
				{
					"name": "targetCoding",
					"valueCoding": {
						"system": "testCodingTargetSystem",
						"code": "testCodingTargetCode",
						"display": "testCodingTargetDisplay"
					}	
				},
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
				},
				{
					"name": "targetScope",
					"valueUri": "testTargetScope"
				},
				{
					"name": "targetSystem",
					"valueUri": "testTargetSystem"
				},
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
		}""";
			
		Resource resource = parser.parse(json);
		
		assertThat(resource).isInstanceOf(Parameters.class);
		
		var parameters = new ConceptMapTranslateParameters((Parameters) resource);
		
		// url	
		assertThat(parameters.getUrl().getValueAsString()).isEqualTo("testuri");
		
		// conceptMap
		assertThat(parameters.getConceptMap().getName()).isEqualTo("testCM");
		
		// conceptMapVersion
		assertThat(parameters.getConceptMapVersion().getValueAsString()).isEqualTo("testConceptMapVersion");
		
		// sourceCode
		assertThat(parameters.getSourceCode().getValueAsString()).isEqualTo("testSourceCode");
		
		// system
		assertThat(parameters.getSystem().getValueAsString()).isEqualTo("testSystemUri");
		
		// version
		assertThat(parameters.getVersion().getValueAsString()).isEqualTo("testVersion");
		
		// sourceScope
		assertThat(parameters.getSourceScope().getValueAsString()).isEqualTo("testSourceScope");
		
		// sourceCoding
		assertThat(parameters.getSourceCoding().getSystem()).isEqualTo("testCodingSourceSystem");
		
		// sourceCodeableConcept
		assertThat(parameters.getSourceCodeableConcept().getCoding().get(0).getSystem()).isEqualTo("sourceSystem");
		
		// targetCode
		assertThat(parameters.getTargetCode().getValueAsString()).isEqualTo("testTargetCode");
		
		// targetCoding
		assertThat(parameters.getTargetCoding().getSystem()).isEqualTo("testCodingTargetSystem");
		
		// targetCodeableConcept
		assertThat(parameters.getTargetCodeableConcept().getCoding().get(0).getSystem()).isEqualTo("targetSystem");
		
		// targetScope
		assertThat(parameters.getTargetScope().getValueAsString()).isEqualTo("testTargetScope");
		
		// targetSystem
		assertThat(parameters.getTargetSystem().getValueAsString()).isEqualTo("testTargetSystem");
		
		// dependency.attribute
		assertThat(parameters.getDependency().get(0).getAttribute().getValueAsString()).isEqualTo("testDepAttribute");
		
		// dependency.value
		Coding value = (Coding) parameters.getDependency().get(0).getValue();
		assertThat(value.getSystem()).isEqualTo("testDepCodingValue");
	}
}