/*
 * XML Type:  ST_CellFormulaType
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_CellFormulaType(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.
 */
public interface STCellFormulaType extends XmlString {
    SimpleTypeFactory<STCellFormulaType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stcellformulatypee2cdtype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum NORMAL = Enum.forString("normal");
    Enum ARRAY = Enum.forString("array");
    Enum DATA_TABLE = Enum.forString("dataTable");
    Enum SHARED = Enum.forString("shared");

    int INT_NORMAL = Enum.INT_NORMAL;
    int INT_ARRAY = Enum.INT_ARRAY;
    int INT_DATA_TABLE = Enum.INT_DATA_TABLE;
    int INT_SHARED = Enum.INT_SHARED;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NORMAL
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

        static final int INT_NORMAL = 1;
        static final int INT_ARRAY = 2;
        static final int INT_DATA_TABLE = 3;
        static final int INT_SHARED = 4;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("normal", INT_NORMAL),
            new Enum("array", INT_ARRAY),
            new Enum("dataTable", INT_DATA_TABLE),
            new Enum("shared", INT_SHARED),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
