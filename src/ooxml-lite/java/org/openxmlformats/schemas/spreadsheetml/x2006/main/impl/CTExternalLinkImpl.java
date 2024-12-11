/*
 * XML Type:  CT_ExternalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_ExternalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTExternalLinkImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink {
    private static final long serialVersionUID = 1L;

    public CTExternalLinkImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalBook"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ddeLink"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleLink"),
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst"),
    };


    /**
     * Gets the "externalBook" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook getExternalBook() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Appends and returns a new empty "externalBook" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook addNewExternalBook() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
