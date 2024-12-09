/*
 * XML Type:  element
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Element
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML element(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class ElementImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.Element {
    private static final long serialVersionUID = 1L;

    public ElementImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "simpleType"),
        new QName("http://www.w3.org/2001/XMLSchema", "complexType"),
        new QName("http://www.w3.org/2001/XMLSchema", "unique"),
        new QName("http://www.w3.org/2001/XMLSchema", "key"),
        new QName("http://www.w3.org/2001/XMLSchema", "keyref"),
        new QName("", "name"),
        new QName("", "ref"),
        new QName("", "type"),
        new QName("", "substitutionGroup"),
        new QName("", "minOccurs"),
        new QName("", "maxOccurs"),
        new QName("", "default"),
        new QName("", "fixed"),
        new QName("", "nillable"),
        new QName("", "abstract"),
        new QName("", "final"),
        new QName("", "block"),
        new QName("", "form"),
    };


    /**
     * Gets the "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "simpleType" element
     */
    public boolean isSetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "simpleType" element
     */
    public void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType) {
        generatedSetterHelperImpl(simpleType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "simpleType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "simpleType" element
     */
    public void unsetSimpleType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "complexType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType getComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "complexType" element
     */
    public boolean isSetComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "complexType" element
     */
    public void setComplexType(org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType complexType) {
        generatedSetterHelperImpl(complexType, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "complexType" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType addNewComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.LocalComplexType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "complexType" element
     */
    public void unsetComplexType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "unique" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Keybase> getUniqueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUniqueArray,
                this::setUniqueArray,
                this::insertNewUnique,
                this::removeUnique,
                this::sizeOfUniqueArray
            );
        }
    }

    /**
     * Gets array of all "unique" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] getUniqueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.impl.xb.xsdschema.Keybase[0]);
    }

    /**
     * Gets ith "unique" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase getUniqueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "unique" element
     */
    public int sizeOfUniqueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "unique" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUniqueArray(org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] uniqueArray) {
        check_orphaned();
        arraySetterHelper(uniqueArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "unique" element
     */
    public void setUniqueArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Keybase unique) {
        generatedSetterHelperImpl(unique, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "unique" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase insertNewUnique(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "unique" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewUnique() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "unique" element
     */
    public void removeUnique(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "key" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Keybase> getKeyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyArray,
                this::setKeyArray,
                this::insertNewKey,
                this::removeKey,
                this::sizeOfKeyArray
            );
        }
    }

    /**
     * Gets array of all "key" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] getKeyArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.impl.xb.xsdschema.Keybase[0]);
    }

    /**
     * Gets ith "key" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase getKeyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "key" element
     */
    public int sizeOfKeyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "key" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyArray(org.apache.xmlbeans.impl.xb.xsdschema.Keybase[] keyArray) {
        check_orphaned();
        arraySetterHelper(keyArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "key" element
     */
    public void setKeyArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Keybase key) {
        generatedSetterHelperImpl(key, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "key" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase insertNewKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "key" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.Keybase addNewKey() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.Keybase target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.Keybase)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "key" element
     */
    public void removeKey(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "keyref" elements
     */
    public java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref> getKeyrefList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getKeyrefArray,
                this::setKeyrefArray,
                this::insertNewKeyref,
                this::removeKeyref,
                this::sizeOfKeyrefArray
            );
        }
    }

    /**
     * Gets array of all "keyref" elements
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref[] getKeyrefArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref[0]);
    }

    /**
     * Gets ith "keyref" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref getKeyrefArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "keyref" element
     */
    public int sizeOfKeyrefArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "keyref" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKeyrefArray(org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref[] keyrefArray) {
        check_orphaned();
        arraySetterHelper(keyrefArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "keyref" element
     */
    public void setKeyrefArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref keyref) {
        generatedSetterHelperImpl(keyref, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyref" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref insertNewKeyref(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "keyref" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref addNewKeyref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument.Keyref)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "keyref" element
     */
    public void removeKeyref(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[5]);
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
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "ref" attribute
     */
    public javax.xml.namespace.QName getRef() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "ref" attribute
     */
    public boolean isSetRef() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "ref" attribute
     */
    public void setRef(javax.xml.namespace.QName ref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[6]);
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
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "type" attribute
     */
    public javax.xml.namespace.QName getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    public void setType(javax.xml.namespace.QName type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setQNameValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlQName type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "substitutionGroup" attribute
     */
    public javax.xml.namespace.QName getSubstitutionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getQNameValue();
        }
    }

    /**
     * Gets (as xml) the "substitutionGroup" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSubstitutionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "substitutionGroup" attribute
     */
    public boolean isSetSubstitutionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "substitutionGroup" attribute
     */
    public void setSubstitutionGroup(javax.xml.namespace.QName substitutionGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setQNameValue(substitutionGroup);
        }
    }

    /**
     * Sets (as xml) the "substitutionGroup" attribute
     */
    public void xsetSubstitutionGroup(org.apache.xmlbeans.XmlQName substitutionGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(substitutionGroup);
        }
    }

    /**
     * Unsets the "substitutionGroup" attribute
     */
    public void unsetSubstitutionGroup() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "minOccurs" attribute
     */
    public java.math.BigInteger getMinOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[9]);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(PROPERTY_QNAME[9]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "minOccurs" attribute
     */
    public void setMinOccurs(java.math.BigInteger minOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
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
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(PROPERTY_QNAME[9]);
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
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "maxOccurs" attribute
     */
    public java.lang.Object getMaxOccurs() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[10]);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_default_attribute_value(PROPERTY_QNAME[10]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "maxOccurs" attribute
     */
    public void setMaxOccurs(java.lang.Object maxOccurs) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
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
            target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.AllNNI)get_store().add_attribute_user(PROPERTY_QNAME[10]);
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
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setStringValue(xdefault);
        }
    }

    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(xdefault);
        }
    }

    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "fixed" attribute
     */
    public java.lang.String getFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fixed" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "fixed" attribute
     */
    public boolean isSetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "fixed" attribute
     */
    public void setFixed(java.lang.String fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(fixed);
        }
    }

    /**
     * Sets (as xml) the "fixed" attribute
     */
    public void xsetFixed(org.apache.xmlbeans.XmlString fixed) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(fixed);
        }
    }

    /**
     * Unsets the "fixed" attribute
     */
    public void unsetFixed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "nillable" attribute
     */
    public boolean getNillable() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[13]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "nillable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNillable() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[13]);
            }
            return target;
        }
    }

    /**
     * True if has "nillable" attribute
     */
    public boolean isSetNillable() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "nillable" attribute
     */
    public void setNillable(boolean nillable) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setBooleanValue(nillable);
        }
    }

    /**
     * Sets (as xml) the "nillable" attribute
     */
    public void xsetNillable(org.apache.xmlbeans.XmlBoolean nillable) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(nillable);
        }
    }

    /**
     * Unsets the "nillable" attribute
     */
    public void unsetNillable() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "abstract" attribute
     */
    public boolean getAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[14]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "abstract" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[14]);
            }
            return target;
        }
    }

    /**
     * True if has "abstract" attribute
     */
    public boolean isSetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "abstract" attribute
     */
    public void setAbstract(boolean xabstract) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setBooleanValue(xabstract);
        }
    }

    /**
     * Sets (as xml) the "abstract" attribute
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(xabstract);
        }
    }

    /**
     * Unsets the "abstract" attribute
     */
    public void unsetAbstract() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "final" attribute
     */
    public java.lang.Object getFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "final" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "final" attribute
     */
    public boolean isSetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "final" attribute
     */
    public void setFinal(java.lang.Object xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setObjectValue(xfinal);
        }
    }

    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(xfinal);
        }
    }

    /**
     * Unsets the "final" attribute
     */
    public void unsetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "block" attribute
     */
    public java.lang.Object getBlock() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "block" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.BlockSet xgetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.BlockSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "block" attribute
     */
    public boolean isSetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "block" attribute
     */
    public void setBlock(java.lang.Object block) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setObjectValue(block);
        }
    }

    /**
     * Sets (as xml) the "block" attribute
     */
    public void xsetBlock(org.apache.xmlbeans.impl.xb.xsdschema.BlockSet block) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.BlockSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.BlockSet)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(block);
        }
    }

    /**
     * Unsets the "block" attribute
     */
    public void unsetBlock() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "form" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum getForm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? null : (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "form" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.FormChoice xgetForm() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "form" attribute
     */
    public boolean isSetForm() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "form" attribute
     */
    public void setForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.Enum form) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setEnumValue(form);
        }
    }

    /**
     * Sets (as xml) the "form" attribute
     */
    public void xsetForm(org.apache.xmlbeans.impl.xb.xsdschema.FormChoice form) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.FormChoice target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.FormChoice)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(form);
        }
    }

    /**
     * Unsets the "form" attribute
     */
    public void unsetForm() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }
}
