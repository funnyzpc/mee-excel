/*
 * XML Type:  ST_VerticalAlignRun
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/sharedTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.sharedTypes;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_VerticalAlignRun(@http://schemas.openxmlformats.org/officeDocument/2006/sharedTypes).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.
 */
public interface STVerticalAlignRun extends XmlString {
    SimpleTypeFactory<STVerticalAlignRun> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stverticalalignrunc096type");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);
    /**
     * Enumeration value class for org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STVerticalAlignRun.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BASELINE
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

        static final int INT_BASELINE = 1;
        static final int INT_SUPERSCRIPT = 2;
        static final int INT_SUBSCRIPT = 3;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("baseline", INT_BASELINE),
            new Enum("superscript", INT_SUPERSCRIPT),
            new Enum("subscript", INT_SUBSCRIPT),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
