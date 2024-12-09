/*
 * An XML document type.
 * Localname: notation
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one notation(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public class NotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument {
    private static final long serialVersionUID = 1L;

    public NotationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "notation"),
    };


    /**
     * Gets the "notation" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation getNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "notation" element
     */
    public void setNotation(org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation notation) {
        generatedSetterHelperImpl(notation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "notation" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation addNewNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML notation(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public static class NotationImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument.Notation {
        private static final long serialVersionUID = 1L;

        public NotationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "name"),
            new QName("", "public"),
            new QName("", "system"),
        };


        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetName() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setStringValue(name);
            }
        }

        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNCName name) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(name);
            }
        }

        /**
         * Gets the "public" attribute
         */
        public java.lang.String getPublic() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "public" attribute
         */
        public org.apache.xmlbeans.impl.xb.xsdschema.Public xgetPublic() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.Public target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Public)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * True if has "public" attribute
         */
        public boolean isSetPublic() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "public" attribute
         */
        public void setPublic(java.lang.String xpublic) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setStringValue(xpublic);
            }
        }

        /**
         * Sets (as xml) the "public" attribute
         */
        public void xsetPublic(org.apache.xmlbeans.impl.xb.xsdschema.Public xpublic) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdschema.Public target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdschema.Public)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.impl.xb.xsdschema.Public)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(xpublic);
            }
        }

        /**
         * Unsets the "public" attribute
         */
        public void unsetPublic() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Gets the "system" attribute
         */
        public java.lang.String getSystem() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "system" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetSystem() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * True if has "system" attribute
         */
        public boolean isSetSystem() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
            }
        }

        /**
         * Sets the "system" attribute
         */
        public void setSystem(java.lang.String system) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.setStringValue(system);
            }
        }

        /**
         * Sets (as xml) the "system" attribute
         */
        public void xsetSystem(org.apache.xmlbeans.XmlAnyURI system) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.set(system);
            }
        }

        /**
         * Unsets the "system" attribute
         */
        public void unsetSystem() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[2]);
            }
        }
    }
}
