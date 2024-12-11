/*
 * XML Type:  CT_NumFmt
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_NumFmt(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNumFmt extends XmlObject {
    DocumentFactory<CTNumFmt> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctnumfmt3870type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "numFmtId" attribute
     */
    long getNumFmtId();

//    /**
//     * Gets (as xml) the "numFmtId" attribute
//     */
//    org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId();

    /**
     * Sets the "numFmtId" attribute
     */
    void setNumFmtId(long numFmtId);

//    /**
//     * Sets (as xml) the "numFmtId" attribute
//     */
//    void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId);

    /**
     * Gets the "formatCode" attribute
     */
    String getFormatCode();

//    /**
//     * Gets (as xml) the "formatCode" attribute
//     */
//    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetFormatCode();

    /**
     * Sets the "formatCode" attribute
     */
    void setFormatCode(String formatCode);
//
//    /**
//     * Sets (as xml) the "formatCode" attribute
//     */
//    void xsetFormatCode(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring formatCode);
}
