/*
 * XML Type:  CT_Dxf
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Dxf(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTDxf extends XmlObject {
    DocumentFactory<CTDxf> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdxfa3b1type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "font" element
     */
    CTFont getFont();

    /**
     * True if has "font" element
     */
    boolean isSetFont();

    /**
     * Sets the "font" element
     */
    void setFont(CTFont font);

    /**
     * Appends and returns a new empty "font" element
     */
    CTFont addNewFont();

    /**
     * Unsets the "font" element
     */
    void unsetFont();

    /**
     * Gets the "numFmt" element
     */
    CTNumFmt getNumFmt();

    /**
     * True if has "numFmt" element
     */
    boolean isSetNumFmt();

    /**
     * Sets the "numFmt" element
     */
    void setNumFmt(CTNumFmt numFmt);

    /**
     * Appends and returns a new empty "numFmt" element
     */
    CTNumFmt addNewNumFmt();

    /**
     * Unsets the "numFmt" element
     */
    void unsetNumFmt();

    /**
     * Gets the "fill" element
     */
    CTFill getFill();

    /**
     * True if has "fill" element
     */
    boolean isSetFill();

    /**
     * Sets the "fill" element
     */
    void setFill(CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    CTFill addNewFill();

    /**
     * Unsets the "fill" element
     */
    void unsetFill();

    /**
     * Gets the "alignment" element
     */
    CTCellAlignment getAlignment();

    /**
     * True if has "alignment" element
     */
    boolean isSetAlignment();

    /**
     * Sets the "alignment" element
     */
    void setAlignment(CTCellAlignment alignment);

    /**
     * Appends and returns a new empty "alignment" element
     */
    CTCellAlignment addNewAlignment();

    /**
     * Unsets the "alignment" element
     */
    void unsetAlignment();

    /**
     * Gets the "border" element
     */
    CTBorder getBorder();

    /**
     * True if has "border" element
     */
    boolean isSetBorder();

    /**
     * Sets the "border" element
     */
    void setBorder(CTBorder border);

    /**
     * Appends and returns a new empty "border" element
     */
    CTBorder addNewBorder();

//    /**
//     * Unsets the "border" element
//     */
//    void unsetBorder();
//
//    /**
//     * Gets the "protection" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection getProtection();
//
//    /**
//     * True if has "protection" element
//     */
//    boolean isSetProtection();
//
//    /**
//     * Sets the "protection" element
//     */
//    void setProtection(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection protection);
//
//    /**
//     * Appends and returns a new empty "protection" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection addNewProtection();
//
//    /**
//     * Unsets the "protection" element
//     */
//    void unsetProtection();
//
//    /**
//     * Gets the "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
//
//    /**
//     * True if has "extLst" element
//     */
//    boolean isSetExtLst();
//
//    /**
//     * Sets the "extLst" element
//     */
//    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
//
//    /**
//     * Appends and returns a new empty "extLst" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}
