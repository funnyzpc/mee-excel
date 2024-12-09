/*
 * An XML document type.
 * Localname: downloaded-schemas
 * Namespace: http://www.bea.com/2003/01/xmlbean/xsdownload
 * Java type: org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdownload;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one downloaded-schemas(@http://www.bea.com/2003/01/xmlbean/xsdownload) element.
 *
 * This is a complex type.
 */
public interface DownloadedSchemasDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "downloadedschemas2dd7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "downloaded-schemas" element
     */
    org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas getDownloadedSchemas();

    /**
     * Sets the "downloaded-schemas" element
     */
    void setDownloadedSchemas(org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas downloadedSchemas);

    /**
     * Appends and returns a new empty "downloaded-schemas" element
     */
    org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas addNewDownloadedSchemas();

    /**
     * An XML downloaded-schemas(@http://www.bea.com/2003/01/xmlbean/xsdownload).
     *
     * This is a complex type.
     */
    public interface DownloadedSchemas extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "downloadedschemasb3efelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "entry" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry> getEntryList();

        /**
         * Gets array of all "entry" elements
         */
        org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry[] getEntryArray();

        /**
         * Gets ith "entry" element
         */
        org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry getEntryArray(int i);

        /**
         * Returns number of "entry" element
         */
        int sizeOfEntryArray();

        /**
         * Sets array of all "entry" element
         */
        void setEntryArray(org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry[] entryArray);

        /**
         * Sets ith "entry" element
         */
        void setEntryArray(int i, org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry entry);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "entry" element
         */
        org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry insertNewEntry(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "entry" element
         */
        org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry addNewEntry();

        /**
         * Removes the ith "entry" element
         */
        void removeEntry(int i);

        /**
         * Gets the "defaultDirectory" attribute
         */
        java.lang.String getDefaultDirectory();

        /**
         * Gets (as xml) the "defaultDirectory" attribute
         */
        org.apache.xmlbeans.XmlToken xgetDefaultDirectory();

        /**
         * True if has "defaultDirectory" attribute
         */
        boolean isSetDefaultDirectory();

        /**
         * Sets the "defaultDirectory" attribute
         */
        void setDefaultDirectory(java.lang.String defaultDirectory);

        /**
         * Sets (as xml) the "defaultDirectory" attribute
         */
        void xsetDefaultDirectory(org.apache.xmlbeans.XmlToken defaultDirectory);

        /**
         * Unsets the "defaultDirectory" attribute
         */
        void unsetDefaultDirectory();
    }
}
