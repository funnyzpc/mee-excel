/*
 * XML Type:  simpleDerivationSet
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML simpleDerivationSet(@http://www.w3.org/2001/XMLSchema).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet$Member
 *     org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet$Member2
 */
public interface SimpleDerivationSet extends org.apache.xmlbeans.XmlAnySimpleType {
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.SimpleDerivationSet> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "simplederivationsetf70ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
