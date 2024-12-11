/*
 * XML Type:  CT_RElt
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_RElt(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRElt extends XmlObject {
    DocumentFactory<CTRElt> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrelt6464type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "rPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt getRPr();

    /**
     * True if has "rPr" element
     */
    boolean isSetRPr();

    /**
     * Sets the "rPr" element
     */
    void setRPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt rPr);

    /**
     * Appends and returns a new empty "rPr" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt addNewRPr();

    /**
     * Unsets the "rPr" element
     */
    void unsetRPr();

    /**
     * Gets the "t" element
     */
    String getT();

    /**
     * Gets (as xml) the "t" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetT();

    /**
     * Sets the "t" element
     */
    void setT(String t);

    /**
     * Sets (as xml) the "t" element
     */
    void xsetT(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring t);
}
