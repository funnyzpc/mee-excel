/*
 * XML Type:  keybase
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Keybase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML keybase(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class KeybaseImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Keybase {
    private static final long serialVersionUID = 1L;

    public KeybaseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "selector"),
        new QName("http://www.w3.org/2001/XMLSchema", "field"),
        new QName("", "name"),
    };


    /**
     * Gets the "selector" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector getSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "selector" element
     */
    public void setSelector(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector selector) {
        generatedSetterHelperImpl(selector, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "selector" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector addNewSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "field" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field> getFieldList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFieldArray,
                this::setFieldArray,
                this::insertNewField,
                this::removeField,
                this::sizeOfFieldArray
            );
        }
    }

    /**
     * Gets array of all "field" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field[] getFieldArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field[0]);
    }

    /**
     * Gets ith "field" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field getFieldArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "field" element
     */
    public int sizeOfFieldArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFieldArray(org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field[] fieldArray) {
        check_orphaned();
        arraySetterHelper(fieldArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "field" element
     */
    public void setFieldArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field field) {
        generatedSetterHelperImpl(field, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field insertNewField(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field addNewField() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "field" element
     */
    public void removeField(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(name);
        }
    }
}
