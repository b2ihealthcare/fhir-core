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
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.junit.Test;

/**
 * @since 0.1
 */
public class CodeSystemSubsumptionResultParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void outcome() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "outcome",
					"valueCode": "equivalent"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemSubsumptionResultParameters expected = CodeSystemSubsumptionResultParameters.equivalent();
		
		CodeSystemSubsumptionResultParameters actual = new CodeSystemSubsumptionResultParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
}