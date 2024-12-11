/*
 * XML Type:  ST_RefMode
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_RefMode(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.
 */
public interface STRefMode extends XmlString {
    SimpleTypeFactory<STRefMode> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "strefmodee5a5type");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum A_1 = Enum.forString("A1");
    Enum R_1_C_1 = Enum.forString("R1C1");

    int INT_A_1 = Enum.INT_A_1;
    int INT_R_1_C_1 = Enum.INT_R_1_C_1;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_A_1
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

        static final int INT_A_1 = 1;
        static final int INT_R_1_C_1 = 2;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("A1", INT_A_1),
            new Enum("R1C1", INT_R_1_C_1),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
