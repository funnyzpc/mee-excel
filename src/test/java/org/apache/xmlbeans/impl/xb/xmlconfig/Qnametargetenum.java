/*
 * XML Type:  qnametargetenum
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetenum
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML qnametargetenum(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetenum.
 */
public interface Qnametargetenum extends org.apache.xmlbeans.XmlToken {
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetenum> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "qnametargetenum9f8ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum TYPE = Enum.forString("type");
    Enum DOCUMENT_TYPE = Enum.forString("document-type");
    Enum ACCESSOR_ELEMENT = Enum.forString("accessor-element");
    Enum ACCESSOR_ATTRIBUTE = Enum.forString("accessor-attribute");

    int INT_TYPE = Enum.INT_TYPE;
    int INT_DOCUMENT_TYPE = Enum.INT_DOCUMENT_TYPE;
    int INT_ACCESSOR_ELEMENT = Enum.INT_ACCESSOR_ELEMENT;
    int INT_ACCESSOR_ATTRIBUTE = Enum.INT_ACCESSOR_ATTRIBUTE;

    /**
     * Enumeration value class for org.apache.xmlbeans.impl.xb.xmlconfig.Qnametargetenum.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TYPE
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

        static final int INT_TYPE = 1;
        static final int INT_DOCUMENT_TYPE = 2;
        static final int INT_ACCESSOR_ELEMENT = 3;
        static final int INT_ACCESSOR_ATTRIBUTE = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("type", INT_TYPE),
            new Enum("document-type", INT_DOCUMENT_TYPE),
            new Enum("accessor-element", INT_ACCESSOR_ELEMENT),
            new Enum("accessor-attribute", INT_ACCESSOR_ATTRIBUTE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
