/*
 * XML Type:  CT_SheetCalcPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetCalcPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetCalcPr extends XmlObject {
    DocumentFactory<CTSheetCalcPr> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetcalcprc6d5type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "fullCalcOnLoad" attribute
     */
    boolean getFullCalcOnLoad();

    /**
     * Gets (as xml) the "fullCalcOnLoad" attribute
     */
    XmlBoolean xgetFullCalcOnLoad();

    /**
     * True if has "fullCalcOnLoad" attribute
     */
    boolean isSetFullCalcOnLoad();

    /**
     * Sets the "fullCalcOnLoad" attribute
     */
    void setFullCalcOnLoad(boolean fullCalcOnLoad);

    /**
     * Sets (as xml) the "fullCalcOnLoad" attribute
     */
    void xsetFullCalcOnLoad(XmlBoolean fullCalcOnLoad);

    /**
     * Unsets the "fullCalcOnLoad" attribute
     */
    void unsetFullCalcOnLoad();
}
