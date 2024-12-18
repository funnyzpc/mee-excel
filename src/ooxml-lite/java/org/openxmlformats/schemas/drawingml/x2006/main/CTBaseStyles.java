/*
 * XML Type:  CT_BaseStyles
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_BaseStyles(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTBaseStyles extends XmlObject {
    DocumentFactory<CTBaseStyles> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbasestyles122etype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "clrScheme" element
     */
    CTColorScheme getClrScheme();

//    /**
//     * Sets the "clrScheme" element
//     */
//    void setClrScheme(CTColorScheme clrScheme);
//
//    /**
//     * Appends and returns a new empty "clrScheme" element
//     */
//    CTColorScheme addNewClrScheme();
//
//    /**
//     * Gets the "fontScheme" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme getFontScheme();
//
//    /**
//     * Sets the "fontScheme" element
//     */
//    void setFontScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme fontScheme);
//
//    /**
//     * Appends and returns a new empty "fontScheme" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme addNewFontScheme();
//
//    /**
//     * Gets the "fmtScheme" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix getFmtScheme();
//
//    /**
//     * Sets the "fmtScheme" element
//     */
//    void setFmtScheme(org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix fmtScheme);
//
//    /**
//     * Appends and returns a new empty "fmtScheme" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix addNewFmtScheme();

//    /**
//     * Gets the "extLst" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst();
//
//    /**
//     * True if has "extLst" element
//     */
//    boolean isSetExtLst();
//
//    /**
//     * Sets the "extLst" element
//     */
//    void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst);
//
//    /**
//     * Appends and returns a new empty "extLst" element
//     */
//    org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst();

    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
}
