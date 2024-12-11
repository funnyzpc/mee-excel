/*
 * XML Type:  CT_SheetDimension
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_SheetDimension(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetDimensionImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension {
    private static final long serialVersionUID = 1L;

    public CTSheetDimensionImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "ref"),
    };


    /**
     * Gets the "ref" attribute
     */
    @Override
    public String getRef() {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ref" attribute
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    @Override
    public void setRef(String ref) {
        synchronized (monitor()) {
            check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(ref);
        }
    }

    /**
     * Sets (as xml) the "ref" attribute
     */
    @Override
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(ref);
        }
    }
}
