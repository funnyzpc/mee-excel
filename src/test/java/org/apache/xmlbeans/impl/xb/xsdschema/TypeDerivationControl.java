/*
 * XML Type:  typeDerivationControl
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.TypeDerivationControl
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML typeDerivationControl(@http://www.w3.org/2001/XMLSchema).
 *
 * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.TypeDerivationControl.
 */
public interface TypeDerivationControl extends org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl {
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.TypeDerivationControl> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "typederivationcontrol3239type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum EXTENSION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.EXTENSION;
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum RESTRICTION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.RESTRICTION;
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum LIST = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.LIST;
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum UNION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.UNION;

    int INT_EXTENSION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_EXTENSION;
    int INT_RESTRICTION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_RESTRICTION;
    int INT_LIST = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_LIST;
    int INT_UNION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_UNION;
}
