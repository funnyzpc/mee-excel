/*
 * An XML document type.
 * Localname: whiteSpace
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one whiteSpace(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class WhiteSpaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument {
    private static final long serialVersionUID = 1L;

    public WhiteSpaceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "whiteSpace"),
    };


    /**
     * Gets the "whiteSpace" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace getWhiteSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "whiteSpace" element
     */
    public void setWhiteSpace(org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace whiteSpace) {
        generatedSetterHelperImpl(whiteSpace, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "whiteSpace" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML whiteSpace(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class WhiteSpaceImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.FacetImpl implements org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace {
        private static final long serialVersionUID = 1L;

        public WhiteSpaceImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument$WhiteSpace$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace.Value {
            private static final long serialVersionUID = 1L;

            public ValueImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
