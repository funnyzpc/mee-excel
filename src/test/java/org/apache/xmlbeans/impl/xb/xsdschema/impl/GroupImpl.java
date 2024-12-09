/*
 * XML Type:  group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Group
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML group(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class GroupImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Group {
    private static final long serialVersionUID = 1L;

    public GroupImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "element"),
        new QName("http://www.w3.org/2001/XMLSchema", "group"),
        new QName("http://www.w3.org/2001/XMLSchema", "all"),
        new QName("http://www.w3.org/2001/XMLSchema", "choice"),
        new QName("http://www.w3.org/2001/XMLSchema", "sequence"),
        new QName("http://www.w3.org/2001/XMLSchema", "any"),
        new QName("", "name"),
        new QName("", "ref"),
        new QName("", "minOccurs"),
        new QName("", "maxOccurs"),
    };


    /**
     * Gets a List of "element" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.LocalElement> getElementList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getElementArray,
                this::setElementArray,
                this::insertNewElement,
                this::removeElement,
                this::sizeOfElementArray
            );
        }
    }

    /**
     * Gets array of all "element" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalElement[] getElementArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.xsdschema.LocalElement[0]);
    }

    /**
     * Gets ith "element" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalElement getElementArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalElement target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalElement)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "element" element
     */
    public int sizeOfElementArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setElementArray(org.apache.xmlbeans.impl.xb.xsdschema.LocalElement[] elementArray) {
        check_orphaned();
        arraySetterHelper(elementArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "element" element
     */
    public void setElementArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.LocalElement element) {
        generatedSetterHelperImpl(element, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalElement insertNewElement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalElement target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalElement)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalElement addNewElement() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalElement target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalElement)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "element" element
     */
    public void removeElement(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "group" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.GroupRef> getGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGroupArray,
                this::setGroupArray,
                this::insertNewGroup,
                this::removeGroup,
                this::sizeOfGroupArray
            );
        }
    }

    /**
     * Gets array of all "group" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef[] getGroupArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.impl.xb.xsdschema.GroupRef[0]);
    }

    /**
     * Gets ith "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef[] groupArray) {
        check_orphaned();
        arraySetterHelper(groupArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group) {
        generatedSetterHelperImpl(group, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef insertNewGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.GroupRef target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.GroupRef)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

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
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xsdschema.All[0]);
    }

    /**
     * Gets ith "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All getAllArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "all" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAllArray(org.apache.xmlbeans.impl.xb.xsdschema.All[] allArray) {
        check_orphaned();
        arraySetterHelper(allArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "all" element
     */
    public void setAllArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.All all) {
        generatedSetterHelperImpl(all, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.All insertNewAll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.All target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().insert_element_user(PROPERTY_QNAME[2], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.All)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "all" element
     */
    public void removeAll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[0]);
    }

    /**
     * Gets ith "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoiceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "choice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChoiceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] choiceArray) {
        check_orphaned();
        arraySetterHelper(choiceArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "choice" element
     */
    public void setChoiceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice) {
        generatedSetterHelperImpl(choice, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewChoice(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().insert_element_user(PROPERTY_QNAME[3], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "choice" element
     */
    public void removeChoice(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
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
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[0]);
    }

    /**
     * Gets ith "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().find_element_user(PROPERTY_QNAME[4], i);
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
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "sequence" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSequenceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] sequenceArray) {
        check_orphaned();
        arraySetterHelper(sequenceArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "sequence" element
     */
    public void setSequenceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().insert_element_user(PROPERTY_QNAME[4], i);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "sequence" element
     */
    public void removeSequence(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "any" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any> getAnyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAnyArray,
                this::setAnyArray,
                this::insertNewAny,
                this::removeAny,
                this::sizeOfAnyArray
            );
        }
    }

    /**
     * Gets array of all "any" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any[] getAnyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any[0]);
    }

    /**
     * Gets ith "any" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any getAnyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "any" element
     */
    public int sizeOfAnyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "any" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAnyArray(org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any[] anyArray) {
        check_orphaned();
        arraySetterHelper(anyArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "any" element
     */
    public void setAnyArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any any) {
        generatedSetterHelperImpl(any, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any insertNewAny(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any addNewAny() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "any" element
     */
    public void removeAny(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(name);
        }
    }

    /**
     * Unsets the "name" attribute
     */
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setQNameValue(ref);
        }
    }

    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.apache.xmlbeans.XmlQName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(ref);
        }
    }

    /**
     * Unsets the "ref" attribute
     */
    public void unsetRef() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "minOccurs" attribute
     */
    public java.math.BigInteger getMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(PROPERTY_QNAME[8]);
            }
            return target;
        }
    }

    /**
     * True if has "minOccurs" attribute
     */
    public boolean isSetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "minOccurs" attribute
     */
    public void setMinOccurs(java.math.BigInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setBigIntegerValue(minOccurs);
        }
    }

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(minOccurs);
        }
    }

    /**
     * Unsets the "minOccurs" attribute
     */
    public void unsetMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "maxOccurs" attribute
     */
    public java.lang.Object getMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.AllNNI xgetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AllNNI target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_default_attribute_value(PROPERTY_QNAME[9]);
            }
            return target;
        }
    }

    /**
     * True if has "maxOccurs" attribute
     */
    public boolean isSetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "maxOccurs" attribute
     */
    public void setMaxOccurs(java.lang.Object maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setObjectValue(maxOccurs);
        }
    }

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    public void xsetMaxOccurs(org.apache.xmlbeans.impl.xb.xsdschema.AllNNI maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.AllNNI target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(maxOccurs);
        }
    }

    /**
     * Unsets the "maxOccurs" attribute
     */
    public void unsetMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }
}
