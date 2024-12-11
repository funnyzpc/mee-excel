/*
 * XML Type:  CT_SheetDimension
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_SheetDimension(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheetDimension extends XmlObject {
    DocumentFactory<CTSheetDimension> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheetdimensiond310type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "ref" attribute
     */
    String getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    STRef xgetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(String ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(STRef ref);
}
