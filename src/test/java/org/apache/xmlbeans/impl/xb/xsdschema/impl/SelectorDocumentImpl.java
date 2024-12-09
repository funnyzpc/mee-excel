/*
 * An XML document type.
 * Localname: selector
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one selector(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class SelectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument {
    private static final long serialVersionUID = 1L;

    public SelectorDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "selector"),
    };


    /**
     * Gets the "selector" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector getSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "selector" element
     */
    public void setSelector(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector selector) {
        generatedSetterHelperImpl(selector, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "selector" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector addNewSelector() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML selector(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class SelectorImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector {
        private static final long serialVersionUID = 1L;

        public SelectorImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "xpath"),
        };


        /**
         * Gets the "xpath" attribute
         */
        public java.lang.String getXpath() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "xpath" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath xgetXpath() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Sets the "xpath" attribute
         */
        public void setXpath(java.lang.String xpath) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setStringValue(xpath);
            }
        }

        /**
         * Sets (as xml) the "xpath" attribute
         */
        public void xsetXpath(org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath xpath) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(xpath);
            }
        }
        /**
         * An XML xpath(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument$Selector$Xpath.
         */
        public static class XpathImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument.Selector.Xpath {
            private static final long serialVersionUID = 1L;

            public XpathImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected XpathImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
