/*
 * An XML document type.
 * Localname: externalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * A document containing one externalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class ExternalLinkDocumentImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument {
    private static final long serialVersionUID = 1L;

    public ExternalLinkDocumentImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalLink"),
    };


    /**
     * Gets the "externalLink" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink getExternalLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "externalLink" element
     */
    @Override
    public void setExternalLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink externalLink) {
        generatedSetterHelperImpl(externalLink, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "externalLink" element
     */
    @Override
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink addNewExternalLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
