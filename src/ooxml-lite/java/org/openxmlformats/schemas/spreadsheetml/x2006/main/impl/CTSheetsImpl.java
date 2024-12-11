/*
 * XML Type:  CT_Sheets
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Sheets(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetsImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets {
    private static final long serialVersionUID = 1L;

    public CTSheetsImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheet"),
    };


    /**
     * Gets array of all "sheet" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[] getSheetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet[0]);
    }

    /**
     * Gets ith "sheet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet getSheetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sheet" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet addNewSheet() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "sheet" element
     */
    @Override
    public void removeSheet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
