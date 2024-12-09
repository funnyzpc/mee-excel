/*
 * XML Type:  test-case
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.TestCase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML test-case(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public interface TestCase extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.ltgfmt.TestCase> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "testcase939btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();

    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();

    /**
     * True if has "description" element
     */
    boolean isSetDescription();

    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);

    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);

    /**
     * Unsets the "description" element
     */
    void unsetDescription();

    /**
     * Gets the "files" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files getFiles();

    /**
     * Sets the "files" element
     */
    void setFiles(org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files files);

    /**
     * Appends and returns a new empty "files" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files addNewFiles();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "origin" attribute
     */
    java.lang.String getOrigin();

    /**
     * Gets (as xml) the "origin" attribute
     */
    org.apache.xmlbeans.XmlToken xgetOrigin();

    /**
     * True if has "origin" attribute
     */
    boolean isSetOrigin();

    /**
     * Sets the "origin" attribute
     */
    void setOrigin(java.lang.String origin);

    /**
     * Sets (as xml) the "origin" attribute
     */
    void xsetOrigin(org.apache.xmlbeans.XmlToken origin);

    /**
     * Unsets the "origin" attribute
     */
    void unsetOrigin();

    /**
     * Gets the "modified" attribute
     */
    boolean getModified();

    /**
     * Gets (as xml) the "modified" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetModified();

    /**
     * True if has "modified" attribute
     */
    boolean isSetModified();

    /**
     * Sets the "modified" attribute
     */
    void setModified(boolean modified);

    /**
     * Sets (as xml) the "modified" attribute
     */
    void xsetModified(org.apache.xmlbeans.XmlBoolean modified);

    /**
     * Unsets the "modified" attribute
     */
    void unsetModified();

    /**
     * An XML files(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public interface Files extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "files7c3eelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "file" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc> getFileList();

        /**
         * Gets array of all "file" elements
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc[] getFileArray();

        /**
         * Gets ith "file" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc getFileArray(int i);

        /**
         * Returns number of "file" element
         */
        int sizeOfFileArray();

        /**
         * Sets array of all "file" element
         */
        void setFileArray(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc[] fileArray);

        /**
         * Sets ith "file" element
         */
        void setFileArray(int i, org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc file);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "file" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc insertNewFile(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "file" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc addNewFile();

        /**
         * Removes the ith "file" element
         */
        void removeFile(int i);
    }
}
