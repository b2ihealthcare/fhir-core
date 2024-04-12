# FHIR Object Model library

The main object of this library is to shrink the original [org.hl7.fhir.core](https://github.com/hapifhir/org.hl7.fhir.core) model (R4, R4B and R5) and convertor jars into a single jar with as few dependencies as possible.

## Steps to shrink the vanilla jars

NOTE: repeat these steps for each required FHIR version. This library starts from R4 and omits the previous versions.

1. Start with copying the following classes/packages from the original `org.hl7.fhir.r?` library:
    * org.hl7.fhir.r?.model.CodeSystem
    * org.hl7.fhir.r?.model.ConceptMap
    * org.hl7.fhir.r?.model.ValueSet
    * org.hl7.fhir.r?.model.CapabilityStatement
    * org.hl7.fhir.r?.model.StructureDefinition

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