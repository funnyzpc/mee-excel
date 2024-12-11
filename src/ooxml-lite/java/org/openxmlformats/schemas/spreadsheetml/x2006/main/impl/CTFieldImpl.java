/*
 * XML Type:  CT_Field
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField
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
 * An XML CT_Field(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFieldImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField {
    private static final long serialVersionUID = 1L;

    public CTFieldImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "x"),
    };


    /**
     * Gets the "x" attribute
     */
    @Override
    public int getX() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "x" attribute
     */
    @Override
    public XmlInt xgetX() {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "x" attribute
     */
    @Override
    public void setX(int x) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(x);
        }
    }

    /**
     * Sets (as xml) the "x" attribute
     */
    @Override
    public void xsetX(XmlInt x) {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(x);
        }
    }
}
