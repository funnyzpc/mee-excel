/*
 * An XML document type.
 * Localname: appinfo
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one appinfo(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class AppinfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument {
    private static final long serialVersionUID = 1L;

    public AppinfoDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "appinfo"),
    };


    /**
     * Gets the "appinfo" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo getAppinfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "appinfo" element
     */
    public void setAppinfo(org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo appinfo) {
        generatedSetterHelperImpl(appinfo, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "appinfo" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo addNewAppinfo() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML appinfo(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class AppinfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument.Appinfo {
        private static final long serialVersionUID = 1L;

        public AppinfoImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "source"),
        };


        /**
         * Gets the "source" attribute
         */
        public java.lang.String getSource() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "source" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSource() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * True if has "source" attribute
         */
        public boolean isSetSource() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "source" attribute
         */
        public void setSource(java.lang.String source) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setStringValue(source);
            }
        }

        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.apache.xmlbeans.XmlAnyURI source) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(source);
            }
        }

        /**
         * Unsets the "source" attribute
         */
        public void unsetSource() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
    }
}
