/*
 * XML Type:  CT_Hyperlinks
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Hyperlinks(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHyperlinks extends XmlObject {
    DocumentFactory<CTHyperlinks> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cthyperlinks6416type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "hyperlink" elements
     */
    java.util.List<CTHyperlink> getHyperlinkList();

    /**
     * Gets array of all "hyperlink" elements
     */
    CTHyperlink[] getHyperlinkArray();

    /**
     * Gets ith "hyperlink" element
     */
    CTHyperlink getHyperlinkArray(int i);

    /**
     * Returns number of "hyperlink" element
     */
    int sizeOfHyperlinkArray();

    /**
     * Sets array of all "hyperlink" element
     */
    void setHyperlinkArray(CTHyperlink[] hyperlinkArray);

    /**
     * Sets ith "hyperlink" element
     */
    void setHyperlinkArray(int i, CTHyperlink hyperlink);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "hyperlink" element
     */
    CTHyperlink insertNewHyperlink(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "hyperlink" element
     */
    CTHyperlink addNewHyperlink();

    /**
     * Removes the ith "hyperlink" element
     */
    void removeHyperlink(int i);
}
