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

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Allows FHIR R5 Resources to be serialized directly into an existing
 * JsonGenerator (an abstraction provided by Jackson) without an intermediary buffer.
 *
 * @since 0.5.0
 */
final class R5JsonCreatorAdapter implements org.hl7.fhir.r5.formats.JsonCreator {

	private final JsonGenerator gen;

	R5JsonCreatorAdapter(final JsonGenerator gen) {
		this.gen = gen;
	}

	@Override
	public void beginObject() throws IOException {
		gen.writeStartObject();
	}

	@Override
	public void endObject() throws IOException {
		gen.writeEndObject();
	}

	@Override
	public void nullValue() throws IOException {
		gen.writeNull();
	}

	@Override
	public void name(final String name) throws IOException {
		gen.writeFieldName(name);
	}

	@Override
	public void value(final String value) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else {
			gen.writeString(value);
		}
	}

	@Override
	public void value(final Boolean value) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else {
			gen.writeBoolean(value);
		}
	}

	@Override
	public void value(final BigDecimal value) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else {
			gen.writeNumber(value);
		}
	}

	@Override
	public void valueNum(final String value) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else {
			// Write the pre-formatted numeric string using Jackson's writeNumber(String) method
			gen.writeNumber(value);
		}
	}

	@Override
	public void value(final Integer value) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else {
			gen.writeNumber(value.intValue());
		}
	}

	@Override
	public void beginArray() throws IOException {
		gen.writeStartArray();
	}

	@Override
	public void endArray() throws IOException {
		gen.writeEndArray();
	}

	@Override
	public void finish() throws IOException {
		gen.flush();
	}

	@Override
	public void comment(final String content) {
		// Jackson does not support comments in JSON output; no-op
	}

	@Override
	public void link(final String href) {
		// Only used by creators that produce XHTML output; no-op
	}

	@Override
	public void anchor(final String name) {
		// Only used by creators that produce XHTML output; no-op
	}

	@Override
	public void externalLink(final String href) {
		// Only used by creators that produce XHTML output; no-op
	}

	@Override
	public void elide() {
		// Only applicable to eliding output; no-op
	}

	@Override
	public boolean canElide() {
		return false;
	}

	@Override
	public boolean isCanonical() {
		return false;
	}
}
