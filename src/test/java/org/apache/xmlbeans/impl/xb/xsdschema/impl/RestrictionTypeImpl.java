/*
 * XML Type:  restrictionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RestrictionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML restrictionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class RestrictionTypeImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.RestrictionType {
    private static final long serialVersionUID = 1L;

    public RestrictionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "group"),
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
        new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
        new QName("http://www.w3.org/2001/XMLSchema", "minExclusive"),
        new QName("http://www.w3.org/2001/XMLSchema", "minInclusive"),
        new QName("http://www.w3.org/2001/XMLSchema", "maxExclusive"),
        new QName("http://www.w3.org/2001/XMLSchema", "maxInclusive"),
        new QName("http://www.w3.org/2001/XMLSchema", "totalDigits"),
        new QName("http://www.w3.org/2001/XMLSchema", "fractionDigits"),
        new QName("http://www.w3.org/2001/XMLSchema", "length"),
        new QName("http://www.w3.org/2001/XMLSchema", "minLength"),
        new QName("http://www.w3.org/2001/XMLSchema", "maxLength"),
        new QName("http://www.w3.org/2001/XMLSchema", "enumeration"),
        new QName("http://www.w3.org/2001/XMLSchema", "whiteSpace"),
        new QName("http://www.w3.org/2001/XMLSchema", "pattern"),
        new QName("http://www.w3.org/2001/XMLSchema", "attribute"),
        new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
        new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute"),
        new QName("", "base"),
    };


    /**
     * Gets the "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "group" element
     */
    public boolean isSetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "group" element
     */
    public void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "group" element
     */
    public void unsetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All getAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "all" element
     */
    public boolean isSetAll() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "all" element
     */
    public void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "all" element
     */
    public void unsetAll() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "choice" element
     */
    public boolean isSetChoice() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "choice" element
     */
    public void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice) {
        generatedSetterHelperImpl(choice, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "choice" element
     */
    public void unsetChoice() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sequence" element
     */
    public boolean isSetSequence() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "sequence" element
     */
    public void unsetSequence() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "simpleType" element
     */
    public boolean isSetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType) {
        generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "simpleType" element
     */
    public void unsetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets a List of "minExclusive" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMinExclusiveList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMinExclusiveArray,
                this::setMinExclusiveArray,
                this::insertNewMinExclusive,
                this::removeMinExclusive,
                this::sizeOfMinExclusiveArray
            );
        }
    }

    /**
     * Gets array of all "minExclusive" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMinExclusiveArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.apache.xmlbeans.impl.xb.xsdschema.Facet[0]);
    }

    /**
     * Gets ith "minExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinExclusiveArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "minExclusive" element
     */
    public int sizeOfMinExclusiveArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "minExclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinExclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] minExclusiveArray) {
        check_orphaned();
        arraySetterHelper(minExclusiveArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "minExclusive" element
     */
    public void setMinExclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet minExclusive) {
        generatedSetterHelperImpl(minExclusive, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMinExclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "minExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "minExclusive" element
     */
    public void removeMinExclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "minInclusive" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMinInclusiveList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMinInclusiveArray,
                this::setMinInclusiveArray,
                this::insertNewMinInclusive,
                this::removeMinInclusive,
                this::sizeOfMinInclusiveArray
            );
        }
    }

    /**
     * Gets array of all "minInclusive" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMinInclusiveArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.apache.xmlbeans.impl.xb.xsdschema.Facet[0]);
    }

    /**
     * Gets ith "minInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet getMinInclusiveArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "minInclusive" element
     */
    public int sizeOfMinInclusiveArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "minInclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinInclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] minInclusiveArray) {
        check_orphaned();
        arraySetterHelper(minInclusiveArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "minInclusive" element
     */
    public void setMinInclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet minInclusive) {
        generatedSetterHelperImpl(minInclusive, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMinInclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "minInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMinInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "minInclusive" element
     */
    public void removeMinInclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "maxExclusive" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMaxExclusiveList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMaxExclusiveArray,
                this::setMaxExclusiveArray,
                this::insertNewMaxExclusive,
                this::removeMaxExclusive,
                this::sizeOfMaxExclusiveArray
            );
        }
    }

    /**
     * Gets array of all "maxExclusive" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMaxExclusiveArray() {
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.apache.xmlbeans.impl.xb.xsdschema.Facet[0]);
    }

    /**
     * Gets ith "maxExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxExclusiveArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "maxExclusive" element
     */
    public int sizeOfMaxExclusiveArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "maxExclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxExclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] maxExclusiveArray) {
        check_orphaned();
        arraySetterHelper(maxExclusiveArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "maxExclusive" element
     */
    public void setMaxExclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet maxExclusive) {
        generatedSetterHelperImpl(maxExclusive, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMaxExclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "maxExclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "maxExclusive" element
     */
    public void removeMaxExclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "maxInclusive" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Facet> getMaxInclusiveList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMaxInclusiveArray,
                this::setMaxInclusiveArray,
                this::insertNewMaxInclusive,
                this::removeMaxInclusive,
                this::sizeOfMaxInclusiveArray
            );
        }
    }

    /**
     * Gets array of all "maxInclusive" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet[] getMaxInclusiveArray() {
        return getXmlObjectArray(PROPERTY_QNAME[8], new org.apache.xmlbeans.impl.xb.xsdschema.Facet[0]);
    }

    /**
     * Gets ith "maxInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet getMaxInclusiveArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "maxInclusive" element
     */
    public int sizeOfMaxInclusiveArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "maxInclusive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxInclusiveArray(org.apache.xmlbeans.impl.xb.xsdschema.Facet[] maxInclusiveArray) {
        check_orphaned();
        arraySetterHelper(maxInclusiveArray, PROPERTY_QNAME[8]);
    }

    /**
     * Sets ith "maxInclusive" element
     */
    public void setMaxInclusiveArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Facet maxInclusive) {
        generatedSetterHelperImpl(maxInclusive, PROPERTY_QNAME[8], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet insertNewMaxInclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "maxInclusive" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Facet addNewMaxInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Facet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Facet)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "maxInclusive" element
     */
    public void removeMaxInclusive(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "totalDigits" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits> getTotalDigitsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTotalDigitsArray,
                this::setTotalDigitsArray,
                this::insertNewTotalDigits,
                this::removeTotalDigits,
                this::sizeOfTotalDigitsArray
            );
        }
    }

    /**
     * Gets array of all "totalDigits" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits[] getTotalDigitsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits[0]);
    }

    /**
     * Gets ith "totalDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits getTotalDigitsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "totalDigits" element
     */
    public int sizeOfTotalDigitsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "totalDigits" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTotalDigitsArray(org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits[] totalDigitsArray) {
        check_orphaned();
        arraySetterHelper(totalDigitsArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "totalDigits" element
     */
    public void setTotalDigitsArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits totalDigits) {
        generatedSetterHelperImpl(totalDigits, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "totalDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits insertNewTotalDigits(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "totalDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits addNewTotalDigits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "totalDigits" element
     */
    public void removeTotalDigits(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "fractionDigits" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getFractionDigitsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFractionDigitsArray,
                this::setFractionDigitsArray,
                this::insertNewFractionDigits,
                this::removeFractionDigits,
                this::sizeOfFractionDigitsArray
            );
        }
    }

    /**
     * Gets array of all "fractionDigits" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getFractionDigitsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[0]);
    }

    /**
     * Gets ith "fractionDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getFractionDigitsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "fractionDigits" element
     */
    public int sizeOfFractionDigitsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "fractionDigits" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFractionDigitsArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] fractionDigitsArray) {
        check_orphaned();
        arraySetterHelper(fractionDigitsArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "fractionDigits" element
     */
    public void setFractionDigitsArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet fractionDigits) {
        generatedSetterHelperImpl(fractionDigits, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fractionDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewFractionDigits(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "fractionDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewFractionDigits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "fractionDigits" element
     */
    public void removeFractionDigits(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "length" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getLengthList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLengthArray,
                this::setLengthArray,
                this::insertNewLength,
                this::removeLength,
                this::sizeOfLengthArray
            );
        }
    }

    /**
     * Gets array of all "length" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getLengthArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[0]);
    }

    /**
     * Gets ith "length" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getLengthArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "length" element
     */
    public int sizeOfLengthArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "length" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] lengthArray) {
        check_orphaned();
        arraySetterHelper(lengthArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "length" element
     */
    public void setLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet length) {
        generatedSetterHelperImpl(length, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "length" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "length" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "length" element
     */
    public void removeLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "minLength" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getMinLengthList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMinLengthArray,
                this::setMinLengthArray,
                this::insertNewMinLength,
                this::removeMinLength,
                this::sizeOfMinLengthArray
            );
        }
    }

    /**
     * Gets array of all "minLength" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getMinLengthArray() {
        return getXmlObjectArray(PROPERTY_QNAME[12], new org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[0]);
    }

    /**
     * Gets ith "minLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMinLengthArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "minLength" element
     */
    public int sizeOfMinLengthArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "minLength" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMinLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] minLengthArray) {
        check_orphaned();
        arraySetterHelper(minLengthArray, PROPERTY_QNAME[12]);
    }

    /**
     * Sets ith "minLength" element
     */
    public void setMinLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet minLength) {
        generatedSetterHelperImpl(minLength, PROPERTY_QNAME[12], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "minLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewMinLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "minLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "minLength" element
     */
    public void removeMinLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "maxLength" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NumFacet> getMaxLengthList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMaxLengthArray,
                this::setMaxLengthArray,
                this::insertNewMaxLength,
                this::removeMaxLength,
                this::sizeOfMaxLengthArray
            );
        }
    }

    /**
     * Gets array of all "maxLength" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] getMaxLengthArray() {
        return getXmlObjectArray(PROPERTY_QNAME[13], new org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[0]);
    }

    /**
     * Gets ith "maxLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMaxLengthArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "maxLength" element
     */
    public int sizeOfMaxLengthArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "maxLength" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaxLengthArray(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet[] maxLengthArray) {
        check_orphaned();
        arraySetterHelper(maxLengthArray, PROPERTY_QNAME[13]);
    }

    /**
     * Sets ith "maxLength" element
     */
    public void setMaxLengthArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NumFacet maxLength) {
        generatedSetterHelperImpl(maxLength, PROPERTY_QNAME[13], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "maxLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet insertNewMaxLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "maxLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "maxLength" element
     */
    public void removeMaxLength(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "enumeration" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet> getEnumerationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEnumerationArray,
                this::setEnumerationArray,
                this::insertNewEnumeration,
                this::removeEnumeration,
                this::sizeOfEnumerationArray
            );
        }
    }

    /**
     * Gets array of all "enumeration" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet[] getEnumerationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet[0]);
    }

    /**
     * Gets ith "enumeration" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet getEnumerationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "enumeration" element
     */
    public int sizeOfEnumerationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "enumeration" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEnumerationArray(org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet[] enumerationArray) {
        check_orphaned();
        arraySetterHelper(enumerationArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "enumeration" element
     */
    public void setEnumerationArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet enumeration) {
        generatedSetterHelperImpl(enumeration, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "enumeration" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet insertNewEnumeration(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "enumeration" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet addNewEnumeration() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NoFixedFacet)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "enumeration" element
     */
    public void removeEnumeration(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "whiteSpace" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace> getWhiteSpaceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getWhiteSpaceArray,
                this::setWhiteSpaceArray,
                this::insertNewWhiteSpace,
                this::removeWhiteSpace,
                this::sizeOfWhiteSpaceArray
            );
        }
    }

    /**
     * Gets array of all "whiteSpace" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace[] getWhiteSpaceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace[0]);
    }

    /**
     * Gets ith "whiteSpace" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace getWhiteSpaceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "whiteSpace" element
     */
    public int sizeOfWhiteSpaceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "whiteSpace" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWhiteSpaceArray(org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace[] whiteSpaceArray) {
        check_orphaned();
        arraySetterHelper(whiteSpaceArray, PROPERTY_QNAME[15]);
    }

    /**
     * Sets ith "whiteSpace" element
     */
    public void setWhiteSpaceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace whiteSpace) {
        generatedSetterHelperImpl(whiteSpace, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "whiteSpace" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace insertNewWhiteSpace(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "whiteSpace" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "whiteSpace" element
     */
    public void removeWhiteSpace(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "pattern" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern> getPatternList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPatternArray,
                this::setPatternArray,
                this::insertNewPattern,
                this::removePattern,
                this::sizeOfPatternArray
            );
        }
    }

    /**
     * Gets array of all "pattern" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern[] getPatternArray() {
        return getXmlObjectArray(PROPERTY_QNAME[16], new org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern[0]);
    }

    /**
     * Gets ith "pattern" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern getPatternArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "pattern" element
     */
    public int sizeOfPatternArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets array of all "pattern" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPatternArray(org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern[] patternArray) {
        check_orphaned();
        arraySetterHelper(patternArray, PROPERTY_QNAME[16]);
    }

    /**
     * Sets ith "pattern" element
     */
    public void setPatternArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern pattern) {
        generatedSetterHelperImpl(pattern, PROPERTY_QNAME[16], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pattern" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern insertNewPattern(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "pattern" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern addNewPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "pattern" element
     */
    public void removePattern(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "attribute" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Attribute> getAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeArray,
                this::setAttributeArray,
                this::insertNewAttribute,
                this::removeAttribute,
                this::sizeOfAttributeArray
            );
        }
    }

    /**
     * Gets array of all "attribute" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] getAttributeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[17], new org.apache.xmlbeans.impl.xb.xsdschema.Attribute[0]);
    }

    /**
     * Gets ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "attribute" element
     */
    public int sizeOfAttributeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray) {
        check_orphaned();
        arraySetterHelper(attributeArray, PROPERTY_QNAME[17]);
    }

    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[17], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "attributeGroup" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef> getAttributeGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAttributeGroupArray,
                this::setAttributeGroupArray,
                this::insertNewAttributeGroup,
                this::removeAttributeGroup,
                this::sizeOfAttributeGroupArray
            );
        }
    }

    /**
     * Gets array of all "attributeGroup" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] getAttributeGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[18], new org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[0]);
    }

    /**
     * Gets ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "attributeGroup" element
     */
    public int sizeOfAttributeGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray) {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[18]);
    }

    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup) {
        generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[18], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef addNewAttributeGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "attributeGroup" element
     */
    public void removeAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets the "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "anyAttribute" element
     */
    public boolean isSetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]) != 0;
        }
    }

    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute) {
        generatedSetterHelperImpl(anyAttribute, PROPERTY_QNAME[19], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Unsets the "anyAttribute" element
     */
    public void unsetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], 0);
        }
    }

    /**
     * Gets the "base" attribute
     */
    public javax.xml.namespace.QName getBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "base" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Sets the "base" attribute
     */
    public void setBase(javax.xml.namespace.QName base) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.setQNameValue(base);
        }
    }

    /**
     * Sets (as xml) the "base" attribute
     */
    public void xsetBase(org.apache.xmlbeans.XmlQName base) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.set(base);
        }
    }
}
