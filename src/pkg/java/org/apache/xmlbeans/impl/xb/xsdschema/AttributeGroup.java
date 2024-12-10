/*
 * XML Type:  attributeGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroup
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML attributeGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface AttributeGroup extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    AbstractDocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroup> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "attributegroupe530type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "attribute" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.Attribute> getAttributeList();

    /**
     * Gets array of all "attribute" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] getAttributeArray();

    /**
     * Gets ith "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute getAttributeArray(int i);

    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();

    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(org.apache.xmlbeans.impl.xb.xsdschema.Attribute[] attributeArray);

    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.Attribute attribute);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute insertNewAttribute(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Attribute addNewAttribute();

    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);

    /**
     * Gets a List of "attributeGroup" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef> getAttributeGroupList();

    /**
     * Gets array of all "attributeGroup" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] getAttributeGroupArray();

    /**
     * Gets ith "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef getAttributeGroupArray(int i);

    /**
     * Returns number of "attributeGroup" element
     */
    int sizeOfAttributeGroupArray();

    /**
     * Sets array of all "attributeGroup" element
     */
    void setAttributeGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef[] attributeGroupArray);

    /**
     * Sets ith "attributeGroup" element
     */
    void setAttributeGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef attributeGroup);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef insertNewAttributeGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "attributeGroup" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef addNewAttributeGroup();

    /**
     * Removes the ith "attributeGroup" element
     */
    void removeAttributeGroup(int i);

    /**
     * Gets the "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard getAnyAttribute();

    /**
     * True if has "anyAttribute" element
     */
    boolean isSetAnyAttribute();

    /**
     * Sets the "anyAttribute" element
     */
    void setAnyAttribute(org.apache.xmlbeans.impl.xb.xsdschema.Wildcard anyAttribute);

    /**
     * Appends and returns a new empty "anyAttribute" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.Wildcard addNewAnyAttribute();

    /**
     * Unsets the "anyAttribute" element
     */
    void unsetAnyAttribute();

    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();

    /**
     * True if has "name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);

    /**
     * Unsets the "name" attribute
     */
    void unsetName();

    /**
     * Gets the "ref" attribute
     */
    javax.xml.namespace.QName getRef();

    /**
     * Gets (as xml) the "ref" attribute
     */
    org.apache.xmlbeans.XmlQName xgetRef();

    /**
     * True if has "ref" attribute
     */
    boolean isSetRef();

    /**
     * Sets the "ref" attribute
     */
    void setRef(javax.xml.namespace.QName ref);

    /**
     * Sets (as xml) the "ref" attribute
     */
    void xsetRef(org.apache.xmlbeans.XmlQName ref);

    /**
     * Unsets the "ref" attribute
     */
    void unsetRef();
}
