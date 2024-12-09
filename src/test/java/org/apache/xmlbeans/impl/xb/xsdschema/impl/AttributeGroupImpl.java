/*
 * XML Type:  attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroup
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML attributeGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class AttributeGroupImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroup {
    private static final long serialVersionUID = 1L;

    public AttributeGroupImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "attribute"),
        new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
        new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute"),
        new QName("", "name"),
        new QName("", "ref"),
    };


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
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.Attribute[0]);
    }

    /**
     * Gets ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray) {
        check_orphaned();
        arraySetterHelper(attributeArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[0]);
    }

    /**
     * Gets ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray) {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup) {
        generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().insert_element_user(PROPERTY_QNAME[1], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "attributeGroup" element
     */
    public void removeAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "anyAttribute" element
     */
    public boolean isSetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute) {
        generatedSetterHelperImpl(anyAttribute, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "anyAttribute" element
     */
    public void unsetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(name);
        }
    }

    /**
     * Unsets the "name" attribute
     */
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setQNameValue(ref);
        }
    }

    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.apache.xmlbeans.XmlQName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(ref);
        }
    }

    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}
