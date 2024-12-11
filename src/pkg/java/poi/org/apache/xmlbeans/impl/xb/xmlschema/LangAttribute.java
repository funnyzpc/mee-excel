/*
 * An XML attribute type.
 * Localname: lang
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute
 *
 * Automatically generated - do not modify.
 */
package poi.org.apache.xmlbeans.impl.xb.xmlschema;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.schema.ElementFactory;
import poi.org.apache.xmlbeans.impl.schema.DocumentFactory;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlAnySimpleType;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.XmlString;
import poi.org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder;


/**
 * A document containing one lang(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface LangAttribute extends XmlObject {
    DocumentFactory<LangAttribute> Factory = new DocumentFactory<>(TypeSystemHolder.typeSystem, "lange126attrtypetype");
    SchemaType type = Factory.getType();


    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();

    /**
     * Gets (as xml) the "lang" attribute
     */
    LangAttribute.Lang xgetLang();

    /**
     * True if has "lang" attribute
     */
    boolean isSetLang();

    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);

    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(LangAttribute.Lang lang);

    /**
     * Unsets the "lang" attribute
     */
    void unsetLang();

    /**
     * An XML lang(@http://www.w3.org/XML/1998/namespace).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlLanguage
     *     org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute$Lang$Member
     */
    public interface Lang extends XmlAnySimpleType {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        SchemaType instanceType();
        ElementFactory<LangAttribute.Lang> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "lang1224attrtype");
        SchemaType type = Factory.getType();


        /**
         * An anonymous inner XML type.
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute$Lang$Member.
         */
        public interface Member extends XmlString {
            ElementFactory<LangAttribute.Lang.Member> Factory = new ElementFactory<>(TypeSystemHolder.typeSystem, "anon695ftype");
            SchemaType type = Factory.getType();


            StringEnumAbstractBase getEnumValue();
            void setEnumValue(StringEnumAbstractBase e);

            Enum X = Enum.forString("");

            int INT_X = Enum.INT_X;

            /**
             * Enumeration value class for org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute$Lang$Member.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_X
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
                public static Enum forString(java.lang.String s) {
                    return (Enum)table.forString(s);
                }

                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i) {
                    return (Enum)table.forInt(i);
                }

                private Enum(java.lang.String s, int i) {
                    super(s, i);
                }

                static final int INT_X = 1;

                public static final Table table =
                    new Table(new Enum[] {
                    new Enum("", INT_X),
                });
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() {
                    return forInt(intValue());
                }
            }
        }
    }
}
