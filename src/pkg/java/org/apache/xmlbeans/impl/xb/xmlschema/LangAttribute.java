/*
 * An XML attribute type.
 * Localname: lang
 * Namespace: http://www.w3.org/XML/1998/namespace
 * Java type: org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one lang(@http://www.w3.org/XML/1998/namespace) attribute.
 *
 * This is a complex type.
 */
public interface LangAttribute extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder.typeSystem, "lange126attrtypetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();

    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang xgetLang();

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
    void xsetLang(org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang lang);

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
    public interface Lang extends org.apache.xmlbeans.XmlAnySimpleType {
        java.lang.Object getObjectValue();
        void setObjectValue(java.lang.Object val);
        org.apache.xmlbeans.SchemaType instanceType();
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder.typeSystem, "lang1224attrtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An anonymous inner XML type.
         *
         * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute$Lang$Member.
         */
        public interface Member extends org.apache.xmlbeans.XmlString {
            ElementFactory<org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute.Lang.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLLANG.TypeSystemHolder.typeSystem, "anon695ftype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
            void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

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
            final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
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

                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
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
