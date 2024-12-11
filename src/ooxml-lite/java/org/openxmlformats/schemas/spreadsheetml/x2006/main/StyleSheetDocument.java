/*
 * An XML document type.
 * Localname: styleSheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * A document containing one styleSheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public interface StyleSheetDocument extends XmlObject {
    DocumentFactory<StyleSheetDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stylesheet5d8bdoctype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "styleSheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet getStyleSheet();

    /**
     * Sets the "styleSheet" element
     */
    void setStyleSheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet styleSheet);

    /**
     * Appends and returns a new empty "styleSheet" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet addNewStyleSheet();
}
