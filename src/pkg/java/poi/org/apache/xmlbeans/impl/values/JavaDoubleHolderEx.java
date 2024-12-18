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

package poi.org.apache.xmlbeans.impl.values;

import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlErrorCodes;
import poi.org.apache.xmlbeans.XmlObject;
import poi.org.apache.xmlbeans.impl.common.QNameHelper;
import poi.org.apache.xmlbeans.impl.common.ValidationContext;


public abstract class JavaDoubleHolderEx extends JavaDoubleHolder {
    public JavaDoubleHolderEx(SchemaType type, boolean complex) {
        _schemaType = type;
        initComplexType(complex, false);
    }

    private final SchemaType _schemaType;

    public SchemaType schemaType() {
        return _schemaType;
    }

    protected void set_double(double v) {
        if (_validateOnSet()) {
            validateValue(v, _schemaType, _voorVc);
        }
        super.set_double(v);
    }

    public static double validateLexical(String v, SchemaType sType, ValidationContext context) {
        double d = validateLexical(v, context);

        if (!sType.matchPatternFacet(v)) {
            context.invalid(XmlErrorCodes.DATATYPE_VALID$PATTERN_VALID,
                new Object[]{"double", v, QNameHelper.readable(sType)});
        }

        return d;
    }

    public static void validateValue(double v, SchemaType sType, ValidationContext context) {
        XmlObject x;
        double d;

        if ((x = sType.getFacet(SchemaType.FACET_MIN_EXCLUSIVE)) != null) {
            if (compare(v, d = ((XmlObjectBase) x).getDoubleValue()) <= 0) {
                context.invalid(XmlErrorCodes.DATATYPE_MIN_EXCLUSIVE_VALID,
                    new Object[]{"double", v, d, QNameHelper.readable(sType)});
            }
        }

        if ((x = sType.getFacet(SchemaType.FACET_MIN_INCLUSIVE)) != null) {
            if (compare(v, d = ((XmlObjectBase) x).getDoubleValue()) < 0) {
                context.invalid(XmlErrorCodes.DATATYPE_MIN_INCLUSIVE_VALID,
                    new Object[]{"double", v, d, QNameHelper.readable(sType)});
            }
        }

        if ((x = sType.getFacet(SchemaType.FACET_MAX_INCLUSIVE)) != null) {
            if (compare(v, d = ((XmlObjectBase) x).getDoubleValue()) > 0) {
                context.invalid(XmlErrorCodes.DATATYPE_MAX_INCLUSIVE_VALID,
                    new Object[]{"double", v, d, QNameHelper.readable(sType)});
            }
        }

        if ((x = sType.getFacet(SchemaType.FACET_MAX_EXCLUSIVE)) != null) {
            if (compare(v, d = ((XmlObjectBase) x).getDoubleValue()) >= 0) {
                context.invalid(XmlErrorCodes.DATATYPE_MAX_EXCLUSIVE_VALID,
                    new Object[]{"double", v, d, QNameHelper.readable(sType)});
            }
        }

        XmlObject[] vals = sType.getEnumerationValues();
        if (vals != null) {
            for (XmlObject val : vals) {
                if (compare(v, ((XmlObjectBase) val).getDoubleValue()) == 0) {
                    return;
                }
            }
            context.invalid(XmlErrorCodes.DATATYPE_ENUM_VALID,
                new Object[]{"double", v, QNameHelper.readable(sType)});
        }
    }

    protected void validate_simpleval(String lexical, ValidationContext ctx) {
        validateLexical(lexical, schemaType(), ctx);
        validateValue(getDoubleValue(), schemaType(), ctx);
    }
}
