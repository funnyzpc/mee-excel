/*
 * XML Type:  downloaded-schema-entry
 * Namespace: http://www.bea.com/2003/01/xmlbean/xsdownload
 * Java type: org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdownload.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML downloaded-schema-entry(@http://www.bea.com/2003/01/xmlbean/xsdownload).
 *
 * This is a complex type.
 */
public class DownloadedSchemaEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.xsdownload.DownloadedSchemaEntry {
    private static final long serialVersionUID = 1L;

    public DownloadedSchemaEntryImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "filename"),
        new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "sha1"),
        new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "schemaLocation"),
        new QName("http://www.bea.com/2003/01/xmlbean/xsdownload", "namespace"),
    };


    /**
     * Gets the "filename" element
     */
    public java.lang.String getFilename() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "filename" element
     */
    public org.apache.xmlbeans.XmlToken xgetFilename() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "filename" element
     */
    public void setFilename(java.lang.String filename) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(filename);
        }
    }

    /**
     * Sets (as xml) the "filename" element
     */
    public void xsetFilename(org.apache.xmlbeans.XmlToken filename) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(filename);
        }
    }

    /**
     * Gets the "sha1" element
     */
    public java.lang.String getSha1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "sha1" element
     */
    public org.apache.xmlbeans.XmlToken xgetSha1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "sha1" element
     */
    public void setSha1(java.lang.String sha1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(sha1);
        }
    }

    /**
     * Sets (as xml) the "sha1" element
     */
    public void xsetSha1(org.apache.xmlbeans.XmlToken sha1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(sha1);
        }
    }

    /**
     * Gets a List of "schemaLocation" elements
     */
    public java.util.List<java.lang.String> getSchemaLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSchemaLocationArray,
                this::setSchemaLocationArray,
                this::insertSchemaLocation,
                this::removeSchemaLocation,
                this::sizeOfSchemaLocationArray
            );
        }
    }

    /**
     * Gets array of all "schemaLocation" elements
     */
    public java.lang.String[] getSchemaLocationArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "schemaLocation" element
     */
    public java.lang.String getSchemaLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "schemaLocation" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetSchemaLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSchemaLocationArray,
                this::xsetSchemaLocationArray,
                this::insertNewSchemaLocation,
                this::removeSchemaLocation,
                this::sizeOfSchemaLocationArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "schemaLocation" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetSchemaLocationArray() {
        return xgetArray(PROPERTY_QNAME[2], org.apache.xmlbeans.XmlAnyURI[]::new);
    }

    /**
     * Gets (as xml) ith "schemaLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSchemaLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "schemaLocation" element
     */
    public int sizeOfSchemaLocationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "schemaLocation" element
     */
    public void setSchemaLocationArray(java.lang.String[] schemaLocationArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(schemaLocationArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "schemaLocation" element
     */
    public void setSchemaLocationArray(int i, java.lang.String schemaLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(schemaLocation);
        }
    }

    /**
     * Sets (as xml) array of all "schemaLocation" element
     */
    public void xsetSchemaLocationArray(org.apache.xmlbeans.XmlAnyURI[]schemaLocationArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(schemaLocationArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "schemaLocation" element
     */
    public void xsetSchemaLocationArray(int i, org.apache.xmlbeans.XmlAnyURI schemaLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(schemaLocation);
        }
    }

    /**
     * Inserts the value as the ith "schemaLocation" element
     */
    public void insertSchemaLocation(int i, java.lang.String schemaLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(schemaLocation);
        }
    }

    /**
     * Appends the value as the last "schemaLocation" element
     */
    public void addSchemaLocation(java.lang.String schemaLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(schemaLocation);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "schemaLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewSchemaLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "schemaLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewSchemaLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "schemaLocation" element
     */
    public void removeSchemaLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "namespace" element
     */
    public java.lang.String getNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "namespace" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "namespace" element
     */
    public boolean isSetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "namespace" element
     */
    public void setNamespace(java.lang.String namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(namespace);
        }
    }

    /**
     * Sets (as xml) the "namespace" element
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(namespace);
        }
    }

    /**
     * Unsets the "namespace" element
     */
    public void unsetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
}
