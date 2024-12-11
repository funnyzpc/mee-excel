/*
 * XML Type:  ST_FontScheme
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontScheme
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_FontScheme(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontScheme.
 */
public interface STFontScheme extends XmlString {
    SimpleTypeFactory<STFontScheme> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stfontschemef36dtype");
    SchemaType type = Factory.getType();


    StringEnumAbstractBase getEnumValue();
    void setEnumValue(StringEnumAbstractBase e);

    Enum NONE = Enum.forString("none");
    Enum MAJOR = Enum.forString("major");
    Enum MINOR = Enum.forString("minor");

    int INT_NONE = Enum.INT_NONE;
    int INT_MAJOR = Enum.INT_MAJOR;
    int INT_MINOR = Enum.INT_MINOR;

    /**
     * Enumeration value class for org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontScheme.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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

        static final int INT_NONE = 1;
        static final int INT_MAJOR = 2;
        static final int INT_MINOR = 3;

        public static final Table table =
            new Table(new Enum[] {
            new Enum("none", INT_NONE),
            new Enum("major", INT_MAJOR),
            new Enum("minor", INT_MINOR),
        });
        private static final long serialVersionUID = 1L;
        private Object readResolve() {
            return forInt(intValue());
        }
    }
}
