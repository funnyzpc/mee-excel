/*
 * XML Type:  CT_BookViews
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_BookViews(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTBookViewsImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews {
    private static final long serialVersionUID = 1L;

    public CTBookViewsImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookView"),
    };

    /**
     * Gets array of all "workbookView" elements
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[] getWorkbookViewArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView[0]);
    }

    /**
     * Gets ith "workbookView" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView getWorkbookViewArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "workbookView" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView addNewWorkbookView() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }


}
