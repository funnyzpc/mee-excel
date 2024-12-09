/*
 * XML Type:  namespaceList
 * Namespace: http://xml.apache.org/xmlbeans/2004/02/xbean/config
 * Java type: org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xmlconfig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML namespaceList(@http://xml.apache.org/xmlbeans/2004/02/xbean/config).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member
 *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2
 */
public class NamespaceListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList, org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member, org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2 {
    private static final long serialVersionUID = 1L;

    public NamespaceListImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected NamespaceListImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member {
        private static final long serialVersionUID = 1L;

        public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is a list type whose items are org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2 {
        private static final long serialVersionUID = 1L;

        public MemberImpl2(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
        /**
         * An anonymous inner XML type.
         *
         * This is a union type. Instances are of one of the following types:
         *     org.apache.xmlbeans.XmlAnyURI
         *     org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item$Member
         */
        public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item, org.apache.xmlbeans.XmlAnyURI, org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item.Member {
            private static final long serialVersionUID = 1L;

            public ItemImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ItemImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
            /**
             * An anonymous inner XML type.
             *
             * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList$Member2$Item$Member.
             */
            public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xmlconfig.NamespaceList.Member2.Item.Member {
                private static final long serialVersionUID = 1L;

                public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
                    super(sType, false);
                }

                protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                    super(sType, b);
                }
            }
        }
    }
}
