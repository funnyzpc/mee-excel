/*
 * An XML document type.
 * Localname: list
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one list(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface ListDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.ListDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "listcde5doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "list" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List getList();

    /**
     * Sets the "list" element
     */
    void setList(org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List list);

    /**
     * Appends and returns a new empty "list" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List addNewList();

    /**
     * An XML list(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface List extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "list391felemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets the "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleType();

        /**
         * True if has "simpleType" element
         */
        boolean isSetSimpleType();

        /**
         * Sets the "simpleType" element
         */
        void setSimpleType(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType);

        /**
         * Appends and returns a new empty "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType();

        /**
         * Unsets the "simpleType" element
         */
        void unsetSimpleType();

        /**
         * Gets the "itemType" attribute
         */
        javax.xml.namespace.QName getItemType();

        /**
         * Gets (as xml) the "itemType" attribute
         */
        org.apache.xmlbeans.XmlQName xgetItemType();

        /**
         * True if has "itemType" attribute
         */
        boolean isSetItemType();

        /**
         * Sets the "itemType" attribute
         */
        void setItemType(javax.xml.namespace.QName itemType);

        /**
         * Sets (as xml) the "itemType" attribute
         */
        void xsetItemType(org.apache.xmlbeans.XmlQName itemType);

        /**
         * Unsets the "itemType" attribute
         */
        void unsetItemType();
    }
}
