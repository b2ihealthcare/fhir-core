package com.b2international.fhir.conv;

import org.hl7.fhir.convertors.factory.VersionConvertorFactory_40_50;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.ValueSet;

public class OperationConvertor_40_50 {
	
	// R5 to R4
	//CodeSystem lookup
	public static com.b2international.fhir.r4.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupParameters()
				.setCode(parameters.getCode() == null ? null : parameters.getCode().getValue())
				.setSystem(parameters.getSystem() == null ? null : parameters.getSystem().getValue())
				.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
				.setCoding(parameters.getCoding() == null ? null : new Coding()
						.setSystem(parameters.getCoding().getSystem() == null ? null : parameters.getCoding().getSystem())
						.setVersion(parameters.getCoding().getVersion() == null ? null : parameters.getCoding().getVersion())
						.setCode(parameters.getCoding().getCode() == null ? null : parameters.getCoding().getCode())
						.setDisplay(parameters.getCoding().getDisplay() == null ? null : parameters.getCoding().getDisplay())
						.setUserSelected(parameters.getCoding().getUserSelectedElement() == null ? null : parameters.getCoding().getUserSelectedElement().getValue()))
				.setDate(parameters.getDate() == null ? null : parameters.getDate().getValue())
				.setDisplayLanguage(parameters.getDisplayLanguage() == null ? null : parameters.getDisplayLanguage().getValue())
				.setProperty(parameters.getProperty() == null ? null : parameters.getProperty());
	}
	
	// TODO: designation
	public static com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters()
				.setName(parameters.getName() == null ? null : parameters.getName().getValue())
				.setVersion(parameters.getVersion() == null ? null : parameters.getVersion().getValue())
				.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue())
				.setDesignation(parameters.getDesignation() == null ? null : parameters.getDesignation().stream().map(designation -> {
					return new com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters.Designation();
				}).toList());
	}
	
	//CodeSystem subsumes
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters(r4Parameters);
	}
	
	public static com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters(r4Parameters);
	}
	
	//CodeSystem validate-code
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters(r4Parameters);
	}
	
	public static com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters parameters) {
		return new com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters()
				.setResult(parameters.getResult() == null ? null : parameters.getResult().getValue())
				.setMessage(parameters.getMessage() == null ? null : parameters.getMessage().getValue())
				.setDisplay(parameters.getDisplay() == null ? null : parameters.getDisplay().getValue());
	}
	
	//ConceptMap translate - TODO
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateParameters(r4Parameters);
	}
	
	public static com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters convert(com.b2international.fhir.r5.operations.ConceptMapTranslateResultParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.ConceptMapTranslateResultParameters(r4Parameters);
	}
	
	//ValueSet expand
	public static com.b2international.fhir.r4.operations.ValueSetExpandParameters convert(com.b2international.fhir.r5.operations.ValueSetExpandParameters parameters) {
		return new com.b2international.fhir.r4.operations.ValueSetExpandParameters()
				.setUrl(parameters.getUrl() == null ? null : parameters.getUrl().getValue())
				.setValueSet(parameters.getValueSet() == null ? null : (ValueSet) VersionConvertorFactory_40_50.convertResource(parameters.getValueSet()))
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
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeParameters(r4Parameters);
	}
	
	public static com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters convert(com.b2international.fhir.r5.operations.ValueSetValidateCodeResultParameters parameters) {
		var r4Parameters = (org.hl7.fhir.r4.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r4.operations.ValueSetValidateCodeResultParameters(r4Parameters);
	}
	
	//R4 to R5
	//CodeSystem lookup
	public static com.b2international.fhir.r5.operations.CodeSystemLookupParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemLookupParameters(r5Parameters);
	}
	public static com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemLookupResultParameters parameters) {
		
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemLookupResultParameters(r5Parameters);
	}
	
	//CodeSystem subsumes
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionParameters(r5Parameters);
	}
	
	public static com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemSubsumptionResultParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemSubsumptionResultParameters(r5Parameters);
	}
	
	//CodeSystem validate-code
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeParameters(r5Parameters);
	}
	
	public static com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters convert(com.b2international.fhir.r4.operations.CodeSystemValidateCodeResultParameters parameters) {
		var r5Parameters = (org.hl7.fhir.r5.model.Parameters) VersionConvertorFactory_40_50.convertResource(parameters.getParameters());
		return new com.b2international.fhir.r5.operations.CodeSystemValidateCodeResultParameters(r5Parameters);
	}
	
}
