/*
 * XML Type:  CT_CellProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlBoolean;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_CellProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTCellProtection extends XmlObject {
    DocumentFactory<CTCellProtection> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctcellprotectionf524type");
    SchemaType type = Factory.getType();


    /**
     * Gets the "locked" attribute
     */
    boolean getLocked();

    /**
     * Gets (as xml) the "locked" attribute
     */
    XmlBoolean xgetLocked();

    /**
     * True if has "locked" attribute
     */
    boolean isSetLocked();

    /**
     * Sets the "locked" attribute
     */
    void setLocked(boolean locked);

    /**
     * Sets (as xml) the "locked" attribute
     */
    void xsetLocked(XmlBoolean locked);

    /**
     * Unsets the "locked" attribute
     */
    void unsetLocked();

    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();

    /**
     * Gets (as xml) the "hidden" attribute
     */
    XmlBoolean xgetHidden();

    /**
     * True if has "hidden" attribute
     */
    boolean isSetHidden();

    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);

    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(XmlBoolean hidden);

    /**
     * Unsets the "hidden" attribute
     */
    void unsetHidden();
}
