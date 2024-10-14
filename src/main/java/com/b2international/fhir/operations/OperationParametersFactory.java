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
package com.b2international.fhir.operations;

/**
 * @since 0.1
 */
public interface OperationParametersFactory {

	com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters);
	
	default com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters, boolean strict) {
		var result = create(parameters);
		if (strict) {
			result.checkParameters();
		}
		return result;
	}
	
	com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters);
	
	default com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters, boolean strict) {
		var result = create(parameters);
		if (strict) {
			result.checkParameters();
		}
		return result;
	}
	
	com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters);
	
	default com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters, boolean strict) {
		var result = create(parameters);
		if (strict) {
			result.checkParameters();
		}
		return result;
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemLookupParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemLookupParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemLookupParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemLookupParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemLookupResultParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemLookupResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemSubsumptionParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemSubsumptionParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemSubsumptionResultParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemSubsumptionResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemValidateCodeParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemValidateCodeParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum CodeSystemValidateCodeResultParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.CodeSystemValidateCodeResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum ConceptMapTranslateParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.ConceptMapTranslateParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.ConceptMapTranslateParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum ConceptMapTranslateResultParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.ConceptMapTranslateResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum ValueSetExpandParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.ValueSetExpandParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.ValueSetExpandParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.ValueSetExpandParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum ValueSetValidateCodeParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.ValueSetValidateCodeParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters(parameters);
		}
		
	}
	
	/**
	 * @since 0.1
	 */
	enum ValueSetValidateCodeResultParametersFactory implements OperationParametersFactory {
		
		INSTANCE;

		@Override
		public com.b2international.fhir.r4.operations.BaseParameters create(org.hl7.fhir.r4.model.Parameters parameters) {
			return new com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters) {
			return new com.b2international.fhir.r4b.operations.ValueSetValidateCodeResultParameters(parameters);
		}

		@Override
		public com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters) {
			return new com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters(parameters);
		}
		
	}
	
}
