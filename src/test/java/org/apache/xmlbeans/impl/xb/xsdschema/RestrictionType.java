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
public interface RestrictionType extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.RestrictionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "restrictiontype939ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroup();

    /**
     * True if has "group" element
     */
    boolean isSetGroup();

    /**
     * Sets the "group" element
     */
    void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group);

    /**
     * Appends and returns a new empty "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup();

    /**
     * Unsets the "group" element
     */
    void unsetGroup();

    /**
     * Gets the "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All getAll();

    /**
     * True if has "all" element
     */
    boolean isSetAll();

    /**
     * Sets the "all" element
     */
    void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all);

    /**
     * Appends and returns a new empty "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll();

    /**
     * Unsets the "all" element
     */
    void unsetAll();

    /**
     * Gets the "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice();

    /**
     * True if has "choice" element
     */
    boolean isSetChoice();

    /**
     * Sets the "choice" element
     */
    void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice);

    /**
     * Appends and returns a new empty "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice();

    /**
     * Unsets the "choice" element
     */
    void unsetChoice();

    /**
     * Gets the "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence();

    /**
     * True if has "sequence" element
     */
    boolean isSetSequence();

    /**
     * Sets the "sequence" element
     */
    void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence);

    /**
     * Appends and returns a new empty "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence();

    /**
     * Unsets the "sequence" element
     */
    void unsetSequence();

    /**
     * Gets the "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType();

    /**
     * True if has "simpleType" element
     */
    boolean isSetSimpleType();

    /**
     * Sets the "simpleType" element
     */
    void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType);

    /**
     * Appends and returns a new empty "simpleType" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType();

    /**
     * Unsets the "simpleType" element
     */
    void unsetSimpleType();

    /**
     * Gets a List of "minExclusive" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMinExclusiveList();

    /**
     * Gets array of all "minExclusive" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMinExclusiveArray();

    /**
     * Gets ith "minExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinExclusiveArray(int i);

    /**
     * Returns number of "minExclusive" element
     */
    int sizeOfMinExclusiveArray();

    /**
     * Sets array of all "minExclusive" element
     */
    void setMinExclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] minExclusiveArray);

    /**
     * Sets ith "minExclusive" element
     */
    void setMinExclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet minExclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMinExclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinExclusive();

    /**
     * Removes the ith "minExclusive" element
     */
    void removeMinExclusive(int i);

    /**
     * Gets a List of "minInclusive" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMinInclusiveList();

    /**
     * Gets array of all "minInclusive" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMinInclusiveArray();

    /**
     * Gets ith "minInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinInclusiveArray(int i);

    /**
     * Returns number of "minInclusive" element
     */
    int sizeOfMinInclusiveArray();

    /**
     * Sets array of all "minInclusive" element
     */
    void setMinInclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] minInclusiveArray);

    /**
     * Sets ith "minInclusive" element
     */
    void setMinInclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet minInclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMinInclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinInclusive();

    /**
     * Removes the ith "minInclusive" element
     */
    void removeMinInclusive(int i);

    /**
     * Gets a List of "maxExclusive" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMaxExclusiveList();

    /**
     * Gets array of all "maxExclusive" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMaxExclusiveArray();

    /**
     * Gets ith "maxExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxExclusiveArray(int i);

    /**
     * Returns number of "maxExclusive" element
     */
    int sizeOfMaxExclusiveArray();

    /**
     * Sets array of all "maxExclusive" element
     */
    void setMaxExclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] maxExclusiveArray);

    /**
     * Sets ith "maxExclusive" element
     */
    void setMaxExclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet maxExclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMaxExclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxExclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxExclusive();

    /**
     * Removes the ith "maxExclusive" element
     */
    void removeMaxExclusive(int i);

    /**
     * Gets a List of "maxInclusive" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMaxInclusiveList();

    /**
     * Gets array of all "maxInclusive" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMaxInclusiveArray();

    /**
     * Gets ith "maxInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxInclusiveArray(int i);

    /**
     * Returns number of "maxInclusive" element
     */
    int sizeOfMaxInclusiveArray();

    /**
     * Sets array of all "maxInclusive" element
     */
    void setMaxInclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] maxInclusiveArray);

    /**
     * Sets ith "maxInclusive" element
     */
    void setMaxInclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet maxInclusive);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMaxInclusive(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxInclusive" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxInclusive();

    /**
     * Removes the ith "maxInclusive" element
     */
    void removeMaxInclusive(int i);

    /**
     * Gets a List of "totalDigits" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits> getTotalDigitsList();

    /**
     * Gets array of all "totalDigits" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits[] getTotalDigitsArray();

    /**
     * Gets ith "totalDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits getTotalDigitsArray(int i);

    /**
     * Returns number of "totalDigits" element
     */
    int sizeOfTotalDigitsArray();

    /**
     * Sets array of all "totalDigits" element
     */
    void setTotalDigitsArray(org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits[] totalDigitsArray);

    /**
     * Sets ith "totalDigits" element
     */
    void setTotalDigitsArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits totalDigits);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "totalDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits insertNewTotalDigits(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "totalDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits addNewTotalDigits();

    /**
     * Removes the ith "totalDigits" element
     */
    void removeTotalDigits(int i);

    /**
     * Gets a List of "fractionDigits" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getFractionDigitsList();

    /**
     * Gets array of all "fractionDigits" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getFractionDigitsArray();

    /**
     * Gets ith "fractionDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getFractionDigitsArray(int i);

    /**
     * Returns number of "fractionDigits" element
     */
    int sizeOfFractionDigitsArray();

    /**
     * Sets array of all "fractionDigits" element
     */
    void setFractionDigitsArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] fractionDigitsArray);

    /**
     * Sets ith "fractionDigits" element
     */
    void setFractionDigitsArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet fractionDigits);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fractionDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewFractionDigits(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fractionDigits" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewFractionDigits();

    /**
     * Removes the ith "fractionDigits" element
     */
    void removeFractionDigits(int i);

    /**
     * Gets a List of "length" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getLengthList();

    /**
     * Gets array of all "length" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getLengthArray();

    /**
     * Gets ith "length" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getLengthArray(int i);

    /**
     * Returns number of "length" element
     */
    int sizeOfLengthArray();

    /**
     * Sets array of all "length" element
     */
    void setLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] lengthArray);

    /**
     * Sets ith "length" element
     */
    void setLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet length);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "length" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "length" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewLength();

    /**
     * Removes the ith "length" element
     */
    void removeLength(int i);

    /**
     * Gets a List of "minLength" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getMinLengthList();

    /**
     * Gets array of all "minLength" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getMinLengthArray();

    /**
     * Gets ith "minLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMinLengthArray(int i);

    /**
     * Returns number of "minLength" element
     */
    int sizeOfMinLengthArray();

    /**
     * Sets array of all "minLength" element
     */
    void setMinLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] minLengthArray);

    /**
     * Sets ith "minLength" element
     */
    void setMinLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet minLength);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewMinLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "minLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMinLength();

    /**
     * Removes the ith "minLength" element
     */
    void removeMinLength(int i);

    /**
     * Gets a List of "maxLength" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getMaxLengthList();

    /**
     * Gets array of all "maxLength" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getMaxLengthArray();

    /**
     * Gets ith "maxLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMaxLengthArray(int i);

    /**
     * Returns number of "maxLength" element
     */
    int sizeOfMaxLengthArray();

    /**
     * Sets array of all "maxLength" element
     */
    void setMaxLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] maxLengthArray);

    /**
     * Sets ith "maxLength" element
     */
    void setMaxLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet maxLength);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewMaxLength(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "maxLength" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMaxLength();

    /**
     * Removes the ith "maxLength" element
     */
    void removeMaxLength(int i);

    /**
     * Gets a List of "enumeration" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet> getEnumerationList();

    /**
     * Gets array of all "enumeration" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet[] getEnumerationArray();

    /**
     * Gets ith "enumeration" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet getEnumerationArray(int i);

    /**
     * Returns number of "enumeration" element
     */
    int sizeOfEnumerationArray();

    /**
     * Sets array of all "enumeration" element
     */
    void setEnumerationArray(org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet[] enumerationArray);

    /**
     * Sets ith "enumeration" element
     */
    void setEnumerationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet enumeration);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "enumeration" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet insertNewEnumeration(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "enumeration" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet addNewEnumeration();

    /**
     * Removes the ith "enumeration" element
     */
    void removeEnumeration(int i);

    /**
     * Gets a List of "whiteSpace" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace> getWhiteSpaceList();

    /**
     * Gets array of all "whiteSpace" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace[] getWhiteSpaceArray();

    /**
     * Gets ith "whiteSpace" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace getWhiteSpaceArray(int i);

    /**
     * Returns number of "whiteSpace" element
     */
    int sizeOfWhiteSpaceArray();

    /**
     * Sets array of all "whiteSpace" element
     */
    void setWhiteSpaceArray(org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray);

    /**
     * Sets ith "whiteSpace" element
     */
    void setWhiteSpaceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace whiteSpace);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "whiteSpace" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace insertNewWhiteSpace(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "whiteSpace" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace();

    /**
     * Removes the ith "whiteSpace" element
     */
    void removeWhiteSpace(int i);

    /**
     * Gets a List of "pattern" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern> getPatternList();

    /**
     * Gets array of all "pattern" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern[] getPatternArray();

    /**
     * Gets ith "pattern" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern getPatternArray(int i);

    /**
     * Returns number of "pattern" element
     */
    int sizeOfPatternArray();

    /**
     * Sets array of all "pattern" element
     */
    void setPatternArray(org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern[] patternArray);

    /**
     * Sets ith "pattern" element
     */
    void setPatternArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern pattern);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern insertNewPattern(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern addNewPattern();

    /**
     * Removes the ith "pattern" element
     */
    void removePattern(int i);

    /**
     * Gets a List of "attribute" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Attribute> getAttributeList();

    /**
     * Gets array of all "attribute" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] getAttributeArray();

    /**
     * Gets ith "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i);

    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray);

    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute addNewAttribute();

    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets a List of "attributeGroup" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef> getAttributeGroupList();

    /**
     * Gets array of all "attributeGroup" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] getAttributeGroupArray();

    /**
     * Gets ith "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i);

    /**
     * Returns number of "attributeGroup" element
     */
    int sizeOfAttributeGroupArray();

    /**
     * Sets array of all "attributeGroup" element
     */
    void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray);

    /**
     * Sets ith "attributeGroup" element
     */
    void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef addNewAttributeGroup();

    /**
     * Removes the ith "attributeGroup" element
     */
    void removeAttributeGroup(int i);

    /**
     * Gets the "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute();

    /**
     * True if has "anyAttribute" element
     */
    boolean isSetAnyAttribute();

    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute);

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute();

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
