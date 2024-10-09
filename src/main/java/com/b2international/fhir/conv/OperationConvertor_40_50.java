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

import org.hl7.fhir.convertors.factory.VersionConvertorFactory_40_50;
import org.hl7.fhir.exceptions.FHIRFormatError;

/*
 * Ensure that there is no explicit import statement to any R4/R5 model classes 
 */
/**
 * @since 0.1
 */
public class OperationConvertor_40_50 {
	
	@SuppressWarnings("unchecked")
	public static final <T extends org.hl7.fhir.r5.model.DataType> T convertType(org.hl7.fhir.r4.model.Type type) {
		return (T) VersionConvertorFactory_40_50.convertType(type);
	}
	
	@SuppressWarnings("unchecked")
	public static final <T extends org.hl7.fhir.r4.model.Type> T convertType(org.hl7.fhir.r5.model.DataType type) {
		return (T) VersionConvertorFactory_40_50.convertType(type);
	}
	
	@SuppressWarnings("unchecked")
	public static final <T extends org.hl7.fhir.r5.model.Resource> T convertResource(org.hl7.fhir.r4.model.Resource resource) {
		return (T) VersionConvertorFactory_40_50.convertResource(resource);
	}
	
	@SuppressWarnings("unchecked")
	public static final <T extends org.hl7.fhir.r4.model.Resource> T convertResource(org.hl7.fhir.r5.model.Resource resource) {
		return (T) VersionConvertorFactory_40_50.convertResource(resource);
	}
	
	//////////////
	// R5 to R4 //
	//////////////
	
	// CodeSystem$lookup input parameters
	public static com.b2international.fhir.r4.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupParameters()
			.setCode(convertType(parameters.getCode()))
			.setSystem(convertType(parameters.getSystem()))
			.setVersion(convertType(parameters.getVersion()))
			.setCoding(convertType(parameters.getCoding()))
			.setDate(convertType(parameters.getDate()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(OperationConvertor_40_50::convertType)
					.toList())
		;
	}
	
	// CodeSystem$lookup output parameters
	public static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters()
			.setName(convertType(parameters.getName()))
			.setVersion(convertType(parameters.getVersion()))
			.setDisplay(convertType(parameters.getDisplay()))
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream()
					.map(OperationConvertor_40_50::convert)
					.toList())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(OperationConvertor_40_50::convert)
					.toList())
		;
	}
	
	private static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation designation) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation()
			.setLanguage(convertType(designation.getLanguage()))
			.setUse(convertType(designation.getUse()))
			.setValue(convertType(designation.getValue()))
		;
	}
	
	
	private static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property property) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property()
			.setCode(convertType(property.getCode()))
			.setValue(convertType(property.getValue()))
			.setDescription(convertType(property.getDescription()))
			.setSubProperty(property.getSubProperty() == null ? null : property.getSubProperty().stream().map(OperationConvertor_40_50::convert).toList())
		;
	}
	
	// CodeSystem$subsumes input parameters
	// No difference between versions, using low-level parameter convertor 
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters(r4Parameters);
	}
	
	// CodeSystem$subsumes output parameters
	// No difference between versions, using low-level parameter convertor
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters(r4Parameters);
	}
	
	// CodeSystem$validate-code input parameters
	// No difference between versions, using low-level parameter convertor
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters(r4Parameters);
	}
	
	// CodeSystem$validate-code output parameters
	// No difference between versions, using low-level parameter convertor
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setDisplay(convertType(parameters.getDisplay()))
		;
	}
	
	// ConceptMap$translate input parameters
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateParameters parameters) {
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setConceptMap(convertResource(parameters.getConceptMap()))
			.setConceptMapVersion(convertType(parameters.getConceptMapVersion()))
			
			// code in R4 is sourceCode in R5
			.setCode(convertType(parameters.getSourceCode()))
			
			.setSystem(convertType(parameters.getSystem()))
			.setVersion(convertType(parameters.getVersion()))
			
			// source in R4 is sourceScope in R5
			.setSource(convertType(parameters.getSourceScope()))
			
			.setCoding(convertType(parameters.getSourceCoding()))
			.setCodeableConcept(convertType(parameters.getSourceCodeableConcept()))
			
			// target in R4 is targetScope in R5
			.setTarget(convertType(parameters.getTargetScope()))
			
			.setTargetSystem(convertType(parameters.getTargetSystem()))
			.setDependency(parameters.getDependency() == null ? null : parameters.getDependency().stream().map(OperationConvertor_40_50::convert).toList())
		;
	}
	
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency convert(com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency r5Dependency) {
		
		var r4Dependency = new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency()
			.setElement(convertType(r5Dependency.getAttribute()));
		
		if (r5Dependency.getValue() != null) {
			if (r5Dependency.getValue() instanceof org.hl7.fhir.r5.model.Coding) {
				r4Dependency.setConcept(convertType(r5Dependency.getValue()));
			} else {
				throw new FHIRFormatError("Unsupported match.dependency.value type: " + r5Dependency.getValue());
			}
		}
		
		return r4Dependency;
	}
	
	// ConceptMap$translate output parameters
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setMatch(parameters.getMatch() == null ? null : parameters.getMatch().stream().map(OperationConvertor_40_50::convert).toList())
		;
	}
	
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match r5Match) {
		var r4Match = new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match();
		
		var r5Relationship = org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.fromCode(r5Match.getRelationship().getCode());
		switch (r5Relationship) {
		case EQUIVALENT:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.EQUIVALENT.toCode());
			break;
		case SOURCEISNARROWERTHANTARGET:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.WIDER.toCode());
			break;
		case SOURCEISBROADERTHANTARGET:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.NARROWER.toCode());
			break;
		case RELATEDTO:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.RELATEDTO.toCode());
			break;
		case NOTRELATEDTO:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.DISJOINT.toCode());
			break;
		case NULL:
			r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.UNMATCHED.toCode());
			break;
		default:
			throw new FHIRFormatError("Unsupported R5 ConceptMapRelationship value: " + r5Relationship);
		}
		
		return r4Match
			.setConcept(convertType(r5Match.getConcept()))
			.setProduct(r5Match.getProduct() == null ? null : r5Match.getProduct().stream().map(OperationConvertor_40_50::convert).toList())
			.setSource(convertType(r5Match.getOriginMap()));
	}
	
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match.Product convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match.Product r5Product) {
		var r4Product = new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match.Product()
				.setElement(r5Product.getAttribute() == null ? null : r5Product.getAttribute().getValue());
		
		if (r5Product.getValue() != null) {
			if (r5Product.getValue() instanceof org.hl7.fhir.r5.model.Coding) {
				r4Product.setConcept((org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(r5Product.getValue()));
			} else {
				throw new FHIRFormatError("Unsupported match.product.value type: " + r5Product.getValue());
			}
		}
		
		return r4Product;
	}
	
	// ValueSet$expand input parameters
	public static com.b2international.fhir.r4.operations.ValueSetExpandParameters convert(com.b2international.fhir.r5.operations.ValueSetExpandParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetExpandParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setValueSet(convertResource(parameters.getValueSet()))
			.setValueSetVersion(convertType(parameters.getValueSetVersion()))
			.setContext(convertType(parameters.getContext()))
			.setContextDirection(convertType(parameters.getContextDirection()))
			.setFilter(convertType(parameters.getFilter()))
			.setDate(convertType(parameters.getDate()))
			.setOffset(convertType(parameters.getOffset()))
			.setCount(convertType(parameters.getCount()))
			.setIncludeDesignations(convertType(parameters.getIncludeDesignations()))
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream().map(OperationConvertor_40_50::convertType).toList())
			.setIncludeDefinition(convertType(parameters.getIncludeDefinition()))
			.setActiveOnly(convertType(parameters.getActiveOnly()))
			.setExcludeNested(convertType(parameters.getExcludeNested()))
			.setExcludeNotForUI(convertType(parameters.getExcludeNotForUI()))
			.setExcludePostCoordinated(convertType(parameters.getExcludePostCoordinated()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
			.setExcludeSystem(parameters.getExcludeSystem() == null ? null : parameters.getExcludeSystem().stream().map(OperationConvertor_40_50::convertType).toList())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			.setCheckSystemVersion(parameters.getCheckSystemVersion() == null ? null : parameters.getCheckSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			.setForceSystemVersion(parameters.getForceSystemVersion() == null ? null : parameters.getForceSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			// add custom B2i specific parameters
			.setAfter(convertType(parameters.getAfter()))
			.setWithHistorySupplements(convertType(parameters.getWithHistorySupplements()))
		;
	}
	
	// ValueSet$validate-code input parameters
	public static com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters convert(com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setContext(convertType(parameters.getContext()))
			.setValueSet(convertResource(parameters.getValueSet()))
			.setValueSetVersion(convertType(parameters.getValueSetVersion()))
			.setCode(convertType(parameters.getCode()))
			.setSystem(convertType(parameters.getSystem()))
			.setSystemVersion(convertType(parameters.getSystemVersion()))
			.setDisplay(convertType(parameters.getDisplay()))
			.setCoding(convertType(parameters.getCoding()))
			.setCodeableConcept(convertType(parameters.getCodeableConcept()))
			.setDate(convertType(parameters.getDate()))
			.setAbstract(convertType(parameters.getIsAbstract()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
		;
	}
	
	// ValueSet$validate-code output parameters
	public static com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setDisplay(convertType(parameters.getDisplay()))
		;
	}
	
	//////////////
	// R4 to R5 //
	//////////////
	
	// CodeSystem$lookup input parameters
	public static com.b2international.fhir.r5.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupParameters()
			.setCode(convertType(parameters.getCode()))
			.setSystem(convertType(parameters.getSystem()))
			.setVersion(convertType(parameters.getVersion()))
			.setCoding(convertType(parameters.getCoding()))
			.setDate(convertType(parameters.getDate()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(OperationConvertor_40_50::convertType)
					.toList())
		;
	}
	
	// CodeSystem$lookup result parameters
	public static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters()
			.setName(convertType(parameters.getName()))
			.setVersion(convertType(parameters.getVersion()))
			.setDisplay(convertType(parameters.getDisplay()))
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream()
					.map(OperationConvertor_40_50::convert)
					.toList())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(OperationConvertor_40_50::convert)
					.toList())
		;
	}
	
	private static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation designation) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation()
			.setLanguage(convertType(designation.getLanguage()))
			.setUse(convertType(designation.getUse()))
			.setValue(convertType(designation.getValue()))
		;
	}
	
	private static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property property) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property()
			.setCode(convertType(property.getCode()))
			.setValue(convertType(property.getValue()))
			.setDescription(convertType(property.getDescription()))
			.setSubProperty(property.getSubProperty() == null ? null : property.getSubProperty().stream().map(OperationConvertor_40_50::convert).toList())
		;
	}
	
	// CodeSystem$subsumes input parameters
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters(r5Parameters);
	}
	
	// CodeSystem$subsumes output parameters
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters(r5Parameters);
	}
	
	// CodeSystem$validate-code input parameters
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters(r5Parameters);
	}
	
	// CodeSystem$validate-code output parameters
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setDisplay(convertType(parameters.getDisplay()))
		;
	}
	
	// ConceptMap$translate input parameters
	public static com.b2international.fhir.r5.operations.ConceptMapTranslateParameters convert(com.b2international.fhir.r4.operations.ConceptMapTranslateParameters parameters) {
		
		var r5params = new com.b2international.fhir.r5.operations.ConceptMapTranslateParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setConceptMap(convertResource(parameters.getConceptMap()))
			.setConceptMapVersion(convertType(parameters.getConceptMapVersion()))
			.setVersion(convertType(parameters.getVersion()));
		
		if (parameters.getReverse() != null && parameters.getReverse().getValue()) {
			r5params
				.setTargetCode(convertType(parameters.getCode()))
				.setSystem(convertType(parameters.getTargetSystem()))
				.setTargetSystem(convertType(parameters.getSystem()))
				.setTargetScope(convertType(parameters.getSource()))
				.setTargetCoding(convertType(parameters.getCoding()))
				.setTargetCodeableConcept(convertType(parameters.getCodeableConcept()));
		} else {
			r5params
				// sourceCode in R5 is code in R4
				.setSourceCode(convertType(parameters.getCode()))
				
				.setSystem(convertType(parameters.getSystem()))
				.setVersion(convertType(parameters.getVersion()))
				
				// sourceScope in R5 is source in R4
				.setSourceScope(convertType(parameters.getSource()))
				
				.setSourceCoding(convertType(parameters.getCoding()))
				.setSourceCodeableConcept(convertType(parameters.getCodeableConcept()))
				
				// targetScope in R5 is target in R4
				.setTargetScope(convertType(parameters.getTarget()))
				
				.setTargetSystem(convertType(parameters.getTargetSystem()));
		}
		return r5params
			.setDependency(parameters.getDependency() == null ? null : parameters.getDependency().stream().map(OperationConvertor_40_50::convert).toList());
	}
	
	private static com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency convert(com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency r4dependency) {
		return new com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency()
			.setAttribute(convertType(r4dependency.getElement()))
			.setValue(convertType(r4dependency.getConcept()))
		;
	}
	
	// ConceptMap$translate output parameters
	public static com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters convert(com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setMatch(parameters.getMatch() == null ? null : parameters.getMatch().stream().map(OperationConvertor_40_50::convert).toList())
		;
	}
	
	private static com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match convert(com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match r4Match) {
		
		var r5Match = new com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match();
		
		var r4Equivalence = org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.fromCode(r4Match.getEquivalence().getCode());
		switch (r4Equivalence) {
		case EQUIVALENT:
		case EQUAL:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.EQUIVALENT);
			break;
		case WIDER:
		case SUBSUMES:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.SOURCEISNARROWERTHANTARGET);
			break;
		case NARROWER:
		case SPECIALIZES:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.SOURCEISBROADERTHANTARGET);
			break;
		case RELATEDTO:
		case INEXACT:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.RELATEDTO);
			break;
		case UNMATCHED:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NULL);
			break;
		case DISJOINT:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NOTRELATEDTO);
			break;
		default:
			r5Match.setRelationship(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.NULL);
			break;
		}

		return r5Match
			.setConcept(convertType(r4Match.getConcept()))
			.setProduct(r4Match.getProduct() == null ? null : r4Match.getProduct().stream().map(OperationConvertor_40_50::convert).toList())
			.setOriginMap(convertType(r4Match.getSource()))
		;
	}
	
	private static com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match.Product convert(com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match.Product r4Product) {
		return new com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match.Product()
			.setAttribute(convertType(r4Product.getElement()))
			.setValue(convertType(r4Product.getConcept()))
		;
	}
	
	// ValueSet$expand input parameters
	public static com.b2international.fhir.r5.operations.ValueSetExpandParameters convert(com.b2international.fhir.r4.operations.ValueSetExpandParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetExpandParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setValueSet(convertResource(parameters.getValueSet()))
			.setValueSetVersion(convertType(parameters.getValueSetVersion()))
			.setContext(convertType(parameters.getContext()))
			.setContextDirection(convertType(parameters.getContextDirection()))
			.setFilter(convertType(parameters.getFilter()))
			.setDate(convertType(parameters.getDate()))
			.setOffset(convertType(parameters.getOffset()))
			.setCount(convertType(parameters.getCount()))
			.setIncludeDesignations(convertType(parameters.getIncludeDesignations()))
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream().map(OperationConvertor_40_50::convertType).toList())
			.setIncludeDefinition(convertType(parameters.getIncludeDefinition()))
			.setActiveOnly(convertType(parameters.getActiveOnly()))
			.setExcludeNested(convertType(parameters.getExcludeNested()))
			.setExcludeNotForUI(convertType(parameters.getExcludeNotForUI()))
			.setExcludePostCoordinated(convertType(parameters.getExcludePostCoordinated()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
			.setExcludeSystem(parameters.getExcludeSystem() == null ? null : parameters.getExcludeSystem().stream().map(OperationConvertor_40_50::convertType).toList())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			.setCheckSystemVersion(parameters.getCheckSystemVersion() == null ? null : parameters.getCheckSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			.setForceSystemVersion(parameters.getForceSystemVersion() == null ? null : parameters.getForceSystemVersion().stream().map(OperationConvertor_40_50::convertType).toList())
			// add custom B2i specific parameters
			.setAfter(convertType(parameters.getAfter()))
			.setWithHistorySupplements(convertType(parameters.getWithHistorySupplements()))
		;
	}
	
	// ValueSet$validate-code input parameters
	public static com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters convert(com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters()
			.setUrl(convertType(parameters.getUrl()))
			.setContext(convertType(parameters.getContext()))
			.setValueSet(convertResource(parameters.getValueSet()))
			.setValueSetVersion(convertType(parameters.getValueSetVersion()))
			.setCode(convertType(parameters.getCode()))
			.setSystem(convertType(parameters.getSystem()))
			.setSystemVersion(convertType(parameters.getSystemVersion()))
			.setDisplay(convertType(parameters.getDisplay()))
			.setCoding(convertType(parameters.getCoding()))
			.setCodeableConcept(convertType(parameters.getCodeableConcept()))
			.setDate(convertType(parameters.getDate()))
			.setAbstract(convertType(parameters.getIsAbstract()))
			.setDisplayLanguage(convertType(parameters.getDisplayLanguage()))
		;
	}
	
	// ValueSet$validate-code output parameters
	public static com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters convert(com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters()
			.setResult(convertType(parameters.getResult()))
			.setMessage(convertType(parameters.getMessage()))
			.setDisplay(convertType(parameters.getDisplay()))
		;
	}
	
}
