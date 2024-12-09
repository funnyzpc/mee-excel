/*
 * XML Type:  simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML simpleType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class SimpleTypeImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.AnnotatedImpl implements org.apache.xmlbeans.impl.xb.xsdschema.SimpleType {
    private static final long serialVersionUID = 1L;

    public SimpleTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.w3.org/2001/XMLSchema", "restriction"),
        new QName("http://www.w3.org/2001/XMLSchema", "list"),
        new QName("http://www.w3.org/2001/XMLSchema", "union"),
        new QName("", "final"),
        new QName("", "name"),
    };


    /**
     * Gets the "restriction" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction getRestriction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "restriction" element
     */
    public boolean isSetRestriction() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "restriction" element
     */
    public void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction restriction) {
        generatedSetterHelperImpl(restriction, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "restriction" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction addNewRestriction() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "restriction" element
     */
    public void unsetRestriction() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "list" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List getList() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "list" element
     */
    public boolean isSetList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "list" element
     */
    public void setList(org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List list) {
        generatedSetterHelperImpl(list, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "list" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List addNewList() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "list" element
     */
    public void unsetList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "union" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union getUnion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "union" element
     */
    public boolean isSetUnion() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "union" element
     */
    public void setUnion(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union union) {
        generatedSetterHelperImpl(union, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "union" element
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union addNewUnion() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "union" element
     */
    public void unsetUnion() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "final" attribute
     */
    public java.lang.Object getFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getObjectValue();
        }
    }

    /**
     * Gets (as xml) the "final" attribute
     */
    public org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet xgetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "final" attribute
     */
    public boolean isSetFinal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "final" attribute
     */
    public void setFinal(java.lang.Object xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setObjectValue(xfinal);
        }
    }

    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet xfinal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet target = null;
            target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet)get_store().add_attribute_user(PROPERTY_QNAME[3]);
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
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "name" attribute
     */
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PROPERTY_QNAME[4]);
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
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }
}
