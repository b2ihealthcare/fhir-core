package org.hl7.fhir.r4b.model;

import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;

/**
 * Base StructureDefinition for MarketingStatus Type: The marketing status
 * describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available.
 */
@DatatypeDef(name = "MarketingStatus")
public class MarketingStatus extends BackboneType implements ICompositeType {

  /**
   * The country in which the marketing authorisation has been granted shall be
   * specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code
   * elements.
   */
  @Child(name = "country", type = {
      CodeableConcept.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements", formalDefinition = "The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.")
  protected CodeableConcept country;

  /**
   * Where a Medicines Regulatory Agency has granted a marketing authorisation for
   * which specific provisions within a jurisdiction apply, the jurisdiction can
   * be specified using an appropriate controlled terminology The controlled term
   * and the controlled term identifier shall be specified.
   */
  @Child(name = "jurisdiction", type = {
      CodeableConcept.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified", formalDefinition = "Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.")
  protected CodeableConcept jurisdiction;

  /**
   * This attribute provides information on the status of the marketing of the
   * medicinal product See ISO/TS 20443 for more information and examples.
   */
  @Child(name = "status", type = {
      CodeableConcept.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples", formalDefinition = "This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.")
  protected CodeableConcept status;

  /**
   * The date when the Medicinal Product is placed on the market by the Marketing
   * Authorisation Holder (or where applicable, the manufacturer/distributor) in a
   * country and/or jurisdiction shall be provided A complete date consisting of
   * day, month and year shall be specified using the ISO 8601 date format NOTE
   * “Placed on the market” refers to the release of the Medicinal Product into
   * the distribution chain.
   */
  @Child(name = "dateRange", type = { Period.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain", formalDefinition = "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.")
  protected Period dateRange;

  /**
   * The date when the Medicinal Product is placed on the market by the Marketing
   * Authorisation Holder (or where applicable, the manufacturer/distributor) in a
   * country and/or jurisdiction shall be provided A complete date consisting of
   * day, month and year shall be specified using the ISO 8601 date format NOTE
   * “Placed on the market” refers to the release of the Medicinal Product into
   * the distribution chain.
   */
  @Child(name = "restoreDate", type = {
      DateTimeType.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
  @Description(shortDefinition = "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain", formalDefinition = "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.")
  protected DateTimeType restoreDate;

  private static final long serialVersionUID = -1445736863L;

  /**
   * Constructor
   */
  public MarketingStatus() {
    super();
  }

  /**
   * Constructor
   */
  public MarketingStatus(CodeableConcept status) {
    super();
    this.setStatus(status);
  }

  /**
   * @return {@link #country} (The country in which the marketing authorisation
   *         has been granted shall be specified It should be specified using the
   *         ISO 3166 ‑ 1 alpha-2 code elements.)
   */
  public CodeableConcept getCountry() {
    if (this.country == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MarketingStatus.country");
      else if (Configuration.doAutoCreate())
        this.country = new CodeableConcept(); // cc
    return this.country;
  }

  public boolean hasCountry() {
    return this.country != null && !this.country.isEmpty();
  }

  /**
   * @param value {@link #country} (The country in which the marketing
   *              authorisation has been granted shall be specified It should be
   *              specified using the ISO 3166 ‑ 1 alpha-2 code elements.)
   */
  public MarketingStatus setCountry(CodeableConcept value) {
    this.country = value;
    return this;
  }

  /**
   * @return {@link #jurisdiction} (Where a Medicines Regulatory Agency has
   *         granted a marketing authorisation for which specific provisions
   *         within a jurisdiction apply, the jurisdiction can be specified using
   *         an appropriate controlled terminology The controlled term and the
   *         controlled term identifier shall be specified.)
   */
  public CodeableConcept getJurisdiction() {
    if (this.jurisdiction == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MarketingStatus.jurisdiction");
      else if (Configuration.doAutoCreate())
        this.jurisdiction = new CodeableConcept(); // cc
    return this.jurisdiction;
  }

  public boolean hasJurisdiction() {
    return this.jurisdiction != null && !this.jurisdiction.isEmpty();
  }

  /**
   * @param value {@link #jurisdiction} (Where a Medicines Regulatory Agency has
   *              granted a marketing authorisation for which specific provisions
   *              within a jurisdiction apply, the jurisdiction can be specified
   *              using an appropriate controlled terminology The controlled term
   *              and the controlled term identifier shall be specified.)
   */
  public MarketingStatus setJurisdiction(CodeableConcept value) {
    this.jurisdiction = value;
    return this;
  }

  /**
   * @return {@link #status} (This attribute provides information on the status of
   *         the marketing of the medicinal product See ISO/TS 20443 for more
   *         information and examples.)
   */
  public CodeableConcept getStatus() {
    if (this.status == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MarketingStatus.status");
      else if (Configuration.doAutoCreate())
        this.status = new CodeableConcept(); // cc
    return this.status;
  }

  public boolean hasStatus() {
    return this.status != null && !this.status.isEmpty();
  }

  /**
   * @param value {@link #status} (This attribute provides information on the
   *              status of the marketing of the medicinal product See ISO/TS
   *              20443 for more information and examples.)
   */
  public MarketingStatus setStatus(CodeableConcept value) {
    this.status = value;
    return this;
  }

  /**
   * @return {@link #dateRange} (The date when the Medicinal Product is placed on
   *         the market by the Marketing Authorisation Holder (or where
   *         applicable, the manufacturer/distributor) in a country and/or
   *         jurisdiction shall be provided A complete date consisting of day,
   *         month and year shall be specified using the ISO 8601 date format NOTE
   *         “Placed on the market” refers to the release of the Medicinal Product
   *         into the distribution chain.)
   */
  public Period getDateRange() {
    if (this.dateRange == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MarketingStatus.dateRange");
      else if (Configuration.doAutoCreate())
        this.dateRange = new Period(); // cc
    return this.dateRange;
  }

  public boolean hasDateRange() {
    return this.dateRange != null && !this.dateRange.isEmpty();
  }

  /**
   * @param value {@link #dateRange} (The date when the Medicinal Product is
   *              placed on the market by the Marketing Authorisation Holder (or
   *              where applicable, the manufacturer/distributor) in a country
   *              and/or jurisdiction shall be provided A complete date consisting
   *              of day, month and year shall be specified using the ISO 8601
   *              date format NOTE “Placed on the market” refers to the release of
   *              the Medicinal Product into the distribution chain.)
   */
  public MarketingStatus setDateRange(Period value) {
    this.dateRange = value;
    return this;
  }

  /**
   * @return {@link #restoreDate} (The date when the Medicinal Product is placed
   *         on the market by the Marketing Authorisation Holder (or where
   *         applicable, the manufacturer/distributor) in a country and/or
   *         jurisdiction shall be provided A complete date consisting of day,
   *         month and year shall be specified using the ISO 8601 date format NOTE
   *         “Placed on the market” refers to the release of the Medicinal Product
   *         into the distribution chain.). This is the underlying object with id,
   *         value and extensions. The accessor "getRestoreDate" gives direct
   *         access to the value
   */
  public DateTimeType getRestoreDateElement() {
    if (this.restoreDate == null)
      if (Configuration.errorOnAutoCreate())
        throw new Error("Attempt to auto-create MarketingStatus.restoreDate");
      else if (Configuration.doAutoCreate())
        this.restoreDate = new DateTimeType(); // bb
    return this.restoreDate;
  }

  public boolean hasRestoreDateElement() {
    return this.restoreDate != null && !this.restoreDate.isEmpty();
  }

  public boolean hasRestoreDate() {
    return this.restoreDate != null && !this.restoreDate.isEmpty();
  }

  /**
   * @param value {@link #restoreDate} (The date when the Medicinal Product is
   *              placed on the market by the Marketing Authorisation Holder (or
   *              where applicable, the manufacturer/distributor) in a country
   *              and/or jurisdiction shall be provided A complete date consisting
   *              of day, month and year shall be specified using the ISO 8601
   *              date format NOTE “Placed on the market” refers to the release of
   *              the Medicinal Product into the distribution chain.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getRestoreDate" gives direct access to the value
   */
  public MarketingStatus setRestoreDateElement(DateTimeType value) {
    this.restoreDate = value;
    return this;
  }

  /**
   * @return The date when the Medicinal Product is placed on the market by the
   *         Marketing Authorisation Holder (or where applicable, the
   *         manufacturer/distributor) in a country and/or jurisdiction shall be
   *         provided A complete date consisting of day, month and year shall be
   *         specified using the ISO 8601 date format NOTE “Placed on the market”
   *         refers to the release of the Medicinal Product into the distribution
   *         chain.
   */
  public Date getRestoreDate() {
    return this.restoreDate == null ? null : this.restoreDate.getValue();
  }

  /**
   * @param value The date when the Medicinal Product is placed on the market by
   *              the Marketing Authorisation Holder (or where applicable, the
   *              manufacturer/distributor) in a country and/or jurisdiction shall
   *              be provided A complete date consisting of day, month and year
   *              shall be specified using the ISO 8601 date format NOTE “Placed
   *              on the market” refers to the release of the Medicinal Product
   *              into the distribution chain.
   */
  public MarketingStatus setRestoreDate(Date value) {
    if (value == null)
      this.restoreDate = null;
    else {
      if (this.restoreDate == null)
        this.restoreDate = new DateTimeType();
      this.restoreDate.setValue(value);
    }
    return this;
  }

  protected void listChildren(List<Property> children) {
    super.listChildren(children);
    children.add(new Property("country", "CodeableConcept",
        "The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.",
        0, 1, country));
    children.add(new Property("jurisdiction", "CodeableConcept",
        "Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.",
        0, 1, jurisdiction));
    children.add(new Property("status", "CodeableConcept",
        "This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.",
        0, 1, status));
    children.add(new Property("dateRange", "Period",
        "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.",
        0, 1, dateRange));
    children.add(new Property("restoreDate", "dateTime",
        "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.",
        0, 1, restoreDate));
  }

  @Override
  public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
    switch (_hash) {
    case 957831062:
      /* country */ return new Property("country", "CodeableConcept",
          "The country in which the marketing authorisation has been granted shall be specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.",
          0, 1, country);
    case -507075711:
      /* jurisdiction */ return new Property("jurisdiction", "CodeableConcept",
          "Where a Medicines Regulatory Agency has granted a marketing authorisation for which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate controlled terminology The controlled term and the controlled term identifier shall be specified.",
          0, 1, jurisdiction);
    case -892481550:
      /* status */ return new Property("status", "CodeableConcept",
          "This attribute provides information on the status of the marketing of the medicinal product See ISO/TS 20443 for more information and examples.",
          0, 1, status);
    case -261425617:
      /* dateRange */ return new Property("dateRange", "Period",
          "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.",
          0, 1, dateRange);
    case 329465692:
      /* restoreDate */ return new Property("restoreDate", "dateTime",
          "The date when the Medicinal Product is placed on the market by the Marketing Authorisation Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall be provided A complete date consisting of day, month and year shall be specified using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into the distribution chain.",
          0, 1, restoreDate);
    default:
      return super.getNamedProperty(_hash, _name, _checkValid);
    }

  }

  @Override
  public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
    switch (hash) {
    case 957831062:
      /* country */ return this.country == null ? new Base[0] : new Base[] { this.country }; // CodeableConcept
    case -507075711:
      /* jurisdiction */ return this.jurisdiction == null ? new Base[0] : new Base[] { this.jurisdiction }; // CodeableConcept
    case -892481550:
      /* status */ return this.status == null ? new Base[0] : new Base[] { this.status }; // CodeableConcept
    case -261425617:
      /* dateRange */ return this.dateRange == null ? new Base[0] : new Base[] { this.dateRange }; // Period
    case 329465692:
      /* restoreDate */ return this.restoreDate == null ? new Base[0] : new Base[] { this.restoreDate }; // DateTimeType
    default:
      return super.getProperty(hash, name, checkValid);
    }

  }

  @Override
  public Base setProperty(int hash, String name, Base value) throws FHIRException {
    switch (hash) {
    case 957831062: // country
      this.country = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      return value;
    case -507075711: // jurisdiction
      this.jurisdiction = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      return value;
    case -892481550: // status
      this.status = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
      return value;
    case -261425617: // dateRange
      this.dateRange = TypeConvertor.castToPeriod(value); // Period
      return value;
    case 329465692: // restoreDate
      this.restoreDate = TypeConvertor.castToDateTime(value); // DateTimeType
      return value;
    default:
      return super.setProperty(hash, name, value);
    }

  }

  @Override
  public Base setProperty(String name, Base value) throws FHIRException {
    if (name.equals("country")) {
      this.country = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("jurisdiction")) {
      this.jurisdiction = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("status")) {
      this.status = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
    } else if (name.equals("dateRange")) {
      this.dateRange = TypeConvertor.castToPeriod(value); // Period
    } else if (name.equals("restoreDate")) {
      this.restoreDate = TypeConvertor.castToDateTime(value); // DateTimeType
    } else
      return super.setProperty(name, value);
    return value;
  }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
    if (name.equals("country")) {
      this.country = null;
    } else if (name.equals("jurisdiction")) {
      this.jurisdiction = null;
    } else if (name.equals("status")) {
      this.status = null;
    } else if (name.equals("dateRange")) {
      this.dateRange = null;
    } else if (name.equals("restoreDate")) {
      this.restoreDate = null;
    } else
      super.removeChild(name, value);
    
  }

  @Override
  public Base makeProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 957831062:
      return getCountry();
    case -507075711:
      return getJurisdiction();
    case -892481550:
      return getStatus();
    case -261425617:
      return getDateRange();
    case 329465692:
      return getRestoreDateElement();
    default:
      return super.makeProperty(hash, name);
    }

  }

  @Override
  public String[] getTypesForProperty(int hash, String name) throws FHIRException {
    switch (hash) {
    case 957831062:
      /* country */ return new String[] { "CodeableConcept" };
    case -507075711:
      /* jurisdiction */ return new String[] { "CodeableConcept" };
    case -892481550:
      /* status */ return new String[] { "CodeableConcept" };
    case -261425617:
      /* dateRange */ return new String[] { "Period" };
    case 329465692:
      /* restoreDate */ return new String[] { "dateTime" };
    default:
      return super.getTypesForProperty(hash, name);
    }

  }

  @Override
  public Base addChild(String name) throws FHIRException {
    if (name.equals("country")) {
      this.country = new CodeableConcept();
      return this.country;
    } else if (name.equals("jurisdiction")) {
      this.jurisdiction = new CodeableConcept();
      return this.jurisdiction;
    } else if (name.equals("status")) {
      this.status = new CodeableConcept();
      return this.status;
    } else if (name.equals("dateRange")) {
      this.dateRange = new Period();
      return this.dateRange;
    } else if (name.equals("restoreDate")) {
      throw new FHIRException("Cannot call addChild on a singleton property MarketingStatus.restoreDate");
    } else
      return super.addChild(name);
  }

  public String fhirType() {
    return "MarketingStatus";

  }

  public MarketingStatus copy() {
    MarketingStatus dst = new MarketingStatus();
    copyValues(dst);
    return dst;
  }

  public void copyValues(MarketingStatus dst) {
    super.copyValues(dst);
    dst.country = country == null ? null : country.copy();
    dst.jurisdiction = jurisdiction == null ? null : jurisdiction.copy();
    dst.status = status == null ? null : status.copy();
    dst.dateRange = dateRange == null ? null : dateRange.copy();
    dst.restoreDate = restoreDate == null ? null : restoreDate.copy();
  }

  protected MarketingStatus typedCopy() {
    return copy();
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof MarketingStatus))
      return false;
    MarketingStatus o = (MarketingStatus) other_;
    return compareDeep(country, o.country, true) && compareDeep(jurisdiction, o.jurisdiction, true)
        && compareDeep(status, o.status, true) && compareDeep(dateRange, o.dateRange, true)
        && compareDeep(restoreDate, o.restoreDate, true);
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof MarketingStatus))
      return false;
    MarketingStatus o = (MarketingStatus) other_;
    return compareValues(restoreDate, o.restoreDate, true);
  }

  public boolean isEmpty() {
    return super.isEmpty()
        && ca.uhn.fhir.util.ElementUtil.isEmpty(country, jurisdiction, status, dateRange, restoreDate);
  }

}