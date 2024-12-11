/*
 * XML Type:  CT_Properties
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import javax.xml.namespace.QName;

/**
 * An XML CT_Properties(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties).
 *
 * This is a complex type.
 */
public class CTPropertiesImpl extends XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties {
    private static final long serialVersionUID = 1L;

    public CTPropertiesImpl(SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/custom-properties", "property"),
    };


    /**
     * Returns number of "property" element
     */
    @Override
    public int sizeOfPropertyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Removes the ith "property" element
     */
    @Override
    public void removeProperty(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
