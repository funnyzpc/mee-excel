/*
 * XML Type:  CT_ExternalCell
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalCell
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalCell(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalCell extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTExternalCell> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalcell5dd6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "v" element
     */
    String getV();

    /**
     * Gets (as xml) the "v" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetV();

    /**
     * True if has "v" element
     */
    boolean isSetV();

    /**
     * Sets the "v" element
     */
    void setV(String v);

    /**
     * Sets (as xml) the "v" element
     */
    void xsetV(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring v);

    /**
     * Unsets the "v" element
     */
    void unsetV();

    /**
     * Gets the "r" attribute
     */
    String getR();

//    /**
//     * Gets (as xml) the "r" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef xgetR();

    /**
     * True if has "r" attribute
     */
    boolean isSetR();

    /**
     * Sets the "r" attribute
     */
    void setR(String r);

//    /**
//     * Sets (as xml) the "r" attribute
//     */
//    void xsetR(org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef r);
//
//    /**
//     * Unsets the "r" attribute
//     */
//    void unsetR();

    /**
     * Gets the "t" attribute
     */
    STCellType.Enum getT();

    /**
     * Gets (as xml) the "t" attribute
     */
    STCellType xgetT();

    /**
     * True if has "t" attribute
     */
    boolean isSetT();

    /**
     * Sets the "t" attribute
     */
    void setT(STCellType.Enum t);

    /**
     * Sets (as xml) the "t" attribute
     */
    void xsetT(STCellType t);

    /**
     * Unsets the "t" attribute
     */
    void unsetT();

//    /**
//     * Gets the "vm" attribute
//     */
//    long getVm();
//
//    /**
//     * Gets (as xml) the "vm" attribute
//     */
//    org.apache.xmlbeans.XmlUnsignedInt xgetVm();
//
//    /**
//     * True if has "vm" attribute
//     */
//    boolean isSetVm();
//
//    /**
//     * Sets the "vm" attribute
//     */
//    void setVm(long vm);
//
//    /**
//     * Sets (as xml) the "vm" attribute
//     */
//    void xsetVm(org.apache.xmlbeans.XmlUnsignedInt vm);
//
//    /**
//     * Unsets the "vm" attribute
//     */
//    void unsetVm();
}
