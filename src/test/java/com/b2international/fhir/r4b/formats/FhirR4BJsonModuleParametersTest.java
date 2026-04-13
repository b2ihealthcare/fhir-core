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
package com.b2international.fhir.r4b.formats;

import static org.assertj.core.api.Assertions.assertThat;

import org.hl7.fhir.r4b.model.Coding;
import org.junit.BeforeClass;
import org.junit.Test;

import com.b2international.fhir.r4b.operations.*;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Verifies that {@link FhirR4BJsonModule} correctly serializes and deserializes
 * FHIR R4B {@link BaseParameters} subclasses via a Jackson {@link ObjectMapper}.
 *
 * @since 0.5.0
 */
public class FhirR4BJsonModuleParametersTest {

	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void setup() {
		objectMapper = new ObjectMapper().registerModule(new FhirR4BJsonModule());
	}

	@Test
	public void codeSystemLookup_serialize() throws Exception {
		final CodeSystemLookupParameters params = new CodeSystemLookupParameters()
			.setCode("testCode")
			.setSystem("http://example.com/system")
			.setVersion("1.0");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"code\"");
		assertThat(json).contains("\"valueCode\":\"testCode\"");
		assertThat(json).contains("\"name\":\"system\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/system\"");
		assertThat(json).contains("\"name\":\"version\"");
		assertThat(json).contains("\"valueString\":\"1.0\"");
	}

	@Test
	public void codeSystemLookup_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "code",
					"valueCode": "testCode"
				},
				{
					"name": "system",
					"valueUri": "http://example.com/system"
				},
				{
					"name": "version",
					"valueString": "1.0"
				}
			]
		}
		""";

		final CodeSystemLookupParameters actual = objectMapper.readValue(json, CodeSystemLookupParameters.class);

		final CodeSystemLookupParameters expected = new CodeSystemLookupParameters()
			.setCode("testCode")
			.setSystem("http://example.com/system")
			.setVersion("1.0");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemLookup_roundtrip() throws Exception {
		final CodeSystemLookupParameters original = new CodeSystemLookupParameters()
			.setCode("testCode")
			.setCoding(new Coding()
				.setSystem("http://example.com")
				.setCode("c1")
				.setDisplay("Concept One"))
			.setDisplayLanguage("en");

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemLookupParameters roundtripped = objectMapper.readValue(json, CodeSystemLookupParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void codeSystemLookupResult_serialize() throws Exception {
		final CodeSystemLookupResultParameters params = new CodeSystemLookupResultParameters()
			.setName("testName")
			.setDisplay("testDisplay")
			.setVersion("1.0");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"name\"");
		assertThat(json).contains("\"valueString\":\"testName\"");
		assertThat(json).contains("\"name\":\"display\"");
		assertThat(json).contains("\"valueString\":\"testDisplay\"");
		assertThat(json).contains("\"name\":\"version\"");
		assertThat(json).contains("\"valueString\":\"1.0\"");
	}

	@Test
	public void codeSystemLookupResult_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "name",
					"valueString": "testName"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";

		final CodeSystemLookupResultParameters actual = objectMapper.readValue(json, CodeSystemLookupResultParameters.class);

		final CodeSystemLookupResultParameters expected = new CodeSystemLookupResultParameters()
			.setName("testName")
			.setDisplay("testDisplay");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemLookupResult_roundtrip() throws Exception {
		final CodeSystemLookupResultParameters original = new CodeSystemLookupResultParameters()
			.setName("testName")
			.setDisplay("testDisplay")
			.setVersion("1.0");

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemLookupResultParameters roundtripped = objectMapper.readValue(json, CodeSystemLookupResultParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void codeSystemSubsumption_serialize() throws Exception {
		final CodeSystemSubsumptionParameters params = new CodeSystemSubsumptionParameters()
			.setCodeA("testCodeA")
			.setCodeB("testCodeB")
			.setSystem("http://example.com/system");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"codeA\"");
		assertThat(json).contains("\"valueCode\":\"testCodeA\"");
		assertThat(json).contains("\"name\":\"codeB\"");
		assertThat(json).contains("\"valueCode\":\"testCodeB\"");
		assertThat(json).contains("\"name\":\"system\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/system\"");
	}

	@Test
	public void codeSystemSubsumption_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "codeA",
					"valueCode": "testCodeA"
				},
				{
					"name": "codeB",
					"valueCode": "testCodeB"
				},
				{
					"name": "system",
					"valueUri": "http://example.com/system"
				}
			]
		}
		""";

		final CodeSystemSubsumptionParameters actual = objectMapper.readValue(json, CodeSystemSubsumptionParameters.class);

		final CodeSystemSubsumptionParameters expected = new CodeSystemSubsumptionParameters()
			.setCodeA("testCodeA")
			.setCodeB("testCodeB")
			.setSystem("http://example.com/system");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemSubsumption_roundtrip() throws Exception {
		final CodeSystemSubsumptionParameters original = new CodeSystemSubsumptionParameters()
			.setCodeA("testCodeA")
			.setCodeB("testCodeB")
			.setSystem("http://example.com/system")
			.setVersion("1.0");

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemSubsumptionParameters roundtripped = objectMapper.readValue(json, CodeSystemSubsumptionParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void codeSystemSubsumptionResult_serialize() throws Exception {
		final CodeSystemSubsumptionResultParameters params = CodeSystemSubsumptionResultParameters.equivalent();

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"outcome\"");
		assertThat(json).contains("\"valueCode\":\"equivalent\"");
	}

	@Test
	public void codeSystemSubsumptionResult_deserialize() throws Exception {
		final String json = """
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

		final CodeSystemSubsumptionResultParameters actual = objectMapper.readValue(json, CodeSystemSubsumptionResultParameters.class);
		final CodeSystemSubsumptionResultParameters expected = CodeSystemSubsumptionResultParameters.equivalent();

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemSubsumptionResult_roundtrip() throws Exception {
		final CodeSystemSubsumptionResultParameters original = CodeSystemSubsumptionResultParameters.equivalent();

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemSubsumptionResultParameters roundtripped = objectMapper.readValue(json, CodeSystemSubsumptionResultParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void codeSystemValidateCode_serialize() throws Exception {
		final CodeSystemValidateCodeParameters params = new CodeSystemValidateCodeParameters()
			.setUrl("http://example.com/system")
			.setCode("testCode")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"url\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/system\"");
		assertThat(json).contains("\"name\":\"code\"");
		assertThat(json).contains("\"valueCode\":\"testCode\"");
		assertThat(json).contains("\"name\":\"display\"");
		assertThat(json).contains("\"valueString\":\"testDisplay\"");
	}

	@Test
	public void codeSystemValidateCode_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "url",
					"valueUri": "http://example.com/system"
				},
				{
					"name": "code",
					"valueCode": "testCode"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";

		final CodeSystemValidateCodeParameters actual = objectMapper.readValue(json, CodeSystemValidateCodeParameters.class);

		final CodeSystemValidateCodeParameters expected = new CodeSystemValidateCodeParameters()
			.setUrl("http://example.com/system")
			.setCode("testCode")
			.setDisplay("testDisplay");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemValidateCode_roundtrip() throws Exception {
		final CodeSystemValidateCodeParameters original = new CodeSystemValidateCodeParameters()
			.setUrl("http://example.com/system")
			.setCode("testCode")
			.setVersion("1.0")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemValidateCodeParameters roundtripped = objectMapper.readValue(json, CodeSystemValidateCodeParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void codeSystemValidateCodeResult_serialize() throws Exception {
		final CodeSystemValidateCodeResultParameters params = new CodeSystemValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"result\"");
		assertThat(json).contains("\"valueBoolean\":true");
		assertThat(json).contains("\"name\":\"message\"");
		assertThat(json).contains("\"valueString\":\"testMessage\"");
		assertThat(json).contains("\"name\":\"display\"");
		assertThat(json).contains("\"valueString\":\"testDisplay\"");
	}

	@Test
	public void codeSystemValidateCodeResult_deserialize() throws Exception {
		final String json = """
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
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";

		final CodeSystemValidateCodeResultParameters actual = objectMapper.readValue(json, CodeSystemValidateCodeResultParameters.class);

		final CodeSystemValidateCodeResultParameters expected = new CodeSystemValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void codeSystemValidateCodeResult_roundtrip() throws Exception {
		final CodeSystemValidateCodeResultParameters original = new CodeSystemValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(original);
		final CodeSystemValidateCodeResultParameters roundtripped = objectMapper.readValue(json, CodeSystemValidateCodeResultParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void conceptMapTranslate_serialize() throws Exception {
		final ConceptMapTranslateParameters params = new ConceptMapTranslateParameters()
			.setUrl("http://example.com/conceptmap")
			.setCode("testCode")
			.setSystem("http://example.com/source");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"url\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/conceptmap\"");
		assertThat(json).contains("\"name\":\"code\"");
		assertThat(json).contains("\"valueCode\":\"testCode\"");
		assertThat(json).contains("\"name\":\"system\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/source\"");
	}

	@Test
	public void conceptMapTranslate_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "url",
					"valueUri": "http://example.com/conceptmap"
				},
				{
					"name": "code",
					"valueCode": "testCode"
				},
				{
					"name": "system",
					"valueUri": "http://example.com/source"
				}
			]
		}
		""";

		final ConceptMapTranslateParameters actual = objectMapper.readValue(json, ConceptMapTranslateParameters.class);

		final ConceptMapTranslateParameters expected = new ConceptMapTranslateParameters()
			.setUrl("http://example.com/conceptmap")
			.setCode("testCode")
			.setSystem("http://example.com/source");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void conceptMapTranslate_roundtrip() throws Exception {
		final ConceptMapTranslateParameters original = new ConceptMapTranslateParameters()
			.setUrl("http://example.com/conceptmap")
			.setCode("testCode")
			.setSystem("http://example.com/source");

		final String json = objectMapper.writeValueAsString(original);
		final ConceptMapTranslateParameters roundtripped = objectMapper.readValue(json, ConceptMapTranslateParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void conceptMapTranslateResult_serialize() throws Exception {
		final ConceptMapTranslateResultParameters params = new ConceptMapTranslateResultParameters()
			.setResult(true)
			.setMessage("testMessage");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"result\"");
		assertThat(json).contains("\"valueBoolean\":true");
		assertThat(json).contains("\"name\":\"message\"");
		assertThat(json).contains("\"valueString\":\"testMessage\"");
	}

	@Test
	public void conceptMapTranslateResult_deserialize() throws Exception {
		final String json = """
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

		final ConceptMapTranslateResultParameters actual = objectMapper.readValue(json, ConceptMapTranslateResultParameters.class);

		final ConceptMapTranslateResultParameters expected = new ConceptMapTranslateResultParameters()
			.setResult(true)
			.setMessage("testMessage");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void conceptMapTranslateResult_roundtrip() throws Exception {
		final ConceptMapTranslateResultParameters original = new ConceptMapTranslateResultParameters()
			.setResult(true)
			.setMessage("testMessage");

		final String json = objectMapper.writeValueAsString(original);
		final ConceptMapTranslateResultParameters roundtripped = objectMapper.readValue(json, ConceptMapTranslateResultParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void valueSetExpand_serialize() throws Exception {
		final ValueSetExpandParameters params = new ValueSetExpandParameters()
			.setUrl("http://example.com/valueset")
			.setValueSetVersion("1.0")
			.setFilter("test");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"url\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/valueset\"");
		assertThat(json).contains("\"name\":\"valueSetVersion\"");
		assertThat(json).contains("\"valueString\":\"1.0\"");
		assertThat(json).contains("\"name\":\"filter\"");
		assertThat(json).contains("\"valueString\":\"test\"");
	}

	@Test
	public void valueSetExpand_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "url",
					"valueUri": "http://example.com/valueset"
				},
				{
					"name": "valueSetVersion",
					"valueString": "1.0"
				},
				{
					"name": "filter",
					"valueString": "test"
				}
			]
		}
		""";

		final ValueSetExpandParameters actual = objectMapper.readValue(json, ValueSetExpandParameters.class);

		final ValueSetExpandParameters expected = new ValueSetExpandParameters()
			.setUrl("http://example.com/valueset")
			.setValueSetVersion("1.0")
			.setFilter("test");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void valueSetExpand_roundtrip() throws Exception {
		final ValueSetExpandParameters original = new ValueSetExpandParameters()
			.setUrl("http://example.com/valueset")
			.setValueSetVersion("1.0")
			.setFilter("test")
			.setCount(100);

		final String json = objectMapper.writeValueAsString(original);
		final ValueSetExpandParameters roundtripped = objectMapper.readValue(json, ValueSetExpandParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void valueSetValidateCode_serialize() throws Exception {
		final ValueSetValidateCodeParameters params = new ValueSetValidateCodeParameters()
			.setUrl("http://example.com/valueset")
			.setCode("testCode")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"url\"");
		assertThat(json).contains("\"valueUri\":\"http://example.com/valueset\"");
		assertThat(json).contains("\"name\":\"code\"");
		assertThat(json).contains("\"valueCode\":\"testCode\"");
		assertThat(json).contains("\"name\":\"display\"");
		assertThat(json).contains("\"valueString\":\"testDisplay\"");
	}

	@Test
	public void valueSetValidateCode_deserialize() throws Exception {
		final String json = """
		{
			"resourceType": "Parameters",
			"parameter": [
				{
					"name": "url",
					"valueUri": "http://example.com/valueset"
				},
				{
					"name": "code",
					"valueCode": "testCode"
				},
				{
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";

		final ValueSetValidateCodeParameters actual = objectMapper.readValue(json, ValueSetValidateCodeParameters.class);

		final ValueSetValidateCodeParameters expected = new ValueSetValidateCodeParameters()
			.setUrl("http://example.com/valueset")
			.setCode("testCode")
			.setDisplay("testDisplay");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void valueSetValidateCode_roundtrip() throws Exception {
		final ValueSetValidateCodeParameters original = new ValueSetValidateCodeParameters()
			.setUrl("http://example.com/valueset")
			.setCode("testCode")
			.setSystemVersion("1.0")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(original);
		final ValueSetValidateCodeParameters roundtripped = objectMapper.readValue(json, ValueSetValidateCodeParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}

	@Test
	public void valueSetValidateCodeResult_serialize() throws Exception {
		final ValueSetValidateCodeResultParameters params = new ValueSetValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(params);

		assertThat(json).contains("\"resourceType\":\"Parameters\"");
		assertThat(json).contains("\"name\":\"result\"");
		assertThat(json).contains("\"valueBoolean\":true");
		assertThat(json).contains("\"name\":\"message\"");
		assertThat(json).contains("\"valueString\":\"testMessage\"");
		assertThat(json).contains("\"name\":\"display\"");
		assertThat(json).contains("\"valueString\":\"testDisplay\"");
	}

	@Test
	public void valueSetValidateCodeResult_deserialize() throws Exception {
		final String json = """
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
					"name": "display",
					"valueString": "testDisplay"
				}
			]
		}
		""";

		final ValueSetValidateCodeResultParameters actual = objectMapper.readValue(json, ValueSetValidateCodeResultParameters.class);

		final ValueSetValidateCodeResultParameters expected = new ValueSetValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void valueSetValidateCodeResult_roundtrip() throws Exception {
		final ValueSetValidateCodeResultParameters original = new ValueSetValidateCodeResultParameters()
			.setResult(true)
			.setMessage("testMessage")
			.setDisplay("testDisplay");

		final String json = objectMapper.writeValueAsString(original);
		final ValueSetValidateCodeResultParameters roundtripped = objectMapper.readValue(json, ValueSetValidateCodeResultParameters.class);

		assertThat(roundtripped).isEqualTo(original);
	}
}
