/*
 * An XML document type.
 * Localname: appinfo
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AppinfoDocument
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xsdschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.XmlAnyURI;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder;


/**
 * A document containing one appinfo(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface AppinfoDocument extends XmlObject {
    DocumentFactory<AppinfoDocument> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "appinfo2ea6doctype");
    SchemaType type = Factory.getType();


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
    public interface Appinfo extends XmlObject {
        ElementFactory<Appinfo> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "appinfo650belemtype");
        SchemaType type = Factory.getType();


        /**
         * Gets the "source" attribute
         */
        String getSource();

        /**
         * Gets (as xml) the "source" attribute
         */
        XmlAnyURI xgetSource();

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
        void xsetSource(XmlAnyURI source);

        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
    }
}
