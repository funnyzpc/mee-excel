/*
 * XML Type:  restrictionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RestrictionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML restrictionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface RestrictionType extends Annotated {
    DocumentFactory<RestrictionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "restrictiontype939ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "group" element
     */
    GroupRef getGroup();

    /**
     * True if has "group" element
     */
    boolean isSetGroup();

    /**
     * Sets the "group" element
     */
    void setGroup(GroupRef group);

    /**
     * Appends and returns a new empty "group" element
     */
    GroupRef addNewGroup();

    /**
     * Unsets the "group" element
     */
    void unsetGroup();

    /**
     * Gets the "all" element
     */
    All getAll();

    /**
     * True if has "all" element
     */
    boolean isSetAll();

    /**
     * Sets the "all" element
     */
    void setAll(All all);

    /**
     * Appends and returns a new empty "all" element
     */
    All addNewAll();

    /**
     * Unsets the "all" element
     */
    void unsetAll();

    /**
     * Gets the "choice" element
     */
    ExplicitGroup getChoice();

    /**
     * True if has "choice" element
     */
    boolean isSetChoice();

    /**
     * Sets the "choice" element
     */
    void setChoice(ExplicitGroup choice);

    /**
     * Appends and returns a new empty "choice" element
     */
    ExplicitGroup addNewChoice();

    /**
     * Unsets the "choice" element
     */
    void unsetChoice();

    /**
     * Gets the "sequence" element
     */
    ExplicitGroup getSequence();

    /**
     * True if has "sequence" element
     */
    boolean isSetSequence();

    /**
     * Sets the "sequence" element
     */
    void setSequence(ExplicitGroup sequence);

    /**
     * Appends and returns a new empty "sequence" element
     */
    ExplicitGroup addNewSequence();

    /**
     * Unsets the "sequence" element
     */
    void unsetSequence();

    /**
     * Gets the "simpleType" element
     */
    LocalSimpleType getSimpleType();

    /**
     * True if has "simpleType" element
     */
    boolean isSetSimpleType();

    /**
     * Sets the "simpleType" element
     */
    void setSimpleType(LocalSimpleType simpleType);

    /**
     * Appends and returns a new empty "simpleType" element
     */
    LocalSimpleType addNewSimpleType();

    /**
     * Unsets the "simpleType" element
     */
    void unsetSimpleType();

    /**
     * Gets a List of "minExclusive" elements
     */
    java.util.List<Facet> getMinExclusiveList();

    /**
     * Gets array of all "minExclusive" elements
     */
    Facet[] getMinExclusiveArray();

    /**
     * Gets ith "minExclusive" element
     */
    Facet getMinExclusiveArray(int i);

    /**
     * Returns number of "minExclusive" element
     */
    int sizeOfMinExclusiveArray();

    /**
     * Sets array of all "minExclusive" element
     */
    void setMinExclusiveArray(Facet[] minExclusiveArray);

    /**
     * Sets ith "minExclusive" element
     */
    void setMinExclusiveArray(int i, Facet minExclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minExclusive" element
     */
    Facet insertNewMinExclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minExclusive" element
     */
    Facet addNewMinExclusive();

    /**
     * Removes the ith "minExclusive" element
     */
    void removeMinExclusive(int i);

    /**
     * Gets a List of "minInclusive" elements
     */
    java.util.List<Facet> getMinInclusiveList();

    /**
     * Gets array of all "minInclusive" elements
     */
    Facet[] getMinInclusiveArray();

    /**
     * Gets ith "minInclusive" element
     */
    Facet getMinInclusiveArray(int i);

    /**
     * Returns number of "minInclusive" element
     */
    int sizeOfMinInclusiveArray();

    /**
     * Sets array of all "minInclusive" element
     */
    void setMinInclusiveArray(Facet[] minInclusiveArray);

    /**
     * Sets ith "minInclusive" element
     */
    void setMinInclusiveArray(int i, Facet minInclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minInclusive" element
     */
    Facet insertNewMinInclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minInclusive" element
     */
    Facet addNewMinInclusive();

    /**
     * Removes the ith "minInclusive" element
     */
    void removeMinInclusive(int i);

    /**
     * Gets a List of "maxExclusive" elements
     */
    java.util.List<Facet> getMaxExclusiveList();

    /**
     * Gets array of all "maxExclusive" elements
     */
    Facet[] getMaxExclusiveArray();

    /**
     * Gets ith "maxExclusive" element
     */
    Facet getMaxExclusiveArray(int i);

    /**
     * Returns number of "maxExclusive" element
     */
    int sizeOfMaxExclusiveArray();

    /**
     * Sets array of all "maxExclusive" element
     */
    void setMaxExclusiveArray(Facet[] maxExclusiveArray);

    /**
     * Sets ith "maxExclusive" element
     */
    void setMaxExclusiveArray(int i, Facet maxExclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxExclusive" element
     */
    Facet insertNewMaxExclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxExclusive" element
     */
    Facet addNewMaxExclusive();

    /**
     * Removes the ith "maxExclusive" element
     */
    void removeMaxExclusive(int i);

    /**
     * Gets a List of "maxInclusive" elements
     */
    java.util.List<Facet> getMaxInclusiveList();

    /**
     * Gets array of all "maxInclusive" elements
     */
    Facet[] getMaxInclusiveArray();

    /**
     * Gets ith "maxInclusive" element
     */
    Facet getMaxInclusiveArray(int i);

    /**
     * Returns number of "maxInclusive" element
     */
    int sizeOfMaxInclusiveArray();

    /**
     * Sets array of all "maxInclusive" element
     */
    void setMaxInclusiveArray(Facet[] maxInclusiveArray);

    /**
     * Sets ith "maxInclusive" element
     */
    void setMaxInclusiveArray(int i, Facet maxInclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxInclusive" element
     */
    Facet insertNewMaxInclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxInclusive" element
     */
    Facet addNewMaxInclusive();

    /**
     * Removes the ith "maxInclusive" element
     */
    void removeMaxInclusive(int i);

    /**
     * Gets a List of "totalDigits" elements
     */
    java.util.List<TotalDigitsDocument.TotalDigits> getTotalDigitsList();

    /**
     * Gets array of all "totalDigits" elements
     */
    TotalDigitsDocument.TotalDigits[] getTotalDigitsArray();

    /**
     * Gets ith "totalDigits" element
     */
    TotalDigitsDocument.TotalDigits getTotalDigitsArray(int i);

    /**
     * Returns number of "totalDigits" element
     */
    int sizeOfTotalDigitsArray();

    /**
     * Sets array of all "totalDigits" element
     */
    void setTotalDigitsArray(TotalDigitsDocument.TotalDigits[] totalDigitsArray);

    /**
     * Sets ith "totalDigits" element
     */
    void setTotalDigitsArray(int i, TotalDigitsDocument.TotalDigits totalDigits);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "totalDigits" element
     */
    TotalDigitsDocument.TotalDigits insertNewTotalDigits(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "totalDigits" element
     */
    TotalDigitsDocument.TotalDigits addNewTotalDigits();

    /**
     * Removes the ith "totalDigits" element
     */
    void removeTotalDigits(int i);

    /**
     * Gets a List of "fractionDigits" elements
     */
    java.util.List<NumFacet> getFractionDigitsList();

    /**
     * Gets array of all "fractionDigits" elements
     */
    NumFacet[] getFractionDigitsArray();

    /**
     * Gets ith "fractionDigits" element
     */
    NumFacet getFractionDigitsArray(int i);

    /**
     * Returns number of "fractionDigits" element
     */
    int sizeOfFractionDigitsArray();

    /**
     * Sets array of all "fractionDigits" element
     */
    void setFractionDigitsArray(NumFacet[] fractionDigitsArray);

    /**
     * Sets ith "fractionDigits" element
     */
    void setFractionDigitsArray(int i, NumFacet fractionDigits);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fractionDigits" element
     */
    NumFacet insertNewFractionDigits(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fractionDigits" element
     */
    NumFacet addNewFractionDigits();

    /**
     * Removes the ith "fractionDigits" element
     */
    void removeFractionDigits(int i);

    /**
     * Gets a List of "length" elements
     */
    java.util.List<NumFacet> getLengthList();

    /**
     * Gets array of all "length" elements
     */
    NumFacet[] getLengthArray();

    /**
     * Gets ith "length" element
     */
    NumFacet getLengthArray(int i);

    /**
     * Returns number of "length" element
     */
    int sizeOfLengthArray();

    /**
     * Sets array of all "length" element
     */
    void setLengthArray(NumFacet[] lengthArray);

    /**
     * Sets ith "length" element
     */
    void setLengthArray(int i, NumFacet length);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "length" element
     */
    NumFacet insertNewLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "length" element
     */
    NumFacet addNewLength();

    /**
     * Removes the ith "length" element
     */
    void removeLength(int i);

    /**
     * Gets a List of "minLength" elements
     */
    java.util.List<NumFacet> getMinLengthList();

    /**
     * Gets array of all "minLength" elements
     */
    NumFacet[] getMinLengthArray();

    /**
     * Gets ith "minLength" element
     */
    NumFacet getMinLengthArray(int i);

    /**
     * Returns number of "minLength" element
     */
    int sizeOfMinLengthArray();

    /**
     * Sets array of all "minLength" element
     */
    void setMinLengthArray(NumFacet[] minLengthArray);

    /**
     * Sets ith "minLength" element
     */
    void setMinLengthArray(int i, NumFacet minLength);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minLength" element
     */
    NumFacet insertNewMinLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minLength" element
     */
    NumFacet addNewMinLength();

    /**
     * Removes the ith "minLength" element
     */
    void removeMinLength(int i);

    /**
     * Gets a List of "maxLength" elements
     */
    java.util.List<NumFacet> getMaxLengthList();

    /**
     * Gets array of all "maxLength" elements
     */
    NumFacet[] getMaxLengthArray();

    /**
     * Gets ith "maxLength" element
     */
    NumFacet getMaxLengthArray(int i);

    /**
     * Returns number of "maxLength" element
     */
    int sizeOfMaxLengthArray();

    /**
     * Sets array of all "maxLength" element
     */
    void setMaxLengthArray(NumFacet[] maxLengthArray);

    /**
     * Sets ith "maxLength" element
     */
    void setMaxLengthArray(int i, NumFacet maxLength);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxLength" element
     */
    NumFacet insertNewMaxLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxLength" element
     */
    NumFacet addNewMaxLength();

    /**
     * Removes the ith "maxLength" element
     */
    void removeMaxLength(int i);

    /**
     * Gets a List of "enumeration" elements
     */
    java.util.List<NoFixedFacet> getEnumerationList();

    /**
     * Gets array of all "enumeration" elements
     */
    NoFixedFacet[] getEnumerationArray();

    /**
     * Gets ith "enumeration" element
     */
    NoFixedFacet getEnumerationArray(int i);

    /**
     * Returns number of "enumeration" element
     */
    int sizeOfEnumerationArray();

    /**
     * Sets array of all "enumeration" element
     */
    void setEnumerationArray(NoFixedFacet[] enumerationArray);

    /**
     * Sets ith "enumeration" element
     */
    void setEnumerationArray(int i, NoFixedFacet enumeration);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "enumeration" element
     */
    NoFixedFacet insertNewEnumeration(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "enumeration" element
     */
    NoFixedFacet addNewEnumeration();

    /**
     * Removes the ith "enumeration" element
     */
    void removeEnumeration(int i);

    /**
     * Gets a List of "whiteSpace" elements
     */
    java.util.List<WhiteSpaceDocument.WhiteSpace> getWhiteSpaceList();

    /**
     * Gets array of all "whiteSpace" elements
     */
    WhiteSpaceDocument.WhiteSpace[] getWhiteSpaceArray();

    /**
     * Gets ith "whiteSpace" element
     */
    WhiteSpaceDocument.WhiteSpace getWhiteSpaceArray(int i);

    /**
     * Returns number of "whiteSpace" element
     */
    int sizeOfWhiteSpaceArray();

    /**
     * Sets array of all "whiteSpace" element
     */
    void setWhiteSpaceArray(WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray);

    /**
     * Sets ith "whiteSpace" element
     */
    void setWhiteSpaceArray(int i, WhiteSpaceDocument.WhiteSpace whiteSpace);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "whiteSpace" element
     */
    WhiteSpaceDocument.WhiteSpace insertNewWhiteSpace(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "whiteSpace" element
     */
    WhiteSpaceDocument.WhiteSpace addNewWhiteSpace();

    /**
     * Removes the ith "whiteSpace" element
     */
    void removeWhiteSpace(int i);

    /**
     * Gets a List of "pattern" elements
     */
    java.util.List<PatternDocument.Pattern> getPatternList();

    /**
     * Gets array of all "pattern" elements
     */
    PatternDocument.Pattern[] getPatternArray();

    /**
     * Gets ith "pattern" element
     */
    PatternDocument.Pattern getPatternArray(int i);

    /**
     * Returns number of "pattern" element
     */
    int sizeOfPatternArray();

    /**
     * Sets array of all "pattern" element
     */
    void setPatternArray(PatternDocument.Pattern[] patternArray);

    /**
     * Sets ith "pattern" element
     */
    void setPatternArray(int i, PatternDocument.Pattern pattern);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    PatternDocument.Pattern insertNewPattern(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    PatternDocument.Pattern addNewPattern();

    /**
     * Removes the ith "pattern" element
     */
    void removePattern(int i);

    /**
     * Gets a List of "attribute" elements
     */
    java.util.List<Attribute> getAttributeList();

    /**
     * Gets array of all "attribute" elements
     */
    Attribute[] getAttributeArray();

    /**
     * Gets ith "attribute" element
     */
    Attribute getAttributeArray(int i);

    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(Attribute[] attributeArray);

    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, Attribute attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    Attribute insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    Attribute addNewAttribute();

    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets a List of "attributeGroup" elements
     */
    java.util.List<AttributeGroupRef> getAttributeGroupList();

    /**
     * Gets array of all "attributeGroup" elements
     */
    AttributeGroupRef[] getAttributeGroupArray();

    /**
     * Gets ith "attributeGroup" element
     */
    AttributeGroupRef getAttributeGroupArray(int i);

    /**
     * Returns number of "attributeGroup" element
     */
    int sizeOfAttributeGroupArray();

    /**
     * Sets array of all "attributeGroup" element
     */
    void setAttributeGroupArray(AttributeGroupRef[] attributeGroupArray);

    /**
     * Sets ith "attributeGroup" element
     */
    void setAttributeGroupArray(int i, AttributeGroupRef attributeGroup);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    AttributeGroupRef insertNewAttributeGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    AttributeGroupRef addNewAttributeGroup();

    /**
     * Removes the ith "attributeGroup" element
     */
    void removeAttributeGroup(int i);

    /**
     * Gets the "anyAttribute" element
     */
    Wildcard getAnyAttribute();

    /**
     * True if has "anyAttribute" element
     */
    boolean isSetAnyAttribute();

    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(Wildcard anyAttribute);

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    Wildcard addNewAnyAttribute();

    /**
     * Unsets the "anyAttribute" element
     */
    void unsetAnyAttribute();

    /**
     * Gets the "base" attribute
     */
    javax.xml.namespace.QName getBase();

    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlQName xgetBase();

    /**
     * Sets the "base" attribute
     */
    void setBase(javax.xml.namespace.QName base);

    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlQName base);
}
