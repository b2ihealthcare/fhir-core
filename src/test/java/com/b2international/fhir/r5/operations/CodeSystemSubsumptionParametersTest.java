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

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.Coding;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

import com.b2international.fhir.operations.OperationParametersFactory.CodeSystemSubsumptionParametersFactory;

/**
 * @since 0.1
 */
public class CodeSystemSubsumptionParametersTest extends InputParametersTest<CodeSystemSubsumptionParameters> {
	
	private final JsonParser parser = new JsonParser();
	
	public CodeSystemSubsumptionParametersTest() {
		super(CodeSystemSubsumptionParametersFactory.INSTANCE);
	}
	
	@Test
	public void codeA() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codeA",
					"valueCode": "testCodeA"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);

		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setCodeA("testCodeA");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void codeB() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codeB",
					"valueCode": "testCodeB"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);
		
		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setCodeB("testCodeB");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void system() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "system",
					"valueUri": "testUri"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);

		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setSystem("testUri");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void version() throws Exception {
		
		String json = """
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
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);

		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setVersion("testVersion");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void codingA() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codingA",
					"valueCoding": {
						"system": "testCodingSystemA",
						"code": "testCodingCodeA",
						"display": "testCodingDisplayA"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);

		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setCodingA(new Coding()
						.setSystem("testCodingSystemA")
						.setCode("testCodingCodeA")
						.setDisplay("testCodingDisplayA"));
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void codingB() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "codingB",
					"valueCoding": {
						"system": "testCodingSystemB",
						"code": "testCodingCodeB",
						"display": "testCodingDisplayB"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		checkInvalidParameter(resource);
		checkInvalidPart(resource);
		CodeSystemSubsumptionParameters actual = createFromResource(resource);

		CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
				.setCodingB(new Coding()
						.setSystem("testCodingSystemB")
						.setCode("testCodingCodeB")
						.setDisplay("testCodingDisplayB"));
		
		assertEquals(expected, actual);
	}
}