/*
 * XML Type:  allNNI
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.AllNNI
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML allNNI(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlNonNegativeInteger
 *     org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member
 */
public class AllNNIImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xmlbeans.impl.xb.xsdschema.AllNNI, org.apache.xmlbeans.XmlNonNegativeInteger, org.apache.xmlbeans.impl.xb.xsdschema.AllNNI.Member {
    private static final long serialVersionUID = 1L;

    public AllNNIImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected AllNNIImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.AllNNI.Member {
        private static final long serialVersionUID = 1L;

        public MemberImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
