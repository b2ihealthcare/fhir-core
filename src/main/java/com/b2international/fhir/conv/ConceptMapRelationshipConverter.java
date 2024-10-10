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
package com.b2international.fhir.conv;

import org.hl7.fhir.exceptions.FHIRFormatError;

/**
 * @since 0.1
 */
public class ConceptMapRelationshipConverter {

	public static org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence convert(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship r5Relationship) {
		switch (r5Relationship) {
		case EQUIVALENT:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.EQUIVALENT;
		case SOURCEISNARROWERTHANTARGET:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.WIDER;
		case SOURCEISBROADERTHANTARGET:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.NARROWER;
		case RELATEDTO:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.RELATEDTO;
		case NOTRELATEDTO:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.DISJOINT;
		case NULL:
			return org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.UNMATCHED;
		default:
			throw new FHIRFormatError("Unsupported R5 ConceptMapRelationship value: " + r5Relationship);
		}
	}

	public static org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship convert(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence r4Equivalence) {
		switch (r4Equivalence) {
		case EQUIVALENT:
		case EQUAL:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.EQUIVALENT;
		case WIDER:
		case SUBSUMES:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.SOURCEISNARROWERTHANTARGET;
		case NARROWER:
		case SPECIALIZES:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.SOURCEISBROADERTHANTARGET;
		case RELATEDTO:
		case INEXACT:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.RELATEDTO;
		case UNMATCHED:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NULL;
		case DISJOINT:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NOTRELATEDTO;
		default:
			return org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NULL;
		}
	}
	
}
