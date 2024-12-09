/*
 * An XML document type.
 * Localname: appinfo
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.ElementFactory;


/**
 * A document containing one appinfo(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AppinfoDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<AppinfoDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "appinfo2ea6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "appinfo" element
     */
    Appinfo getAppinfo();

    /**
     * Sets the "appinfo" element
     */
    void setAppinfo(Appinfo appinfo);

    /**
     * Appends and returns a new empty "appinfo" element
     */
    Appinfo addNewAppinfo();

    /**
     * An XML appinfo(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Appinfo extends org.apache.xmlbeans.XmlObject {
        ElementFactory<Appinfo> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "appinfo650belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "source" attribute
         */
        String getSource();

        /**
         * Gets (as xml) the "source" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetSource();

        /**
         * True if has "source" attribute
         */
        boolean isSetSource();

        /**
         * Sets the "source" attribute
         */
        void setSource(String source);

        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.apache.xmlbeans.XmlAnyURI source);

        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
    }
}
