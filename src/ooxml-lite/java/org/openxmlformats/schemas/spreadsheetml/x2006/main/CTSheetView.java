/*
 * XML Type:  CT_SheetView
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetView(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetView extends XmlObject {
    DocumentFactory<CTSheetView> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetview0f43type");
    SchemaType type = Factory.getType();

    /**
     * Gets ith "selection" element
     */
    CTSelection getSelectionArray(int i);

    /**
     * Returns number of "selection" element
     */
    int sizeOfSelectionArray();

    /**
     * Sets ith "selection" element
     */
    void setSelectionArray(int i, CTSelection selection);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "selection" element
     */
    CTSelection insertNewSelection(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "selection" element
     */
    CTSelection addNewSelection();

    /**
     * Removes the ith "selection" element
     */
    void removeSelection(int i);


    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();

    /**
     * Gets the "showFormulas" attribute
     */
    boolean getShowFormulas();

    /**
     * Sets the "showFormulas" attribute
     */
    void setShowFormulas(boolean showFormulas);


    /**
     * Gets the "showRowColHeaders" attribute
     */
    boolean getShowRowColHeaders();


    /**
     * Sets (as xml) the "showRowColHeaders" attribute
     */

    /**
     * Gets the "showZeros" attribute
     */
    boolean getShowZeros();

    /**
     * Sets the "showZeros" attribute
     */
    void setShowZeros(boolean showZeros);

    /**
     * Gets the "rightToLeft" attribute
     */
    boolean getRightToLeft();


    /**
     * Sets the "rightToLeft" attribute
     */
    void setRightToLeft(boolean rightToLeft);


    /**
     * Gets the "tabSelected" attribute
     */
    boolean getTabSelected();

    /**
     * Sets the "tabSelected" attribute
     */
    void setTabSelected(boolean tabSelected);


    /**
     * Gets the "topLeftCell" attribute
     */
    String getTopLeftCell();

    /**
     * Sets the "zoomScale" attribute
     */
    void setZoomScale(long zoomScale);

    /**
     * Sets the "workbookViewId" attribute
     */
    void setWorkbookViewId(long workbookViewId);


}
