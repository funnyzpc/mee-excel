/*
 * An XML document type.
 * Localname: tests
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one tests(@http://www.bea.com/2003/05/xmlbean/ltgfmt) element.
 *
 * This is a complex type.
 */
public interface TestsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "tests5621doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "tests" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests getTests();

    /**
     * Sets the "tests" element
     */
    void setTests(org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests tests);

    /**
     * Appends and returns a new empty "tests" element
     */
    org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests addNewTests();

    /**
     * An XML tests(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public interface Tests extends org.apache.xmlbeans.XmlObject {
        ElementFactory<org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLTOOLS.TypeSystemHolder.typeSystem, "tests9d6eelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "test" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.ltgfmt.TestCase> getTestList();

        /**
         * Gets array of all "test" elements
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.TestCase[] getTestArray();

        /**
         * Gets ith "test" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.TestCase getTestArray(int i);

        /**
         * Returns number of "test" element
         */
        int sizeOfTestArray();

        /**
         * Sets array of all "test" element
         */
        void setTestArray(org.apache.xmlbeans.impl.xb.ltgfmt.TestCase[] testArray);

        /**
         * Sets ith "test" element
         */
        void setTestArray(int i, org.apache.xmlbeans.impl.xb.ltgfmt.TestCase test);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "test" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.TestCase insertNewTest(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "test" element
         */
        org.apache.xmlbeans.impl.xb.ltgfmt.TestCase addNewTest();

        /**
         * Removes the ith "test" element
         */
        void removeTest(int i);
    }
}
