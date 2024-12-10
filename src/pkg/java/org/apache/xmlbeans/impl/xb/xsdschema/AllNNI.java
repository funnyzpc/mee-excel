/*
 * XML Type:  allNNI
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AllNNI
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML allNNI(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlNonNegativeInteger
 *     org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member
 */
public interface AllNNI extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.AllNNI> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "allnni78cbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member.
     */
    public interface Member extends org.apache.xmlbeans.XmlNMTOKEN {
        ElementFactory<org.apache.xmlbeans.impl.xb.xsdschema.AllNNI.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "anon0330type");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum UNBOUNDED = Enum.forString("unbounded");

        int INT_UNBOUNDED = Enum.INT_UNBOUNDED;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_UNBOUNDED
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

            static final int INT_UNBOUNDED = 1;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("unbounded", INT_UNBOUNDED),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }
}
