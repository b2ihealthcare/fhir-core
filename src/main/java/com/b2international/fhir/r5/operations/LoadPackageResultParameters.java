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
package com.b2international.fhir.r5.operations;

import org.hl7.fhir.r5.model.*;

/**
 * @since 0.6.0
 */
public final class LoadPackageResultParameters extends BaseParameters {

	private static final String PARAM_SUCCESS = "success";
	private static final String PARAM_NUMBER_OF_LOADED_CODESYSTEMS = "numberOfLoadedCodeSystems";
	private static final String PARAM_NUMBER_OF_LOADED_VALUESETS = "numberOfLoadedValueSets";
	private static final String PARAM_NUMBER_OF_LOADED_CONCEPTMAPS = "numberOfLoadedConceptMaps";

	public LoadPackageResultParameters() {
		this(new Parameters());
	}
	
	public LoadPackageResultParameters(Parameters parameters) {
		super(parameters);
	}
	
	public BooleanType getSuccess() {
		return getParameterValue(PARAM_SUCCESS, Parameters.ParametersParameterComponent::getValueBooleanType);
	}
	
	public LoadPackageResultParameters setSuccess(Boolean success) {
		return setSuccess(new BooleanType(success));
	}
	
	public LoadPackageResultParameters setSuccess(BooleanType success) {
		addParameter(PARAM_SUCCESS, success);
		return this;
	}
	
	public IntegerType getNumberOfLoadedCodeSystems() {
		return getParameterValue(PARAM_NUMBER_OF_LOADED_CODESYSTEMS, Parameters.ParametersParameterComponent::getValueIntegerType);
	}
	
	public LoadPackageResultParameters setNumberOfLoadedCodeSystems(Integer numberOfLoadedCodeSystems) {
		return setNumberOfLoadedCodeSystems(new IntegerType(numberOfLoadedCodeSystems));
	}

	public LoadPackageResultParameters setNumberOfLoadedCodeSystems(IntegerType numberOfLoadedCodeSystems) {
		addParameter(PARAM_NUMBER_OF_LOADED_CODESYSTEMS, numberOfLoadedCodeSystems);
		return this;
	}
	
	public IntegerType getNumberOfLoadedValueSets() {
		return getParameterValue(PARAM_NUMBER_OF_LOADED_VALUESETS, Parameters.ParametersParameterComponent::getValueIntegerType);
	}
	
	public LoadPackageResultParameters setNumberOfLoadedValueSets(Integer numberOfLoadedValueSets) {
		return setNumberOfLoadedValueSets(new IntegerType(numberOfLoadedValueSets));
	}

	public LoadPackageResultParameters setNumberOfLoadedValueSets(IntegerType numberOfLoadedValueSets) {
		addParameter(PARAM_NUMBER_OF_LOADED_VALUESETS, numberOfLoadedValueSets);
		return this;
	}
	
	public IntegerType getNumberOfLoadedConceptMaps() {
		return getParameterValue(PARAM_NUMBER_OF_LOADED_CONCEPTMAPS, Parameters.ParametersParameterComponent::getValueIntegerType);
	}

	public LoadPackageResultParameters setNumberOfLoadedConceptMaps(Integer numberOfLoadedConceptMaps) {
		return setNumberOfLoadedConceptMaps(new IntegerType(numberOfLoadedConceptMaps));
	}

	public LoadPackageResultParameters setNumberOfLoadedConceptMaps(IntegerType numberOfLoadedConceptMaps) {
		addParameter(PARAM_NUMBER_OF_LOADED_CONCEPTMAPS, numberOfLoadedConceptMaps);
		return this;
	}
	
}
