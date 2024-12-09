/*
 * An XML document type.
 * Localname: config
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config) element.
 *
 * This is a complex type.
 */
public class ConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument {
    private static final long serialVersionUID = 1L;

    public ConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "config"),
    };


    /**
     * Gets the "config" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config getConfig() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "config" element
     */
    public void setConfig(org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config config) {
        generatedSetterHelperImpl(config, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "config" element
     */
    public org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config addNewConfig() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config target = null;
            target = (org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public static class ConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config {
        private static final long serialVersionUID = 1L;

        public ConfigImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "namespace"),
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "qname"),
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "extension"),
            new QName("http://xml.apache.org/xmlbeans/2004/02/xbean/config", "usertype"),
        };


        /**
         * Gets a List of "namespace" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig> getNamespaceList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getNamespaceArray,
                    this::setNamespaceArray,
                    this::insertNewNamespace,
                    this::removeNamespace,
                    this::sizeOfNamespaceArray
                );
            }
        }

        /**
         * Gets array of all "namespace" elements
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig[] getNamespaceArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig[0]);
        }

        /**
         * Gets ith "namespace" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig getNamespaceArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "namespace" element
         */
        public int sizeOfNamespaceArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "namespace" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNamespaceArray(org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig[] namespaceArray) {
            check_orphaned();
            arraySetterHelper(namespaceArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "namespace" element
         */
        public void setNamespaceArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig namespace) {
            generatedSetterHelperImpl(namespace, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "namespace" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig insertNewNamespace(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "namespace" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig addNewNamespace() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "namespace" element
         */
        public void removeNamespace(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets a List of "qname" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig> getQnameList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getQnameArray,
                    this::setQnameArray,
                    this::insertNewQname,
                    this::removeQname,
                    this::sizeOfQnameArray
                );
            }
        }

        /**
         * Gets array of all "qname" elements
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig[] getQnameArray() {
            return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig[0]);
        }

        /**
         * Gets ith "qname" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig getQnameArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig)get_store().find_element_user(PROPERTY_QNAME[1], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "qname" element
         */
        public int sizeOfQnameArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Sets array of all "qname" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setQnameArray(org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig[] qnameArray) {
            check_orphaned();
            arraySetterHelper(qnameArray, PROPERTY_QNAME[1]);
        }

        /**
         * Sets ith "qname" element
         */
        public void setQnameArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig qname) {
            generatedSetterHelperImpl(qname, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "qname" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig insertNewQname(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig)get_store().insert_element_user(PROPERTY_QNAME[1], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "qname" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig addNewQname() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Removes the ith "qname" element
         */
        public void removeQname(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], i);
            }
        }

        /**
         * Gets a List of "extension" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig> getExtensionList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getExtensionArray,
                    this::setExtensionArray,
                    this::insertNewExtension,
                    this::removeExtension,
                    this::sizeOfExtensionArray
                );
            }
        }

        /**
         * Gets array of all "extension" elements
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig[] getExtensionArray() {
            return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig[0]);
        }

        /**
         * Gets ith "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig getExtensionArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig)get_store().find_element_user(PROPERTY_QNAME[2], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "extension" element
         */
        public int sizeOfExtensionArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[2]);
            }
        }

        /**
         * Sets array of all "extension" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtensionArray(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig[] extensionArray) {
            check_orphaned();
            arraySetterHelper(extensionArray, PROPERTY_QNAME[2]);
        }

        /**
         * Sets ith "extension" element
         */
        public void setExtensionArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig extension) {
            generatedSetterHelperImpl(extension, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig insertNewExtension(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig)get_store().insert_element_user(PROPERTY_QNAME[2], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig addNewExtension() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig)get_store().add_element_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * Removes the ith "extension" element
         */
        public void removeExtension(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[2], i);
            }
        }

        /**
         * Gets a List of "usertype" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig> getUsertypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getUsertypeArray,
                    this::setUsertypeArray,
                    this::insertNewUsertype,
                    this::removeUsertype,
                    this::sizeOfUsertypeArray
                );
            }
        }

        /**
         * Gets array of all "usertype" elements
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig[] getUsertypeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig[0]);
        }

        /**
         * Gets ith "usertype" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig getUsertypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig)get_store().find_element_user(PROPERTY_QNAME[3], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "usertype" element
         */
        public int sizeOfUsertypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[3]);
            }
        }

        /**
         * Sets array of all "usertype" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUsertypeArray(org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig[] usertypeArray) {
            check_orphaned();
            arraySetterHelper(usertypeArray, PROPERTY_QNAME[3]);
        }

        /**
         * Sets ith "usertype" element
         */
        public void setUsertypeArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig usertype) {
            generatedSetterHelperImpl(usertype, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "usertype" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig insertNewUsertype(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig)get_store().insert_element_user(PROPERTY_QNAME[3], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "usertype" element
         */
        public org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig addNewUsertype() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig)get_store().add_element_user(PROPERTY_QNAME[3]);
                return target;
            }
        }

        /**
         * Removes the ith "usertype" element
         */
        public void removeUsertype(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[3], i);
            }
        }
    }
}
