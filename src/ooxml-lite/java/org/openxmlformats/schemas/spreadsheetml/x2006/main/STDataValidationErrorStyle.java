/*
 * XML Type:  ST_DataValidationErrorStyle
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_DataValidationErrorStyle(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.
 */
public interface STDataValidationErrorStyle extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<STDataValidationErrorStyle> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stdatavalidationerrorstyleca85type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum STOP = Enum.forString("stop");
    Enum WARNING = Enum.forString("warning");
    Enum INFORMATION = Enum.forString("information");

    int INT_STOP = Enum.INT_STOP;
    int INT_WARNING = Enum.INT_WARNING;
    int INT_INFORMATION = Enum.INT_INFORMATION;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_STOP
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

        static final int INT_STOP = 1;
        static final int INT_WARNING = 2;
        static final int INT_INFORMATION = 3;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("stop", INT_STOP),
            new Enum("warning", INT_WARNING),
            new Enum("information", INT_INFORMATION),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
