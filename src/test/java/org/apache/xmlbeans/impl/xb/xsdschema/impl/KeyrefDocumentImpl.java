/*
 * An XML document type.
 * Localname: keyref
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one keyref(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class KeyrefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument {
    private static final long serialVersionUID = 1L;

    public KeyrefDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "keyref"),
    };


    /**
     * Gets the "keyref" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref getKeyref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "keyref" element
     */
    public void setKeyref(org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref keyref) {
        generatedSetterHelperImpl(keyref, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "keyref" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref addNewKeyref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML keyref(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class KeyrefImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.KeybaseImpl implements org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref {
        private static final long serialVersionUID = 1L;

        public KeyrefImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "refer"),
        };


        /**
         * Gets the "refer" attribute
         */
        public javax.xml.namespace.QName getRefer() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return (target == null) ? null : target.getQNameValue();
            }
        }

        /**
         * Gets (as xml) the "refer" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetRefer() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Sets the "refer" attribute
         */
        public void setRefer(javax.xml.namespace.QName refer) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setQNameValue(refer);
            }
        }

        /**
         * Sets (as xml) the "refer" attribute
         */
        public void xsetRefer(org.apache.xmlbeans.XmlQName refer) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(refer);
            }
        }
    }
}
