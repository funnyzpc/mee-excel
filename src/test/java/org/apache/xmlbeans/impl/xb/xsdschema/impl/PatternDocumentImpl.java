/*
 * An XML document type.
 * Localname: pattern
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one pattern(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class PatternDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument {
    private static final long serialVersionUID = 1L;

    public PatternDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "pattern"),
    };


    /**
     * Gets the "pattern" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern getPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "pattern" element
     */
    public void setPattern(org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern pattern) {
        generatedSetterHelperImpl(pattern, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "pattern" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern addNewPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML pattern(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class PatternImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.NoFixedFacetImpl implements org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument.Pattern {
        private static final long serialVersionUID = 1L;

        public PatternImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
    }
}
