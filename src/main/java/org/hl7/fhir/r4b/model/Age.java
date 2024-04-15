package org.hl7.fhir.r4b.model;

import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.DatatypeDef;

/**
 * Base StructureDefinition for Age Type: A duration of time during which an
 * organism (or a process) has existed.
 */
@DatatypeDef(name = "Age")
public class Age extends Quantity implements ICompositeType {

  private static final long serialVersionUID = 0L;

  /**
   * Constructor
   */
  public Age() {
    super();
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    return super.setProperty(name, value);
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    super.removeChild(name, value);
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    return super.addChild(name);
  }

  public String fhirType() {
    return "Age";

  }

  public Age copy() {
    Age dst = new Age();
    copyValues(dst);
    return dst;
  }

  public void copyValues(Age dst) {
    super.copyValues(dst);
  }

  protected Age typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof Age))
      return false;
    Age o = (Age) other_;
    return true;
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof Age))
      return false;
    Age o = (Age) other_;
    return true;
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty();
  }

}