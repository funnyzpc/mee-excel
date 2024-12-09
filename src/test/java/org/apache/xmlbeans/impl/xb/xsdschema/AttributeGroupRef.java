/*
 * XML Type:  attributeGroupRef
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML attributeGroupRef(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public interface AttributeGroupRef extends org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroup {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.AttributeGroupRef> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "attributegroupref8375type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
