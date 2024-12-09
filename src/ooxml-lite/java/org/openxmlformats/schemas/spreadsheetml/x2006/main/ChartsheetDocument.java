/*
 * An XML document type.
 * Localname: chartsheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one chartsheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface ChartsheetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<ChartsheetDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "chartsheet99dedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "chartsheet" element
     */
    CTChartsheet getChartsheet();

    /**
     * Sets the "chartsheet" element
     */
    void setChartsheet(CTChartsheet chartsheet);

    /**
     * Appends and returns a new empty "chartsheet" element
     */
    CTChartsheet addNewChartsheet();
}
