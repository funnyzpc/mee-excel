/*
 * XML Type:  ST_UnderlineValues
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_UnderlineValues(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.
 */
public interface STUnderlineValues extends XmlString {
    SimpleTypeFactory<STUnderlineValues> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stunderlinevaluesb6ddtype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum SINGLE = Enum.forString("single");
    Enum DOUBLE = Enum.forString("double");
    Enum SINGLE_ACCOUNTING = Enum.forString("singleAccounting");
    Enum DOUBLE_ACCOUNTING = Enum.forString("doubleAccounting");
    Enum NONE = Enum.forString("none");

    int INT_SINGLE = Enum.INT_SINGLE;
    int INT_DOUBLE = Enum.INT_DOUBLE;
    int INT_SINGLE_ACCOUNTING = Enum.INT_SINGLE_ACCOUNTING;
    int INT_DOUBLE_ACCOUNTING = Enum.INT_DOUBLE_ACCOUNTING;
    int INT_NONE = Enum.INT_NONE;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SINGLE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(String s, int i) {
            super(s, i);
        }

        static final int INT_SINGLE = 1;
        static final int INT_DOUBLE = 2;
        static final int INT_SINGLE_ACCOUNTING = 3;
        static final int INT_DOUBLE_ACCOUNTING = 4;
        static final int INT_NONE = 5;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("single", INT_SINGLE),
            new Enum("double", INT_DOUBLE),
            new Enum("singleAccounting", INT_SINGLE_ACCOUNTING),
            new Enum("doubleAccounting", INT_DOUBLE_ACCOUNTING),
            new Enum("none", INT_NONE),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
