/*
 * XML Type:  narrowMaxMin
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.NarrowMaxMin
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML narrowMaxMin(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a complex type.
 */
public class NarrowMaxMinImpl extends org.apache.xmlbeans.impl.xb.xsdschema.impl.LocalElementImpl implements org.apache.xmlbeans.impl.xb.xsdschema.NarrowMaxMin {
    private static final long serialVersionUID = 1L;

    public NarrowMaxMinImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }
    /**
     * An XML minOccurs(@).
     *
     * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.NarrowMaxMin$MinOccurs.
     */
    public static class MinOccursImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.apache.xmlbeans.impl.xb.xsdschema.NarrowMaxMin.MinOccurs {
        private static final long serialVersionUID = 1L;

        public MinOccursImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MinOccursImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
    /**
     * An XML maxOccurs(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlNonNegativeInteger
     *     org.apache.xmlbeans.impl.xb.xsdschema.AllNNI$Member
     */
    public static class MaxOccursImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.apache.xmlbeans.impl.xb.xsdschema.NarrowMaxMin.MaxOccurs, org.apache.xmlbeans.XmlNonNegativeInteger, org.apache.xmlbeans.impl.xb.xsdschema.AllNNI.Member {
        private static final long serialVersionUID = 1L;

        public MaxOccursImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType, false);
        }

        protected MaxOccursImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
            super(sType, b);
        }
    }
}
