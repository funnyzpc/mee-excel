/*
 * An XML document type.
 * Localname: totalDigits
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one totalDigits(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class TotalDigitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument {
    private static final long serialVersionUID = 1L;

    public TotalDigitsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "totalDigits"),
    };


    /**
     * Gets the "totalDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits getTotalDigits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "totalDigits" element
     */
    public void setTotalDigits(org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits totalDigits) {
        generatedSetterHelperImpl(totalDigits, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "totalDigits" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits addNewTotalDigits() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML totalDigits(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class TotalDigitsImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.NumFacetImpl implements org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits {
        private static final long serialVersionUID = 1L;

        public TotalDigitsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
    }
}
