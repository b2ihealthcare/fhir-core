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

import java.io.IOException;

import org.hl7.fhir.exceptions.FHIRFormatError;

import com.b2international.fhir.formats.JsonParserInputStream;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Jackson module supporting serialization and deserialization of FHIR R4
 * {@link org.hl7.fhir.r4.model.Resource} instances.
 *
 * @since 0.5.0
 */
public final class FhirR4JsonModule extends SimpleModule {

	private static final long serialVersionUID = 1L;

	private static final class ResourceSerializer extends JsonSerializer<org.hl7.fhir.r4.model.Resource> {

		@Override
		public void serialize(final org.hl7.fhir.r4.model.Resource value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
			final R4JsonCreatorAdapter adapter = new R4JsonCreatorAdapter(gen);

			adapter.beginObject();
			new org.hl7.fhir.r4.formats.JsonParser().compose(adapter, value);
			adapter.endObject();
			adapter.finish();
		}

		@Override
		public Class<org.hl7.fhir.r4.model.Resource> handledType() {
			return org.hl7.fhir.r4.model.Resource.class;
		}
	}

	private static final class ResourceDeserializer extends JsonDeserializer<org.hl7.fhir.r4.model.Resource> {

		@Override
		public org.hl7.fhir.r4.model.Resource deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException {
			try (final JsonParserInputStream in = new JsonParserInputStream(p)) {
				return new org.hl7.fhir.r4.formats.JsonParser().parse(in);
			} catch (final FHIRFormatError e) {
				throw new IOException("Failed to deserialize FHIR R4 resource: " + e.getMessage(), e);
			}
		}

		@Override
		public Class<org.hl7.fhir.r4.model.Resource> handledType() {
			return org.hl7.fhir.r4.model.Resource.class;
		}
	}
	
	private static final class BaseParametersSerializer extends JsonSerializer<com.b2international.fhir.r4.operations.BaseParameters> {

	    @Override
	    public void serialize(final com.b2international.fhir.r4.operations.BaseParameters value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
	        if (value == null) {
	            gen.writeNull();
	            return;
	        }

	        final org.hl7.fhir.r4.model.Parameters params = value.getParameters();
	        if (params == null) {
	            gen.writeNull();
	            return;
	        }

	        final JsonSerializer<Object> paramsSerializer = serializers.findValueSerializer(params.getClass());
	        paramsSerializer.serialize(params, gen, serializers);
	    }

	    @Override
	    public Class<com.b2international.fhir.r4.operations.BaseParameters> handledType() {
	        return com.b2international.fhir.r4.operations.BaseParameters.class;
	    }
	}
	
	private static final class BaseParametersDeserializer extends JsonDeserializer<com.b2international.fhir.r4.operations.BaseParameters> {

	    private final Class<? extends com.b2international.fhir.r4.operations.BaseParameters> parametersType;

	    private BaseParametersDeserializer() {
	        this(null);
	    }

	    private BaseParametersDeserializer(final Class<? extends com.b2international.fhir.r4.operations.BaseParameters> parametersType) {
	        this.parametersType = parametersType;
	    }

	    @Override
	    public com.b2international.fhir.r4.operations.BaseParameters deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException {
	        try (final JsonParserInputStream in = new JsonParserInputStream(p)) {

	        	final org.hl7.fhir.r4.model.Resource resource = new org.hl7.fhir.r4.formats.JsonParser().parse(in);
	            if (resource == null) {
	                return null;
	            }
	            
	            if (!(resource instanceof org.hl7.fhir.r4.model.Parameters)) {
	                throw new IOException("Expected a FHIR Parameters resource but parsed: " + resource.getClass().getName());
	            }
	            
	            final org.hl7.fhir.r4.model.Parameters params = (org.hl7.fhir.r4.model.Parameters) resource;

	            Class<? extends com.b2international.fhir.r4.operations.BaseParameters> clazz = this.parametersType;
	            if (clazz == null) {
	                final JavaType ctxType = ctxt.getContextualType();
	                if (ctxType != null) {
	                    final Class<?> raw = ctxType.getRawClass();
	                    if (com.b2international.fhir.r4.operations.BaseParameters.class.isAssignableFrom(raw)) {
	                        clazz = raw.asSubclass(com.b2international.fhir.r4.operations.BaseParameters.class);
	                    }
	                }
	            }

	            if (clazz == null || clazz.equals(com.b2international.fhir.r4.operations.BaseParameters.class)) {
	                throw new IOException("Cannot determine BaseParameters subclass to instantiate");
	            }

	            try {
	                final java.lang.reflect.Constructor<? extends com.b2international.fhir.r4.operations.BaseParameters> ctor = 
                		clazz.getDeclaredConstructor(org.hl7.fhir.r4.model.Parameters.class);
	                return ctor.newInstance(params);
	            } catch (final NoSuchMethodException e) {
	                throw new IOException("No suitable constructor found for wrapper " + clazz.getName() + ": expected a single-argument constructor accepting a Parameters instance", e);
	            } catch (final ReflectiveOperationException e) {
	                throw new IOException("Failed to instantiate wrapper " + clazz.getName(), e);
	            }
	            
	        } catch (final org.hl7.fhir.exceptions.FHIRFormatError e) {
	            throw new IOException("Failed to parse FHIR Parameters: " + e.getMessage(), e);
	        }
	    }

	    @Override
	    public Class<com.b2international.fhir.r4.operations.BaseParameters> handledType() {
	        return com.b2international.fhir.r4.operations.BaseParameters.class;
	    }
	}

	public FhirR4JsonModule() {
		super(FhirR4JsonModule.class.getSimpleName());

		addSerializer(org.hl7.fhir.r4.model.Resource.class, new ResourceSerializer());
		addSerializer(com.b2international.fhir.r4.operations.BaseParameters.class, new BaseParametersSerializer());

		setDeserializers(new SimpleDeserializers() {
			@Override
			public JsonDeserializer<?> findBeanDeserializer(final JavaType type, final DeserializationConfig config, final BeanDescription beanDesc)
				throws JsonMappingException {

				// TODO: introduce caching of deserializers if necessary
				if (org.hl7.fhir.r4.model.Resource.class.isAssignableFrom(type.getRawClass())) {
					return new ResourceDeserializer();
				} else if (com.b2international.fhir.r4.operations.BaseParameters.class.isAssignableFrom(beanDesc.getBeanClass())) {
					return new BaseParametersDeserializer(beanDesc.getBeanClass().asSubclass(com.b2international.fhir.r4.operations.BaseParameters.class));
				} else {
					return null;
				}
			}
		});
	}
}
