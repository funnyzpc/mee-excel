/*
 * XML Type:  ST_VerticalAlignment
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_VerticalAlignment(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.
 */
public interface STVerticalAlignment extends XmlString {
    SimpleTypeFactory<STVerticalAlignment> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stverticalalignmentd35ctype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum TOP = Enum.forString("top");
    Enum CENTER = Enum.forString("center");
    Enum BOTTOM = Enum.forString("bottom");
    Enum JUSTIFY = Enum.forString("justify");
    Enum DISTRIBUTED = Enum.forString("distributed");

    int INT_TOP = Enum.INT_TOP;
    int INT_CENTER = Enum.INT_CENTER;
    int INT_BOTTOM = Enum.INT_BOTTOM;
    int INT_JUSTIFY = Enum.INT_JUSTIFY;
    int INT_DISTRIBUTED = Enum.INT_DISTRIBUTED;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignment.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TOP
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

        static final int INT_TOP = 1;
        static final int INT_CENTER = 2;
        static final int INT_BOTTOM = 3;
        static final int INT_JUSTIFY = 4;
        static final int INT_DISTRIBUTED = 5;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("top", INT_TOP),
            new Enum("center", INT_CENTER),
            new Enum("bottom", INT_BOTTOM),
            new Enum("justify", INT_JUSTIFY),
            new Enum("distributed", INT_DISTRIBUTED),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
