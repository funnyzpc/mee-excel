/*
 * XML Type:  complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML complexType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ComplexTypeImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.ComplexType {
    private static final long serialVersionUID = 1L;

    public ComplexTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "simpleContent"),
        new QName("http://www.w3.org/2001/XMLSchema", "complexContent"),
        new QName("http://www.w3.org/2001/XMLSchema", "group"),
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
        new QName("http://www.w3.org/2001/XMLSchema", "attribute"),
        new QName("http://www.w3.org/2001/XMLSchema", "attributeGroup"),
        new QName("http://www.w3.org/2001/XMLSchema", "anyAttribute"),
        new QName("", "name"),
        new QName("", "mixed"),
        new QName("", "abstract"),
        new QName("", "final"),
        new QName("", "block"),
    };


    /**
     * Gets the "simpleContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent getSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "simpleContent" element
     */
    public boolean isSetSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "simpleContent" element
     */
    public void setSimpleContent(org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent simpleContent) {
        generatedSetterHelperImpl(simpleContent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent addNewSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "simpleContent" element
     */
    public void unsetSimpleContent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "complexContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent getComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "complexContent" element
     */
    public boolean isSetComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "complexContent" element
     */
    public void setComplexContent(org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent complexContent) {
        generatedSetterHelperImpl(complexContent, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "complexContent" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent addNewComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "complexContent" element
     */
    public void unsetComplexContent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "group" element
     */
    public boolean isSetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "group" element
     */
    public void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "group" element
     */
    public void unsetGroup() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All getAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "all" element
     */
    public boolean isSetAll() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "all" element
     */
    public void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "all" element
     */
    public void unsetAll() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "choice" element
     */
    public boolean isSetChoice() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "choice" element
     */
    public void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice) {
        generatedSetterHelperImpl(choice, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "choice" element
     */
    public void unsetChoice() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "sequence" element
     */
    public boolean isSetSequence() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "sequence" element
     */
    public void unsetSequence() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
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
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.apache.xmlbeans.impl.xb.xsdschema.Attribute[0]);
    }

    /**
     * Gets ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().find_element_user(PROPERTY_QNAME[6], i);
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
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "attribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray) {
        check_orphaned();
        arraySetterHelper(attributeArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().insert_element_user(PROPERTY_QNAME[6], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[7], new org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[0]);
    }

    /**
     * Gets ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "attributeGroup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray) {
        check_orphaned();
        arraySetterHelper(attributeGroupArray, PROPERTY_QNAME[7]);
    }

    /**
     * Sets ith "attributeGroup" element
     */
    public void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup) {
        generatedSetterHelperImpl(attributeGroup, PROPERTY_QNAME[7], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().insert_element_user(PROPERTY_QNAME[7], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "attributeGroup" element
     */
    public void removeAttributeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets the "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "anyAttribute" element
     */
    public boolean isSetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "anyAttribute" element
     */
    public void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute) {
        generatedSetterHelperImpl(anyAttribute, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Wildcard target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Wildcard)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "anyAttribute" element
     */
    public void unsetAnyAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[9]);
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
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "mixed" attribute
     */
    public boolean getMixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "mixed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[10]);
            }
            return target;
        }
    }

    /**
     * True if has "mixed" attribute
     */
    public boolean isSetMixed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "mixed" attribute
     */
    public void setMixed(boolean mixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(mixed);
        }
    }

    /**
     * Sets (as xml) the "mixed" attribute
     */
    public void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(mixed);
        }
    }

    /**
     * Unsets the "mixed" attribute
     */
    public void unsetMixed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "abstract" attribute
     */
    public boolean getAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "abstract" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[11]);
            }
            return target;
        }
    }

    /**
     * True if has "abstract" attribute
     */
    public boolean isSetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "abstract" attribute
     */
    public void setAbstract(boolean xabstract) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setBooleanValue(xabstract);
        }
    }

    /**
     * Sets (as xml) the "abstract" attribute
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(xabstract);
        }
    }

    /**
     * Unsets the "abstract" attribute
     */
    public void unsetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "final" attribute
     */
    public java.lang.Object getFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "final" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "final" attribute
     */
    public boolean isSetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "final" attribute
     */
    public void setFinal(java.lang.Object xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setObjectValue(xfinal);
        }
    }

    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(xfinal);
        }
    }

    /**
     * Unsets the "final" attribute
     */
    public void unsetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "block" attribute
     */
    public java.lang.Object getBlock() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "block" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "block" attribute
     */
    public boolean isSetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "block" attribute
     */
    public void setBlock(java.lang.Object block) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setObjectValue(block);
        }
    }

    /**
     * Sets (as xml) the "block" attribute
     */
    public void xsetBlock(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet block) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(block);
        }
    }

    /**
     * Unsets the "block" attribute
     */
    public void unsetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }
}
