/*
 * XML Type:  CT_CellAlignment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlInt;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CellAlignment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellAlignment extends XmlObject {
    DocumentFactory<CTCellAlignment> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcellalignmentb580type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "horizontal" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment.Enum getHorizontal();

    /**
     * Gets (as xml) the "horizontal" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment xgetHorizontal();

    /**
     * True if has "horizontal" attribute
     */
    boolean isSetHorizontal();

    /**
     * Sets the "horizontal" attribute
     */
    void setHorizontal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment.Enum horizontal);

    /**
     * Sets (as xml) the "horizontal" attribute
     */
    void xsetHorizontal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STHorizontalAlignment horizontal);

    /**
     * Unsets the "horizontal" attribute
     */
    void unsetHorizontal();

    /**
     * Gets the "vertical" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.Enum getVertical();
//
//    /**
//     * Gets (as xml) the "vertical" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment xgetVertical();

    /**
     * True if has "vertical" attribute
     */
    boolean isSetVertical();

    /**
     * Sets the "vertical" attribute
     */
    void setVertical(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.Enum vertical);

//    /**
//     * Sets (as xml) the "vertical" attribute
//     */
//    void xsetVertical(org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment vertical);

    /**
     * Unsets the "vertical" attribute
     */
    void unsetVertical();

    /**
     * Gets the "textRotation" attribute
     */
    java.math.BigInteger getTextRotation();

//    /**
//     * Gets (as xml) the "textRotation" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STTextRotation xgetTextRotation();

    /**
     * True if has "textRotation" attribute
     */
    boolean isSetTextRotation();

    /**
     * Sets the "textRotation" attribute
     */
    void setTextRotation(java.math.BigInteger textRotation);

//    /**
//     * Sets (as xml) the "textRotation" attribute
//     */
//    void xsetTextRotation(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTextRotation textRotation);

    /**
     * Unsets the "textRotation" attribute
     */
    void unsetTextRotation();

    /**
     * Gets the "wrapText" attribute
     */
    boolean getWrapText();

    /**
     * Gets (as xml) the "wrapText" attribute
     */
    XmlBoolean xgetWrapText();

    /**
     * True if has "wrapText" attribute
     */
    boolean isSetWrapText();

    /**
     * Sets the "wrapText" attribute
     */
    void setWrapText(boolean wrapText);

    /**
     * Sets (as xml) the "wrapText" attribute
     */
    void xsetWrapText(XmlBoolean wrapText);

    /**
     * Unsets the "wrapText" attribute
     */
    void unsetWrapText();

    /**
     * Gets the "indent" attribute
     */
    long getIndent();

    /**
     * Gets (as xml) the "indent" attribute
     */
    XmlUnsignedInt xgetIndent();

    /**
     * True if has "indent" attribute
     */
    boolean isSetIndent();

    /**
     * Sets the "indent" attribute
     */
    void setIndent(long indent);

    /**
     * Sets (as xml) the "indent" attribute
     */
    void xsetIndent(XmlUnsignedInt indent);

    /**
     * Unsets the "indent" attribute
     */
    void unsetIndent();

    /**
     * Gets the "relativeIndent" attribute
     */
    int getRelativeIndent();

    /**
     * Gets (as xml) the "relativeIndent" attribute
     */
    XmlInt xgetRelativeIndent();

    /**
     * True if has "relativeIndent" attribute
     */
    boolean isSetRelativeIndent();

    /**
     * Sets the "relativeIndent" attribute
     */
    void setRelativeIndent(int relativeIndent);

    /**
     * Sets (as xml) the "relativeIndent" attribute
     */
    void xsetRelativeIndent(XmlInt relativeIndent);

    /**
     * Unsets the "relativeIndent" attribute
     */
    void unsetRelativeIndent();

    /**
     * Gets the "justifyLastLine" attribute
     */
    boolean getJustifyLastLine();

    /**
     * Gets (as xml) the "justifyLastLine" attribute
     */
    XmlBoolean xgetJustifyLastLine();

    /**
     * True if has "justifyLastLine" attribute
     */
    boolean isSetJustifyLastLine();

    /**
     * Sets the "justifyLastLine" attribute
     */
    void setJustifyLastLine(boolean justifyLastLine);

    /**
     * Sets (as xml) the "justifyLastLine" attribute
     */
    void xsetJustifyLastLine(XmlBoolean justifyLastLine);

    /**
     * Unsets the "justifyLastLine" attribute
     */
    void unsetJustifyLastLine();

    /**
     * Gets the "shrinkToFit" attribute
     */
    boolean getShrinkToFit();

    /**
     * Gets (as xml) the "shrinkToFit" attribute
     */
    XmlBoolean xgetShrinkToFit();

    /**
     * True if has "shrinkToFit" attribute
     */
    boolean isSetShrinkToFit();

    /**
     * Sets the "shrinkToFit" attribute
     */
    void setShrinkToFit(boolean shrinkToFit);

    /**
     * Sets (as xml) the "shrinkToFit" attribute
     */
    void xsetShrinkToFit(XmlBoolean shrinkToFit);

    /**
     * Unsets the "shrinkToFit" attribute
     */
    void unsetShrinkToFit();

    /**
     * Gets the "readingOrder" attribute
     */
    long getReadingOrder();

    /**
     * Gets (as xml) the "readingOrder" attribute
     */
    XmlUnsignedInt xgetReadingOrder();

    /**
     * True if has "readingOrder" attribute
     */
    boolean isSetReadingOrder();

    /**
     * Sets the "readingOrder" attribute
     */
    void setReadingOrder(long readingOrder);

    /**
     * Sets (as xml) the "readingOrder" attribute
     */
    void xsetReadingOrder(XmlUnsignedInt readingOrder);

    /**
     * Unsets the "readingOrder" attribute
     */
    void unsetReadingOrder();
}
