package org.hl7.fhir.r4b.model;

import java.util.Date;
import java.util.List;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Common Ancestor declaration for conformance and knowledge artifact resources.
 */
public abstract class MetadataResource extends CanonicalResource {

  private static final long serialVersionUID = 0L;

  /**
   * Constructor
   */
  public MetadataResource() {
    super();
  }

  /**
   * How many allowed for this property by the implementation
   */
  public int getApprovalDateMax() {
    return 1;
  }

  /**
   * @return {@link #approvalDate} (The date on which the resource content was
   *         approved by the publisher. Approval happens once when the content is
   *         officially approved for usage.). This is the underlying object with
   *         id, value and extensions. The accessor "getApprovalDate" gives direct
   *         access to the value
   */
  public abstract DateType getApprovalDateElement();

  public abstract boolean hasApprovalDateElement();

  public abstract boolean hasApprovalDate();

  /**
   * @param value {@link #approvalDate} (The date on which the resource content
   *              was approved by the publisher. Approval happens once when the
   *              content is officially approved for usage.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getApprovalDate" gives direct access to the value
   */
  public abstract MetadataResource setApprovalDateElement(DateType value);

  /**
   * @return The date on which the resource content was approved by the publisher.
   *         Approval happens once when the content is officially approved for
   *         usage.
   */
  public abstract Date getApprovalDate();

  /**
   * @param value The date on which the resource content was approved by the
   *              publisher. Approval happens once when the content is officially
   *              approved for usage.
   */
  public abstract MetadataResource setApprovalDate(Date value);

  /**
   * How many allowed for this property by the implementation
   */
  public int getLastReviewDateMax() {
    return 1;
  }

  /**
   * @return {@link #lastReviewDate} (The date on which the resource content was
   *         last reviewed. Review happens periodically after approval but does
   *         not change the original approval date.). This is the underlying
   *         object with id, value and extensions. The accessor
   *         "getLastReviewDate" gives direct access to the value
   */
  public abstract DateType getLastReviewDateElement();

  public abstract boolean hasLastReviewDateElement();

  public abstract boolean hasLastReviewDate();

  /**
   * @param value {@link #lastReviewDate} (The date on which the resource content
   *              was last reviewed. Review happens periodically after approval
   *              but does not change the original approval date.). This is the
   *              underlying object with id, value and extensions. The accessor
   *              "getLastReviewDate" gives direct access to the value
   */
  public abstract MetadataResource setLastReviewDateElement(DateType value);

  /**
   * @return The date on which the resource content was last reviewed. Review
   *         happens periodically after approval but does not change the original
   *         approval date.
   */
  public abstract Date getLastReviewDate();

  /**
   * @param value The date on which the resource content was last reviewed. Review
   *              happens periodically after approval but does not change the
   *              original approval date.
   */
  public abstract MetadataResource setLastReviewDate(Date value);

  /**
   * How many allowed for this property by the implementation
   */
  public int getEffectivePeriodMax() {
    return 1;
  }

  /**
   * @return {@link #effectivePeriod} (The period during which the metadata
   *         resource content was or is planned to be in active use.)
   */
  public abstract Period getEffectivePeriod();

  public abstract boolean hasEffectivePeriod();

  /**
   * @param value {@link #effectivePeriod} (The period during which the metadata
   *              resource content was or is planned to be in active use.)
   */
  public abstract MetadataResource setEffectivePeriod(Period value);

  /**
   * How many allowed for this property by the implementation
   */
  public int getTopicMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #topic} (Descriptive topics related to the content of the
   *         library. Topics provide a high-level categorization of the library
   *         that can be useful for filtering and searching.)
   */
  public abstract List<CodeableConcept> getTopic();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setTopic(List<CodeableConcept> theTopic);

  public abstract boolean hasTopic();

  public abstract CodeableConcept addTopic(); // 3

  public abstract MetadataResource addTopic(CodeableConcept t); // 3

  /**
   * @return The first repetition of repeating field {@link #topic}, creating it
   *         if it does not already exist {1}
   */
  public abstract CodeableConcept getTopicFirstRep();

  /**
   * How many allowed for this property by the implementation
   */
  public int getAuthorMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #author} (An individiual or organization primarily involved in
   *         the creation and maintenance of the metadata resource.)
   */
  public abstract List<ContactDetail> getAuthor();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setAuthor(List<ContactDetail> theAuthor);

  public abstract boolean hasAuthor();

  public abstract ContactDetail addAuthor(); // 3

  public abstract MetadataResource addAuthor(ContactDetail t); // 3

  /**
   * @return The first repetition of repeating field {@link #author}, creating it
   *         if it does not already exist {1}
   */
  public abstract ContactDetail getAuthorFirstRep();

  /**
   * How many allowed for this property by the implementation
   */
  public int getEditorMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #editor} (An individual or organization primarily responsible
   *         for internal coherence of the metadata resource.)
   */
  public abstract List<ContactDetail> getEditor();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setEditor(List<ContactDetail> theEditor);

  public abstract boolean hasEditor();

  public abstract ContactDetail addEditor(); // 3

  public abstract MetadataResource addEditor(ContactDetail t); // 3

  /**
   * @return The first repetition of repeating field {@link #editor}, creating it
   *         if it does not already exist {1}
   */
  public abstract ContactDetail getEditorFirstRep();

  /**
   * How many allowed for this property by the implementation
   */
  public int getReviewerMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #reviewer} (An individual or organization primarily
   *         responsible for review of some aspect of the metadata resource.)
   */
  public abstract List<ContactDetail> getReviewer();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setReviewer(List<ContactDetail> theReviewer);

  public abstract boolean hasReviewer();

  public abstract ContactDetail addReviewer(); // 3

  public abstract MetadataResource addReviewer(ContactDetail t); // 3

  /**
   * @return The first repetition of repeating field {@link #reviewer}, creating
   *         it if it does not already exist {1}
   */
  public abstract ContactDetail getReviewerFirstRep();

  /**
   * How many allowed for this property by the implementation
   */
  public int getEndorserMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #endorser} (An individual or organization responsible for
   *         officially endorsing the metadata resource for use in some setting.)
   */
  public abstract List<ContactDetail> getEndorser();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setEndorser(List<ContactDetail> theEndorser);

  public abstract boolean hasEndorser();

  public abstract ContactDetail addEndorser(); // 3

  public abstract MetadataResource addEndorser(ContactDetail t); // 3

  /**
   * @return The first repetition of repeating field {@link #endorser}, creating
   *         it if it does not already exist {1}
   */
  public abstract ContactDetail getEndorserFirstRep();

  /**
   * How many allowed for this property by the implementation
   */
  public int getRelatedArtifactMax() {
    return Integer.MAX_VALUE;
  }

  /**
   * @return {@link #relatedArtifact} (Related artifacts such as additional
   *         documentation, justification, dependencies, bibliographic references,
   *         and predecessor and successor artifacts.)
   */
  public abstract List<RelatedArtifact> getRelatedArtifact();

  /**
   * @return Returns a reference to <code>this</code> for easy method chaining
   */
  public abstract MetadataResource setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact);

  public abstract boolean hasRelatedArtifact();

  public abstract RelatedArtifact addRelatedArtifact(); // 3

  public abstract MetadataResource addRelatedArtifact(RelatedArtifact t); // 3

  /**
   * @return The first repetition of repeating field {@link #relatedArtifact},
   *         creating it if it does not already exist {1}
   */
  public abstract RelatedArtifact getRelatedArtifactFirstRep();

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
    return "MetadataResource";

  }

  public abstract MetadataResource copy();

  public void copyValues(MetadataResource dst) {
    super.copyValues(dst);
  }

  @Override
  public boolean equalsDeep(Base other_) {
    if (!super.equalsDeep(other_))
      return false;
    if (!(other_ instanceof MetadataResource))
      return false;
    MetadataResource o = (MetadataResource) other_;
    return true;
  }

  @Override
  public boolean equalsShallow(Base other_) {
    if (!super.equalsShallow(other_))
      return false;
    if (!(other_ instanceof MetadataResource))
      return false;
    MetadataResource o = (MetadataResource) other_;
    return true;
  }

  public boolean isEmpty() {
    return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty();
  }

}
