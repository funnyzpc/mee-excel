/*
 * XML Type:  CT_ExternalDefinedName
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalDefinedName(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalDefinedName extends XmlObject {
    DocumentFactory<CTExternalDefinedName> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternaldefinedname9408type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "name" attribute
     */
    String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetName();

    /**
     * Sets the "name" attribute
     */
    void setName(String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring name);

    /**
     * Gets the "refersTo" attribute
     */
    String getRefersTo();

    /**
     * Gets (as xml) the "refersTo" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetRefersTo();

    /**
     * True if has "refersTo" attribute
     */
    boolean isSetRefersTo();

    /**
     * Sets the "refersTo" attribute
     */
    void setRefersTo(String refersTo);

    /**
     * Sets (as xml) the "refersTo" attribute
     */
    void xsetRefersTo(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring refersTo);

    /**
     * Unsets the "refersTo" attribute
     */
    void unsetRefersTo();

    /**
     * Gets the "sheetId" attribute
     */
    long getSheetId();

    /**
     * Gets (as xml) the "sheetId" attribute
     */
    XmlUnsignedInt xgetSheetId();

    /**
     * True if has "sheetId" attribute
     */
    boolean isSetSheetId();

    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);

    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(XmlUnsignedInt sheetId);

    /**
     * Unsets the "sheetId" attribute
     */
    void unsetSheetId();
}
