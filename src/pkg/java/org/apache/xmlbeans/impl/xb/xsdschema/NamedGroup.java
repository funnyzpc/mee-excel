/*
 * XML Type:  namedGroup
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML namedGroup(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface NamedGroup extends org.apache.xmlbeans.impl.xb.xsdschema.RealGroup {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "namedgroup878dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * An XML all(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface All extends org.apache.xmlbeans.impl.xb.xsdschema.All {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup.All> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "all82daelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();

    }
}
