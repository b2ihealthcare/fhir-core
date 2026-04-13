/*
 * Copyright 2026 B2i Healthcare, https://b2ihealthcare.com
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
package com.b2international.fhir.r5.formats;

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r5.model.Enumerations;
import org.hl7.fhir.r5.model.Resource;
import org.hl7.fhir.r5.model.ValueSet;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Verifies that {@link FhirR5JsonModule} correctly serializes and deserializes
 * FHIR R5 {@code ValueSet} resources via a Jackson {@link ObjectMapper}.
 *
 * @since 0.5.0
 */
public class FhirR5JsonModuleValueSetTest {

	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void setup() {
		objectMapper = new ObjectMapper().registerModule(new FhirR5JsonModule());
	}

	private static ValueSet buildValueSet() {
		final ValueSet vs = new ValueSet();
		vs.setId("r5-vs");
		vs.setUrl("http://example.com/r5/vs");
		vs.setVersion("1.0.0");
		vs.setName("R5ExampleVS");
		vs.setTitle("R5 Example Value Set");
		vs.setStatus(Enumerations.PublicationStatus.ACTIVE);
		vs.getCompose()
			.addInclude()
				.setSystem("http://example.com/cs")
				.addConcept()
					.setCode("example-code")
					.setDisplay("Example Concept");
		return vs;
	}

	private static void assertValueSet(final ValueSet vs) {
		assertThat(vs.getId()).isEqualTo("r5-vs");
		assertThat(vs.getUrl()).isEqualTo("http://example.com/r5/vs");
		assertThat(vs.getVersion()).isEqualTo("1.0.0");
		assertThat(vs.getName()).isEqualTo("R5ExampleVS");
		assertThat(vs.getTitle()).isEqualTo("R5 Example Value Set");
		assertThat(vs.getStatus()).isEqualTo(Enumerations.PublicationStatus.ACTIVE);
		assertThat(vs.getCompose().getInclude()).hasSize(1);
		assertThat(vs.getCompose().getIncludeFirstRep().getSystem()).isEqualTo("http://example.com/cs");
		assertThat(vs.getCompose().getIncludeFirstRep().getConcept()).hasSize(1);
		assertThat(vs.getCompose().getIncludeFirstRep().getConceptFirstRep().getCode()).isEqualTo("example-code");
		assertThat(vs.getCompose().getIncludeFirstRep().getConceptFirstRep().getDisplay()).isEqualTo("Example Concept");
	}

	@Test
	public void serialize_valueSet() throws Exception {
		final String json = objectMapper.writeValueAsString(buildValueSet());

		assertThat(json).contains("\"resourceType\":\"ValueSet\"");
		assertThat(json).contains("\"url\":\"http://example.com/r5/vs\"");
		assertThat(json).contains("\"version\":\"1.0.0\"");
		assertThat(json).contains("\"name\":\"R5ExampleVS\"");
		assertThat(json).contains("\"status\":\"active\"");
		assertThat(json).contains("\"system\":\"http://example.com/cs\"");
		assertThat(json).contains("\"code\":\"example-code\"");
		assertThat(json).contains("\"display\":\"Example Concept\"");
	}

	@Test
	public void roundtrip_deserialize_to_resource() throws Exception {
		final String json = objectMapper.writeValueAsString(buildValueSet());
		final Resource resource = objectMapper.readValue(json, Resource.class);

		assertThat(resource).isInstanceOf(ValueSet.class);
		assertValueSet((ValueSet) resource);
	}

	@Test
	public void roundtrip_deserialize_to_valueSet() throws Exception {
		final String json = objectMapper.writeValueAsString(buildValueSet());
		final ValueSet valueSet = objectMapper.readValue(json, ValueSet.class);

		assertValueSet(valueSet);
	}

	@Test
	public void deserialize_from_json_literal() throws Exception {
		final String json = """
		{
		  "resourceType": "ValueSet",
		  "id": "r5-vs",
		  "url": "http://example.com/r5/vs",
		  "version": "1.0.0",
		  "name": "R5ExampleVS",
		  "title": "R5 Example Value Set",
		  "status": "active",
		  "compose": {
		    "include": [
		      {
		        "system": "http://example.com/cs",
		        "concept": [
		          {
		            "code": "example-code",
		            "display": "Example Concept"
		          }
		        ]
		      }
		    ]
		  }
		}""";

		final ValueSet valueSet = objectMapper.readValue(json, ValueSet.class);
		assertValueSet(valueSet);
	}
}
