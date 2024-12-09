/*
 * An XML document type.
 * Localname: maxLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MaxLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one maxLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MaxLengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.MaxLengthDocument {
    private static final long serialVersionUID = 1L;

    public MaxLengthDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "maxLength"),
    };


    /**
     * Gets the "maxLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet maxLength) {
        generatedSetterHelperImpl(maxLength, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "maxLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMaxLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
