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

import java.util.List;

import org.hl7.fhir.r5.model.*;

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
			.map(designation -> new Parameters.ParametersParameterComponent().setName("designation").setPart(designation.getPart()))
			.forEach(getParameters()::addParameter);
		
		return this;
	}

	public CodeSystemLookupResultParameters setProperty(List<Property> properties) {
		if (properties == null) {
			return this;
		}
		
		properties.stream()
			.map(property -> new Parameters.ParametersParameterComponent().setName("property").setPart(property.getPart()))
			.forEach(getParameters()::addParameter);
	
		return this;
	}
	
	public static final class Designation extends BasePart {
		
		public Designation() {
			super(null);
		}
		
		public Designation(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getLanguage() {
			return getParameterValue("language", Parameters.ParametersParameterComponent::getValueCodeType);
		}
		
		public Coding getUse() {
			return getParameterValue("use", Parameters.ParametersParameterComponent::getValueCoding);
		}
		
		public List<Coding> getAdditionalUse() {
			return getParameters("additionalUse")
					.map(Parameters.ParametersParameterComponent::getValueCoding)
					.toList();
		}
		
		public StringType getValue() {
			return getParameterValue("value", Parameters.ParametersParameterComponent::getValueStringType);
		}
		
		public Designation setLanguage(CodeType language) {
			addParameter("language", language);
			return this;
		}
		
		public Designation setUse(Coding use) {
			addParameter("use", use);
			return this;
		}
		
		public Designation setAdditionalUse(Coding additionalUse) {
			addParameter("additionalUse", additionalUse);
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
	
	public static final class Property extends BasePart {
		
		public Property() {
			super(null);
		}
		
		public Property(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getCode() {
			return getParameterValue("code", Parameters.ParametersParameterComponent::getValueCodeType);
		}
		
		public DataType getValue() {
			return getParameterValue("value", Parameters.ParametersParameterComponent::getValue);
		}
		
		public StringType getDescription() {
			return getParameterValue("description", Parameters.ParametersParameterComponent::getValueStringType);
		}
		
		public CanonicalType getSource() {
			return getParameterValue("source", Parameters.ParametersParameterComponent::getValueCanonicalType);
		}
		
		public List<Property> getSubProperty() {
			return getParameters("subproperty")
					.map(propertyParameter -> new Property(propertyParameter.getPart()))
					.toList();
		}
		
		public Property setCode(CodeType code) {
			addParameter("code", code);
			return this;
		}
		
		public Property setValue(DataType value) {
			addParameter("value", value);
			return this;
		}
		
		public Property setDescription(StringType description) {
			addParameter("description", description);
			return this;
		}
		
		public Property setSource(CanonicalType source) {
			addParameter("source", source);
			return this;
		}
		
	}

}
