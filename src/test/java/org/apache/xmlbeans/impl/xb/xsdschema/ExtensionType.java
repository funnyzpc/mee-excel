/*
 * XML Type:  extensionType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML extensionType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface ExtensionType extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ExtensionType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "extensiontypeed4ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroup();

    /**
     * True if has "group" element
     */
    boolean isSetGroup();

    /**
     * Sets the "group" element
     */
    void setGroup(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group);

    /**
     * Appends and returns a new empty "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup();

    /**
     * Unsets the "group" element
     */
    void unsetGroup();

    /**
     * Gets the "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All getAll();

    /**
     * True if has "all" element
     */
    boolean isSetAll();

    /**
     * Sets the "all" element
     */
    void setAll(org.apache.xmlbeans.impl.xb.xsdschema.All all);

    /**
     * Appends and returns a new empty "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll();

    /**
     * Unsets the "all" element
     */
    void unsetAll();

    /**
     * Gets the "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoice();

    /**
     * True if has "choice" element
     */
    boolean isSetChoice();

    /**
     * Sets the "choice" element
     */
    void setChoice(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice);

    /**
     * Appends and returns a new empty "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice();

    /**
     * Unsets the "choice" element
     */
    void unsetChoice();

    /**
     * Gets the "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequence();

    /**
     * True if has "sequence" element
     */
    boolean isSetSequence();

    /**
     * Sets the "sequence" element
     */
    void setSequence(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence);

    /**
     * Appends and returns a new empty "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence();

    /**
     * Unsets the "sequence" element
     */
    void unsetSequence();

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
     * Gets the "base" attribute
     */
    javax.xml.namespace.QName getBase();

    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlQName xgetBase();

    /**
     * Sets the "base" attribute
     */
    void setBase(javax.xml.namespace.QName base);

    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlQName base);
}
