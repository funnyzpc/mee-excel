/*
 * XML Type:  CT_Sheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Sheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSheet extends XmlObject {
    DocumentFactory<CTSheet> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsheet4dbetype");
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
     * Gets the "sheetId" attribute
     */
    long getSheetId();

    /**
     * Gets (as xml) the "sheetId" attribute
     */
    XmlUnsignedInt xgetSheetId();

    /**
     * Sets the "sheetId" attribute
     */
    void setSheetId(long sheetId);

    /**
     * Sets (as xml) the "sheetId" attribute
     */
    void xsetSheetId(XmlUnsignedInt sheetId);

    /**
     * Gets the "state" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum getState();

    /**
     * Gets (as xml) the "state" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState xgetState();

    /**
     * True if has "state" attribute
     */
    boolean isSetState();

    /**
     * Sets the "state" attribute
     */
    void setState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.Enum state);

    /**
     * Sets (as xml) the "state" attribute
     */
    void xsetState(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState state);

    /**
     * Unsets the "state" attribute
     */
    void unsetState();

    /**
     * Gets the "id" attribute
     */
    String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();

    /**
     * Sets the "id" attribute
     */
    void setId(String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);
}
