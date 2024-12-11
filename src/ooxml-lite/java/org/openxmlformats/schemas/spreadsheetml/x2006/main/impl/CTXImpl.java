/*
 * XML Type:  CT_X
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_X(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTXImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX {
    private static final long serialVersionUID = 1L;

    public CTXImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "v"),
    };


    /**
     * Gets the "v" attribute
     */
    @Override
    public int getV() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "v" attribute
     */
    @Override
    public XmlInt xgetV() {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlInt)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "v" attribute
     */
    @Override
    public boolean isSetV() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "v" attribute
     */
    @Override
    public void setV(int v) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(v);
        }
    }

    /**
     * Sets (as xml) the "v" attribute
     */
    @Override
    public void xsetV(XmlInt v) {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(v);
        }
    }

    /**
     * Unsets the "v" attribute
     */
    @Override
    public void unsetV() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
