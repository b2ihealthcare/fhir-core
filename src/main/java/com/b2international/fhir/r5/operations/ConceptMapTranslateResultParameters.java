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
 * @since 9.3 
 */
public class ConceptMapTranslateResultParameters extends BaseParameters {

	public ConceptMapTranslateResultParameters() {
		this(new Parameters());
	}
	
	public ConceptMapTranslateResultParameters(Parameters parameters) {
		super(parameters);
	}

	public BooleanType getResult() {
		return getParameterValue("result", Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	
	public StringType getMessage() {
		return getParameterValue("message", Parameters.ParametersParameterComponent::getValueStringType);
	}
	
	public List<Match> getMatch() {
		return getParameters("match").stream().map(param -> new Match(param.getPart())).toList();
	}
	
	public ConceptMapTranslateResultParameters setResult(boolean result) {
		addParameter("result", new BooleanType(result));
		return this;
	}
	
	public ConceptMapTranslateResultParameters setMessage(String message) {
		return setMessage(new StringType(message));
	}
	
	public ConceptMapTranslateResultParameters setMessage(StringType message) {
		addParameter("message", message);
		return this;
	}
	
	public ConceptMapTranslateResultParameters setMatch(List<Match> matches) {
		if (matches == null) {
			return this;
		}
		matches.stream()
			.map(match -> new Parameters.ParametersParameterComponent().setName("match").setPart(match.getPartSorted()))
			.forEach(getParameters()::addParameter);
		
		return this;
	}
	
	public static final class Match extends BasePart {
		
		public Match() {
			super(null);
		}
		
		public Match(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getRelationship() {
			return getParameterValue("relationship", Parameters.ParametersParameterComponent::getValueCodeType);
		}
		
		public Coding getConcept() {
			return getParameterValue("concept", Parameters.ParametersParameterComponent::getValueCoding);
		}
		
		public List<Property> getProperty() {
			return getParameters("property").map(param -> new Property(param.getPart())).toList();
		}
		
		public List<Product> getProduct() {
			return getParameters("product").map(param -> new Product(param.getPart())).toList();
		}
		
		public List<Product> getDependsOn() {
			return getParameters("dependsOn").map(param -> new Product(param.getPart())).toList();
		}
		
		public UriType getOriginMap() {
			return getParameterValue("originMap", Parameters.ParametersParameterComponent::getValueUriType);
		}
		
		public Match setRelationship(String relationship) {
			return setRelationship(new CodeType(relationship));
		}
		
		public Match setRelationship(CodeType codeType) {
			addParameter("relationship", codeType);
			return this;
		}
		
		public Match setConcept(Coding concept) {
			addParameter("concept", concept);
			return this;
		}
		
		public Match setProperty(List<Property> property) {
			if (property == null) {
				return this;
			}
			
			property.stream()
				.map(prop -> new Parameters.ParametersParameterComponent().setName("property").setPart(prop.getPart()))
				.forEach(getPartSorted()::add);
			
			return this;
		}
		
		public Match setProduct(List<Product> product) {
			if (product == null) {
				return this;
			}
			
			product.stream()
				.map(prod -> new Parameters.ParametersParameterComponent().setName("product").setPart(prod.getPart()))
				.forEach(getPartSorted()::add);
			
			return this;
		}
		
		public Match setDependsOn(List<Product> dependsOn) {
			if (dependsOn == null) {
				return this;
			}
			
			dependsOn.stream()
				.map(dep -> new Parameters.ParametersParameterComponent().setName("dependsOn").setPart(dep.getPart()))
				.forEach(getPartSorted()::add);
			
			return this;
		}
		
		public Match setOriginMap(String originMap) {
			return setOriginMap(new UriType(originMap));
		}
		
		public Match setOriginMap(UriType originMap) {
			addParameter("originMap", originMap);
			return this;
		}

		public static final class Property extends BasePart {
			
			public Property() {
				super(null);
			}
			
			public Property(List<Parameters.ParametersParameterComponent> part) {
				super(part);
			}
			
			// Mandatory
			public UriType getUri() {
				return getParameter("uri").map(Parameters.ParametersParameterComponent::getValueUriType).get();
			}
			
			// Mandatory
			public DataType getValue() {
				return getParameter("value").map(Parameters.ParametersParameterComponent::getValue).get();
			}
			
			public Property setUri(String uri) {
				return setUri(new UriType(uri));
			}
			
			public Property setUri(UriType uriType) {
				addParameter("uri", uriType);
				return this;
			}
			
			public Property setValue(DataType value) {
				addParameter("value", value);
				return this;
			}
						
		}
		
		public static final class Product extends BasePart {
			
			public Product() {
				super(null);
			}
			
			public Product(List<Parameters.ParametersParameterComponent> part) {
				super(part);
			}
			
			// Mandatory
			public UriType geAttribute() {
				return getParameter("attribute").map(Parameters.ParametersParameterComponent::getValueUriType).get();
			}
			
			// Mandatory
			public DataType getValue() {
				return getParameter("value").map(Parameters.ParametersParameterComponent::getValue).get();
			}
			
			public Product setAttribute(String attribute) {
				return setAttribute(new UriType(attribute));
			}

			public Product setAttribute(UriType attribute) {
				addParameter("attribute", attribute);
				return this;
			}
			
			public Product setValue(DataType value) {
				addParameter("value", value);
				return this;
			}
			
		}
	}
}
