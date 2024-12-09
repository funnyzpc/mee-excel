/*
 * XML Type:  extensionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML extensionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ExtensionTypeImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType {
    private static final long serialVersionUID = 1L;

    public ExtensionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "group"),
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
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
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.impl.xb.xsdschema.Attribute[0]);
    }

    /**
     * Gets ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().find_element_user(PROPERTY_QNAME[4], i);
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
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray) {
        check_orphaned();
        arraySetterHelper(attributeArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().insert_element_user(PROPERTY_QNAME[4], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[0]);
    }

    /**
     * Gets ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().find_element_user(PROPERTY_QNAME[5], i);
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
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray) {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup) {
        generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().insert_element_user(PROPERTY_QNAME[5], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "attributeGroup" element
     */
    public void removeAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets the "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "anyAttribute" element
     */
    public boolean isSetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute) {
        generatedSetterHelperImpl(anyAttribute, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "anyAttribute" element
     */
    public void unsetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "base" attribute
     */
    public javax.xml.namespace.QName getBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(base);
        }
    }
}
