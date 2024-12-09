/*
 * XML Type:  all
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.All
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML all(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface All extends org.apache.xmlbeans.impl.xb.xsdschema.ExplicitGroup {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.All> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "all3c04type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * An XML minOccurs(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.All$MinOccurs.
     */
    public interface MinOccurs extends org.apache.xmlbeans.XmlNonNegativeInteger {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.All.MinOccurs> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "minoccurs9283attrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();

    }

    /**
     * An XML maxOccurs(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlNonNegativeInteger
     *     org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member
     */
    public interface MaxOccurs extends org.apache.xmlbeans.impl.xb.xsdschema.AllNNI {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        org.apache.xmlbeans.SchemaType instanceType();
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.All.MaxOccurs> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "maxoccurse8b1attrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();

    }
}
