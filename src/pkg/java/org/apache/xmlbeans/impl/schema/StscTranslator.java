/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans.impl.schema;

import org.apache.xmlbeans.*;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.XMLChar;
import org.apache.xmlbeans.impl.schema.StscImporter.SchemaToProcess;
import org.apache.xmlbeans.impl.values.NamespaceContext;
import org.apache.xmlbeans.impl.values.XmlNonNegativeIntegerImpl;
import org.apache.xmlbeans.impl.values.XmlPositiveIntegerImpl;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;
import org.apache.xmlbeans.impl.xb.xsdschema.*;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema;
import org.apache.xmlbeans.impl.xpath.XPath;
import org.apache.xmlbeans.soap.SOAPArrayType;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.*;

public class StscTranslator {
    private static final QName WSDL_ARRAYTYPE_NAME =
        QNameHelper.forLNS("arrayType", "http://schemas.xmlsoap.org/wsdl/");
    private static final String FORM_QUALIFIED = "qualified";

    private static class RedefinitionHolder {
        // record redefinitions
        private Map<String, TopLevelSimpleType> stRedefinitions = Collections.emptyMap();
        private String schemaLocation = "";
        private SchemaToProcess schemaRedefined;

    }

    /**
     * This is used to aggregate all redefinitions for a specific component name.
     * The idea is to record the list of &lt;redefine%gt; sections that could
     * potentially redefine this component. When the list of actual redefinitions
     * is requested, the potential redefinitions are first filtered based on
     * accessibilty of the schema currently being processed from the redefining Schemas
     * and then topologically sorted based on the inclusion relationship to
     * ensure that redefinitions are applied in the right order.
     */
    private static class RedefinitionMaster {
        private static final short SIMPLE_TYPE = 1;
        private static final short COMPLEX_TYPE = 2;
        private static final short MODEL_GROUP = 3;
        private static final short ATTRIBUTE_GROUP = 4;

        // record redefinitions
        private Map<String, List<RedefinitionHolder>> stRedefinitions = Collections.emptyMap();
        private Map<String, List<RedefinitionHolder>> ctRedefinitions = Collections.emptyMap();
        private Map<String, List<RedefinitionHolder>> agRedefinitions = Collections.emptyMap();
        private Map<String, List<RedefinitionHolder>> mgRedefinitions = Collections.emptyMap();
        private static final RedefinitionHolder[] EMPTY_REDEFINTION_HOLDER_ARRAY =
            new RedefinitionHolder[0];


        private String componentNameFromCode(short code) {
            String componentName;
            switch (code) {
                case SIMPLE_TYPE:
                    componentName = "simple type";
                    break;
                case COMPLEX_TYPE:
                    componentName = "complex type";
                    break;
                case MODEL_GROUP:
                    componentName = "model group";
                    break;
                case ATTRIBUTE_GROUP:
                    componentName = "attribute group";
                    break;
                default:
                    componentName = "";
            }
            return componentName;
        }

    }
    public static final org.apache.xmlbeans.impl.regex.RegularExpression XPATH_REGEXP = new org.apache.xmlbeans.impl.regex.RegularExpression("(\\.//)?((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)/)*((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)|((attribute::|@)((\\i\\c*:)?(\\i\\c*|\\*))))(\\|(\\.//)?((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)/)*((((child::)?((\\i\\c*:)?(\\i\\c*|\\*)))|\\.)|((attribute::|@)((\\i\\c*:)?(\\i\\c*|\\*)))))*", "X");


    static BigInteger buildBigInt(XmlAnySimpleType value) {
        if (value == null) {
            return null;
        }
        String text = value.getStringValue();
        BigInteger bigInt;
        try {
            bigInt = new BigInteger(text);
        } catch (NumberFormatException e) {
            StscState.get().error(XmlErrorCodes.INVALID_VALUE_DETAIL, new Object[]{text, "nonNegativeInteger", e.getMessage()}, value);
            return null;
        }

        if (bigInt.signum() < 0) {
            StscState.get().error(XmlErrorCodes.INVALID_VALUE, new Object[]{text, "nonNegativeInteger"}, value);
            return null;
        }

        return bigInt;
    }


    static XmlNonNegativeInteger buildNnInteger(XmlAnySimpleType value) {
        BigInteger bigInt = buildBigInt(value);
        try {
            XmlNonNegativeIntegerImpl i = new XmlNonNegativeIntegerImpl();
            i.setBigIntegerValue(bigInt);
            i.setImmutable();
            return i;
        } catch (XmlValueOutOfRangeException e) {
            StscState.get().error("Internal error processing number", XmlErrorCodes.MALFORMED_NUMBER, value);
            return null;
        }
    }

    static XmlPositiveInteger buildPosInteger(XmlAnySimpleType value) {
        BigInteger bigInt = buildBigInt(value);
        try {
            XmlPositiveIntegerImpl i = new XmlPositiveIntegerImpl();
            i.setBigIntegerValue(bigInt);
            i.setImmutable();
            return i;
        } catch (XmlValueOutOfRangeException e) {
            StscState.get().error("Internal error processing number", XmlErrorCodes.MALFORMED_NUMBER, value);
            return null;
        }
    }


    private static Object getUserData(XmlObject pos) {
        XmlCursor.XmlBookmark b;
        try (XmlCursor c = pos.newCursor()) {
            b = c.getBookmark(SchemaBookmark.class);
        }
        if (b instanceof SchemaBookmark) {
            return ((SchemaBookmark) b).getValue();
        } else {
            return null;
        }
    }

    private static boolean isEmptySchema(Schema schema) {
        try (XmlCursor cursor = schema.newCursor()) {
            return !cursor.toFirstChild();
        }
    }

    private static boolean isReservedTypeName(QName name) {
        return (BuiltinSchemaTypeSystem.get().findType(name) != null);
    }
}
