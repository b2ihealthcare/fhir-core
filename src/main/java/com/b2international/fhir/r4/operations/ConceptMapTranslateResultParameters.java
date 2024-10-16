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

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence;

/**
 * @since 0.1 
 */
public class ConceptMapTranslateResultParameters extends BaseParameters {

	public ConceptMapTranslateResultParameters() {
		this(new Parameters());
	}
	
	public ConceptMapTranslateResultParameters(Parameters parameters) {
		super(parameters);
	}

	public BooleanType getResult() {
		return (BooleanType) getParameterValue("result", Parameters.ParametersParameterComponent::getValue);
	}
	
	
	public StringType getMessage() {
		return (StringType) getParameterValue("message", Parameters.ParametersParameterComponent::getValue);
	}
	
	public List<Match> getMatch() {
		return getParameters("match").stream().map(param -> new Match(param.getPart())).toList();
	}
	
	public ConceptMapTranslateResultParameters setResult(Boolean isResult) {
		return setResult(new BooleanType(isResult));
	}
	
	public ConceptMapTranslateResultParameters setResult(BooleanType result) {
		addParameter("result", result);
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
			super();
		}
		
		public Match(List<Parameters.ParametersParameterComponent> part) {
			super(part);
		}
		
		public CodeType getEquivalence() {
			return (CodeType) getParameterValue("equivalence", Parameters.ParametersParameterComponent::getValue);
		}
		
		public Coding getConcept() {
			return (Coding) getParameterValue("concept", Parameters.ParametersParameterComponent::getValue);
		}
		
		public List<Product> getProduct() {
			return getParameters("product").map(param -> new Product(param.getPart())).toList();
		}
		
		public UriType getSource() {
			return (UriType) getParameterValue("source", Parameters.ParametersParameterComponent::getValue);
		}
		
		public Match setEquivalence(ConceptMapEquivalence equivalence) {
			return equivalence == null ? this : setEquivalence(equivalence.toCode());
		}
		
		public Match setEquivalence(String equivalence) {
			return setEquivalence(new CodeType(equivalence));
		}
		
		public Match setEquivalence(CodeType equivalence) {
			addParameter("equivalence", equivalence);
			return this;
		}
		
		public Match setConcept(Coding concept) {
			addParameter("concept", concept);
			return this;
		}
		
		public Match setProduct(List<Product> product) {
			if (product == null) {
				return this;
			}
			
			product.stream()
				.map(prod -> new Parameters.ParametersParameterComponent().setName("product").setPart(prod.getPart()))
				.forEach(this::addParameter);
			
			return this;
		}
		
		public Match setSource(String source) {
			return setSource(new UriType(source));
		}
		
		public Match setSource(UriType source) {
			addParameter("source", source);
			return this;
		}
		
		public static final class Product extends BasePart {
			
			public Product() {
				super();
			}
			
			public Product(List<Parameters.ParametersParameterComponent> part) {
				super(part);
			}
			
			public UriType getElement() {
				return (UriType) getParameter("element").map(Parameters.ParametersParameterComponent::getValue).get();
			}
			
			public Coding getConcept() {
				return (Coding) getParameter("concept").map(Parameters.ParametersParameterComponent::getValue).get();
			}
			
			public Product setElement(String element) {
				return setElement(new UriType(element));
			}

			public Product setElement(UriType element) {
				addParameter("element", element);
				return this;
			}
			
			public Product setConcept(Coding concept) {
				addParameter("concept", concept);
				return this;
			}
		}
	}
}
