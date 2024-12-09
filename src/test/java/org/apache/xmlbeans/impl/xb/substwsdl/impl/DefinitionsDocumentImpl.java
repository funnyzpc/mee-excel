/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://www.apache.org/internal/xmlbeans/wsdlsubst
 * Java type: org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.xmlbeans.impl.xb.substwsdl.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst) element.
 *
 * This is a complex type.
 */
public class DefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument {
    private static final long serialVersionUID = 1L;

    public DefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "definitions"),
    };


    /**
     * Gets the "definitions" element
     */
    public org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions getDefinitions() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions target = null;
            target = (org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "definitions" element
     */
    public void setDefinitions(org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions definitions) {
        generatedSetterHelperImpl(definitions, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "definitions" element
     */
    public org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions addNewDefinitions() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions target = null;
            target = (org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML definitions(@http://www.apache.org/internal/xmlbeans/wsdlsubst).
     *
     * This is a complex type.
     */
    public static class DefinitionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.xmlbeans.impl.xb.substwsdl.DefinitionsDocument.Definitions {
        private static final long serialVersionUID = 1L;

        public DefinitionsImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "import"),
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "types"),
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "message"),
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "binding"),
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "portType"),
            new QName("http://www.apache.org/internal/xmlbeans/wsdlsubst", "service"),
        };


        /**
         * Gets a List of "import" elements
         */
        public java.util.List<org.apache.xmlbeans.impl.xb.substwsdl.TImport> getImportList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getImportArray,
                    this::setImportArray,
                    this::insertNewImport,
                    this::removeImport,
                    this::sizeOfImportArray
                );
            }
        }

        /**
         * Gets array of all "import" elements
         */
        public org.apache.xmlbeans.impl.xb.substwsdl.TImport[] getImportArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new org.apache.xmlbeans.impl.xb.substwsdl.TImport[0]);
        }

        /**
         * Gets ith "import" element
         */
        public org.apache.xmlbeans.impl.xb.substwsdl.TImport getImportArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.substwsdl.TImport target = null;
                target = (org.apache.xmlbeans.impl.xb.substwsdl.TImport)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "import" element
         */
        public int sizeOfImportArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "import" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setImportArray(org.apache.xmlbeans.impl.xb.substwsdl.TImport[] ximportArray) {
            check_orphaned();
            arraySetterHelper(ximportArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "import" element
         */
        public void setImportArray(int i, org.apache.xmlbeans.impl.xb.substwsdl.TImport ximport) {
            generatedSetterHelperImpl(ximport, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "import" element
         */
        public org.apache.xmlbeans.impl.xb.substwsdl.TImport insertNewImport(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.substwsdl.TImport target = null;
                target = (org.apache.xmlbeans.impl.xb.substwsdl.TImport)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "import" element
         */
        public org.apache.xmlbeans.impl.xb.substwsdl.TImport addNewImport() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.substwsdl.TImport target = null;
                target = (org.apache.xmlbeans.impl.xb.substwsdl.TImport)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "import" element
         */
        public void removeImport(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets a List of "types" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlObject> getTypesList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getTypesArray,
                    this::setTypesArray,
                    this::insertNewTypes,
                    this::removeTypes,
                    this::sizeOfTypesArray
                );
            }
        }

        /**
         * Gets array of all "types" elements
         */
        public org.apache.xmlbeans.XmlObject[] getTypesArray() {
            return getXmlObjectArray(PROPERTY_QNAME[1], new org.apache.xmlbeans.XmlObject[0]);
        }

        /**
         * Gets ith "types" element
         */
        public org.apache.xmlbeans.XmlObject getTypesArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[1], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "types" element
         */
        public int sizeOfTypesArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]);
            }
        }

        /**
         * Sets array of all "types" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTypesArray(org.apache.xmlbeans.XmlObject[] typesArray) {
            check_orphaned();
            arraySetterHelper(typesArray, PROPERTY_QNAME[1]);
        }

        /**
         * Sets ith "types" element
         */
        public void setTypesArray(int i, org.apache.xmlbeans.XmlObject types) {
            generatedSetterHelperImpl(types, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "types" element
         */
        public org.apache.xmlbeans.XmlObject insertNewTypes(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PROPERTY_QNAME[1], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "types" element
         */
        public org.apache.xmlbeans.XmlObject addNewTypes() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Removes the ith "types" element
         */
        public void removeTypes(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], i);
            }
        }

        /**
         * Gets a List of "message" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlObject> getMessageList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getMessageArray,
                    this::setMessageArray,
                    this::insertNewMessage,
                    this::removeMessage,
                    this::sizeOfMessageArray
                );
            }
        }

        /**
         * Gets array of all "message" elements
         */
        public org.apache.xmlbeans.XmlObject[] getMessageArray() {
            return getXmlObjectArray(PROPERTY_QNAME[2], new org.apache.xmlbeans.XmlObject[0]);
        }

        /**
         * Gets ith "message" element
         */
        public org.apache.xmlbeans.XmlObject getMessageArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[2], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "message" element
         */
        public int sizeOfMessageArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[2]);
            }
        }

        /**
         * Sets array of all "message" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMessageArray(org.apache.xmlbeans.XmlObject[] messageArray) {
            check_orphaned();
            arraySetterHelper(messageArray, PROPERTY_QNAME[2]);
        }

        /**
         * Sets ith "message" element
         */
        public void setMessageArray(int i, org.apache.xmlbeans.XmlObject message) {
            generatedSetterHelperImpl(message, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "message" element
         */
        public org.apache.xmlbeans.XmlObject insertNewMessage(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PROPERTY_QNAME[2], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "message" element
         */
        public org.apache.xmlbeans.XmlObject addNewMessage() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * Removes the ith "message" element
         */
        public void removeMessage(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[2], i);
            }
        }

        /**
         * Gets a List of "binding" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlObject> getBindingList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getBindingArray,
                    this::setBindingArray,
                    this::insertNewBinding,
                    this::removeBinding,
                    this::sizeOfBindingArray
                );
            }
        }

        /**
         * Gets array of all "binding" elements
         */
        public org.apache.xmlbeans.XmlObject[] getBindingArray() {
            return getXmlObjectArray(PROPERTY_QNAME[3], new org.apache.xmlbeans.XmlObject[0]);
        }

        /**
         * Gets ith "binding" element
         */
        public org.apache.xmlbeans.XmlObject getBindingArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[3], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "binding" element
         */
        public int sizeOfBindingArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[3]);
            }
        }

        /**
         * Sets array of all "binding" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBindingArray(org.apache.xmlbeans.XmlObject[] bindingArray) {
            check_orphaned();
            arraySetterHelper(bindingArray, PROPERTY_QNAME[3]);
        }

        /**
         * Sets ith "binding" element
         */
        public void setBindingArray(int i, org.apache.xmlbeans.XmlObject binding) {
            generatedSetterHelperImpl(binding, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "binding" element
         */
        public org.apache.xmlbeans.XmlObject insertNewBinding(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PROPERTY_QNAME[3], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "binding" element
         */
        public org.apache.xmlbeans.XmlObject addNewBinding() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[3]);
                return target;
            }
        }

        /**
         * Removes the ith "binding" element
         */
        public void removeBinding(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[3], i);
            }
        }

        /**
         * Gets a List of "portType" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlObject> getPortTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getPortTypeArray,
                    this::setPortTypeArray,
                    this::insertNewPortType,
                    this::removePortType,
                    this::sizeOfPortTypeArray
                );
            }
        }

        /**
         * Gets array of all "portType" elements
         */
        public org.apache.xmlbeans.XmlObject[] getPortTypeArray() {
            return getXmlObjectArray(PROPERTY_QNAME[4], new org.apache.xmlbeans.XmlObject[0]);
        }

        /**
         * Gets ith "portType" element
         */
        public org.apache.xmlbeans.XmlObject getPortTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[4], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "portType" element
         */
        public int sizeOfPortTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[4]);
            }
        }

        /**
         * Sets array of all "portType" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPortTypeArray(org.apache.xmlbeans.XmlObject[] portTypeArray) {
            check_orphaned();
            arraySetterHelper(portTypeArray, PROPERTY_QNAME[4]);
        }

        /**
         * Sets ith "portType" element
         */
        public void setPortTypeArray(int i, org.apache.xmlbeans.XmlObject portType) {
            generatedSetterHelperImpl(portType, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "portType" element
         */
        public org.apache.xmlbeans.XmlObject insertNewPortType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PROPERTY_QNAME[4], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "portType" element
         */
        public org.apache.xmlbeans.XmlObject addNewPortType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[4]);
                return target;
            }
        }

        /**
         * Removes the ith "portType" element
         */
        public void removePortType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[4], i);
            }
        }

        /**
         * Gets a List of "service" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlObject> getServiceList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getServiceArray,
                    this::setServiceArray,
                    this::insertNewService,
                    this::removeService,
                    this::sizeOfServiceArray
                );
            }
        }

        /**
         * Gets array of all "service" elements
         */
        public org.apache.xmlbeans.XmlObject[] getServiceArray() {
            return getXmlObjectArray(PROPERTY_QNAME[5], new org.apache.xmlbeans.XmlObject[0]);
        }

        /**
         * Gets ith "service" element
         */
        public org.apache.xmlbeans.XmlObject getServiceArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PROPERTY_QNAME[5], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "service" element
         */
        public int sizeOfServiceArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[5]);
            }
        }

        /**
         * Sets array of all "service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceArray(org.apache.xmlbeans.XmlObject[] serviceArray) {
            check_orphaned();
            arraySetterHelper(serviceArray, PROPERTY_QNAME[5]);
        }

        /**
         * Sets ith "service" element
         */
        public void setServiceArray(int i, org.apache.xmlbeans.XmlObject service) {
            generatedSetterHelperImpl(service, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        public org.apache.xmlbeans.XmlObject insertNewService(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PROPERTY_QNAME[5], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        public org.apache.xmlbeans.XmlObject addNewService() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PROPERTY_QNAME[5]);
                return target;
            }
        }

        /**
         * Removes the ith "service" element
         */
        public void removeService(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[5], i);
            }
        }
    }
}
