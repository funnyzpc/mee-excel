/*
 * XML Type:  facet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Facet
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML facet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class FacetImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Facet {
    private static final long serialVersionUID = 1L;

    public FacetImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "value"),
        new QName("", "fixed"),
    };


    /**
     * Gets the "value" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "value" attribute
     */
    public void setValue(org.apache.xmlbeans.XmlAnySimpleType value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(value);
        }
    }

    /**
     * Appends and returns a new empty "value" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "fixed" attribute
     */
    public boolean getFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "fixed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
            }
            return target;
        }
    }

    /**
     * True if has "fixed" attribute
     */
    public boolean isSetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "fixed" attribute
     */
    public void setFixed(boolean fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(fixed);
        }
    }

    /**
     * Sets (as xml) the "fixed" attribute
     */
    public void xsetFixed(org.apache.xmlbeans.XmlBoolean fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
