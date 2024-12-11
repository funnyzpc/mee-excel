/*
 * An XML document type.
 * Localname: worksheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one worksheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface WorksheetDocument extends XmlObject {
    DocumentFactory<WorksheetDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "worksheetf539doctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "worksheet" element
     */
    CTWorksheet getWorksheet();

    /**
     * Sets the "worksheet" element
     */
    void setWorksheet(CTWorksheet worksheet);

    /**
     * Appends and returns a new empty "worksheet" element
     */
    CTWorksheet addNewWorksheet();
}
