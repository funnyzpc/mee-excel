/*
 * XML Type:  CT_VerticalAlignFontProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_VerticalAlignFontProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTVerticalAlignFontProperty extends XmlObject {
    DocumentFactory<CTVerticalAlignFontProperty> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctverticalalignfontproperty89f2type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "val" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.Enum getVal();

    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun xgetVal();

    /**
     * Sets the "val" attribute
     */
    void setVal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.Enum val);

    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun val);
}
