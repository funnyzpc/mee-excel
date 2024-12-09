/*
 * An XML document type.
 * Localname: whiteSpace
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one whiteSpace(@http://www.w3.org/2001/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface WhiteSpaceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "whitespaced2c6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "whiteSpace" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace getWhiteSpace();

    /**
     * Sets the "whiteSpace" element
     */
    void setWhiteSpace(org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace whiteSpace);

    /**
     * Appends and returns a new empty "whiteSpace" element
     */
    org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace addNewWhiteSpace();

    /**
     * An XML whiteSpace(@http://www.w3.org/2001/XMLSchema).
     *
     * This is a complex type.
     */
    public interface WhiteSpace extends org.apache.xmlbeans.impl.xb.xsdschema.Facet {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "whitespace97ffelemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An XML value(@).
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument$WhiteSpace$Value.
         */
        public interface Value extends org.apache.xmlbeans.XmlNMTOKEN {
            ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument.WhiteSpace.Value> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "value8186attrtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

            Enum PRESERVE = Enum.forString("preserve");
            Enum REPLACE = Enum.forString("replace");
            Enum COLLAPSE = Enum.forString("collapse");

            int INT_PRESERVE = Enum.INT_PRESERVE;
            int INT_REPLACE = Enum.INT_REPLACE;
            int INT_COLLAPSE = Enum.INT_COLLAPSE;

            /**
             * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.WhiteSpaceDocument$WhiteSpace$Value.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PRESERVE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_PRESERVE = 1;
                static final int INT_REPLACE = 2;
                static final int INT_COLLAPSE = 3;

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                    new Enum("preserve", INT_PRESERVE),
                    new Enum("replace", INT_REPLACE),
                    new Enum("collapse", INT_COLLAPSE),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
