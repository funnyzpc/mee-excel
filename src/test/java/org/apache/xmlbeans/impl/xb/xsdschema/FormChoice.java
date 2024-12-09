/*
 * XML Type:  formChoice
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.FormChoice
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML formChoice(@http://www.w3.org/2001/XMLSchema).
 *
 * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.
 */
public interface FormChoice extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.FormChoice> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "formchoicef2aetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum QUALIFIED = Enum.forString("qualified");
    Enum UNQUALIFIED = Enum.forString("unqualified");

    int INT_QUALIFIED = Enum.INT_QUALIFIED;
    int INT_UNQUALIFIED = Enum.INT_UNQUALIFIED;

    /**
     * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.FormChoice.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_QUALIFIED
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

        static final int INT_QUALIFIED = 1;
        static final int INT_UNQUALIFIED = 2;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("qualified", INT_QUALIFIED),
            new Enum("unqualified", INT_UNQUALIFIED),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
