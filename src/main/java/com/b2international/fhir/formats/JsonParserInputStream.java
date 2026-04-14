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
package com.b2international.fhir.formats;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * An {@link InputStream} that re-serializes tokens from a {@link JsonParser} on
 * demand. Each call to {@link #read()} (or {@link #read(byte[], int, int)})
 * advances the source parser by one token when the internal byte buffer is
 * exhausted, keeping peak memory usage proportional to the size of a single
 * JSON token rather than the entire input document.
 * <p>
 * The caller is responsible for closing the source {@link JsonParser}; this
 * stream only closes its own internal {@link JsonGenerator}.
 *
 * @since 0.5.0
 */
public final class JsonParserInputStream extends InputStream {

	private static final class ResettableBuffer extends ByteArrayOutputStream {

		private ResettableBuffer(final int capacity) {
			super(capacity);
		}

		private int readByte(final int offset) {
			// Work around sign extension when converting bytes to ints
			return buf[offset] & 0xFF;
		}

		private void readBytes(final byte[] dest, final int destOff, final int srcOff, final int len) {
			System.arraycopy(buf, srcOff, dest, destOff, len);
		}
	}

	private final JsonParser source;
	private final ResettableBuffer buffer;
	private final JsonGenerator generator;

	/** Read position within the most recently serialized token in {@link #buffer}. */
	private int readPos = 0;

	/** Whether the first token (already current in {@link #source}) has been emitted. */
	private boolean started = false;

	/**
	 * Creates a new instance positioned at the current token of {@code source}.
	 * The source parser must be positioned at a valid token before calling this
	 * constructor.
	 *
	 * @param source the {@link JsonParser} to read tokens from
	 * @throws IOException if the internal {@link JsonGenerator} cannot be created
	 */
	public JsonParserInputStream(final JsonParser source) throws IOException {
		this.source = source;
		this.buffer = new ResettableBuffer(512);
		this.generator = source.getCodec().getFactory().createGenerator(buffer);
	}

	@Override
	public int read() throws IOException {
		if (fillBufferIfNeeded()) {
			return -1;
		}
		
		return buffer.readByte(readPos++);
	}

	@Override
	public int read(final byte[] b, final int off, final int len) throws IOException {
		if (len == 0) {
			return 0;
		}

		if (fillBufferIfNeeded()) {
			return -1;
		}
		
		final int toCopy = Math.min(buffer.size() - readPos, len);
		buffer.readBytes(b, off, readPos, toCopy);
		readPos += toCopy;
		return toCopy;
	}

	private boolean fillBufferIfNeeded() throws IOException {
		while (readPos >= buffer.size()) {
			buffer.reset();
			readPos = 0;

			// Skip the call to source.nextToken() on the first iteration
			if (!started) {
				started = true;
			} else {
				final JsonToken next = source.nextToken();
				if (next == null) {
					return true;
				}
			}

			// Use copyCurrentEventExact instead of copyCurrentEvent to avoid potential conversion losses in JSON number representation
			generator.copyCurrentEventExact(source);
			generator.flush();
		}

		return false;
	}

	@Override
	public void close() throws IOException {
		generator.close();
	}
}
