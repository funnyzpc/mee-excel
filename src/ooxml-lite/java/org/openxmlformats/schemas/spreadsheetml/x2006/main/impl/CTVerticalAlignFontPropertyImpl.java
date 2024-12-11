/*
 * XML Type:  CT_VerticalAlignFontProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_VerticalAlignFontProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTVerticalAlignFontPropertyImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty {
    private static final long serialVersionUID = 1L;

    public CTVerticalAlignFontPropertyImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "val"),
    };


    /**
     * Gets the "val" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.Enum getVal() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "val" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun xgetVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "val" attribute
     */
    @Override
    public void setVal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.Enum val) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(val);
        }
    }

    /**
     * Sets (as xml) the "val" attribute
     */
    @Override
    public void xsetVal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun val) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(val);
        }
    }
}
