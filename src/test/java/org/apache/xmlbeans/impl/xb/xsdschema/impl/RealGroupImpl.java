/*
 * XML Type:  realGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RealGroup
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML realGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class RealGroupImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.GroupImpl implements org.apache.xmlbeans.impl.xb.xsdschema.RealGroup {
    private static final long serialVersionUID = 1L;

    public RealGroupImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
    };


    /**
     * Gets a List of "all" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.All> getAllList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAllArray,
                this::setAllArray,
                this::insertNewAll,
                this::removeAll,
                this::sizeOfAllArray
            );
        }
    }

    /**
     * Gets array of all "all" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All[] getAllArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.All[0]);
    }

    /**
     * Gets ith "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All getAllArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "all" element
     */
    public int sizeOfAllArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "all" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAllArray(org.apache.xmlbeans.impl.xb.xsdschema.All[] allArray) {
        check_orphaned();
        arraySetterHelper(allArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "all" element
     */
    public void setAllArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.All all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All insertNewAll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "all" element
     */
    public void removeAll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "choice" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup> getChoiceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getChoiceArray,
                this::setChoiceArray,
                this::insertNewChoice,
                this::removeChoice,
                this::sizeOfChoiceArray
            );
        }
    }

    /**
     * Gets array of all "choice" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] getChoiceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[0]);
    }

    /**
     * Gets ith "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoiceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "choice" element
     */
    public int sizeOfChoiceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "choice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChoiceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] choiceArray) {
        check_orphaned();
        arraySetterHelper(choiceArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "choice" element
     */
    public void setChoiceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice) {
        generatedSetterHelperImpl(choice, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewChoice(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "choice" element
     */
    public void removeChoice(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "sequence" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup> getSequenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSequenceArray,
                this::setSequenceArray,
                this::insertNewSequence,
                this::removeSequence,
                this::sizeOfSequenceArray
            );
        }
    }

    /**
     * Gets array of all "sequence" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] getSequenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[0]);
    }

    /**
     * Gets ith "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sequence" element
     */
    public int sizeOfSequenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "sequence" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSequenceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] sequenceArray) {
        check_orphaned();
        arraySetterHelper(sequenceArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "sequence" element
     */
    public void setSequenceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "sequence" element
     */
    public void removeSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }
}
