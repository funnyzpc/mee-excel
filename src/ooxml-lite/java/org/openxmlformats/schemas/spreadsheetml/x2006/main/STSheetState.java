/*
 * XML Type:  ST_SheetState
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_SheetState(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.
 */
public interface STSheetState extends XmlString {
    SimpleTypeFactory<STSheetState> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stsheetstate158btype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum VISIBLE = Enum.forString("visible");
    Enum HIDDEN = Enum.forString("hidden");
    Enum VERY_HIDDEN = Enum.forString("veryHidden");

    int INT_VISIBLE = Enum.INT_VISIBLE;
    int INT_HIDDEN = Enum.INT_HIDDEN;
    int INT_VERY_HIDDEN = Enum.INT_VERY_HIDDEN;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_VISIBLE
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

        static final int INT_VISIBLE = 1;
        static final int INT_HIDDEN = 2;
        static final int INT_VERY_HIDDEN = 3;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("visible", INT_VISIBLE),
            new Enum("hidden", INT_HIDDEN),
            new Enum("veryHidden", INT_VERY_HIDDEN),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
