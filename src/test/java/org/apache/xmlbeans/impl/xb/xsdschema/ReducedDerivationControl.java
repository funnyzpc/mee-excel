/*
 * XML Type:  reducedDerivationControl
 * Namespace: http://www.w3.org/2001/XMLSchema
 * Java type: org.apache.xmlbeans.impl.xb.xsdschema.ReducedDerivationControl
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.xsdschema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML reducedDerivationControl(@http://www.w3.org/2001/XMLSchema).
 *
 * This is an atomic type that is a restriction of org.apache.xmlbeans.impl.xb.xsdschema.ReducedDerivationControl.
 */
public interface ReducedDerivationControl extends org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl {
    SimpleTypeFactory<org.apache.xmlbeans.impl.xb.xsdschema.ReducedDerivationControl> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.sXMLSCHEMA.TypeSystemHolder.typeSystem, "reducedderivationcontrole1cbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum EXTENSION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.EXTENSION;
    org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.Enum RESTRICTION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.RESTRICTION;

    int INT_EXTENSION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_EXTENSION;
    int INT_RESTRICTION = org.apache.xmlbeans.impl.xb.xsdschema.DerivationControl.INT_RESTRICTION;
}
