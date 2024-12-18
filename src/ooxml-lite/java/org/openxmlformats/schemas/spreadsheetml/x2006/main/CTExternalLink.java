/*
 * XML Type:  CT_ExternalLink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalLink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalLink extends XmlObject {
    DocumentFactory<CTExternalLink> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternallink966etype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "externalBook" element
     */
    CTExternalBook getExternalBook();

//    /**
//     * True if has "externalBook" element
//     */
//    boolean isSetExternalBook();
//
//    /**
//     * Sets the "externalBook" element
//     */
//    void setExternalBook(CTExternalBook externalBook);

    /**
     * Appends and returns a new empty "externalBook" element
     */
    CTExternalBook addNewExternalBook();

//    /**
//     * Unsets the "externalBook" element
//     */
//    void unsetExternalBook();
//
//    /**
//     * Gets the "ddeLink" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink getDdeLink();

//    /**
//     * True if has "ddeLink" element
//     */
//    boolean isSetDdeLink();
//
//    /**
//     * Sets the "ddeLink" element
//     */
//    void setDdeLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink ddeLink);
//
//    /**
//     * Appends and returns a new empty "ddeLink" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink addNewDdeLink();
//
//    /**
//     * Unsets the "ddeLink" element
//     */
//    void unsetDdeLink();
//
//    /**
//     * Gets the "oleLink" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink getOleLink();
//
//    /**
//     * True if has "oleLink" element
//     */
//    boolean isSetOleLink();
//
//    /**
//     * Sets the "oleLink" element
//     */
//    void setOleLink(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink oleLink);
//
//    /**
//     * Appends and returns a new empty "oleLink" element
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink addNewOleLink();
//
//    /**
//     * Unsets the "oleLink" element
//     */
//    void unsetOleLink();
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
