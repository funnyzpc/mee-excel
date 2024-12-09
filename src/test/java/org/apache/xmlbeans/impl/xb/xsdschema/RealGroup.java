/*
 * XML Type:  realGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.RealGroup
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML realGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface RealGroup extends org.apache.xmlbeans.impl.xb.xsdschema.Group {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.RealGroup> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "realgroup1f64type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "all" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.All> getAllList();

    /**
     * Gets array of all "all" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All[] getAllArray();

    /**
     * Gets ith "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All getAllArray(int i);

    /**
     * Returns number of "all" element
     */
    int sizeOfAllArray();

    /**
     * Sets array of all "all" element
     */
    void setAllArray(org.apache.xmlbeans.impl.xb.xsdschema.All[] allArray);

    /**
     * Sets ith "all" element
     */
    void setAllArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.All all);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All insertNewAll(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "all" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.All addNewAll();

    /**
     * Removes the ith "all" element
     */
    void removeAll(int i);

    /**
     * Gets a List of "choice" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup> getChoiceList();

    /**
     * Gets array of all "choice" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] getChoiceArray();

    /**
     * Gets ith "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getChoiceArray(int i);

    /**
     * Returns number of "choice" element
     */
    int sizeOfChoiceArray();

    /**
     * Sets array of all "choice" element
     */
    void setChoiceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] choiceArray);

    /**
     * Sets ith "choice" element
     */
    void setChoiceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup choice);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewChoice(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewChoice();

    /**
     * Removes the ith "choice" element
     */
    void removeChoice(int i);

    /**
     * Gets a List of "sequence" elements
     */
    java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup> getSequenceList();

    /**
     * Gets array of all "sequence" elements
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] getSequenceArray();

    /**
     * Gets ith "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup getSequenceArray(int i);

    /**
     * Returns number of "sequence" element
     */
    int sizeOfSequenceArray();

    /**
     * Sets array of all "sequence" element
     */
    void setSequenceArray(org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup[] sequenceArray);

    /**
     * Sets ith "sequence" element
     */
    void setSequenceArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup sequence);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup insertNewSequence(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "sequence" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup addNewSequence();

    /**
     * Removes the ith "sequence" element
     */
    void removeSequence(int i);
}
