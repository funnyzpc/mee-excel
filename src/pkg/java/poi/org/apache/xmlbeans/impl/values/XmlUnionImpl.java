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

import poi.org.apache.xmlbeans.*;
import poi.org.apache.xmlbeans.GDate;
import poi.org.apache.xmlbeans.GDurationSpecification;
import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.impl.common.QNameHelper;
import poi.org.apache.xmlbeans.impl.common.ValidationContext;
import poi.org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import poi.org.apache.xmlbeans.GDateSpecification;
import poi.org.apache.xmlbeans.GDuration;
import poi.org.apache.xmlbeans.SimpleValue;
import poi.org.apache.xmlbeans.StringEnumAbstractBase;
import poi.org.apache.xmlbeans.XmlAnySimpleType;
import poi.org.apache.xmlbeans.XmlErrorCodes;
import poi.org.apache.xmlbeans.XmlObject;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * This class implements simple union types.
 */
public class XmlUnionImpl extends XmlObjectBase implements XmlAnySimpleType {
    public XmlUnionImpl(SchemaType type, boolean complex) {
        _schemaType = type;
        initComplexType(complex, false);
    }

    public SchemaType schemaType() {
        return _schemaType;
    }

    public SchemaType instanceType() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).instanceType();
    }

    private final SchemaType _schemaType;
    private XmlAnySimpleType _value; // underlying value
    private String _textvalue = ""; // textual value


    // SIMPLE VALUE ACCESSORS BELOW -------------------------------------------
    // gets raw text value

    protected String compute_text(NamespaceManager nsm) {
        return _textvalue;
    }

    protected boolean is_defaultable_ws(String v) {
        try {
            XmlAnySimpleType savedValue = _value;
            set_text(v);

            // restore the saved value
            _value = savedValue;

            return false;
        } catch (XmlValueOutOfRangeException e) {
            return true;
        }
    }

    protected void set_text(String s) {
        // first check against any patterns...
        if (!_schemaType.matchPatternFacet(s) && _validateOnSet()) {
            throw new XmlValueOutOfRangeException(XmlErrorCodes.DATATYPE_VALID$PATTERN_VALID,
                new Object[]{"string", s, QNameHelper.readable(_schemaType)});
        }


        // save state for rollback
        String original = _textvalue;
        _textvalue = s;

        // iterate through the types, trying to create a type
        SchemaType[] members = _schemaType.getUnionConstituentTypes();
        assert (members != null);

        boolean pushed = false;
        // boolean wasstrict = set_strict(true); // tell types to complain ferverently about errors
        if (has_store()) {
            NamespaceContext.push(new NamespaceContext(get_store()));
            pushed = true;
        }
        try {
            for (boolean validate = true; validate || !_validateOnSet(); validate = false) {
                for (SchemaType member : members) {
                    // From the point of view of the following call, "this" is a generic
                    // XmlAnySimpleType implementation, for which only getText can be called.
                    // (Note that "this" is not wrapped in the proxy object.)
                    try {
                        XmlAnySimpleType newval = ((SchemaTypeImpl) member).newValue(s, validate);

                        // now we need to check against (enuemration) restrictions
                        if (!check(newval, _schemaType)) {
                            continue;
                        }

                        // found one that works!
                        _value = newval;
                        return;
                    } catch (XmlValueOutOfRangeException ignored) {
                    } catch (Exception e) {
                        throw new RuntimeException("Troublesome union exception caused by unexpected " + e, e);
                        // assert(false) : "Unexpected " + e;
                        // continue;
                    }
                }
                if (!validate) {
                    break;
                }
            }
        } finally {
            if (pushed) {
                NamespaceContext.pop();
            }
            // set_strict(wasstrict);
        }


        // doesn't match any of the members; rollback and throw
        _textvalue = original;
        throw new XmlValueOutOfRangeException(XmlErrorCodes.DATATYPE_VALID$UNION,
            new Object[]{s, QNameHelper.readable(_schemaType)});
    }

    protected void set_nil() {
        _value = null;
        _textvalue = null;
    }

    protected int get_wscanon_rule() {
        return SchemaType.WS_PRESERVE;
    }


    // numerics
    public float getFloatValue() {
        check_dated();
        return _value == null ? 0.0f : ((SimpleValue) _value).getFloatValue();
    }

    public double getDoubleValue() {
        check_dated();
        return _value == null ? 0.0 : ((SimpleValue) _value).getDoubleValue();
    }

    public BigDecimal getBigDecimalValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getBigDecimalValue();
    }

    public BigInteger getBigIntegerValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getBigIntegerValue();
    }

    public byte getByteValue() {
        check_dated();
        return _value == null ? 0 : ((SimpleValue) _value).getByteValue();
    }

    public short getShortValue() {
        check_dated();
        return _value == null ? 0 : ((SimpleValue) _value).getShortValue();
    }

    public int getIntValue() {
        check_dated();
        return _value == null ? 0 : ((SimpleValue) _value).getIntValue();
    }

    public long getLongValue() {
        check_dated();
        return _value == null ? 0 : ((SimpleValue) _value).getLongValue();
    }


    // various
    public byte[] getByteArrayValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getByteArrayValue();
    }

    public boolean getBooleanValue() {
        check_dated();
        return _value != null && ((SimpleValue) _value).getBooleanValue();
    }

    public Calendar getCalendarValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getCalendarValue();
    }

    public Date getDateValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getDateValue();
    }

    public GDate getGDateValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getGDateValue();
    }

    public GDuration getGDurationValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getGDurationValue();
    }

    public QName getQNameValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getQNameValue();
    }

    public List<?> getListValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getListValue();
    }

    public List<? extends XmlAnySimpleType> xgetListValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).xgetListValue();
    }

    public StringEnumAbstractBase getEnumValue() {
        check_dated();
        return _value == null ? null : ((SimpleValue) _value).getEnumValue();
    }

    public String getStringValue() {
        check_dated();
        return _value == null ? null : _value.getStringValue();
    }

    /**
     * True if the given schema type's logical type is a match for
     * the given category of java concepts.
     */

    private static final int JAVA_NUMBER = SchemaType.BTC_LAST_BUILTIN + 1;
    private static final int JAVA_DATE = SchemaType.BTC_LAST_BUILTIN + 2;
    private static final int JAVA_CALENDAR = SchemaType.BTC_LAST_BUILTIN + 3;
    private static final int JAVA_BYTEARRAY = SchemaType.BTC_LAST_BUILTIN + 4;
    private static final int JAVA_LIST = SchemaType.BTC_LAST_BUILTIN + 5;

    private static boolean logical_overlap(SchemaType type, int javacode) {
        // non-union types because it's being applied on irreducible union members!
        assert (type.getSimpleVariety() != SchemaType.UNION);

        if (javacode <= SchemaType.BTC_LAST_BUILTIN) {
            if (type.getSimpleVariety() != SchemaType.ATOMIC) {
                return false;
            }

            return (type.getPrimitiveType().getBuiltinTypeCode() == javacode);
        }

        switch (javacode) {
            case JAVA_NUMBER: {
                if (type.getSimpleVariety() != SchemaType.ATOMIC) {
                    return false;
                }

                switch (type.getPrimitiveType().getBuiltinTypeCode()) {
                    case SchemaType.BTC_FLOAT:
                    case SchemaType.BTC_DOUBLE:
                    case SchemaType.BTC_DECIMAL:
                    case SchemaType.BTC_G_YEAR:
                    case SchemaType.BTC_G_MONTH:
                    case SchemaType.BTC_G_DAY:
                        return true;
                }
                return false;
            }
            case JAVA_DATE: {
                if (type.getSimpleVariety() != SchemaType.ATOMIC) {
                    return false;
                }

                switch (type.getPrimitiveType().getBuiltinTypeCode()) {
                    case SchemaType.BTC_DATE_TIME:
                    case SchemaType.BTC_DATE:
                        return true;
                }
                return false;
            }
            case JAVA_CALENDAR: {
                if (type.getSimpleVariety() != SchemaType.ATOMIC) {
                    return false;
                }

                switch (type.getPrimitiveType().getBuiltinTypeCode()) {
                    case SchemaType.BTC_DATE_TIME:
                    case SchemaType.BTC_DATE:
                    case SchemaType.BTC_TIME:
                    case SchemaType.BTC_G_YEAR_MONTH:
                    case SchemaType.BTC_G_MONTH_DAY:
                    case SchemaType.BTC_G_YEAR:
                    case SchemaType.BTC_G_MONTH:
                    case SchemaType.BTC_G_DAY:
                        return true;
                }
                return false;
            }

            case JAVA_BYTEARRAY: {
                if (type.getSimpleVariety() != SchemaType.ATOMIC) {
                    return false;
                }

                switch (type.getPrimitiveType().getBuiltinTypeCode()) {
                    case SchemaType.BTC_BASE_64_BINARY:
                    case SchemaType.BTC_HEX_BINARY:
                        return true;
                }
                return false;
            }
            case JAVA_LIST: {
                return (type.getSimpleVariety() == SchemaType.LIST);
            }
        }

        assert (false) : "missing case";
        return false;
    }

    /**
     * Grabs a chained value of type st, creating and attaching
     * one if not present.
     */
    private void set_primitive(int typecode, Object val) {
        SchemaType[] members = _schemaType.getUnionConstituentTypes();
        assert (members != null);

        boolean pushed = false;
        if (has_store()) {
            NamespaceContext.push(new NamespaceContext(get_store()));
            pushed = true;
        }
        try {
            for (boolean validate = true; validate || !_validateOnSet(); validate = false) {
                for (SchemaType member : members) {
                    // candidates must be a logical match for the desired typecode
                    if (logical_overlap(member, typecode)) {
                        XmlAnySimpleType newval;

                        try {
                            newval = ((SchemaTypeImpl) member).newValue(val, validate);
                        } catch (XmlValueOutOfRangeException ignored) {
                            // doesn't match this type even though logical categories
                            // line up (probably because of restriciton); try the next type.
                            continue;
                        } catch (Exception e) {
                            assert (false) : "Unexpected " + e;
                            continue;
                        }

                    /* TODO: rethink this - disabling for now.

                    // OK, now we've got a newval... We have to verify
                    // that lexically it doesn't overlap with previous types

                    String newvaltext = null;

                    inner: for (int j = 0; j < i; j++)
                    {
                        if (members[j].getSimpleVariety() == SchemaType.LIST ||
                            lexical_overlap(members[j].getPrimitiveType().getBuiltinTypeCode(),
                                            newval.schemaType().getPrimitiveType().getBuiltinTypeCode()))
                        {
                            // there is a preceding type that may lexically overlap with ours...
                            // if it lexically contains the string representation of our new
                            // proposed value, then it's impossible for the union to have our
                            // logical value (because it would have been masked) and throw an
                            // error.
                            if (newvaltext == null)
                                newvaltext = newval.stringValue();
                            try
                            {
                                // discard return value
                                members[i].newValue(newvaltext);

                                // oh bad, we succeeded. Our instance lexically looks like a
                                // previous type, and this isn't a valid value. Keep on hunting.
                                continue outer;
                            }
                            catch (XmlValueOutOfRangeException e)
                            {
                                // this is good: this error means that our value doesn't look like
                                // the other type.
                                continue inner;
                            }
                        }
                    }

                    */

                        // No lexical masking: we're OK
                        _value = newval;
                        _textvalue = _value.getStringValue();
                        return;
                    }
                }
                if (!validate) {
                    break;
                }
            }
        } finally {
            if (pushed) {
                NamespaceContext.pop();
            }
        }

        // doesn't match any of the members; throw
        throw new XmlValueOutOfRangeException(XmlErrorCodes.DATATYPE_VALID$UNION,
            new Object[]{val.toString(), QNameHelper.readable(_schemaType)});
    }

    // here are the setters

    protected void set_boolean(boolean v) {
        set_primitive(SchemaType.BTC_BOOLEAN, v);
    }

    protected void set_byte(byte v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_short(short v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_int(int v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_long(long v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_float(float v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_double(double v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_ByteArray(byte[] b) {
        set_primitive(JAVA_BYTEARRAY, b);
    }

    protected void set_hex(byte[] b) {
        set_primitive(JAVA_BYTEARRAY, b);
    }

    protected void set_b64(byte[] b) {
        set_primitive(JAVA_BYTEARRAY, b);
    }

    protected void set_BigInteger(BigInteger v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_BigDecimal(BigDecimal v) {
        set_primitive(JAVA_NUMBER, v);
    }

    protected void set_QName(QName v) {
        set_primitive(SchemaType.BTC_QNAME, v);
    }

    protected void set_Calendar(Calendar c) {
        set_primitive(JAVA_CALENDAR, c);
    }

    protected void set_Date(Date d) {
        set_primitive(JAVA_DATE, d);
    }

    protected void set_GDate(GDateSpecification d) {
        int btc = d.getBuiltinTypeCode();
        if (btc <= 0) {
            throw new XmlValueOutOfRangeException();
        }
        set_primitive(btc, d);
    }

    protected void set_GDuration(GDurationSpecification d) {
        set_primitive(SchemaType.BTC_DURATION, d);
    }

    protected void set_enum(StringEnumAbstractBase e) {
        set_primitive(SchemaType.BTC_STRING, e);
    }

    protected void set_list(List<?> v) {
        set_primitive(JAVA_LIST, v);
    }


    protected void set_xmlfloat(XmlObject v) {
        set_primitive(SchemaType.BTC_FLOAT, v);
    }

    protected void set_xmldouble(XmlObject v) {
        set_primitive(SchemaType.BTC_DOUBLE, v);
    }

    protected void set_xmldecimal(XmlObject v) {
        set_primitive(SchemaType.BTC_DECIMAL, v);
    }

    protected void set_xmlduration(XmlObject v) {
        set_primitive(SchemaType.BTC_DURATION, v);
    }

    protected void set_xmldatetime(XmlObject v) {
        set_primitive(SchemaType.BTC_DATE_TIME, v);
    }

    protected void set_xmltime(XmlObject v) {
        set_primitive(SchemaType.BTC_TIME, v);
    }

    protected void set_xmldate(XmlObject v) {
        set_primitive(SchemaType.BTC_DATE, v);
    }

    protected void set_xmlgyearmonth(XmlObject v) {
        set_primitive(SchemaType.BTC_G_YEAR_MONTH, v);
    }

    protected void set_xmlgyear(XmlObject v) {
        set_primitive(SchemaType.BTC_G_YEAR, v);
    }

    protected void set_xmlgmonthday(XmlObject v) {
        set_primitive(SchemaType.BTC_G_MONTH_DAY, v);
    }

    protected void set_xmlgday(XmlObject v) {
        set_primitive(SchemaType.BTC_G_DAY, v);
    }

    protected void set_xmlgmonth(XmlObject v) {
        set_primitive(SchemaType.BTC_G_MONTH, v);
    }


    private static boolean check(XmlObject v, SchemaType sType) {
        XmlObject[] vals = sType.getEnumerationValues();
        if (vals != null) {
            for (XmlObject val : vals) {
                if (val.valueEquals(v)) {
                    return true;
                }
            }
            return false;
        }

        return true;
    }

    protected boolean equal_to(XmlObject xmlobj) {
        return _value.valueEquals(xmlobj);
    }

    protected int value_hash_code() {
        return _value.hashCode();
    }

    protected void validate_simpleval(String lexical, ValidationContext ctx) {
        try {
            check_dated();
        } catch (Exception e) {
            ctx.invalid(XmlErrorCodes.UNION, new Object[]{"'" + lexical + "' does not match any of the member types for " + QNameHelper.readable(schemaType())});
            return;
        }
        if (_value == null) {
            ctx.invalid(XmlErrorCodes.UNION, new Object[]{"'" + lexical + "' does not match any of the member types for " + QNameHelper.readable(schemaType())});
            return;
        }

        ((XmlObjectBase) _value).validate_simpleval(lexical, ctx);
    }


}

