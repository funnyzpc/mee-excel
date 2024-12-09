/*
 * An XML document type.
 * Localname: config
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config) element.
 *
 * This is a complex type.
 */
public interface ConfigDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "config4185doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "config" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config getConfig();

    /**
     * Sets the "config" element
     */
    void setConfig(org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config config);

    /**
     * Appends and returns a new empty "config" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config addNewConfig();

    /**
     * An XML config(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface Config extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "configf467elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "namespace" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig> getNamespaceList();

        /**
         * Gets array of all "namespace" elements
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig[] getNamespaceArray();

        /**
         * Gets ith "namespace" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig getNamespaceArray(int i);

        /**
         * Returns number of "namespace" element
         */
        int sizeOfNamespaceArray();

        /**
         * Sets array of all "namespace" element
         */
        void setNamespaceArray(org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig[] namespaceArray);

        /**
         * Sets ith "namespace" element
         */
        void setNamespaceArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig namespace);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "namespace" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig insertNewNamespace(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "namespace" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Nsconfig addNewNamespace();

        /**
         * Removes the ith "namespace" element
         */
        void removeNamespace(int i);

        /**
         * Gets a List of "qname" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig> getQnameList();

        /**
         * Gets array of all "qname" elements
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig[] getQnameArray();

        /**
         * Gets ith "qname" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig getQnameArray(int i);

        /**
         * Returns number of "qname" element
         */
        int sizeOfQnameArray();

        /**
         * Sets array of all "qname" element
         */
        void setQnameArray(org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig[] qnameArray);

        /**
         * Sets ith "qname" element
         */
        void setQnameArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig qname);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "qname" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig insertNewQname(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "qname" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Qnameconfig addNewQname();

        /**
         * Removes the ith "qname" element
         */
        void removeQname(int i);

        /**
         * Gets a List of "extension" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig> getExtensionList();

        /**
         * Gets array of all "extension" elements
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig[] getExtensionArray();

        /**
         * Gets ith "extension" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig getExtensionArray(int i);

        /**
         * Returns number of "extension" element
         */
        int sizeOfExtensionArray();

        /**
         * Sets array of all "extension" element
         */
        void setExtensionArray(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig[] extensionArray);

        /**
         * Sets ith "extension" element
         */
        void setExtensionArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig extension);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "extension" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig insertNewExtension(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "extension" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig addNewExtension();

        /**
         * Removes the ith "extension" element
         */
        void removeExtension(int i);

        /**
         * Gets a List of "usertype" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig> getUsertypeList();

        /**
         * Gets array of all "usertype" elements
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig[] getUsertypeArray();

        /**
         * Gets ith "usertype" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig getUsertypeArray(int i);

        /**
         * Returns number of "usertype" element
         */
        int sizeOfUsertypeArray();

        /**
         * Sets array of all "usertype" element
         */
        void setUsertypeArray(org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig[] usertypeArray);

        /**
         * Sets ith "usertype" element
         */
        void setUsertypeArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig usertype);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "usertype" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig insertNewUsertype(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "usertype" element
         */
        org.apache.xmlbeans.impl.xb.xmlconfig.Usertypeconfig addNewUsertype();

        /**
         * Removes the ith "usertype" element
         */
        void removeUsertype(int i);
    }
}
