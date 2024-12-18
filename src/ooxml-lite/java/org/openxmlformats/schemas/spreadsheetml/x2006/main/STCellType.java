/*
 * XML Type:  ST_CellType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_CellType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.
 */
public interface STCellType extends XmlString {
    SimpleTypeFactory<STCellType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stcelltypebf95type");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum B = Enum.forString("b");
    Enum N = Enum.forString("n");
    Enum E = Enum.forString("e");
    Enum S = Enum.forString("s");
    Enum STR = Enum.forString("str");
    Enum INLINE_STR = Enum.forString("inlineStr");

    int INT_B = Enum.INT_B;
    int INT_N = Enum.INT_N;
    int INT_E = Enum.INT_E;
    int INT_S = Enum.INT_S;
    int INT_STR = Enum.INT_STR;
    int INT_INLINE_STR = Enum.INT_INLINE_STR;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_B
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

        static final int INT_B = 1;
        static final int INT_N = 2;
        static final int INT_E = 3;
        static final int INT_S = 4;
        static final int INT_STR = 5;
        static final int INT_INLINE_STR = 6;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("b", INT_B),
            new Enum("n", INT_N),
            new Enum("e", INT_E),
            new Enum("s", INT_S),
            new Enum("str", INT_STR),
            new Enum("inlineStr", INT_INLINE_STR),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
