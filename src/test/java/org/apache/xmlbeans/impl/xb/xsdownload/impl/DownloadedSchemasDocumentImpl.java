/*
 * An XML document type.
 * Localname: downloaded-schemas
 * Namespace: http://www.bea.com/2003/01/xmlbean/xsdownload
 * Java type: org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdownload.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one downloaded-schemas(@http://www.bea.com/2003/01/xmlbean/xsdownload) element.
 *
 * This is a complex type.
 */
public class DownloadedSchemasDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument {
    private static final long serialVersionUID = 1L;

    public DownloadedSchemasDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "downloaded-schemas"),
    };


    /**
     * Gets the "downloaded-schemas" element
     */
    public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas getDownloadedSchemas() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "downloaded-schemas" element
     */
    public void setDownloadedSchemas(org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas downloadedSchemas) {
        generatedSetterHelperImpl(downloadedSchemas, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "downloaded-schemas" element
     */
    public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas addNewDownloadedSchemas() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML downloaded-schemas(@http://www.bea.com/2003/01/xmlbean/xsdownload).
     *
     * This is a complex type.
     */
    public static class DownloadedSchemasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemasDocument.DownloadedSchemas {
        private static final long serialVersionUID = 1L;

        public DownloadedSchemasImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "entry"),
            new QName("", "defaultDirectory"),
        };


        /**
         * Gets a List of "entry" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry> getEntryList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getEntryArray,
                    this::setEntryArray,
                    this::insertNewEntry,
                    this::removeEntry,
                    this::sizeOfEntryArray
                );
            }
        }

        /**
         * Gets array of all "entry" elements
         */
        public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry[] getEntryArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry[0]);
        }

        /**
         * Gets ith "entry" element
         */
        public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry getEntryArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "entry" element
         */
        public int sizeOfEntryArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "entry" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntryArray(org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry[] entryArray) {
            check_orphaned();
            arraySetterHelper(entryArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "entry" element
         */
        public void setEntryArray(int i, org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry entry) {
            generatedSetterHelperImpl(entry, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "entry" element
         */
        public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry insertNewEntry(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "entry" element
         */
        public org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry addNewEntry() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry target = null;
                target = (org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "entry" element
         */
        public void removeEntry(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "defaultDirectory" attribute
         */
        public java.lang.String getDefaultDirectory() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "defaultDirectory" attribute
         */
        public org.apache.xmlbeans.XmlToken xgetDefaultDirectory() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * True if has "defaultDirectory" attribute
         */
        public boolean isSetDefaultDirectory() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "defaultDirectory" attribute
         */
        public void setDefaultDirectory(java.lang.String defaultDirectory) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setStringValue(defaultDirectory);
            }
        }

        /**
         * Sets (as xml) the "defaultDirectory" attribute
         */
        public void xsetDefaultDirectory(org.apache.xmlbeans.XmlToken defaultDirectory) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlToken target = null;
                target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(defaultDirectory);
            }
        }

        /**
         * Unsets the "defaultDirectory" attribute
         */
        public void unsetDefaultDirectory() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
    }
}
