/*
 * XML Type:  extensionconfig
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML extensionconfig(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a complex type.
 */
public interface Extensionconfig extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "extensionconfig2ac2type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "interface" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface> getInterfaceList();

    /**
     * Gets array of all "interface" elements
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface[] getInterfaceArray();

    /**
     * Gets ith "interface" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface getInterfaceArray(int i);

    /**
     * Returns number of "interface" element
     */
    int sizeOfInterfaceArray();

    /**
     * Sets array of all "interface" element
     */
    void setInterfaceArray(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface[] xinterfaceArray);

    /**
     * Sets ith "interface" element
     */
    void setInterfaceArray(int i, org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface xinterface);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface insertNewInterface(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface addNewInterface();

    /**
     * Removes the ith "interface" element
     */
    void removeInterface(int i);

    /**
     * Gets the "prePostSet" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet getPrePostSet();

    /**
     * True if has "prePostSet" element
     */
    boolean isSetPrePostSet();

    /**
     * Sets the "prePostSet" element
     */
    void setPrePostSet(org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet prePostSet);

    /**
     * Appends and returns a new empty "prePostSet" element
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet addNewPrePostSet();

    /**
     * Unsets the "prePostSet" element
     */
    void unsetPrePostSet();

    /**
     * Gets the "for" attribute
     */
    java.lang.Object getFor();

    /**
     * Gets (as xml) the "for" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList xgetFor();

    /**
     * True if has "for" attribute
     */
    boolean isSetFor();

    /**
     * Sets the "for" attribute
     */
    void setFor(java.lang.Object xfor);

    /**
     * Sets (as xml) the "for" attribute
     */
    void xsetFor(org.apache.xmlbeans.impl.xb.xmlconfig.JavaNameList xfor);

    /**
     * Unsets the "for" attribute
     */
    void unsetFor();

    /**
     * An XML interface(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface Interface extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "interface02a7elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "staticHandler" element
         */
        java.lang.String getStaticHandler();

        /**
         * Gets (as xml) the "staticHandler" element
         */
        org.apache.xmlbeans.XmlString xgetStaticHandler();

        /**
         * Sets the "staticHandler" element
         */
        void setStaticHandler(java.lang.String staticHandler);

        /**
         * Sets (as xml) the "staticHandler" element
         */
        void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler);

        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();

        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();

        /**
         * True if has "name" attribute
         */
        boolean isSetName();

        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);

        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);

        /**
         * Unsets the "name" attribute
         */
        void unsetName();
    }

    /**
     * An XML prePostSet(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
     *
     * This is a complex type.
     */
    public interface PrePostSet extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.PrePostSet> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "prepostset5c9delemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "staticHandler" element
         */
        java.lang.String getStaticHandler();

        /**
         * Gets (as xml) the "staticHandler" element
         */
        org.apache.xmlbeans.XmlString xgetStaticHandler();

        /**
         * Sets the "staticHandler" element
         */
        void setStaticHandler(java.lang.String staticHandler);

        /**
         * Sets (as xml) the "staticHandler" element
         */
        void xsetStaticHandler(org.apache.xmlbeans.XmlString staticHandler);
    }
}
