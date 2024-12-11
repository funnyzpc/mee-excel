/*
 * XML Type:  CT_FontSize
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_FontSize(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontSizeImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize {
    private static final long serialVersionUID = 1L;

    public CTFontSizeImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public double getVal() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? 0.0 : target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public XmlDouble xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(double val) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setDoubleValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(XmlDouble val) {
        synchronized (monitor()) {
            check_orphaned();
            XmlDouble target = null;
            target = (XmlDouble)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlDouble)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }
}
