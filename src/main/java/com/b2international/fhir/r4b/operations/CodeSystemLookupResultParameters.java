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
import java.util.stream.Collectors;

import org.hl7.fhir.r4b.model.*;
import org.hl7.fhir.r4b.model.Parameters.ParametersParameterComponent;

/**
 * @since 0.1
 */
public final class CodeSystemLookupResultParameters extends BaseParameters {

	public CodeSystemLookupResultParameters() {
		this(new Parameters());
	}
	
	public CodeSystemLookupResultParameters(Parameters parameters) {
		super(parameters);
	}
	
	public StringType getName() {
		return getParameterValue("name", Parameters.ParametersParameterComponent::getValueStringType);
	}

	public CodeSystemLookupResultParameters setName(String name) {
		return setName(new StringType(name));
	}
	
	public CodeSystemLookupResultParameters setName(StringType name) {
		getParameters().addParameter("name", name);
		return this;
	}
	
	public StringType getDisplay() {
		return getParameterValue("display", Parameters.ParametersParameterComponent::getValueStringType);
	}

	public CodeSystemLookupResultParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}
	
	public CodeSystemLookupResultParameters setDisplay(StringType display) {
		getParameters().addParameter("display", display);
		return this;
	}

	public StringType getVersion() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeSystemLookupResultParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemLookupResultParameters setVersion(StringType version) {
		getParameters().addParameter("version", version);
		return this;
	}
	
	public List<Designation> getDesignation() {
		List<ParametersParameterComponent> designationParameters = getParameters("designation");
		return designationParameters.stream()
				.map(designationParameter -> {
					
					List<ParametersParameterComponent> part = designationParameter.getPart();
					return new Designation(part);
				})
				.collect(Collectors.toList());
	}
	
	public List<Property> getProperty() {
		List<ParametersParameterComponent> propertyParameters = getParameters("property");
		return propertyParameters.stream()
				.map(propertyParameter -> {
					List<ParametersParameterComponent> part = propertyParameter.getPart();
					return new Property(part);
				})
				.collect(Collectors.toList());
	}

	public CodeSystemLookupResultParameters setDesignation(List<Designation> designations) {
		if (designations == null) {
			return this;
		}
		
		designations.stream()
			.map(designation -> {
				var designationParameter = new Parameters.ParametersParameterComponent().setName("designation");
				
				// add value part, which is the term of the designation
				designationParameter.addPart(
					new Parameters.ParametersParameterComponent()
						.setName("value")
						.setValue(designation.getValue())
				);
				
				// add language part
				designationParameter.addPart(
					new Parameters.ParametersParameterComponent()
						.setName("language")
						.setValue(designation.getLanguage())
				);
				// add use part
				designationParameter.addPart(
					new Parameters.ParametersParameterComponent()
						.setName("use")
						.setValue(designation.getUse())
				);
				
				return designationParameter; 
			})
			.forEach(getParameters()::addParameter);
		
		return this;
	}

	public CodeSystemLookupResultParameters setProperty(List<Property> properties) {
		if (properties == null) {
			return this;
		}
		
		properties.stream()
			.map(property -> {
				var propertyParameter = new Parameters.ParametersParameterComponent().setName("property");
				
				// property.code
				propertyParameter.addPart(
					new Parameters.ParametersParameterComponent()
						.setName("code")
						.setValue(property.getCode())
				);
				
				// property.value
				propertyParameter.addPart(
					new Parameters.ParametersParameterComponent()
						.setName("value")
						.setValue(property.getValue())
				);
				
				// property.description
				propertyParameter.addPart(new Parameters.ParametersParameterComponent()
						.setName("description")
						.setValue(property.getDescription()));
				
				return propertyParameter; 
			})
			.forEach(getParameters()::addParameter);
	
		return this;
	}
	
	public static class Designation {
		
		private List<Parameters.ParametersParameterComponent> part;
		
		public Designation() {
			this(new ArrayList<>());
		}
		
		public Designation(List<Parameters.ParametersParameterComponent> part) {
			this.part = part == null ? new ArrayList<>(1) : part;
		}
		
		public CodeType getLanguage() {
			StringType type = (StringType) getParameter("language").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
			return new CodeType(type.getValueAsString());
		}
		
		public Coding getUse() {
			return (Coding) getParameter("use").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public StringType getValue() {
			return (StringType) getParameter("value").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public Designation setLanguage(String language) {
			return setLanguage(new CodeType(language));
		}
		
		public Designation setLanguage(CodeType language) {
			if (language == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("language")
					.setValue(language));
		}
		
		public Designation setUse(Coding use) {
			if (use == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("use")
					.setValue(use));
		}
		
		public Designation setValue(String value) {
			if (value == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("value")
					.setValue(new StringType(value)));
		}
		
		public Designation addParameter(Parameters.ParametersParameterComponent parameter) {
			part.add(parameter);
			return this;
		}
		
		private Optional<Parameters.ParametersParameterComponent> getParameter(String name) {
			return part.stream()
					.filter(param -> param.getName().equals(name))
					.findFirst();
		}
	}
	
	public static class Property {
		
		private List<Parameters.ParametersParameterComponent> part;
		
		public Property() {
			this(new ArrayList<>());
		}
		
		public Property(List<Parameters.ParametersParameterComponent> part) {
			this.part = part == null ? new ArrayList<>(1) : part;
		}
		
		public CodeType getCode() {
			return (CodeType) getParameter("code").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public DataType getValue() {
			return getParameter("value").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public StringType getDescription() {
			return (StringType) getParameter("description").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public List<Parameters.ParametersParameterComponent> getPart() {
			return part;
		}
		
		private Optional<Parameters.ParametersParameterComponent> getParameter(String name) {
			return part.stream()
					.filter(param -> param.getName().equals(name))
					.findFirst();
		}
		
		public List<Property> getSubProperty() {
			return part.stream()
					.filter(param -> param.getName().equals("subproperty"))
					.map(propertyParameter -> {
						List<ParametersParameterComponent> part = propertyParameter.getPart();
						return new Property(part);
					})
					.collect(Collectors.toList());
		}
		
		public Property setSubProperty(List<Property> subproperties) {
			if (subproperties == null) {
				return this;
			}
			subproperties.stream()
				.map(subproperty -> new Parameters.ParametersParameterComponent().setName("subproperty").setPart(subproperty.getPart()))
				.forEach(getPart()::add);
			
			return this;
		}
		
		public Property setCode(String code) {
			return setCode(new CodeType(code));
		}
		
		public Property setCode(CodeType code) {
			if (code == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("code")
					.setValue(code));
		}
		
		public Property setValue(DataType value) {
			if (value == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("value")
					.setValue(value));
		}
		
		public Property setDescription(StringType description) {
			if (description == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("description")
					.setValue(description));
		}
		
		public Property addParameter(Parameters.ParametersParameterComponent parameter) {
			part.add(parameter);
			return this;
		}
	}
}
