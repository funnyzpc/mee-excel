/*
 * XML Type:  downloaded-schema-entry
 * Namespace: http://www.bea.com/2003/01/xmlbean/xsdownload
 * Java type: org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdownload;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML downloaded-schema-entry(@http://www.bea.com/2003/01/xmlbean/xsdownload).
 *
 * This is a complex type.
 */
public interface DownloadedSchemaEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "downloadedschemaentry1c75type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "filename" element
     */
    java.lang.String getFilename();

    /**
     * Gets (as xml) the "filename" element
     */
    org.apache.xmlbeans.XmlToken xgetFilename();

    /**
     * Sets the "filename" element
     */
    void setFilename(java.lang.String filename);

    /**
     * Sets (as xml) the "filename" element
     */
    void xsetFilename(org.apache.xmlbeans.XmlToken filename);

    /**
     * Gets the "sha1" element
     */
    java.lang.String getSha1();

    /**
     * Gets (as xml) the "sha1" element
     */
    org.apache.xmlbeans.XmlToken xgetSha1();

    /**
     * Sets the "sha1" element
     */
    void setSha1(java.lang.String sha1);

    /**
     * Sets (as xml) the "sha1" element
     */
    void xsetSha1(org.apache.xmlbeans.XmlToken sha1);

    /**
     * Gets a List of "schemaLocation" elements
     */
    java.util.List<java.lang.String> getSchemaLocationList();

    /**
     * Gets array of all "schemaLocation" elements
     */
    java.lang.String[] getSchemaLocationArray();

    /**
     * Gets ith "schemaLocation" element
     */
    java.lang.String getSchemaLocationArray(int i);

    /**
     * Gets (as xml) a List of "schemaLocation" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetSchemaLocationList();

    /**
     * Gets (as xml) array of all "schemaLocation" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetSchemaLocationArray();

    /**
     * Gets (as xml) ith "schemaLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSchemaLocationArray(int i);

    /**
     * Returns number of "schemaLocation" element
     */
    int sizeOfSchemaLocationArray();

    /**
     * Sets array of all "schemaLocation" element
     */
    void setSchemaLocationArray(java.lang.String[] schemaLocationArray);

    /**
     * Sets ith "schemaLocation" element
     */
    void setSchemaLocationArray(int i, java.lang.String schemaLocation);

    /**
     * Sets (as xml) array of all "schemaLocation" element
     */
    void xsetSchemaLocationArray(org.apache.xmlbeans.XmlAnyURI[] schemaLocationArray);

    /**
     * Sets (as xml) ith "schemaLocation" element
     */
    void xsetSchemaLocationArray(int i, org.apache.xmlbeans.XmlAnyURI schemaLocation);

    /**
     * Inserts the value as the ith "schemaLocation" element
     */
    void insertSchemaLocation(int i, java.lang.String schemaLocation);

    /**
     * Appends the value as the last "schemaLocation" element
     */
    void addSchemaLocation(java.lang.String schemaLocation);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "schemaLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewSchemaLocation(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "schemaLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewSchemaLocation();

    /**
     * Removes the ith "schemaLocation" element
     */
    void removeSchemaLocation(int i);

    /**
     * Gets the "namespace" element
     */
    java.lang.String getNamespace();

    /**
     * Gets (as xml) the "namespace" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();

    /**
     * True if has "namespace" element
     */
    boolean isSetNamespace();

    /**
     * Sets the "namespace" element
     */
    void setNamespace(java.lang.String namespace);

    /**
     * Sets (as xml) the "namespace" element
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);

    /**
     * Unsets the "namespace" element
     */
    void unsetNamespace();
}
