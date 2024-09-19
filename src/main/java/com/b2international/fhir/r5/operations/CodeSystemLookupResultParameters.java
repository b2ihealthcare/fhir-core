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
package com.b2international.fhir.r5.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent;

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
		addParameter("name", name);
		return this;
	}
	
	public StringType getDisplay() {
		return getParameterValue("display", Parameters.ParametersParameterComponent::getValueStringType);
	}

	public CodeSystemLookupResultParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}
	
	public CodeSystemLookupResultParameters setDisplay(StringType display) {
		addParameter("display", display);
		return this;
	}

	public StringType getVersionDisplay() {
		return getParameterValue("version", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeSystemLookupResultParameters setVersion(String version) {
		return setVersion(new StringType(version));
	}
	
	public CodeSystemLookupResultParameters setVersion(StringType version) {
		addParameter("version", version);
		return this;
	}
	
	public StringType getDefinition() {
		return getParameterValue("definition", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public CodeSystemLookupResultParameters setDefinition(String definition) {
		return setDefinition(new StringType(definition));
	}
	
	public CodeSystemLookupResultParameters setDefinition(StringType definition) {
		addParameter("definition", definition);
		return this;
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
						.setValue(new StringType(designation.getValue()))
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
				// add additional use part
				designation.getAdditionalUse().forEach(additionalUse -> {
					designationParameter.addPart(
						new Parameters.ParametersParameterComponent()
						.setName("additionalUse")
						.setValue(additionalUse)
					);
				});
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
				
				// property.source
				propertyParameter.addPart(new Parameters.ParametersParameterComponent()
						.setName("source")
						.setValue(property.getSource()));
				
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
			StringType type = getParameter("language").map(Parameters.ParametersParameterComponent::getValueStringType).orElse(null);
			return new CodeType(type.getValueAsString());
		}
		
		public Coding getUse() {
			return getParameter("use").map(Parameters.ParametersParameterComponent::getValueCoding).orElse(null);
		}
		
		public List<Coding> getAdditionalUse() {
			return getParameters("additionalUse").stream()
					.map(Parameters.ParametersParameterComponent::getValueCoding)
					.collect(Collectors.toList());
		}
		
		public String getValue() {
			StringType type = getParameter("value").map(Parameters.ParametersParameterComponent::getValueStringType).orElse(null);
			return type.getValueAsString();
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
		
		public Designation setAdditionalUse(Coding additionalUse) {
			if (additionalUse == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("additionalUse")
					.setValue(additionalUse));
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
		
		private List<Parameters.ParametersParameterComponent> getParameters(String name) {
			return part.stream()
					.filter(param -> param.getName().equals(name))
					.collect(Collectors.toList());
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
			return getParameter("code").map(Parameters.ParametersParameterComponent::getValueCodeType).orElse(null);
		}
		
		public DataType getValue() {
			return getParameter("value").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public StringType getDescription() {
			return getParameter("description").map(Parameters.ParametersParameterComponent::getValueStringType).orElse(null);
		}
		
		public CanonicalType getSource() {
			return getParameter("source").map(Parameters.ParametersParameterComponent::getValueCanonicalType).orElse(null);
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
		
		public Property setSource(CanonicalType source) {
			if (source == null) {
				return this;
			}
			return addParameter(new Parameters.ParametersParameterComponent()
					.setName("source")
					.setValue(source));
		}
		
		public Property addParameter(Parameters.ParametersParameterComponent parameter) {
			part.add(parameter);
			return this;
		}
	}

}
