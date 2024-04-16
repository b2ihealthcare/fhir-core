package org.hl7.fhir.r4b.model;

import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;

/**
 * Base StructureDefinition for UsageContext Type: Specifies
 * clinical/business/etc. metadata that can be used to retrieve, index and/or
 * categorize an artifact. This metadata can either be specific to the
 * applicable population (e.g., age category, DRG) or the specific context of
 * care (e.g., venue, care setting, provider of care).
 */
@DatatypeDef(name = "UsageContext")
public class UsageContext extends DataType implements ICompositeType {

  /**
   * A code that identifies the type of context being specified by this usage
   * context.
   */
  @Child(name = "code", type = { Coding.class }, order = 0, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Type of context being specified", formalDefinition = "A code that identifies the type of context being specified by this usage context.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/usage-context-type")
  protected Coding code;

  /**
   * A value that defines the context specified in this context of use. The
   * interpretation of the value is defined by the code.
   */
  @Child(name = "value", type = { 
		  CodeableConcept.class, 
		  Quantity.class, 
		  Range.class,
          // XXX NOT NEEDED for Terminology Module
//		  PlanDefinition.class,
//		  ResearchStudy.class, 
//		  InsurancePlan.class, 
		  HealthcareService.class, 
		  Group.class, 
		  Location.class,
		  Organization.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Value that defines the context", formalDefinition = "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.")
  @ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/use-context")
  protected DataType value;

  private static final long serialVersionUID = -1546390646L;

  /**
   * Constructor
   */
  public UsageContext() {
    super();
  }

  /**
   * Constructor
   */
  public UsageContext(Coding code, DataType value) {
    super();
    this.setCode(code);
    this.setValue(value);
  }

  /**
   * @return {@link #code} (A code that identifies the type of context being
   *         specified by this usage context.)
   */
  public Coding getCode() {
    if (this.code == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create UsageContext.code");
      else if (Configuration.doAutoCreate())
        this.code = new Coding(); // cc
    return this.code;
  }

  public boolean hasCode() {
    return this.code != null && !this.code.isEmpty();
  }

  /**
   * @param value {@link #code} (A code that identifies the type of context being
   *              specified by this usage context.)
   */
  public UsageContext setCode(Coding value) {
    this.code = value;
    return this;
  }

  /**
   * @return {@link #value} (A value that defines the context specified in this
   *         context of use. The interpretation of the value is defined by the
   *         code.)
   */
  public DataType getValue() {
    return this.value;
  }

  /**
   * @return {@link #value} (A value that defines the context specified in this
   *         context of use. The interpretation of the value is defined by the
   *         code.)
   */
  public CodeableConcept getValueCodeableConcept() throws FHIRException {
    if (this.value == null)
      this.value = new CodeableConcept();
    if (!(this.value instanceof CodeableConcept))
      throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "
          + this.value.getClass().getName() + " was encountered");
    return (CodeableConcept) this.value;
  }

  public boolean hasValueCodeableConcept() {
    return this != null && this.value instanceof CodeableConcept;
  }

  /**
   * @return {@link #value} (A value that defines the context specified in this
   *         context of use. The interpretation of the value is defined by the
   *         code.)
   */
  public Quantity getValueQuantity() throws FHIRException {
    if (this.value == null)
      this.value = new Quantity();
    if (!(this.value instanceof Quantity))
      throw new FHIRException(
          "Type mismatch: the type Quantity was expected, but " + this.value.getClass().getName() + " was encountered");
    return (Quantity) this.value;
  }

  public boolean hasValueQuantity() {
    return this != null && this.value instanceof Quantity;
  }

  /**
   * @return {@link #value} (A value that defines the context specified in this
   *         context of use. The interpretation of the value is defined by the
   *         code.)
   */
  public Range getValueRange() throws FHIRException {
    if (this.value == null)
      this.value = new Range();
    if (!(this.value instanceof Range))
      throw new FHIRException(
          "Type mismatch: the type Range was expected, but " + this.value.getClass().getName() + " was encountered");
    return (Range) this.value;
  }

  public boolean hasValueRange() {
    return this != null && this.value instanceof Range;
  }

  /**
   * @return {@link #value} (A value that defines the context specified in this
   *         context of use. The interpretation of the value is defined by the
   *         code.)
   */
  public Reference getValueReference() throws FHIRException {
    if (this.value == null)
      this.value = new Reference();
    if (!(this.value instanceof Reference))
      throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.value.getClass().getName()
          + " was encountered");
    return (Reference) this.value;
  }

  public boolean hasValueReference() {
    return this != null && this.value instanceof Reference;
  }

  public boolean hasValue() {
    return this.value != null && !this.value.isEmpty();
  }

  /**
   * @param value {@link #value} (A value that defines the context specified in
   *              this context of use. The interpretation of the value is defined
   *              by the code.)
   */
  public UsageContext setValue(DataType value) {
    if (value != null && !(value instanceof CodeableConcept || value instanceof Quantity || value instanceof Range
        || value instanceof Reference))
      throw new Error("Not the right type for UsageContext.value[x]: " + value.fhirType());
    this.value = value;
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("code", "Coding",
        "A code that identifies the type of context being specified by this usage context.", 0, 1, code));
    children.add(new Property("value[x]",
        "CodeableConcept|Quantity|Range|Reference(PlanDefinition|ResearchStudy|InsurancePlan|HealthcareService|Group|Location|Organization)",
        "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
        0, 1, value));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 3059181:
      /* code */ return new Property("code", "Coding",
          "A code that identifies the type of context being specified by this usage context.", 0, 1, code);
    case -1410166417:
      /* value[x] */ return new Property("value[x]",
          "CodeableConcept|Quantity|Range|Reference(PlanDefinition|ResearchStudy|InsurancePlan|HealthcareService|Group|Location|Organization)",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    case 111972721:
      /* value */ return new Property("value[x]",
          "CodeableConcept|Quantity|Range|Reference(PlanDefinition|ResearchStudy|InsurancePlan|HealthcareService|Group|Location|Organization)",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    case 924902896:
      /* valueCodeableConcept */ return new Property("value[x]", "CodeableConcept",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    case -2029823716:
      /* valueQuantity */ return new Property("value[x]", "Quantity",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    case 2030761548:
      /* valueRange */ return new Property("value[x]", "Range",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    case 1755241690:
      /* valueReference */ return new Property("value[x]",
          "Reference(PlanDefinition|ResearchStudy|InsurancePlan|HealthcareService|Group|Location|Organization)",
          "A value that defines the context specified in this context of use. The interpretation of the value is defined by the code.",
          0, 1, value);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 3059181:
      /* code */ return this.code == null ? new Base[0] : new Base[] { this.code }; // Coding
    case 111972721:
      /* value */ return this.value == null ? new Base[0] : new Base[] { this.value }; // DataType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 3059181: // code
      this.code = TypeConvertor.castToCoding(value); // Coding
      return value;
    case 111972721: // value
      this.value = TypeConvertor.castToType(value); // DataType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("code")) {
      this.code = TypeConvertor.castToCoding(value); // Coding
    } else if (name.equals("value[x]")) {
      this.value = TypeConvertor.castToType(value); // DataType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("code")) {
      this.code = null;
    } else if (name.equals("value[x]")) {
      this.value = null;
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 3059181:
      return getCode();
    case -1410166417:
      return getValue();
    case 111972721:
      return getValue();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 3059181:
      /* code */ return new String[] { "Coding" };
    case 111972721:
      /* value */ return new String[] { "CodeableConcept", "Quantity", "Range", "Reference" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("code")) {
      this.code = new Coding();
      return this.code;
    } else if (name.equals("valueCodeableConcept")) {
      this.value = new CodeableConcept();
      return this.value;
    } else if (name.equals("valueQuantity")) {
      this.value = new Quantity();
      return this.value;
    } else if (name.equals("valueRange")) {
      this.value = new Range();
      return this.value;
    } else if (name.equals("valueReference")) {
      this.value = new Reference();
      return this.value;
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "UsageContext";

  }

  public UsageContext copy() {
    UsageContext dst = new UsageContext();
    copyValues(dst);
    return dst;
  }

  public void copyValues(UsageContext dst) {
    super.copyValues(dst);
    dst.code = code == null ? null : code.copy();
    dst.value = value == null ? null : value.copy();
  }

  protected UsageContext typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof UsageContext))
      return false;
    UsageContext o = (UsageContext) other_;
    return compareDeep(code, o.code, true) && compareDeep(value, o.value, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof UsageContext))
      return false;
    UsageContext o = (UsageContext) other_;
    return true;
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, value);
  }

}