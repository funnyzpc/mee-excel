/*
 * XML Type:  attribute
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Attribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML attribute(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class AttributeImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Attribute {
    private static final long serialVersionUID = 1L;

    public AttributeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
        new QName("", "name"),
        new QName("", "ref"),
        new QName("", "type"),
        new QName("", "use"),
        new QName("", "default"),
        new QName("", "fixed"),
        new QName("", "form"),
    };


    /**
     * Gets the "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "simpleType" element
     */
    public boolean isSetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType) {
        generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "simpleType" element
     */
    public void unsetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setQNameValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "use" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use.Enum getUse() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "use" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use xgetUse() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use)get_default_attribute_value(PROPERTY_QNAME[4]);
            }
            return target;
        }
    }

    /**
     * True if has "use" attribute
     */
    public boolean isSetUse() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "use" attribute
     */
    public void setUse(org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use.Enum use) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(use);
        }
    }

    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use use) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(use);
        }
    }

    /**
     * Unsets the "use" attribute
     */
    public void unsetUse() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(xdefault);
        }
    }

    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(xdefault);
        }
    }

    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "fixed" attribute
     */
    public java.lang.String getFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fixed" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "fixed" attribute
     */
    public boolean isSetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "fixed" attribute
     */
    public void setFixed(java.lang.String fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(fixed);
        }
    }

    /**
     * Sets (as xml) the "fixed" attribute
     */
    public void xsetFixed(org.apache.xmlbeans.XmlString fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(fixed);
        }
    }

    /**
     * Unsets the "fixed" attribute
     */
    public void unsetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "form" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getForm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "form" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetForm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "form" attribute
     */
    public boolean isSetForm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "form" attribute
     */
    public void setForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum form) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setEnumValue(form);
        }
    }

    /**
     * Sets (as xml) the "form" attribute
     */
    public void xsetForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice form) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(form);
        }
    }

    /**
     * Unsets the "form" attribute
     */
    public void unsetForm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }
    /**
     * An XML use(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.Attribute$Use.
     */
    public static class UseImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use {
        private static final long serialVersionUID = 1L;

        public UseImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected UseImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
