/*
 * XML Type:  complexType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ComplexType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML complexType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface ComplexType extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    AbstractDocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ComplexType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "complextype5dbbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "simpleContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent getSimpleContent();

    /**
     * True if has "simpleContent" element
     */
    boolean isSetSimpleContent();

    /**
     * Sets the "simpleContent" element
     */
    void setSimpleContent(org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent simpleContent);

    /**
     * Appends and returns a new empty "simpleContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SimpleContentDocument.SimpleContent addNewSimpleContent();

    /**
     * Unsets the "simpleContent" element
     */
    void unsetSimpleContent();

    /**
     * Gets the "complexContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent getComplexContent();

    /**
     * True if has "complexContent" element
     */
    boolean isSetComplexContent();

    /**
     * Sets the "complexContent" element
     */
    void setComplexContent(org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent complexContent);

    /**
     * Appends and returns a new empty "complexContent" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ComplexContentDocument.ComplexContent addNewComplexContent();

    /**
     * Unsets the "complexContent" element
     */
    void unsetComplexContent();

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
     * Gets the "mixed" attribute
     */
    boolean getMixed();

    /**
     * Gets (as xml) the "mixed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMixed();

    /**
     * True if has "mixed" attribute
     */
    boolean isSetMixed();

    /**
     * Sets the "mixed" attribute
     */
    void setMixed(boolean mixed);

    /**
     * Sets (as xml) the "mixed" attribute
     */
    void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed);

    /**
     * Unsets the "mixed" attribute
     */
    void unsetMixed();

    /**
     * Gets the "abstract" attribute
     */
    boolean getAbstract();

    /**
     * Gets (as xml) the "abstract" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAbstract();

    /**
     * True if has "abstract" attribute
     */
    boolean isSetAbstract();

    /**
     * Sets the "abstract" attribute
     */
    void setAbstract(boolean xabstract);

    /**
     * Sets (as xml) the "abstract" attribute
     */
    void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract);

    /**
     * Unsets the "abstract" attribute
     */
    void unsetAbstract();

    /**
     * Gets the "final" attribute
     */
    java.lang.Object getFinal();

    /**
     * Gets (as xml) the "final" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetFinal();

    /**
     * True if has "final" attribute
     */
    boolean isSetFinal();

    /**
     * Sets the "final" attribute
     */
    void setFinal(java.lang.Object xfinal);

    /**
     * Sets (as xml) the "final" attribute
     */
    void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xfinal);

    /**
     * Unsets the "final" attribute
     */
    void unsetFinal();

    /**
     * Gets the "block" attribute
     */
    java.lang.Object getBlock();

    /**
     * Gets (as xml) the "block" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet xgetBlock();

    /**
     * True if has "block" attribute
     */
    boolean isSetBlock();

    /**
     * Sets the "block" attribute
     */
    void setBlock(java.lang.Object block);

    /**
     * Sets (as xml) the "block" attribute
     */
    void xsetBlock(org.apache.xmlbeans.impl.xb.xsdschema.DerivationSet block);

    /**
     * Unsets the "block" attribute
     */
    void unsetBlock();
}
