/*
 * XML Type:  facet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.Facet
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML facet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface Facet extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.Facet> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "facet446etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "value" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getValue();

    /**
     * Sets the "value" attribute
     */
    void setValue(org.apache.xmlbeans.XmlAnySimpleType value);

    /**
     * Appends and returns a new empty "value" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewValue();

    /**
     * Gets the "fixed" attribute
     */
    boolean getFixed();

    /**
     * Gets (as xml) the "fixed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFixed();

    /**
     * True if has "fixed" attribute
     */
    boolean isSetFixed();

    /**
     * Sets the "fixed" attribute
     */
    void setFixed(boolean fixed);

    /**
     * Sets (as xml) the "fixed" attribute
     */
    void xsetFixed(org.apache.xmlbeans.XmlBoolean fixed);

    /**
     * Unsets the "fixed" attribute
     */
    void unsetFixed();
}
