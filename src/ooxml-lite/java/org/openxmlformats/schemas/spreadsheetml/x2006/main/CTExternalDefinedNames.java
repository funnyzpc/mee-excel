/*
 * XML Type:  CT_ExternalDefinedNames
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_ExternalDefinedNames(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTExternalDefinedNames extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<CTExternalDefinedNames> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctexternaldefinednamesccf3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets array of all "definedName" elements
     */
    CTExternalDefinedName[] getDefinedNameArray();

    /**
     * Gets ith "definedName" element
     */
    CTExternalDefinedName getDefinedNameArray(int i);

    /**
     * Returns number of "definedName" element
     */
    int sizeOfDefinedNameArray();

    /**
     * Sets ith "definedName" element
     */
    void setDefinedNameArray(int i, CTExternalDefinedName definedName);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "definedName" element
     */
    CTExternalDefinedName insertNewDefinedName(int i);


    /**
     * Removes the ith "definedName" element
     */
    void removeDefinedName(int i);
}
