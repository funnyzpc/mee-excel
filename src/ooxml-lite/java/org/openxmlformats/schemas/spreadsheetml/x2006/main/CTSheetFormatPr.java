/*
 * XML Type:  CT_SheetFormatPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlDouble;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedByte;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetFormatPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetFormatPr extends XmlObject {
    DocumentFactory<CTSheetFormatPr> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetformatprdef7type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "baseColWidth" attribute
     */
    long getBaseColWidth();

    /**
     * Gets (as xml) the "baseColWidth" attribute
     */
    XmlUnsignedInt xgetBaseColWidth();

    /**
     * True if has "baseColWidth" attribute
     */
    boolean isSetBaseColWidth();

    /**
     * Sets the "baseColWidth" attribute
     */
    void setBaseColWidth(long baseColWidth);

    /**
     * Sets (as xml) the "baseColWidth" attribute
     */
    void xsetBaseColWidth(XmlUnsignedInt baseColWidth);

    /**
     * Unsets the "baseColWidth" attribute
     */
    void unsetBaseColWidth();

    /**
     * Gets the "defaultColWidth" attribute
     */
    double getDefaultColWidth();

    /**
     * Gets (as xml) the "defaultColWidth" attribute
     */
    XmlDouble xgetDefaultColWidth();

    /**
     * True if has "defaultColWidth" attribute
     */
    boolean isSetDefaultColWidth();

    /**
     * Sets the "defaultColWidth" attribute
     */
    void setDefaultColWidth(double defaultColWidth);

    /**
     * Sets (as xml) the "defaultColWidth" attribute
     */
    void xsetDefaultColWidth(XmlDouble defaultColWidth);

    /**
     * Unsets the "defaultColWidth" attribute
     */
    void unsetDefaultColWidth();

    /**
     * Gets the "defaultRowHeight" attribute
     */
    double getDefaultRowHeight();

    /**
     * Gets (as xml) the "defaultRowHeight" attribute
     */
    XmlDouble xgetDefaultRowHeight();

    /**
     * Sets the "defaultRowHeight" attribute
     */
    void setDefaultRowHeight(double defaultRowHeight);

    /**
     * Sets (as xml) the "defaultRowHeight" attribute
     */
    void xsetDefaultRowHeight(XmlDouble defaultRowHeight);

    /**
     * Gets the "customHeight" attribute
     */
    boolean getCustomHeight();

    /**
     * Gets (as xml) the "customHeight" attribute
     */
    XmlBoolean xgetCustomHeight();

    /**
     * True if has "customHeight" attribute
     */
    boolean isSetCustomHeight();

    /**
     * Sets the "customHeight" attribute
     */
    void setCustomHeight(boolean customHeight);

    /**
     * Sets (as xml) the "customHeight" attribute
     */
    void xsetCustomHeight(XmlBoolean customHeight);

    /**
     * Unsets the "customHeight" attribute
     */
    void unsetCustomHeight();

    /**
     * Gets the "zeroHeight" attribute
     */
    boolean getZeroHeight();

    /**
     * Gets (as xml) the "zeroHeight" attribute
     */
    XmlBoolean xgetZeroHeight();

    /**
     * True if has "zeroHeight" attribute
     */
    boolean isSetZeroHeight();

    /**
     * Sets the "zeroHeight" attribute
     */
    void setZeroHeight(boolean zeroHeight);

    /**
     * Sets (as xml) the "zeroHeight" attribute
     */
    void xsetZeroHeight(XmlBoolean zeroHeight);

    /**
     * Unsets the "zeroHeight" attribute
     */
    void unsetZeroHeight();

    /**
     * Gets the "thickTop" attribute
     */
    boolean getThickTop();

    /**
     * Gets (as xml) the "thickTop" attribute
     */
    XmlBoolean xgetThickTop();

    /**
     * True if has "thickTop" attribute
     */
    boolean isSetThickTop();

    /**
     * Sets the "thickTop" attribute
     */
    void setThickTop(boolean thickTop);

    /**
     * Sets (as xml) the "thickTop" attribute
     */
    void xsetThickTop(XmlBoolean thickTop);

    /**
     * Unsets the "thickTop" attribute
     */
    void unsetThickTop();

    /**
     * Gets the "thickBottom" attribute
     */
    boolean getThickBottom();

    /**
     * Gets (as xml) the "thickBottom" attribute
     */
    XmlBoolean xgetThickBottom();

    /**
     * True if has "thickBottom" attribute
     */
    boolean isSetThickBottom();

    /**
     * Sets the "thickBottom" attribute
     */
    void setThickBottom(boolean thickBottom);

    /**
     * Sets (as xml) the "thickBottom" attribute
     */
    void xsetThickBottom(XmlBoolean thickBottom);

    /**
     * Unsets the "thickBottom" attribute
     */
    void unsetThickBottom();

    /**
     * Gets the "outlineLevelRow" attribute
     */
    short getOutlineLevelRow();

    /**
     * Gets (as xml) the "outlineLevelRow" attribute
     */
    XmlUnsignedByte xgetOutlineLevelRow();

    /**
     * True if has "outlineLevelRow" attribute
     */
    boolean isSetOutlineLevelRow();

    /**
     * Sets the "outlineLevelRow" attribute
     */
    void setOutlineLevelRow(short outlineLevelRow);

    /**
     * Sets (as xml) the "outlineLevelRow" attribute
     */
    void xsetOutlineLevelRow(XmlUnsignedByte outlineLevelRow);

    /**
     * Unsets the "outlineLevelRow" attribute
     */
    void unsetOutlineLevelRow();

    /**
     * Gets the "outlineLevelCol" attribute
     */
    short getOutlineLevelCol();

    /**
     * Gets (as xml) the "outlineLevelCol" attribute
     */
    XmlUnsignedByte xgetOutlineLevelCol();

    /**
     * True if has "outlineLevelCol" attribute
     */
    boolean isSetOutlineLevelCol();

    /**
     * Sets the "outlineLevelCol" attribute
     */
    void setOutlineLevelCol(short outlineLevelCol);

    /**
     * Sets (as xml) the "outlineLevelCol" attribute
     */
    void xsetOutlineLevelCol(XmlUnsignedByte outlineLevelCol);

    /**
     * Unsets the "outlineLevelCol" attribute
     */
    void unsetOutlineLevelCol();
}
