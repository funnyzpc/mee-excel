/*
 * An XML document type.
 * Localname: tests
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one tests(@http://www.bea.com/2003/05/xmlbean/ltgfmt) element.
 *
 * This is a complex type.
 */
public class TestsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument {
    private static final long serialVersionUID = 1L;

    public TestsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "tests"),
    };


    /**
     * Gets the "tests" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests getTests() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "tests" element
     */
    public void setTests(org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests tests) {
        generatedSetterHelperImpl(tests, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "tests" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests addNewTests() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML tests(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public static class TestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.ltgfmt.TestsDocument.Tests {
        private static final long serialVersionUID = 1L;

        public TestsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "test"),
        };


        /**
         * Gets a List of "test" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.ltgfmt.TestCase> getTestList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getTestArray,
                    this::setTestArray,
                    this::insertNewTest,
                    this::removeTest,
                    this::sizeOfTestArray
                );
            }
        }

        /**
         * Gets array of all "test" elements
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase[] getTestArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.ltgfmt.TestCase[0]);
        }

        /**
         * Gets ith "test" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase getTestArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.TestCase target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestCase)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "test" element
         */
        public int sizeOfTestArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "test" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTestArray(org.apache.xmlbeans.impl.xb.ltgfmt.TestCase[] testArray) {
            check_orphaned();
            arraySetterHelper(testArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "test" element
         */
        public void setTestArray(int i, org.apache.xmlbeans.impl.xb.ltgfmt.TestCase test) {
            generatedSetterHelperImpl(test, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "test" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase insertNewTest(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.TestCase target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestCase)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "test" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase addNewTest() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.TestCase target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestCase)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "test" element
         */
        public void removeTest(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
    }
}
