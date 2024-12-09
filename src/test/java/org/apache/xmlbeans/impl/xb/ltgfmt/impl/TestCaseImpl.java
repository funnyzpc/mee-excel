/*
 * XML Type:  test-case
 * Namespace: http://www.bea.com/2003/05/xmlbean/ltgfmt
 * Java type: org.apache.xmlbeans.impl.xb.ltgfmt.TestCase
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.ltgfmt.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML test-case(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
 *
 * This is a complex type.
 */
public class TestCaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.ltgfmt.TestCase {
    private static final long serialVersionUID = 1L;

    public TestCaseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "description"),
        new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "files"),
        new QName("", "id"),
        new QName("", "origin"),
        new QName("", "modified"),
    };


    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "description" element
     */
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(description);
        }
    }

    /**
     * Unsets the "description" element
     */
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "files" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files getFiles() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "files" element
     */
    public void setFiles(org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files files) {
        generatedSetterHelperImpl(files, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "files" element
     */
    public org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files addNewFiles() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files target = null;
            target = (org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "origin" attribute
     */
    public java.lang.String getOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.apache.xmlbeans.XmlToken xgetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(java.lang.String origin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(origin);
        }
    }

    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlToken origin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(origin);
        }
    }

    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "modified" attribute
     */
    public boolean getModified() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "modified" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetModified() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "modified" attribute
     */
    public boolean isSetModified() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "modified" attribute
     */
    public void setModified(boolean modified) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setBooleanValue(modified);
        }
    }

    /**
     * Sets (as xml) the "modified" attribute
     */
    public void xsetModified(org.apache.xmlbeans.XmlBoolean modified) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(modified);
        }
    }

    /**
     * Unsets the "modified" attribute
     */
    public void unsetModified() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
    /**
     * An XML files(@http://www.bea.com/2003/05/xmlbean/ltgfmt).
     *
     * This is a complex type.
     */
    public static class FilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files {
        private static final long serialVersionUID = 1L;

        public FilesImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.bea.com/2003/05/xmlbean/ltgfmt", "file"),
        };


        /**
         * Gets a List of "file" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc> getFileList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getFileArray,
                    this::setFileArray,
                    this::insertNewFile,
                    this::removeFile,
                    this::sizeOfFileArray
                );
            }
        }

        /**
         * Gets array of all "file" elements
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc[] getFileArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc[0]);
        }

        /**
         * Gets ith "file" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc getFileArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "file" element
         */
        public int sizeOfFileArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "file" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFileArray(org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc[] fileArray) {
            check_orphaned();
            arraySetterHelper(fileArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "file" element
         */
        public void setFileArray(int i, org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc file) {
            generatedSetterHelperImpl(file, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "file" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc insertNewFile(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "file" element
         */
        public org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc addNewFile() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc target = null;
                target = (org.apache.xmlbeans.impl.xb.ltgfmt.FileDesc)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "file" element
         */
        public void removeFile(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
    }
}
