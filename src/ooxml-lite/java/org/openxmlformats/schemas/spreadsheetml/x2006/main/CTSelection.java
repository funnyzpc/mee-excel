/*
 * XML Type:  CT_Selection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Selection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSelection extends XmlObject {
    DocumentFactory<CTSelection> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctselectionca2btype");
    SchemaType type = Factory.getType();


//    /**
//     * Gets the "pane" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum getPane();

//    /**
//     * Gets (as xml) the "pane" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane xgetPane();

    /**
     * True if has "pane" attribute
     */
    boolean isSetPane();

//    /**
//     * Sets the "pane" attribute
//     */
//    void setPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane.Enum pane);

//    /**
//     * Sets (as xml) the "pane" attribute
//     */
//    void xsetPane(org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane pane);

    /**
     * Unsets the "pane" attribute
     */
    void unsetPane();

    /**
     * Gets the "activeCell" attribute
     */
    String getActiveCell();

//    /**
//     * Gets (as xml) the "activeCell" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetActiveCell();

    /**
     * True if has "activeCell" attribute
     */
    boolean isSetActiveCell();

    /**
     * Sets the "activeCell" attribute
     */
    void setActiveCell(String activeCell);

//    /**
//     * Sets (as xml) the "activeCell" attribute
//     */
//    void xsetActiveCell(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef activeCell);

    /**
     * Unsets the "activeCell" attribute
     */
    void unsetActiveCell();

    /**
     * Gets the "activeCellId" attribute
     */
    long getActiveCellId();

    /**
     * Gets (as xml) the "activeCellId" attribute
     */
    XmlUnsignedInt xgetActiveCellId();

    /**
     * True if has "activeCellId" attribute
     */
    boolean isSetActiveCellId();

    /**
     * Sets the "activeCellId" attribute
     */
    void setActiveCellId(long activeCellId);

    /**
     * Sets (as xml) the "activeCellId" attribute
     */
    void xsetActiveCellId(XmlUnsignedInt activeCellId);

    /**
     * Unsets the "activeCellId" attribute
     */
    void unsetActiveCellId();

    /**
     * Gets the "sqref" attribute
     */
    java.util.List getSqref();
//
//    /**
//     * Gets (as xml) the "sqref" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref();

    /**
     * True if has "sqref" attribute
     */
    boolean isSetSqref();

    /**
     * Sets the "sqref" attribute
     */
    void setSqref(java.util.List sqref);

//    /**
//     * Sets (as xml) the "sqref" attribute
//     */
//    void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref);

    /**
     * Unsets the "sqref" attribute
     */
    void unsetSqref();
}
