/*
 * An XML document type.
 * Localname: minLength
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.MinLengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one minLength(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class MinLengthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.MinLengthDocument {
    private static final long serialVersionUID = 1L;

    public MinLengthDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "minLength"),
    };


    /**
     * Gets the "minLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet getMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "minLength" element
     */
    public void setMinLength(org.apache.xmlbeans.impl.xb.xsdschema.NumFacet minLength) {
        generatedSetterHelperImpl(minLength, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "minLength" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NumFacet addNewMinLength() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NumFacet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NumFacet)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
