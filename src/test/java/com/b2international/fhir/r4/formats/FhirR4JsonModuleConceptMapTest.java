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

import org.hl7.fhir.r4.model.ConceptMap;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Resource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Verifies that {@link FhirR4JsonModule} correctly serializes and deserializes
 * FHIR R4 {@code ConceptMap} resources via a Jackson {@link ObjectMapper}.
 *
 * @since 0.5.0
 */
public class FhirR4JsonModuleConceptMapTest {

	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void setup() {
		objectMapper = new ObjectMapper().registerModule(new FhirR4JsonModule());
	}

	private static ConceptMap buildConceptMap() {
		final ConceptMap cm = new ConceptMap();
		cm.setId("r4-cm");
		cm.setUrl("http://example.com/r4/cm");
		cm.setVersion("1.0.0");
		cm.setName("R4ExampleCM");
		cm.setTitle("R4 Example Concept Map");
		cm.setStatus(Enumerations.PublicationStatus.ACTIVE);
		cm.addGroup()
			.setSource("http://example.com/source")
			.setTarget("http://example.com/target")
			.addElement()
				.setCode("source-code")
				.addTarget()
					.setCode("target-code")
					.setEquivalence(Enumerations.ConceptMapEquivalence.EQUAL);
		return cm;
	}

	private static void assertConceptMap(final ConceptMap cm) {
		assertThat(cm.getId()).isEqualTo("r4-cm");
		assertThat(cm.getUrl()).isEqualTo("http://example.com/r4/cm");
		assertThat(cm.getVersion()).isEqualTo("1.0.0");
		assertThat(cm.getName()).isEqualTo("R4ExampleCM");
		assertThat(cm.getTitle()).isEqualTo("R4 Example Concept Map");
		assertThat(cm.getStatus()).isEqualTo(Enumerations.PublicationStatus.ACTIVE);
		assertThat(cm.getGroup()).hasSize(1);
		assertThat(cm.getGroupFirstRep().getSource()).isEqualTo("http://example.com/source");
		assertThat(cm.getGroupFirstRep().getTarget()).isEqualTo("http://example.com/target");
		assertThat(cm.getGroupFirstRep().getElement()).hasSize(1);
		assertThat(cm.getGroupFirstRep().getElementFirstRep().getCode()).isEqualTo("source-code");
		assertThat(cm.getGroupFirstRep().getElementFirstRep().getTarget()).hasSize(1);
		assertThat(cm.getGroupFirstRep().getElementFirstRep().getTargetFirstRep().getCode()).isEqualTo("target-code");
		assertThat(cm.getGroupFirstRep().getElementFirstRep().getTargetFirstRep().getEquivalence()).isEqualTo(Enumerations.ConceptMapEquivalence.EQUAL);
	}

	@Test
	public void serialize_conceptMap() throws Exception {
		final String json = objectMapper.writeValueAsString(buildConceptMap());

		assertThat(json).contains("\"resourceType\":\"ConceptMap\"");
		assertThat(json).contains("\"url\":\"http://example.com/r4/cm\"");
		assertThat(json).contains("\"version\":\"1.0.0\"");
		assertThat(json).contains("\"name\":\"R4ExampleCM\"");
		assertThat(json).contains("\"status\":\"active\"");
		assertThat(json).contains("\"source\":\"http://example.com/source\"");
		assertThat(json).contains("\"target\":\"http://example.com/target\"");
		assertThat(json).contains("\"code\":\"source-code\"");
		assertThat(json).contains("\"code\":\"target-code\"");
		assertThat(json).contains("\"equivalence\":\"equal\"");
	}

	@Test
	public void roundtrip_deserialize_to_resource() throws Exception {
		final String json = objectMapper.writeValueAsString(buildConceptMap());
		final Resource resource = objectMapper.readValue(json, Resource.class);

		assertThat(resource).isInstanceOf(ConceptMap.class);
		assertConceptMap((ConceptMap) resource);
	}

	@Test
	public void roundtrip_deserialize_to_conceptMap() throws Exception {
		final String json = objectMapper.writeValueAsString(buildConceptMap());
		final ConceptMap conceptMap = objectMapper.readValue(json, ConceptMap.class);

		assertConceptMap(conceptMap);
	}

	@Test
	public void deserialize_from_json_literal() throws Exception {
		final String json = """
		{
		  "resourceType": "ConceptMap",
		  "id": "r4-cm",
		  "url": "http://example.com/r4/cm",
		  "version": "1.0.0",
		  "name": "R4ExampleCM",
		  "title": "R4 Example Concept Map",
		  "status": "active",
		  "group": [
		    {
		      "source": "http://example.com/source",
		      "target": "http://example.com/target",
		      "element": [
		        {
		          "code": "source-code",
		          "target": [
		            {
		              "code": "target-code",
		              "equivalence": "equal"
		            }
		          ]
		        }
		      ]
		    }
		  ]
		}""";

		final ConceptMap conceptMap = objectMapper.readValue(json, ConceptMap.class);
		assertConceptMap(conceptMap);
	}
}
