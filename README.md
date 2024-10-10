# FHIR Core Classes and Converters (R4, R4B, R5)

The main object of this library is to shrink the original [org.hl7.fhir.core](https://github.com/hapifhir/org.hl7.fhir.core) model (R4, R4B and R5) and convertor jars into a OSGi bundle with as few dependencies as possible.

This library is based on the 6.3.30 version of org.hl7.fhir.core.

## Maven Usage

```
    <dependency>
        <groupId>com.b2international</groupId>
        <artifactId>fhir-core</artifactId>
        <version>0.1.0</version>
    </dependency>
```

## Build

This project uses Java (minimum version 17) and Apache Maven to build.

To build the package, invoke:

```
    mvnw clean package
```

To deploy it to the configured Nexus repository, invoke:

```
    mvnw clean deploy
```