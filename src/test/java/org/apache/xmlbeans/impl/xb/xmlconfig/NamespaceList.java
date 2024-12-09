/*
 * XML Type:  namespaceList
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML namespaceList(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member
 *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2
 */
public interface NamespaceList extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "namespacelist20datype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member.
     */
    public interface Member extends org.apache.xmlbeans.XmlToken {
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "anonc6fftype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
        void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

        Enum ANY = Enum.forString("##any");

        int INT_ANY = Enum.INT_ANY;

        /**
         * Enumeration value class for org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ANY
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

            static final int INT_ANY = 1;

            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                new Enum("##any", INT_ANY),
            });
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() {
                return forInt(intValue());
            }
        }
    }

    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item.
     */
    public interface Member2 extends org.apache.xmlbeans.XmlAnySimpleType {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List<?> list);
        ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "anon5680type");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * An anonymous inner XML type.
         *
         * This is a union type. Instances are of one of the following types:
         *     org.apache.xmlbeans.XmlAnyURI
         *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item$Member
         */
        public interface Item extends org.apache.xmlbeans.XmlAnySimpleType {
            java.lang.Object getObjectValue();
            void setObjectValue(java.lang.Object val);
            org.apache.xmlbeans.SchemaType instanceType();
            ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "anon0798type");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * An anonymous inner XML type.
             *
             * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item$Member.
             */
            public interface Member extends org.apache.xmlbeans.XmlToken {
                ElementFactory<org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item.Member> Factory = new ElementFactory<>(org.apache.xmlbeans.metadata.system.sXMLCONFIG.TypeSystemHolder.typeSystem, "anon1dd3type");
                org.apache.xmlbeans.SchemaType type = Factory.getType();


                org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
                void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

                Enum LOCAL = Enum.forString("##local");

                int INT_LOCAL = Enum.INT_LOCAL;

                /**
                 * Enumeration value class for org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item$Member.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_LOCAL
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

                    static final int INT_LOCAL = 1;

                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
                      new Enum("##local", INT_LOCAL),
                    });
                    private static final long serialVersionUID = 1L;
                    private java.lang.Object readResolve() {
                        return forInt(intValue());
                    }
                }
            }
        }
    }
}
