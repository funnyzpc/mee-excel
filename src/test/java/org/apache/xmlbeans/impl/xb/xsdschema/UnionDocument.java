/*
 * An XML document type.
 * Localname: union
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one union(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface UnionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "union5866doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "union" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union getUnion();

    /**
     * Sets the "union" element
     */
    void setUnion(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union union);

    /**
     * Appends and returns a new empty "union" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union addNewUnion();

    /**
     * An XML union(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface Union extends org.apache.xmlbeans.impl.xb.xsdschema.Annotated {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "union498belemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "simpleType" elements
         */
        java.util.List<org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType> getSimpleTypeList();

        /**
         * Gets array of all "simpleType" elements
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType[] getSimpleTypeArray();

        /**
         * Gets ith "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType getSimpleTypeArray(int i);

        /**
         * Returns number of "simpleType" element
         */
        int sizeOfSimpleTypeArray();

        /**
         * Sets array of all "simpleType" element
         */
        void setSimpleTypeArray(org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType[] simpleTypeArray);

        /**
         * Sets ith "simpleType" element
         */
        void setSimpleTypeArray(int i, org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType simpleType);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType insertNewSimpleType(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "simpleType" element
         */
        org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType addNewSimpleType();

        /**
         * Removes the ith "simpleType" element
         */
        void removeSimpleType(int i);

        /**
         * Gets the "memberTypes" attribute
         */
        java.util.List getMemberTypes();

        /**
         * Gets (as xml) the "memberTypes" attribute
         */
        org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes xgetMemberTypes();

        /**
         * True if has "memberTypes" attribute
         */
        boolean isSetMemberTypes();

        /**
         * Sets the "memberTypes" attribute
         */
        void setMemberTypes(java.util.List memberTypes);

        /**
         * Sets (as xml) the "memberTypes" attribute
         */
        void xsetMemberTypes(org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes memberTypes);

        /**
         * Unsets the "memberTypes" attribute
         */
        void unsetMemberTypes();

        /**
         * An XML memberTypes(@).
         *
         * This is a list type whose items are org.apache.xmlbeans.XmlQName.
         */
        public interface MemberTypes extends org.apache.xmlbeans.XmlAnySimpleType {
            java.util.List getListValue();
            java.util.List xgetListValue();
            void setListValue(java.util.List<?> list);
            ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.UnionDocument.Union.MemberTypes> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "membertypes2404attrtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();

        }
    }
}
