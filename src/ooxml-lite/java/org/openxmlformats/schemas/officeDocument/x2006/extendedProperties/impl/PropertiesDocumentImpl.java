/*
 * An XML document type.
 * Localname: Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/extended-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.PropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import poi.org.apache.xmlbeans.impl.values.XmlObjectBase;

import javax.xml.namespace.QName;

/**
 * A document containing one Properties(@http://schemas.openxmlformats.org/officeDocument/2006/extended-properties) element.
 *
 * This is a complex type.
 */
public class PropertiesDocumentImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.PropertiesDocument {
    private static final long serialVersionUID = 1L;

    public PropertiesDocumentImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/extended-properties", "Properties"),
    };


    /**
     * Gets the "Properties" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties getProperties() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Properties" element
     */
    @Override
    public void setProperties(org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties properties) {
        generatedSetterHelperImpl(properties, PROPERTY_QNAME[0], 0, XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Properties" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties addNewProperties() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
