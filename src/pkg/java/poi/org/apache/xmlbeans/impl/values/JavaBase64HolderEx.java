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

public abstract class JavaBase64HolderEx extends JavaBase64Holder {
    private final SchemaType _schemaType;

    public SchemaType schemaType() {
        return _schemaType;
    }

    public JavaBase64HolderEx(SchemaType type, boolean complex) {
        _schemaType = type;
        initComplexType(complex, false);
    }

    protected int get_wscanon_rule() {
        return schemaType().getWhiteSpaceRule();
    }

    protected void set_text(String s) {
        final byte[] v;

        if (_validateOnSet()) {
            v = validateLexical(s, schemaType(), _voorVc);
        } else {
            v = lex(s, _voorVc);
        }

        if (v != null && _validateOnSet()) {
            validateValue(v, schemaType(), _voorVc);
        }

        if (v != null) {
            super.set_ByteArray(v);
        }
    }

    // setters
    protected void set_ByteArray(byte[] v) {
        if (_validateOnSet()) {
            validateValue(v, schemaType(), _voorVc);
        }

        super.set_ByteArray(v);
    }

    public static void validateValue(byte[] v, SchemaType sType, ValidationContext context) {
        int i;
        XmlObject o;

        if ((o = sType.getFacet(SchemaType.FACET_LENGTH)) != null) {
            if ((i = ((XmlObjectBase) o).getBigIntegerValue().intValue()) != v.length) {
                context.invalid(XmlErrorCodes.DATATYPE_LENGTH_VALID$BINARY,
                    new Object[]{"base64Binary", v.length, i, QNameHelper.readable(sType)});
            }
        }

        if ((o = sType.getFacet(SchemaType.FACET_MIN_LENGTH)) != null) {
            if ((i = ((XmlObjectBase) o).getBigIntegerValue().intValue()) > v.length) {
                context.invalid(XmlErrorCodes.DATATYPE_MIN_LENGTH_VALID$BINARY,
                    new Object[]{"base64Binary", v.length, i, QNameHelper.readable(sType)});
            }
        }

        if ((o = sType.getFacet(SchemaType.FACET_MAX_LENGTH)) != null) {
            if ((i = ((XmlObjectBase) o).getBigIntegerValue().intValue()) < v.length) {
                context.invalid(XmlErrorCodes.DATATYPE_MAX_LENGTH_VALID$BINARY,
                    new Object[]{"base64Binary", v.length, i, QNameHelper.readable(sType)});
            }
        }

        XmlObject[] vals = sType.getEnumerationValues();

        if (vals != null) {
            enumLoop:
            for (i = 0; i < vals.length; i++) {
                byte[] enumBytes = ((XmlObjectBase) vals[i]).getByteArrayValue();

                if (enumBytes.length != v.length) {
                    continue;
                }

                for (int j = 0; j < enumBytes.length; j++) {
                    if (enumBytes[j] != v[j]) {
                        continue enumLoop;
                    }
                }

                break;
            }

            if (i >= vals.length) {
                context.invalid(XmlErrorCodes.DATATYPE_ENUM_VALID$NO_VALUE,
                    new Object[]{"base64Binary", QNameHelper.readable(sType)});
            }
        }
    }

    protected void validate_simpleval(String lexical, ValidationContext ctx) {
        validateLexical(lexical, schemaType(), ctx);
        validateValue(getByteArrayValue(), schemaType(), ctx);
    }

}
