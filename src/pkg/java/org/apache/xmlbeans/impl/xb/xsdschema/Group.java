/*
 * XML Type:  group
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Group
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML group(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Group extends Annotated {
    AbstractDocumentFactory<Group> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "group7ca6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "element" elements
     */
    java.util.List<LocalElement> getElementList();

    /**
     * Gets array of all "element" elements
     */
    LocalElement[] getElementArray();

    /**
     * Gets ith "element" element
     */
    LocalElement getElementArray(int i);

    /**
     * Returns number of "element" element
     */
    int sizeOfElementArray();

    /**
     * Sets array of all "element" element
     */
    void setElementArray(LocalElement[] elementArray);

    /**
     * Sets ith "element" element
     */
    void setElementArray(int i, LocalElement element);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    LocalElement insertNewElement(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    LocalElement addNewElement();

    /**
     * Removes the ith "element" element
     */
    void removeElement(int i);

    /**
     * Gets a List of "group" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.GroupRef> getGroupList();

    /**
     * Gets array of all "group" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef[] getGroupArray();

    /**
     * Gets ith "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef getGroupArray(int i);

    /**
     * Returns number of "group" element
     */
    int sizeOfGroupArray();

    /**
     * Sets array of all "group" element
     */
    void setGroupArray(org.apache.xmlbeans.impl.xb.xsdschema.GroupRef[] groupArray);

    /**
     * Sets ith "group" element
     */
    void setGroupArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.GroupRef group);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef insertNewGroup(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.GroupRef addNewGroup();

    /**
     * Removes the ith "group" element
     */
    void removeGroup(int i);

    /**
     * Gets a List of "all" elements
     */
    java.util.List<All> getAllList();

    /**
     * Gets array of all "all" elements
     */
    All[] getAllArray();

    /**
     * Gets ith "all" element
     */
    All getAllArray(int i);

    /**
     * Returns number of "all" element
     */
    int sizeOfAllArray();

    /**
     * Sets array of all "all" element
     */
    void setAllArray(All[] allArray);

    /**
     * Sets ith "all" element
     */
    void setAllArray(int i, All all);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    All insertNewAll(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "all" element
     */
    All addNewAll();

    /**
     * Removes the ith "all" element
     */
    void removeAll(int i);

    /**
     * Gets a List of "choice" elements
     */
    java.util.List<ExplicitGroup> getChoiceList();

    /**
     * Gets array of all "choice" elements
     */
    ExplicitGroup[] getChoiceArray();

    /**
     * Gets ith "choice" element
     */
    ExplicitGroup getChoiceArray(int i);

    /**
     * Returns number of "choice" element
     */
    int sizeOfChoiceArray();

    /**
     * Sets array of all "choice" element
     */
    void setChoiceArray(ExplicitGroup[] choiceArray);

    /**
     * Sets ith "choice" element
     */
    void setChoiceArray(int i, ExplicitGroup choice);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    ExplicitGroup insertNewChoice(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    ExplicitGroup addNewChoice();

    /**
     * Removes the ith "choice" element
     */
    void removeChoice(int i);

    /**
     * Gets a List of "sequence" elements
     */
    java.util.List<ExplicitGroup> getSequenceList();

    /**
     * Gets array of all "sequence" elements
     */
    ExplicitGroup[] getSequenceArray();

    /**
     * Gets ith "sequence" element
     */
    ExplicitGroup getSequenceArray(int i);

    /**
     * Returns number of "sequence" element
     */
    int sizeOfSequenceArray();

    /**
     * Sets array of all "sequence" element
     */
    void setSequenceArray(ExplicitGroup[] sequenceArray);

    /**
     * Sets ith "sequence" element
     */
    void setSequenceArray(int i, ExplicitGroup sequence);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    ExplicitGroup insertNewSequence(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sequence" element
     */
    ExplicitGroup addNewSequence();

    /**
     * Removes the ith "sequence" element
     */
    void removeSequence(int i);

    /**
     * Gets a List of "any" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any> getAnyList();

    /**
     * Gets array of all "any" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any[] getAnyArray();

    /**
     * Gets ith "any" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any getAnyArray(int i);

    /**
     * Returns number of "any" element
     */
    int sizeOfAnyArray();

    /**
     * Sets array of all "any" element
     */
    void setAnyArray(org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any[] anyArray);

    /**
     * Sets ith "any" element
     */
    void setAnyArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any any);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any insertNewAny(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.AnyDocument.Any addNewAny();

    /**
     * Removes the ith "any" element
     */
    void removeAny(int i);

    /**
     * Gets the "name" attribute
     */
    String getName();

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
    void setName(String name);

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

    /**
     * Gets the "minOccurs" attribute
     */
    java.math.BigInteger getMinOccurs();

    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();

    /**
     * True if has "minOccurs" attribute
     */
    boolean isSetMinOccurs();

    /**
     * Sets the "minOccurs" attribute
     */
    void setMinOccurs(java.math.BigInteger minOccurs);

    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);

    /**
     * Unsets the "minOccurs" attribute
     */
    void unsetMinOccurs();

    /**
     * Gets the "maxOccurs" attribute
     */
    Object getMaxOccurs();

    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    AllNNI xgetMaxOccurs();

    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();

    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(Object maxOccurs);

    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(AllNNI maxOccurs);

    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();
}
