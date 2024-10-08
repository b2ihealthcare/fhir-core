package com.b2international.fhir.conv;

import org.hl7.fhir.convertors.factory.VersionConvertorFactory_40_50;

public class OperationConvertor_40_50 {
	
	// R5 to R4
	//CodeSystem lookup
	public static com.b2international.fhir.r4.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupParameters()
			.setCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
			.setCoding(parameters.getCoding() == null ? null : (org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(parameters.getCoding()))
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(propertyCode -> VersionConvertorFactory_40_50.convertType(propertyCode))
					.toList());
	}
	
	// CodeSystem lookup result
	public static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters()
			.setName(parameters.getName() == null ? null : parameters.getName().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue())
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream()
					.map(designation -> convert(designation))
					.toList())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(property -> convert(property))
					.toList());
	}
	
	// CodeSystem subsumes
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters(r4Parameters);
	}
	
	// CodeSystem subsumes result
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters(r4Parameters);
	}
	
	// CodeSystem validate-code
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters(r4Parameters);
	}
	
	//CodeSystem validate-code result
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters()
			.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
			.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue());
	}
	
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateParameters parameters) {
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setConceptMap(parameters.getConceptMap() == null ? null : (org.hl7.fhir.r4.model.ConceptMap) VersionConvertorFactory_40_50.convertResource(parameters.getConceptMap()))
			.setConceptMapVersion(parameters.getConceptMapVersion() == null ? null : parameters.getConceptMapVersion().getValue())
			
			// TODO: code (r4) - sourceCode(r5)?
			.setCode(parameters.getSourceCode() == null ? null : parameters.getSourceCode().getValue())
			
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
			
			// TODO: source (r4) - sourceScope (r5)
			.setSource(parameters.getSourceScope() == null ? null : parameters.getSourceScope().getValue())
			
			.setCoding(parameters.getSourceCoding() == null ? null : (org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(parameters.getSourceCoding()))
			.setCodeableConcept(parameters.getSourceCodeableConcept() == null ? null : (org.hl7.fhir.r4.model.CodeableConcept) VersionConvertorFactory_40_50.convertType(parameters.getSourceCodeableConcept()))
			
			// TODO: target (r4) - targetScope(r5)?
			.setTarget(parameters.getTargetScope() == null ? null : parameters.getTargetScope().getValue())
			
			.setTargetSystem(parameters.getTargetSystem() == null ? null : parameters.getTargetSystem().getValue())
			.setDependency(parameters.getDependency() == null ? null : parameters.getDependency().stream().map(dependency -> convert(dependency)).toList());
	}
	
	// ConceptMap translate result
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters()
				.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
				.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
				.setMatch(parameters.getMatch().stream().map(match -> convert(match)).toList());
	}
	
	//ValueSet expand
	public static com.b2international.fhir.r4.operations.ValueSetExpandParameters convert(com.b2international.fhir.r5.operations.ValueSetExpandParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetExpandParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setValueSet(parameters.getValueSet() == null ? null : (org.hl7.fhir.r4.model.ValueSet) VersionConvertorFactory_40_50.convertResource(parameters.getValueSet()))
			.setValueSetVersion(parameters.getValueSetVersion() == null ? null : parameters.getValueSetVersion().getValue())
			.setContext(parameters.getContext() == null ? null : parameters.getContext().getValue())
			.setContextDirection(parameters.getContextDirection() == null ? null : parameters.getContextDirection().getValue())
			.setFilter(parameters.getFilter() == null ? null : parameters.getFilter().getValue())
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setOffset(parameters.getOffset() == null ? null : parameters.getOffset().getValue())
			.setCount(parameters.getCount() == null ? null : parameters.getCount().getValue())
			.setIncludeDesignations(parameters.getIncludeDesignations() == null ? null : parameters.getIncludeDesignations().getValue())
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream().map(des -> des.getValue()).toList())
			.setIncludeDefinition(parameters.getIncludeDefinition() == null ? null : parameters.getIncludeDefinition().getValue())
			.setActiveOnly(parameters.getActiveOnly() == null ? null : parameters.getActiveOnly().getValue())
			.setExcludeNested(parameters.getExcludeNested() == null ? null : parameters.getExcludeNested().getValue())
			.setExcludeNotForUI(parameters.getExcludeNotForUI() == null ? null : parameters.getExcludeNotForUI().getValue())
			.setExcludePostCoordinated(parameters.getExcludePostCoordinated() == null ? null : parameters.getExcludePostCoordinated().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue())
			.setExcludeSystem(parameters.getExcludeSystem() == null ? null : parameters.getExcludeSystem().stream().map(ex -> ex.getValue()).toList())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().stream().map(ex -> ex.getValue()).toList())
			.setCheckSystemVersion(parameters.getCheckSystemVersion() == null ? null : parameters.getCheckSystemVersion().stream().map(ex -> ex.getValue()).toList())
			.setForceSystemVersion(parameters.getForceSystemVersion() == null ? null : parameters.getForceSystemVersion().stream().map(ex -> ex.getValue()).toList());
	}
	
	//ValueSet validate-code
	public static com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters convert(com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setContext(parameters.getContext() == null ? null : parameters.getContext().getValue())
			.setValueSet(parameters.getValueSet() == null ? null : (org.hl7.fhir.r4.model.ValueSet) VersionConvertorFactory_40_50.convertResource(parameters.getValueSet()))
			.setValueSetVersion(parameters.getValueSetVersion() == null ? null : parameters.getValueSetVersion().getValue())
			.setCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue())
			.setCoding(parameters.getCoding() == null ? null : (org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(parameters.getCoding()))
			.setCodeableConcept(parameters.getCodeableConcept() == null ? null : (org.hl7.fhir.r4.model.CodeableConcept) VersionConvertorFactory_40_50.convertType(parameters.getCodeableConcept()))
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setAbstract(parameters.getIsAbstract() == null ? null : parameters.getIsAbstract().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue());
	}
	
	// ValueSet validate-code result
	public static com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters()
			.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
			.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue());
	}
	
	//R4 to R5
	//CodeSystem lookup
	public static com.b2international.fhir.r5.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupParameters()
			.setCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
			.setCoding(parameters.getCoding() == null ? null : (org.hl7.fhir.r5.model.Coding) VersionConvertorFactory_40_50.convertType(parameters.getCoding()))
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(propertyCode -> (org.hl7.fhir.r5.model.CodeType) VersionConvertorFactory_40_50.convertType(propertyCode))
					.toList());
	}
	
	// CodeSystem lookup result
	public static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters()
			.setName(parameters.getName() == null ? null : parameters.getName().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue())
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream()
					.map(designation -> convert(designation))
					.toList())
			.setProperty(parameters.getProperty() == null ? null : parameters.getProperty().stream()
					.map(property -> convert(property))
					.toList());
	}
	
	// CodeSystem subsumes
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters(r5Parameters);
	}
	
	// CodeSystem subsumes result
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters(r5Parameters);
	}
	
	// CodeSystem validate-code
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters(r5Parameters);
	}
	
	//CodeSystem validate-code result
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters()
			.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
			.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue());
	}
	
	// ConceptMap translate - TODO
	public static com.b2international.fhir.r5.operations.ConceptMapTranslateParameters convert(com.b2international.fhir.r4.operations.ConceptMapTranslateParameters parameters) {
		return new com.b2international.fhir.r5.operations.ConceptMapTranslateParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setConceptMap(parameters.getConceptMap() == null ? null : (org.hl7.fhir.r5.model.ConceptMap) VersionConvertorFactory_40_50.convertResource(parameters.getConceptMap()))
			.setConceptMapVersion(parameters.getConceptMapVersion() == null ? null : parameters.getConceptMapVersion().getValue())
			.setSourceCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue());
	}
	
	// ConceptMap translate result - TODO
	public static com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters convert(com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters parameters) {
		return null;
	}
	
	//ValueSet expand
	public static com.b2international.fhir.r5.operations.ValueSetExpandParameters convert(com.b2international.fhir.r4.operations.ValueSetExpandParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetExpandParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setValueSet(parameters.getValueSet() == null ? null : (org.hl7.fhir.r5.model.ValueSet) VersionConvertorFactory_40_50.convertResource(parameters.getValueSet()))
			.setValueSetVersion(parameters.getValueSetVersion() == null ? null : parameters.getValueSetVersion().getValue())
			.setContext(parameters.getContext() == null ? null : parameters.getContext().getValue())
			.setContextDirection(parameters.getContextDirection() == null ? null : parameters.getContextDirection().getValue())
			.setFilter(parameters.getFilter() == null ? null : parameters.getFilter().getValue())
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setOffset(parameters.getOffset() == null ? null : parameters.getOffset().getValue())
			.setCount(parameters.getCount() == null ? null : parameters.getCount().getValue())
			.setIncludeDesignations(parameters.getIncludeDesignations() == null ? null : parameters.getIncludeDesignations().getValue())
			.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream().map(des -> des.getValue()).toList())
			.setIncludeDefinition(parameters.getIncludeDefinition() == null ? null : parameters.getIncludeDefinition().getValue())
			.setActiveOnly(parameters.getActiveOnly() == null ? null : parameters.getActiveOnly().getValue())
			.setExcludeNested(parameters.getExcludeNested() == null ? null : parameters.getExcludeNested().getValue())
			.setExcludeNotForUI(parameters.getExcludeNotForUI() == null ? null : parameters.getExcludeNotForUI().getValue())
			.setExcludePostCoordinated(parameters.getExcludePostCoordinated() == null ? null : parameters.getExcludePostCoordinated().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue())
			.setExcludeSystem(parameters.getExcludeSystem() == null ? null : parameters.getExcludeSystem().stream().map(ex -> ex.getValue()).toList())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().stream().map(ex -> ex.getValue()).toList())
			.setCheckSystemVersion(parameters.getCheckSystemVersion() == null ? null : parameters.getCheckSystemVersion().stream().map(ex -> ex.getValue()).toList())
			.setForceSystemVersion(parameters.getForceSystemVersion() == null ? null : parameters.getForceSystemVersion().stream().map(ex -> ex.getValue()).toList());
	}
	
	//ValueSet validate-code
	public static com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters convert(com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetValidateCodeParameters()
			.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
			.setContext(parameters.getContext() == null ? null : parameters.getContext().getValue())
			.setValueSet(parameters.getValueSet() == null ? null : (org.hl7.fhir.r5.model.ValueSet) VersionConvertorFactory_40_50.convertResource(parameters.getValueSet()))
			.setValueSetVersion(parameters.getValueSetVersion() == null ? null : parameters.getValueSetVersion().getValue())
			.setCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
			.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
			.setSystemVersion(parameters.getSystemVersion() == null ? null : parameters.getSystemVersion().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue())
			.setCoding(parameters.getCoding() == null ? null : (org.hl7.fhir.r5.model.Coding) VersionConvertorFactory_40_50.convertType(parameters.getCoding()))
			.setCodeableConcept(parameters.getCodeableConcept() == null ? null : (org.hl7.fhir.r5.model.CodeableConcept) VersionConvertorFactory_40_50.convertType(parameters.getCodeableConcept()))
			.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
			.setAbstract(parameters.getIsAbstract() == null ? null : parameters.getIsAbstract().getValue())
			.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue());
	}
	
	// ValueSet validate-code result
	public static com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters convert(com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters()
			.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
			.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
			.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue());
	}
	
	private static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation designation) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation()
			.setLanguage(designation.getLanguage() == null ? null : designation.getLanguage().getValue())
			.setUse((org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(designation.getUse()))
			.setValue(designation.getValue() == null ? null : designation.getValue().getValue());
	}
	
	private static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation designation) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Designation()
			.setLanguage(designation.getLanguage() == null ? null : designation.getLanguage().getValue())
			.setUse((org.hl7.fhir.r5.model.Coding) VersionConvertorFactory_40_50.convertType(designation.getUse()))
			.setValue(designation.getValue() == null ? null : designation.getValue().getValue());
	}
	
	
	private static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property property) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property()
			.setCode(property.getCode() == null ? null : property.getCode().getValue())
			.setValue(property.getValue() == null ? null : VersionConvertorFactory_40_50.convertType(property.getValue()))
			.setDescription(property.getDescription() == null ? null : property.getDescription().getValue())
			.setSubProperty(property.getSubProperty() == null ? null : property.getSubProperty().stream()
					.map(subproperty -> convert(subproperty)).toList());
	}
	
	private static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Property property) {
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters.Property()
			.setCode(property.getCode() == null ? null : property.getCode().getValue())
			.setValue(property.getValue() == null ? null : VersionConvertorFactory_40_50.convertType(property.getValue()))
			.setDescription(property.getDescription() == null ? null : property.getDescription().getValue())
			.setSubProperty(property.getSubProperty() == null ? null : property.getSubProperty().stream()
					.map(subproperty -> convert(subproperty)).toList());
	}
	
	//TODO: revise r4 ConceptMapEquivalence to r5 ConceptMapRelationship conversion
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match r5Match) {
		
		var r4Match = new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match();
		
		switch(org.hl7.fhir.r5.model.Enumerations.ConceptMapRelationship.fromCode(r5Match.getRelationship().asStringValue())) {
			case RELATEDTO: 
				r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.RELATEDTO.toCode());
				break;
			case EQUIVALENT:
				r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.EQUIVALENT.toCode());
				break;
			case SOURCEISNARROWERTHANTARGET:
				r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.WIDER.toCode());
				break;
			case SOURCEISBROADERTHANTARGET:
				r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.NARROWER.toCode());
				break;
			case NOTRELATEDTO:
				// OR: UNMATCHED?
				r4Match.setEquivalence(org.hl7.fhir.r4.model.codesystems.ConceptMapEquivalence.DISJOINT.toCode());
				break;
			// TODO error msg?
			default:
				r4Match.setEquivalence("");
		}
		
		return r4Match
			.setConcept(r5Match.getConcept() == null ? null : (org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(r5Match.getConcept()))
			.setProduct(r5Match.getProduct() == null ? null : r5Match.getProduct().stream().map(product -> convert(product)).toList())
			.setSource(r5Match.getOriginMap() == null ? null : r5Match.getOriginMap().getValue());
	}
	
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match.Product convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters.Match.Product r5Product) {
		var r4Product = new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters.Match.Product()
				.setElement(r5Product.getAttribute() == null ? null : r5Product.getAttribute().getValue());
		
		//TODO - error msg in case of impossible conversion
		if (r5Product.getValue() instanceof org.hl7.fhir.r5.model.Coding) {
			r4Product.setConcept((org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(r5Product.getValue()));
		}
		
		return r4Product;
	}
	
	private static com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency convert (com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency r5dependency) {
		
		var r4Dependency = new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency()
			.setElement(r5dependency.getAttribute() == null ? null : r5dependency.getAttribute().getValue());
		
		if (r5dependency.getValue() instanceof org.hl7.fhir.r5.model.Coding) {
			r4Dependency.setConcept(
					new org.hl7.fhir.r4.model.CodeableConcept()
					.setCoding(List.of((org.hl7.fhir.r4.model.Coding) VersionConvertorFactory_40_50.convertType(r5dependency.getValue())))
			);
		}
		
		return r4Dependency;
	}
	
	private static com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency convert (com.b2international.fhir.r4.operations.ConceptMapTranslateParameters.Dependency r4dependency) {
		return new com.b2international.fhir.r5.operations.ConceptMapTranslateParameters.Dependency()
				.setAttribute(r4dependency.getElement() == null ? null : r4dependency.getElement().getValue())
				// TODO
				.setValue(r4dependency.getConcept() == null ? null : (org.hl7.fhir.r5.model.Coding) VersionConvertorFactory_40_50.convertType(r4dependency.getConcept().getCoding().get(0)));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
