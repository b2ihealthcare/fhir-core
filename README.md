# FHIR Object Model library

The main object of this library is to shrink the original [org.hl7.fhir.core](https://github.com/hapifhir/org.hl7.fhir.core) model (R4, R4B and R5) and convertor jars into a single jar with as few dependencies as possible.

This library is based on the 6.3.4 version.

## Create a shrinked object class library

NOTE: repeat these steps for each required FHIR version. This library starts from R4 and omits the previous versions.

1. Start with copying the following classes/packages from the original `org.hl7.fhir.r?` library:
    * org.hl7.fhir.r?.model.Bundle
    * org.hl7.fhir.r?.model.CodeSystem
    * org.hl7.fhir.r?.model.ConceptMap
    * org.hl7.fhir.r?.model.ValueSet
    * org.hl7.fhir.r?.model.CapabilityStatement
    * org.hl7.fhir.r?.model.TerminologyCapabilities
    * org.hl7.fhir.r?.model.StructureDefinition
    * org.hl7.fhir.r?.model.NamingSystem

2. Then copy the following abstract, base and data type classes from the `org.hl7.fhir.r?.model` package:
    * org.hl7.fhir.r?.model.Base
    * org.hl7.fhir.r?.model.BaseResource
    * org.hl7.fhir.r?.model.Resource
    * org.hl7.fhir.r?.model.DomainResource
    * org.hl7.fhir.r?.model.MetadataResource
    * org.hl7.fhir.r?.model.Base
    * org.hl7.fhir.r?.model.Element
    * org.hl7.fhir.r?.model.BackboneElement
    * org.hl7.fhir.r?.model.Type
    * org.hl7.fhir.r?.model.PrimitiveType
    * org.hl7.fhir.r?.model.Base64BinaryType
    * org.hl7.fhir.r?.model.BaseDateTimeType
    * org.hl7.fhir.r?.model.DateTimeType
    * org.hl7.fhir.r?.model.DateType
    * org.hl7.fhir.r?.model.InstantType
    * org.hl7.fhir.r?.model.BooleanType
    * org.hl7.fhir.r?.model.DecimalType
    * org.hl7.fhir.r?.model.Enumeration
    * org.hl7.fhir.r?.model.IntegerType
    * org.hl7.fhir.r?.model.PositiveIntType
    * org.hl7.fhir.r?.model.UnsignedIntType
    * org.hl7.fhir.r?.model.StringType
    * org.hl7.fhir.r?.model.CodeType
    * org.hl7.fhir.r?.model.MarkdownType
    * org.hl7.fhir.r?.model.TimeType
    * org.hl7.fhir.r?.model.UriType
    * org.hl7.fhir.r?.model.CanonicalType
    * org.hl7.fhir.r?.model.IdType
    * org.hl7.fhir.r?.model.OidType
    * org.hl7.fhir.r?.model.SidType
    * org.hl7.fhir.r?.model.UrlType
    * org.hl7.fhir.r?.model.UuidType
    * org.hl7.fhir.r?.model.BaseExtension
    * org.hl7.fhir.r?.model.Extension
    * org.hl7.fhir.r?.model.BaseNarrative
    * org.hl7.fhir.r?.model.Narrative
    * org.hl7.fhir.r?.model.Coding
    * org.hl7.fhir.r?.model.CodeableConcept
    * org.hl7.fhir.r?.model.Meta
    * org.hl7.fhir.r?.model.Period
    * org.hl7.fhir.r?.model.Quantity
    * org.hl7.fhir.r?.model.BaseReference
    * org.hl7.fhir.r?.model.Reference
    * org.hl7.fhir.r?.model.Range
    * org.hl7.fhir.r?.model.Ratio
    * org.hl7.fhir.r?.model.Timing
    * org.hl7.fhir.r?.model.ParameterDefinition
    * org.hl7.fhir.r?.model.TriggerDefinition
    * org.hl7.fhir.r?.model.UsageContext
    * org.hl7.fhir.r?.model.Property
    * org.hl7.fhir.r?.model.Annotation

3. Copy the following annotations, interfaces and classes from 'hapi-fhir-base' (version: 6.4.1)
    * ca.uhn.fhir.context.FhirVersionEnum
    * ca.uhn.fhir.i18n.Msg
    * ca.uhn.fhir.util.DatatypeUtil
    * ca.uhn.fhir.util.ElementUtil
    * ca.uhn.fhir.util.ObjectUtil
    * ca.uhn.fhir.model.api.IElement
    * ca.uhn.fhir.model.api.Include
    * ca.uhn.fhir.model.api.TemporalPrecisionEnum
    * ca.uhn.fhir.model.api.annotation.* (all of them)
    * ca.uhn.fhir.parser.DataFormatException
    * ca.uhn.fhir.rest.api.Constants
    * org.hl7.fhir.instance.model.api.IAnyResource
    * org.hl7.fhir.instance.model.api.IBase
    * org.hl7.fhir.instance.model.api.IBaseBackboneElement
    * org.hl7.fhir.instance.model.api.IBaseBinary
    * org.hl7.fhir.instance.model.api.IBaseBooleanDatatype
    * org.hl7.fhir.instance.model.api.IBaseCoding
    * org.hl7.fhir.instance.model.api.IBaseConformance
    * org.hl7.fhir.instance.model.api.IBaseDatatype
    * org.hl7.fhir.instance.model.api.IBaseDatatypeElement
    * org.hl7.fhir.instance.model.api.IBaseDecimalDatatype
    * org.hl7.fhir.instance.model.api.IBaseElement
    * org.hl7.fhir.instance.model.api.IBaseEnumFactory
    * org.hl7.fhir.instance.model.api.IBaseEnumeration
    * org.hl7.fhir.instance.model.api.IBaseExtension
    * org.hl7.fhir.instance.model.api.IBaseHasModifierExtensions
    * org.hl7.fhir.instance.model.api.IBaseIntegerDatatype
    * org.hl7.fhir.instance.model.api.IBaseMetaType
    * org.hl7.fhir.instance.model.api.IBaseReference
    * org.hl7.fhir.instance.model.api.IBaseResource
    * org.hl7.fhir.instance.model.api.ICompositeType
    * org.hl7.fhir.instance.model.api.ICompositeElement
    * org.hl7.fhir.instance.model.api.IDomainResource
    * org.hl7.fhir.instance.model.api.IIdType
    * org.hl7.fhir.instance.model.api.INarrative
    * org.hl7.fhir.instance.model.api.IPrimitiveType
    * add dependencies `com.google.code.findbugs:jsr305:3.0.2` and 'org.apache.commons:commons-lang3:3.12.0'
    * NOTE: this represents our final class set for the given FHIR Normative R version.

4. Comment out all utility functions in Utilities that are not being used at all by the classes above

5. Comment out all instances of `ca.uhn.fhir.rest.gclient.*` search parameter definitions in all model classes and/or interfaces

6. Copy `org.hl7.fhir.utilities.xhtml.*` classes that are required by Base and Narrative model classes

    * The capability of adding markdown nodes to XHTML should be commented out
    * The capability of parsing XHtmlNodes/Docs with pull parser should be commented out

7. Copy `org.hl7.fhir.r4.utils.ToolingExtensions` and `org.hl7.fhir.r4.model.ExtensionHelper`
    * Make sure all unwanted methods in the ToolingExtensions classes are disabled

## Create a shrinked object class converter library

1. Copy classes from the `org.hl7.fhir.convertors.conv*` package according to the required R? versions.

For example: copy the `org.hl7.fhir.convertors.conv40_50` package and all related infrastructure packages/classes.

2. Delete all convertor classes that reference unwanted object classes

3. Copy and/or enable the necessary extra infrastructure methods, etc. if needed
