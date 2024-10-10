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
	
	com.b2international.fhir.r4b.operations.BaseParameters create(org.hl7.fhir.r4b.model.Parameters parameters);
	
	com.b2international.fhir.r5.operations.BaseParameters create(org.hl7.fhir.r5.model.Parameters parameters);
	
	/**
	 * @since 0.1
	 */
	final class CodeSystemLookupParametersFactory implements OperationParametersFactory {

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
	
}
