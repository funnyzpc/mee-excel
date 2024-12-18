/*
 * XML Type:  CT_RowFields
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlUnsignedInt;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;


/**
 * An XML CT_RowFields(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTRowFields extends XmlObject {
    DocumentFactory<CTRowFields> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctrowfields0312type");
    SchemaType type = Factory.getType();


    /**
     * Gets a List of "field" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField> getFieldList();

    /**
     * Gets array of all "field" elements
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] getFieldArray();

    /**
     * Gets ith "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField getFieldArray(int i);

    /**
     * Returns number of "field" element
     */
    int sizeOfFieldArray();

    /**
     * Sets array of all "field" element
     */
    void setFieldArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField[] fieldArray);

    /**
     * Sets ith "field" element
     */
    void setFieldArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField field);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField insertNewField(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "field" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField addNewField();

    /**
     * Removes the ith "field" element
     */
    void removeField(int i);

    /**
     * Gets the "count" attribute
     */
    long getCount();

    /**
     * Gets (as xml) the "count" attribute
     */
    XmlUnsignedInt xgetCount();

    /**
     * True if has "count" attribute
     */
    boolean isSetCount();

    /**
     * Sets the "count" attribute
     */
    void setCount(long count);

    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(XmlUnsignedInt count);

    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
}
