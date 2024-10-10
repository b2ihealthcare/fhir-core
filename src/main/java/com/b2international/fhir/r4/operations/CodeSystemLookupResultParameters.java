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
package com.b2international.fhir.r4.operations;

import java.util.List;
import java.util.stream.Collectors;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.Parameters.ParametersParameterComponent;

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
		return (StringType) getParameterValue("name", Parameters.ParametersParameterComponent::getValue);
	}

	public CodeSystemLookupResultParameters setName(String name) {
		return setName(new StringType(name));
	}
	
	public CodeSystemLookupResultParameters setName(StringType name) {
		getParameters().addParameter("name", name);
		return this;
	}
	
	public StringType getDisplay() {
		return (StringType) getParameterValue("display", Parameters.ParametersParameterComponent::getValue);
	}

	public CodeSystemLookupResultParameters setDisplay(String display) {
		return setDisplay(new StringType(display));
	}
	
	public CodeSystemLookupResultParameters setDisplay(StringType display) {
		getParameters().addParameter("display", display);
		return this;
	}

	public StringType getVersion() {
		return (StringType) getParameterValue("version", Parameters.ParametersParameterComponent::getValue);
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
				ParametersParameterComponent param = new Parameters.ParametersParameterComponent().setName("designation").setPart(designation.getPartSorted());
				param.setExtension(designation.getExtension());
				return param;
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
	
	public static class Designation extends BasePart {
		
		public Designation() {
			super();
		}
		
		public Designation(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getLanguage() {
			return (CodeType) getParameter("language").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
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
			addParameter("language", language);
			return this;
		}
		
		public Designation setUse(Coding use) {
			addParameter("use", use);
			return this;
		}
		
		public Designation setValue(String value) {
			return setValue(new StringType(value));
		}
		
		public Designation setValue(StringType value) {
			addParameter("value", value);
			return this;
		}
		
	}
	
	public static class Property extends BasePart {
		
		public Property() {
			super();
		}
		
		public Property(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getCode() {
			return (CodeType) getParameter("code").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public Type getValue() {
			return getParameter("value").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}
		
		public StringType getDescription() {
			return (StringType) getParameter("description").map(Parameters.ParametersParameterComponent::getValue).orElse(null);
		}

		public List<Property> getSubProperty() {
			return getParameters("subproperty")
					.map(propertyParameter -> new Property(propertyParameter.getPart()))
					.toList();
		}
		
		public Property setCode(String code) {
			return setCode(new CodeType(code));
		}
		
		public Property setCode(CodeType code) {
			addParameter("code", code);
			return this;
		}
		
		public Property setValue(Type value) {
			addParameter("value", value);
			return this;
		}
		
		public Property setDescription(String description) {
			return setDescription(new StringType(description));
		}
		
		public Property setDescription(StringType description) {
			addParameter("description", description);
			return this;
		}
		
		public Property setSubProperty(List<Property> subproperties) {
			if (subproperties == null) {
				return this;
			}
			
			subproperties.stream()
				.map(subproperty -> new Parameters.ParametersParameterComponent().setName("subproperty").setPart(subproperty.getPart()))
				.forEach(this::addParameter);
			
			return this;
		}
	}
}
