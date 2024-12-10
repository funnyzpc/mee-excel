/*
 * XML Type:  simpleType
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleType
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML simpleType(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface SimpleType extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    AbstractDocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.SimpleType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "simpletype0707type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "restriction" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction getRestriction();

    /**
     * True if has "restriction" element
     */
    boolean isSetRestriction();

    /**
     * Sets the "restriction" element
     */
    void setRestriction(org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction restriction);

    /**
     * Appends and returns a new empty "restriction" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.RestrictionDocument.Restriction addNewRestriction();

    /**
     * Unsets the "restriction" element
     */
    void unsetRestriction();

    /**
     * Gets the "list" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List getList();

    /**
     * True if has "list" element
     */
    boolean isSetList();

    /**
     * Sets the "list" element
     */
    void setList(org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List list);

    /**
     * Appends and returns a new empty "list" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List addNewList();

    /**
     * Unsets the "list" element
     */
    void unsetList();

    /**
     * Gets the "union" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union getUnion();

    /**
     * True if has "union" element
     */
    boolean isSetUnion();

    /**
     * Sets the "union" element
     */
    void setUnion(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union union);

    /**
     * Appends and returns a new empty "union" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union addNewUnion();

    /**
     * Unsets the "union" element
     */
    void unsetUnion();

    /**
     * Gets the "final" attribute
     */
    java.lang.Object getFinal();

    /**
     * Gets (as xml) the "final" attribute
     */
    org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet xgetFinal();

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
    void xsetFinal(org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet xfinal);

    /**
     * Unsets the "final" attribute
     */
    void unsetFinal();

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
}
