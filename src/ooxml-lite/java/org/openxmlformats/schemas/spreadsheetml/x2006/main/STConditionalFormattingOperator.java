/*
 * XML Type:  ST_ConditionalFormattingOperator
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_ConditionalFormattingOperator(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.
 */
public interface STConditionalFormattingOperator extends XmlString {
    SimpleTypeFactory<STConditionalFormattingOperator> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stconditionalformattingoperatora99etype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum LESS_THAN = Enum.forString("lessThan");
    Enum LESS_THAN_OR_EQUAL = Enum.forString("lessThanOrEqual");
    Enum EQUAL = Enum.forString("equal");
    Enum NOT_EQUAL = Enum.forString("notEqual");
    Enum GREATER_THAN_OR_EQUAL = Enum.forString("greaterThanOrEqual");
    Enum GREATER_THAN = Enum.forString("greaterThan");
    Enum BETWEEN = Enum.forString("between");
    Enum NOT_BETWEEN = Enum.forString("notBetween");
    Enum CONTAINS_TEXT = Enum.forString("containsText");
    Enum NOT_CONTAINS = Enum.forString("notContains");
    Enum BEGINS_WITH = Enum.forString("beginsWith");
    Enum ENDS_WITH = Enum.forString("endsWith");

    int INT_LESS_THAN = Enum.INT_LESS_THAN;
    int INT_LESS_THAN_OR_EQUAL = Enum.INT_LESS_THAN_OR_EQUAL;
    int INT_EQUAL = Enum.INT_EQUAL;
    int INT_NOT_EQUAL = Enum.INT_NOT_EQUAL;
    int INT_GREATER_THAN_OR_EQUAL = Enum.INT_GREATER_THAN_OR_EQUAL;
    int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    int INT_BETWEEN = Enum.INT_BETWEEN;
    int INT_NOT_BETWEEN = Enum.INT_NOT_BETWEEN;
    int INT_CONTAINS_TEXT = Enum.INT_CONTAINS_TEXT;
    int INT_NOT_CONTAINS = Enum.INT_NOT_CONTAINS;
    int INT_BEGINS_WITH = Enum.INT_BEGINS_WITH;
    int INT_ENDS_WITH = Enum.INT_ENDS_WITH;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LESS_THAN
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

        static final int INT_LESS_THAN = 1;
        static final int INT_LESS_THAN_OR_EQUAL = 2;
        static final int INT_EQUAL = 3;
        static final int INT_NOT_EQUAL = 4;
        static final int INT_GREATER_THAN_OR_EQUAL = 5;
        static final int INT_GREATER_THAN = 6;
        static final int INT_BETWEEN = 7;
        static final int INT_NOT_BETWEEN = 8;
        static final int INT_CONTAINS_TEXT = 9;
        static final int INT_NOT_CONTAINS = 10;
        static final int INT_BEGINS_WITH = 11;
        static final int INT_ENDS_WITH = 12;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("lessThan", INT_LESS_THAN),
            new Enum("lessThanOrEqual", INT_LESS_THAN_OR_EQUAL),
            new Enum("equal", INT_EQUAL),
            new Enum("notEqual", INT_NOT_EQUAL),
            new Enum("greaterThanOrEqual", INT_GREATER_THAN_OR_EQUAL),
            new Enum("greaterThan", INT_GREATER_THAN),
            new Enum("between", INT_BETWEEN),
            new Enum("notBetween", INT_NOT_BETWEEN),
            new Enum("containsText", INT_CONTAINS_TEXT),
            new Enum("notContains", INT_NOT_CONTAINS),
            new Enum("beginsWith", INT_BEGINS_WITH),
            new Enum("endsWith", INT_ENDS_WITH),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
