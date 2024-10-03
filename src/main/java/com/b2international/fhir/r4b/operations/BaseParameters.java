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
package com.b2international.fhir.r4b.operations;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import org.hl7.fhir.r4b.model.DataType;
import org.hl7.fhir.r4b.model.Parameters;
import org.hl7.fhir.r4b.model.PrimitiveType;

/**
 * @since 0.1
 */
public abstract class BaseParameters {

	private final Parameters parameters;
	
	public BaseParameters(Parameters parameters) {
		this.parameters = parameters;
	}
	
	public Parameters getParameters() {
		return parameters;
	}
	
	public List<Parameters.ParametersParameterComponent> getParameters(String name) {
		return this.parameters.getParameters(name);
	}
	
	public Optional<Parameters.ParametersParameterComponent> getParameter(String name) {
		return getParameters(name).stream().findFirst();
	}
	
	public <T> T getParameterValue(String name, Function<Parameters.ParametersParameterComponent, T> parameterValueExtractor) {
		return getParameter(name).map(parameterValueExtractor).orElse(null);
	}
	
	public <T> boolean hasParameterWithValue(String name, Function<Parameters.ParametersParameterComponent, T> parameterValueExtractor, T expectedValue) {
		return getParameters(name).stream().map(parameterValueExtractor).filter(expectedValue::equals).findFirst().isPresent();
	}
	
	protected final void addParameter(String name, DataType value) {
		// prevent adding parameters without name and/or value
		if (name == null || value == null) {
			return;
		}
		
		// prevent adding primitive types without actual value
		if (value instanceof PrimitiveType<?> && !value.hasPrimitiveValue()) {
			return;
		}
		
		getParameters().addParameter(name, value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(parameters);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		BaseParameters other = (BaseParameters) obj;
		return this.parameters.equalsDeep(other.getParameters());
	}
}
