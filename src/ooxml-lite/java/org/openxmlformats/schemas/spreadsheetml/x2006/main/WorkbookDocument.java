/*
 * An XML document type.
 * Localname: workbook
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one workbook(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface WorkbookDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<WorkbookDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "workbookec17doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "workbook" element
     */
    CTWorkbook getWorkbook();

    /**
     * Sets the "workbook" element
     */
    void setWorkbook(CTWorkbook workbook);

    /**
     * Appends and returns a new empty "workbook" element
     */
    CTWorkbook addNewWorkbook();
}
