/*
 * XML Type:  CT_Hyperlink
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_Hyperlink(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTHyperlink extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTHyperlink> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cthyperlink0c85type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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

    /**
     * Gets the "id" attribute
     */
    String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "location" attribute
     */
    String getLocation();

    /**
     * Gets (as xml) the "location" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetLocation();

    /**
     * True if has "location" attribute
     */
    boolean isSetLocation();

    /**
     * Sets the "location" attribute
     */
    void setLocation(String location);

    /**
     * Sets (as xml) the "location" attribute
     */
    void xsetLocation(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring location);

    /**
     * Unsets the "location" attribute
     */
    void unsetLocation();

    /**
     * Gets the "tooltip" attribute
     */
    String getTooltip();

    /**
     * Gets (as xml) the "tooltip" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetTooltip();

    /**
     * True if has "tooltip" attribute
     */
    boolean isSetTooltip();

    /**
     * Sets the "tooltip" attribute
     */
    void setTooltip(String tooltip);

    /**
     * Sets (as xml) the "tooltip" attribute
     */
    void xsetTooltip(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring tooltip);

    /**
     * Unsets the "tooltip" attribute
     */
    void unsetTooltip();

    /**
     * Gets the "display" attribute
     */
    String getDisplay();

    /**
     * Gets (as xml) the "display" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring xgetDisplay();

    /**
     * True if has "display" attribute
     */
    boolean isSetDisplay();

    /**
     * Sets the "display" attribute
     */
    void setDisplay(String display);

    /**
     * Sets (as xml) the "display" attribute
     */
    void xsetDisplay(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STXstring display);

    /**
     * Unsets the "display" attribute
     */
    void unsetDisplay();
}
