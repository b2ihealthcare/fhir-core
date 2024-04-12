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
    
