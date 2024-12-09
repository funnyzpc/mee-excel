/*
 * XML Type:  CT_ExternalReferences
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalReferences(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalReferences extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTExternalReferences> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternalreferencesd77ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "externalReference" elements
     */
    java.util.List<CTExternalReference> getExternalReferenceList();

    /**
     * Gets array of all "externalReference" elements
     */
    CTExternalReference[] getExternalReferenceArray();

    /**
     * Gets ith "externalReference" element
     */
    CTExternalReference getExternalReferenceArray(int i);

    /**
     * Returns number of "externalReference" element
     */
    int sizeOfExternalReferenceArray();

    /**
     * Sets array of all "externalReference" element
     */
    void setExternalReferenceArray(CTExternalReference[] externalReferenceArray);

    /**
     * Sets ith "externalReference" element
     */
    void setExternalReferenceArray(int i, CTExternalReference externalReference);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "externalReference" element
     */
    CTExternalReference insertNewExternalReference(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "externalReference" element
     */
    CTExternalReference addNewExternalReference();

    /**
     * Removes the ith "externalReference" element
     */
    void removeExternalReference(int i);
}
