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
public class CodeSystemLookupParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void code() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "code",
					"valueCode": "testCode" 
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setCode("testCode");
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
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
					"valueUri": "testSystem"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setSystem("testSystem");
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
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
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setVersion("testVersion");
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void coding() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "coding",
					"valueCoding": {
							"system": "testValueCodingSystem",
							"code": "testCodingValueCode",
							"display": "testDisplay"
					}
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setCoding(
				new Coding()
					.setSystem("testValueCodingSystem")
					.setCode("testCodingValueCode")
					.setDisplay("testDisplay")
		);
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void date() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "date",
					"valueDateTime": "2024"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setDate("2024");
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void displayLanguage() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "displayLanguage",
					"valueCode": "en"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setDisplayLanguage("en");
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
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
					"valueCode": "testCode"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setProperty(List.of("testCode"));
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
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
					"valueCode": "testCode1"
				},
				{
					"name": "property",
					"valueCode": "testCode2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setProperty(List.of("testCode1", "testCode2"));
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void useSupplement() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "useSupplement",
					"valueCanonical": "testUri"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setUseSupplement(List.of("testUri"));
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_useSupplements() throws Exception {
		
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter" : [
				{
					"name": "useSupplement",
					"valueCanonical": "testUri1"
				},
				{
					"name": "useSupplement",
					"valueCanonical": "testUri2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		CodeSystemLookupParameters expected = new CodeSystemLookupParameters().setUseSupplement(List.of("testUri1", "testUri2"));
		
		CodeSystemLookupParameters actual = new CodeSystemLookupParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
}