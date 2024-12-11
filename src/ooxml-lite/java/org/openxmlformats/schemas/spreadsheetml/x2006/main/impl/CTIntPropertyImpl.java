/*
 * XML Type:  CT_IntProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty
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
 * An XML CT_IntProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTIntPropertyImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty {
    private static final long serialVersionUID = 1L;

    public CTIntPropertyImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public int getVal() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public XmlInt xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(int val) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setIntValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(XmlInt val) {
        synchronized (monitor()) {
            check_orphaned();
            XmlInt target = null;
            target = (XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }
}
