/*
 * XML Type:  derivationControl
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML derivationControl(@http://www.w3.org/2001/XMLSchema).
 *
 * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.
 */
public interface DerivationControl extends org.apache.xmlbeans.XmlNMTOKEN {
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "derivationcontrola5dftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum SUBSTITUTION = Enum.forString("substitution");
    Enum EXTENSION = Enum.forString("extension");
    Enum RESTRICTION = Enum.forString("restriction");
    Enum LIST = Enum.forString("list");
    Enum UNION = Enum.forString("union");

    int INT_SUBSTITUTION = Enum.INT_SUBSTITUTION;
    int INT_EXTENSION = Enum.INT_EXTENSION;
    int INT_RESTRICTION = Enum.INT_RESTRICTION;
    int INT_LIST = Enum.INT_LIST;
    int INT_UNION = Enum.INT_UNION;

    /**
     * Enumeration value class for org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SUBSTITUTION
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

        static final int INT_SUBSTITUTION = 1;
        static final int INT_EXTENSION = 2;
        static final int INT_RESTRICTION = 3;
        static final int INT_LIST = 4;
        static final int INT_UNION = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("substitution", INT_SUBSTITUTION),
            new Enum("extension", INT_EXTENSION),
            new Enum("restriction", INT_RESTRICTION),
            new Enum("list", INT_LIST),
            new Enum("union", INT_UNION),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
