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

import static org.junit.Assert.*;

import java.util.List;

import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.model.Parameters;
import org.hl7.fhir.r5.model.Resource;
import org.hl7.fhir.r5.model.ValueSet;
import org.junit.Test;

/**
 * @since 0.1
 */
public class ValueSetExpandParametersTest {
	
	private final JsonParser parser = new JsonParser();
	
	@Test
	public void url() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "url",
					"valueUri": "testUri"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setUrl("testUri");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
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
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setValueSet(new ValueSet()
						.setUrl("testResourceUri")
						.setVersion("testResourceVersion")
						.setName("testVS")
						.setTitle("Test value set"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void valueSetVersion() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "valueSetVersion",
					"valueString": "testValueSetVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setValueSetVersion("testValueSetVersion");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void context() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "context",
					"valueUri": "testContext"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setContext("testContext");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void contextDirection() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "contextDirection",
					"valueCode": "testContextDirection"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setContextDirection("testContextDirection");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void filter() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "filter",
					"valueString": "testFilter"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setFilter("testFilter");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
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
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setDate("2024-10-02");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void offset() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "offset",
					"valueInteger": "10"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setOffset(10);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void count() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "count",
					"valueInteger": "8"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setCount(8);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void includeDesignations() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "includeDesignations",
					"valueBoolean": "false"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setIncludeDesignations(false);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void designation() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "designation",
					"valueString": "testDesignation"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setDesignation(List.of("testDesignation"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_designations() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "designation",
					"valueString": "testDesignation1"
				},
				{
					"name": "designation",
					"valueString": "testDesignation2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setDesignation(List.of("testDesignation1", "testDesignation2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void includeDefinition() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "includeDefinition",
					"valueBoolean": "false"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setIncludeDefinition(false);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void activeOnly() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "activeOnly",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setActiveOnly(true);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
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
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setUseSupplement(List.of("testUseSupplement"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
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
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setUseSupplement(List.of("testUseSupplement1", "testUseSupplement2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void excludeNested() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "excludeNested",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setExcludeNested(true);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void excludeNotForUI() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "excludeNotForUI",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setExcludeNotForUI(true);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void excludePostCoordinated() throws Exception {
		
		String json = """
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "excludePostCoordinated",
					"valueBoolean": "true"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setExcludePostCoordinated(true);
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void displayLanguage() throws Exception {
		
		String json = """
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
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setDisplayLanguage("en");
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void property() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "property",
					"valueString": "testProperty"
				}
			]
		}
		""";
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setProperty(List.of("testProperty"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_properties() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "property",
					"valueString": "testProperty1"
				},
				{
					"name": "property",
					"valueString": "testProperty2"
				}
			]
		}
		""";
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setProperty(List.of("testProperty1", "testProperty2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void exlcludeSystem() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "exclude-system",
					"valueCanonical": "testSystem"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setExcludeSystem(List.of("testSystem"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_exlcludeSystems() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "exclude-system",
					"valueCanonical": "testSystem1"
				},
				{
					"name": "exclude-system",
					"valueCanonical": "testSystem2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setExcludeSystem(List.of("testSystem1", "testSystem2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
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
					"name": "system-version",
					"valueCanonical": "testVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setSystemVersion(List.of("testVersion"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_systemVersions() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "system-version",
					"valueCanonical": "testVersion1"
				},
				{
					"name": "system-version",
					"valueCanonical": "testVersion2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setSystemVersion(List.of("testVersion1", "testVersion2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkSystemVersion() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "check-system-version",
					"valueCanonical": "testCheckVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setCheckSystemVersion(List.of("testCheckVersion"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_checkSystemVersions() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "check-system-version",
					"valueCanonical": "testCheckVersion1"
				},
				{
					"name": "check-system-version",
					"valueCanonical": "testCheckVersion2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setCheckSystemVersion(List.of("testCheckVersion1", "testCheckVersion2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void forceSystemVersion() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "force-system-version",
					"valueCanonical": "testForceVersion"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setForceSystemVersion(List.of("testForceVersion"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void multiple_forceSystemVersions() throws Exception {
		String json = 
		"""
		{
			"resourceType": "Parameters",
			"parameter": [ 
				{
					"name": "force-system-version",
					"valueCanonical": "testForceVersion1"
				},
				{
					"name": "force-system-version",
					"valueCanonical": "testForceVersion2"
				}
			]
		}
		""";
		
		Resource resource = parser.parse(json);
		
		ValueSetExpandParameters expected = new ValueSetExpandParameters()
				.setForceSystemVersion(List.of("testForceVersion1", "testForceVersion2"));
		
		ValueSetExpandParameters actual = new ValueSetExpandParameters((Parameters) resource);
		
		assertEquals(expected, actual);
	}

}