/*
 * XML Type:  CT_ExternalReference
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalReference(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalReference extends XmlObject {
    DocumentFactory<CTExternalReference> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalreference945ftype");
    SchemaType type = Factory.getType();


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
