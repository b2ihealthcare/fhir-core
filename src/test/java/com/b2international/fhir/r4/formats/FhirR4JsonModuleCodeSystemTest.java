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
package com.b2international.fhir.r4.formats;

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r4.model.CodeSystem;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Resource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Verifies that {@link FhirR4JsonModule} correctly serializes and deserializes
 * FHIR R4 {@code CodeSystem} resources via a Jackson {@link ObjectMapper}.
 *
 * @since 0.5.0
 */
public class FhirR4JsonModuleCodeSystemTest {

	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void setup() {
		objectMapper = new ObjectMapper().registerModule(new FhirR4JsonModule());
	}

	private static CodeSystem buildCodeSystem() {
		final CodeSystem cs = new CodeSystem();
		cs.setId("r4-cs");
		cs.setUrl("http://example.com/r4/cs");
		cs.setVersion("1.0.0");
		cs.setName("R4ExampleCS");
		cs.setTitle("R4 Example Code System");
		cs.setStatus(Enumerations.PublicationStatus.ACTIVE);
		cs.setContent(CodeSystem.CodeSystemContentMode.COMPLETE);
		cs.addConcept()
			.setCode("example-code")
			.setDisplay("Example Concept")
			.setDefinition("An example concept used for testing.");
		return cs;
	}

	private static void assertCodeSystem(final CodeSystem cs) {
		assertThat(cs.getId()).isEqualTo("r4-cs");
		assertThat(cs.getUrl()).isEqualTo("http://example.com/r4/cs");
		assertThat(cs.getVersion()).isEqualTo("1.0.0");
		assertThat(cs.getName()).isEqualTo("R4ExampleCS");
		assertThat(cs.getTitle()).isEqualTo("R4 Example Code System");
		assertThat(cs.getStatus()).isEqualTo(Enumerations.PublicationStatus.ACTIVE);
		assertThat(cs.getContent()).isEqualTo(CodeSystem.CodeSystemContentMode.COMPLETE);
		assertThat(cs.getConcept()).hasSize(1);
		assertThat(cs.getConceptFirstRep().getCode()).isEqualTo("example-code");
		assertThat(cs.getConceptFirstRep().getDisplay()).isEqualTo("Example Concept");
		assertThat(cs.getConceptFirstRep().getDefinition()).isEqualTo("An example concept used for testing.");
	}

	@Test
	public void serialize_codeSystem() throws Exception {
		final String json = objectMapper.writeValueAsString(buildCodeSystem());

		assertThat(json).contains("\"resourceType\":\"CodeSystem\"");
		assertThat(json).contains("\"url\":\"http://example.com/r4/cs\"");
		assertThat(json).contains("\"version\":\"1.0.0\"");
		assertThat(json).contains("\"name\":\"R4ExampleCS\"");
		assertThat(json).contains("\"status\":\"active\"");
		assertThat(json).contains("\"content\":\"complete\"");
		assertThat(json).contains("\"code\":\"example-code\"");
		assertThat(json).contains("\"display\":\"Example Concept\"");
	}

	@Test
	public void roundtrip_deserialize_to_resource() throws Exception {
		final String json = objectMapper.writeValueAsString(buildCodeSystem());
		final Resource resource = objectMapper.readValue(json, Resource.class);

		assertThat(resource).isInstanceOf(CodeSystem.class);
		assertCodeSystem((CodeSystem) resource);
	}

	@Test
	public void roundtrip_deserialize_to_codeSystem() throws Exception {
		final String json = objectMapper.writeValueAsString(buildCodeSystem());
		final CodeSystem codeSystem = objectMapper.readValue(json, CodeSystem.class);

		assertCodeSystem(codeSystem);
	}

	@Test
	public void deserialize_from_json_literal() throws Exception {
		final String json = """
		{
		  "resourceType": "CodeSystem",
		  "id": "r4-cs",
		  "url": "http://example.com/r4/cs",
		  "version": "1.0.0",
		  "name": "R4ExampleCS",
		  "title": "R4 Example Code System",
		  "status": "active",
		  "content": "complete",
		  "concept": [
		    {
		      "code": "example-code",
		      "display": "Example Concept",
		      "definition": "An example concept used for testing."
		    }
		  ]
		}""";

		final CodeSystem codeSystem = objectMapper.readValue(json, CodeSystem.class);
		assertCodeSystem(codeSystem);
	}
}
