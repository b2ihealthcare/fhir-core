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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import org.hl7.fhir.r4b.model.DataType;
import org.hl7.fhir.r4b.model.Extension;
import org.hl7.fhir.r4b.model.Parameters;
import org.hl7.fhir.r4b.model.Parameters.ParametersParameterComponent;
import org.hl7.fhir.r4b.model.PrimitiveType;

/**
 * @since 0.1
 */
public abstract class BasePart {

	private final List<Parameters.ParametersParameterComponent> part;
	private List<Extension> extension;
	
	public BasePart() {
		this(null);
	}
	
	public BasePart(List<Parameters.ParametersParameterComponent> part) {
		this.part = part == null ? new ArrayList<>(1) : part;
	}
	
	public final List<ParametersParameterComponent> getPart() {
		return part;
	}
	
	public final List<ParametersParameterComponent> getPartSorted() {
		return part.stream().sorted(this::sortBy).toList();
	}
	
	protected final Optional<Parameters.ParametersParameterComponent> getParameter(String name) {
		return getParameters(name).findFirst();
	}
	
	protected final Stream<Parameters.ParametersParameterComponent> getParameters(String name) {
		return getPart().stream().filter(param -> param.getName().equals(name));
	}
	
	protected final <T> T getParameterValue(String name, Function<Parameters.ParametersParameterComponent, T> parameterValueExtractor) {
		return getParameter(name).map(parameterValueExtractor).orElse(null);
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
		
		addParameter(
			new Parameters.ParametersParameterComponent()
				.setName(name)
				.setValue(value)
		);
	}
	
	protected final void addParameter(Parameters.ParametersParameterComponent parameter) {
		part.add(parameter);
	}

	protected int sortBy(Parameters.ParametersParameterComponent parameterA, Parameters.ParametersParameterComponent parameterB) {
		return 0;
	}
	
	public List<Extension> getExtension() {
		return extension;
	}
	
	public void setExtension(List<Extension> extension) {
		this.extension = extension;
	}
	
}
