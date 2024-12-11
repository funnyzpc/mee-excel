/*
 * XML Type:  CT_SheetCalcPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_SheetCalcPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetCalcPrImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr {
    private static final long serialVersionUID = 1L;

    public CTSheetCalcPrImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "fullCalcOnLoad"),
    };


    /**
     * Gets the "fullCalcOnLoad" attribute
     */
    @Override
    public boolean getFullCalcOnLoad() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "fullCalcOnLoad" attribute
     */
    @Override
    public XmlBoolean xgetFullCalcOnLoad() {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
            return target;
        }
    }

    /**
     * True if has "fullCalcOnLoad" attribute
     */
    @Override
    public boolean isSetFullCalcOnLoad() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "fullCalcOnLoad" attribute
     */
    @Override
    public void setFullCalcOnLoad(boolean fullCalcOnLoad) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(fullCalcOnLoad);
        }
    }

    /**
     * Sets (as xml) the "fullCalcOnLoad" attribute
     */
    @Override
    public void xsetFullCalcOnLoad(XmlBoolean fullCalcOnLoad) {
        synchronized (monitor()) {
            check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(fullCalcOnLoad);
        }
    }

    /**
     * Unsets the "fullCalcOnLoad" attribute
     */
    @Override
    public void unsetFullCalcOnLoad() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }
}
