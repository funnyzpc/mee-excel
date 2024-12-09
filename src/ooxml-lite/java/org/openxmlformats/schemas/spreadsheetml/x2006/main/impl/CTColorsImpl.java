/*
 * XML Type:  CT_Colors
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Colors(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTColorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors {
    private static final long serialVersionUID = 1L;

    public CTColorsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "indexedColors"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mruColors"),
    };


    /**
     * Gets the "indexedColors" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors getIndexedColors() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndexedColors)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "indexedColors" element
     */
    @Override
    public boolean isSetIndexedColors() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }



}
