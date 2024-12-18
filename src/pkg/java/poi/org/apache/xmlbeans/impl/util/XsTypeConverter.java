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

package poi.org.apache.xmlbeans.impl.util;

import poi.org.apache.xmlbeans.*;
import poi.org.apache.xmlbeans.GDate;
import poi.org.apache.xmlbeans.SchemaType;
import poi.org.apache.xmlbeans.XmlCalendar;
import poi.org.apache.xmlbeans.impl.common.InvalidLexicalValueException;
import poi.org.apache.xmlbeans.GDateBuilder;
import poi.org.apache.xmlbeans.GDateSpecification;
import poi.org.apache.xmlbeans.XmlError;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public final class XsTypeConverter {
    private static final String POS_INF_LEX = "INF";
    private static final String NEG_INF_LEX = "-INF";
    private static final String NAN_LEX = "NaN";

    private static final char NAMESPACE_SEP = ':';
    private static final String EMPTY_PREFIX = "";
    private static final BigDecimal DECIMAL__ZERO = new BigDecimal(0.0);

    // See Section 2.4.3 of FRC2396  http://www.ietf.org/rfc/rfc2396.txt
    private static final String[] URI_CHARS_TO_BE_REPLACED = {" ", "{", "}", "|", "\\", "^", "[", "]", "`"};
    private static final String[] URI_CHARS_REPLACED_WITH = {"%20", "%7b", "%7d", "%7c", "%5c", "%5e", "%5b", "%5d", "%60"};

    // ======================== float ========================
    public static float lexFloat(CharSequence cs)
        throws NumberFormatException {
        final String v = cs.toString();
        try {
            //current jdk impl of parseFloat calls trim() on the string.
            //Any other space is illegal anyway, whether there are one or more spaces.
            //so no need to do a collapse pass through the string.
            if (cs.length() > 0) {
                char ch = cs.charAt(cs.length() - 1);
                if (ch == 'f' || ch == 'F') {
                    if (cs.charAt(cs.length() - 2) != 'N') {
                        throw new NumberFormatException("Invalid char '" + ch + "' in float.");
                    }
                }
            }
            return Float.parseFloat(v);
        } catch (NumberFormatException e) {
            if (v.equals(POS_INF_LEX)) {
                return Float.POSITIVE_INFINITY;
            }
            if (v.equals(NEG_INF_LEX)) {
                return Float.NEGATIVE_INFINITY;
            }
            if (v.equals(NAN_LEX)) {
                return Float.NaN;
            }

            throw e;
        }
    }

    public static float lexFloat(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexFloat(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid float: " + cs;
            errors.add(XmlError.forMessage(msg));

            return Float.NaN;
        }
    }

    public static String printFloat(float value) {
        if (value == Float.POSITIVE_INFINITY) {
            return POS_INF_LEX;
        } else if (value == Float.NEGATIVE_INFINITY) {
            return NEG_INF_LEX;
        } else if (Float.isNaN(value)) {
            return NAN_LEX;
        } else {
            return Float.toString(value);
        }
    }


    // ======================== double ========================
    public static double lexDouble(CharSequence cs)
        throws NumberFormatException {
        final String v = cs.toString();

        try {
            //current jdk impl of parseDouble calls trim() on the string.
            //Any other space is illegal anyway, whether there are one or more spaces.
            //so no need to do a collapse pass through the string.
            if (cs.length() > 0) {
                char ch = cs.charAt(cs.length() - 1);
                if (ch == 'd' || ch == 'D') {
                    throw new NumberFormatException("Invalid char '" + ch + "' in double.");
                }
            }
            return Double.parseDouble(v);
        } catch (NumberFormatException e) {
            if (v.equals(POS_INF_LEX)) {
                return Double.POSITIVE_INFINITY;
            }
            if (v.equals(NEG_INF_LEX)) {
                return Double.NEGATIVE_INFINITY;
            }
            if (v.equals(NAN_LEX)) {
                return Double.NaN;
            }

            throw e;
        }
    }

    public static double lexDouble(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexDouble(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid double: " + cs;
            errors.add(XmlError.forMessage(msg));

            return Double.NaN;
        }
    }

    public static String printDouble(double value) {
        if (value == Double.POSITIVE_INFINITY) {
            return POS_INF_LEX;
        } else if (value == Double.NEGATIVE_INFINITY) {
            return NEG_INF_LEX;
        } else if (Double.isNaN(value)) {
            return NAN_LEX;
        } else {
            return Double.toString(value);
        }
    }


    // ======================== decimal ========================
    public static BigDecimal lexDecimal(CharSequence cs)
        throws NumberFormatException {
        final String v = cs.toString();

        //TODO: review this
        //NOTE: we trim unneeded zeros from the string because
        //java.math.BigDecimal considers them significant for its
        //equals() method, but the xml value
        //space does not consider them significant.
        //See http://www.w3.org/2001/05/xmlschema-errata#e2-44
        return new BigDecimal(trimTrailingZeros(v));
    }

    private static final char[] CH_ZEROS = new char[]{'0', '0', '0', '0', '0', '0', '0', '0',
        '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};

    public static String printDecimal(BigDecimal value) {
        // We can't simply use value.toString() here, because in JDK1.5 that returns an
        // exponent String and exponents are not allowed in XMLSchema decimal values
        // The following code comes from Apache Harmony
        String intStr = value.unscaledValue().toString();
        int scale = value.scale();
        if ((scale == 0) || ((value.longValue() == 0) && (scale < 0))) {
            return intStr;
        }

        int begin = (value.signum() < 0) ? 1 : 0;
        int delta = scale;
        // We take space for all digits, plus a possible decimal point, plus 'scale'
        StringBuilder result = new StringBuilder(intStr.length() + 1 + Math.abs(scale));

        if (begin == 1) {
            // If the number is negative, we insert a '-' character at front
            result.append('-');
        }
        if (scale > 0) {
            delta -= (intStr.length() - begin);
            if (delta >= 0) {
                result.append("0."); //$NON-NLS-1$
                // To append zeros after the decimal point
                for (; delta > CH_ZEROS.length; delta -= CH_ZEROS.length) {
                    result.append(CH_ZEROS);
                }
                result.append(CH_ZEROS, 0, delta);
                result.append(intStr.substring(begin));
            } else {
                delta = begin - delta;
                result.append(intStr.substring(begin, delta));
                result.append('.');
                result.append(intStr.substring(delta));
            }
        } else {// (scale <= 0)
            result.append(intStr.substring(begin));
            // To append trailing zeros
            for (; delta < -CH_ZEROS.length; delta += CH_ZEROS.length) {
                result.append(CH_ZEROS);
            }
            result.append(CH_ZEROS, 0, -delta);
        }
        return result.toString();
    }

    // ======================== integer ========================
    public static BigInteger lexInteger(CharSequence cs)
        throws NumberFormatException {
        if (cs.length() > 1) {
            if (cs.charAt(0) == '+' && cs.charAt(1) == '-') {
                throw new NumberFormatException("Illegal char sequence '+-'");
            }
        }
        final String v = cs.toString();

        //TODO: consider special casing zero and one to return static values
        //from BigInteger to avoid object creation.
        return new BigInteger(trimInitialPlus(v));
    }

    public static BigInteger lexInteger(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexInteger(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid long: " + cs;
            errors.add(XmlError.forMessage(msg));
            return BigInteger.ZERO;
        }
    }

    public static String printInteger(BigInteger value) {
        return value.toString();
    }

    // ======================== long ========================
    public static long lexLong(CharSequence cs)
        throws NumberFormatException {
        final String v = cs.toString();
        return Long.parseLong(trimInitialPlus(v));
    }

    public static long lexLong(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexLong(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid long: " + cs;
            errors.add(XmlError.forMessage(msg));
            return 0L;
        }
    }

    public static String printLong(long value) {
        return Long.toString(value);
    }


    // ======================== short ========================
    public static short lexShort(CharSequence cs)
        throws NumberFormatException {
        return parseShort(cs);
    }

    public static short lexShort(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexShort(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid short: " + cs;
            errors.add(XmlError.forMessage(msg));
            return 0;
        }
    }

    public static String printShort(short value) {
        return Short.toString(value);
    }


    // ======================== int ========================
    public static int lexInt(CharSequence cs)
        throws NumberFormatException {
        return parseInt(cs);
    }

    public static int lexInt(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexInt(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid int:" + cs;
            errors.add(XmlError.forMessage(msg));
            return 0;
        }
    }

    public static String printInt(int value) {
        return Integer.toString(value);
    }


    // ======================== byte ========================
    public static byte lexByte(CharSequence cs)
        throws NumberFormatException {
        return parseByte(cs);
    }

    public static byte lexByte(CharSequence cs, Collection<XmlError> errors) {
        try {
            return lexByte(cs);
        } catch (NumberFormatException e) {
            String msg = "invalid byte: " + cs;
            errors.add(XmlError.forMessage(msg));
            return 0;
        }
    }

    public static String printByte(byte value) {
        return Byte.toString(value);
    }


    // ======================== string ========================
    public static String printString(String value) {
        return value;
    }

    // ======================== GDate ========================
    public static GDate lexGDate(CharSequence charSeq) {
        return new GDate(charSeq);
    }

    public static GDate lexGDate(String xsd_gdate, Collection<XmlError> errors) {
        try {
            return lexGDate(xsd_gdate);
        } catch (IllegalArgumentException e) {
            errors.add(XmlError.forMessage(e.getMessage()));
            return new GDateBuilder().toGDate();
        }
    }

    public static String printGDate(GDate gdate, Collection<XmlError> errors) {
        return gdate.toString();
    }


    // ======================== dateTime ========================
    public static XmlCalendar lexDateTime(CharSequence v) {
        GDateSpecification value = getGDateValue(v, SchemaType.BTC_DATE_TIME);
        return value.getCalendar();
    }


    public static String printDateTime(Calendar c) {
        return printDateTime(c, SchemaType.BTC_DATE_TIME);
    }

    public static String printTime(Calendar c) {
        return printDateTime(c, SchemaType.BTC_TIME);
    }

    public static String printDate(Calendar c) {
        return printDateTime(c, SchemaType.BTC_DATE);
    }

    public static String printDate(Date d) {
        GDateSpecification value = getGDateValue(d, SchemaType.BTC_DATE);
        return value.toString();
    }

    public static String printDateTime(Calendar c, int type_code) {
        GDateSpecification value = getGDateValue(c, type_code);
        return value.toString();
    }

    public static String printDateTime(Date c) {
        GDateSpecification value = getGDateValue(c, SchemaType.BTC_DATE_TIME);
        return value.toString();
    }


    // ======================== hexBinary ========================
    public static CharSequence printHexBinary(byte[] val) {
        return HexBin.bytesToString(val);
    }


    // date utils
    public static GDateSpecification getGDateValue(Date d,
                                                   int builtin_type_code) {
        GDateBuilder gDateBuilder = new GDateBuilder(d);
        gDateBuilder.setBuiltinTypeCode(builtin_type_code);
        GDate value = gDateBuilder.toGDate();
        return value;
    }


    public static GDateSpecification getGDateValue(Calendar c,
                                                   int builtin_type_code) {
        GDateBuilder gDateBuilder = new GDateBuilder(c);
        gDateBuilder.setBuiltinTypeCode(builtin_type_code);
        GDate value = gDateBuilder.toGDate();
        return value;
    }

    public static GDateSpecification getGDateValue(CharSequence v,
                                                   int builtin_type_code) {
        GDateBuilder gDateBuilder = new GDateBuilder(v);
        gDateBuilder.setBuiltinTypeCode(builtin_type_code);
        GDate value = gDateBuilder.toGDate();
        return value;
    }

    private static String trimInitialPlus(String xml) {
        if (xml.length() > 0 && xml.charAt(0) == '+') {
            return xml.substring(1);
        } else {
            return xml;
        }
    }

    private static String trimTrailingZeros(String xsd_decimal) {
        final int last_char_idx = xsd_decimal.length() - 1;
        if (xsd_decimal.charAt(last_char_idx) == '0') {
            final int last_point = xsd_decimal.lastIndexOf('.');
            if (last_point >= 0) {
                //find last trailing zero
                for (int idx = last_char_idx; idx > last_point; idx--) {
                    if (xsd_decimal.charAt(idx) != '0') {
                        return xsd_decimal.substring(0, idx + 1);
                    }
                }
                //reaching here means the string matched xxx.0*
                return xsd_decimal.substring(0, last_point);
            }
        }
        return xsd_decimal;
    }

    private static int parseInt(CharSequence cs) {
        return parseIntXsdNumber(cs, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static short parseShort(CharSequence cs) {
        return (short) parseIntXsdNumber(cs, Short.MIN_VALUE, Short.MAX_VALUE);
    }

    private static byte parseByte(CharSequence cs) {
        return (byte) parseIntXsdNumber(cs, Byte.MIN_VALUE, Byte.MAX_VALUE);
    }

    private static int parseIntXsdNumber(CharSequence ch, int min_value, int max_value) {
        // int parser on a CharSequence
        int length = ch.length();
        if (length < 1) {
            throw new NumberFormatException("For input string: \"" + ch.toString() + "\"");
        }

        int sign = 1;
        int result = 0;
        int start = 0;
        int limit;
        int limit2;

        char c = ch.charAt(0);
        if (c == '-') {
            start++;
            limit = (min_value / 10);
            limit2 = -(min_value % 10);
        } else if (c == '+') {
            start++;
            sign = -1;
            limit = -(max_value / 10);
            limit2 = (max_value % 10);
        } else {
            sign = -1;
            limit = -(max_value / 10);
            limit2 = (max_value % 10);
        }

        for (int i = 0; i < length - start; i++) {
            c = ch.charAt(i + start);
            int v = Character.digit(c, 10);

            if (v < 0) {
                throw new NumberFormatException("For input string: \"" + ch.toString() + "\"");
            }

            if (result < limit || (result == limit && v > limit2)) {
                throw new NumberFormatException("For input string: \"" + ch.toString() + "\"");
            }

            result = result * 10 - v;
        }

        return sign * result;
    }

    // ======================== anyURI ========================

    /**
     * Checkes the regular expression of URI, defined by RFC2369 http://www.ietf.org/rfc/rfc2396.txt Appendix B.
     * Note: The whitespace normalization rule collapse must be applied priot to calling this method.
     *
     * @param lexical_value the lexical value
     * @return same input value if input value is in the lexical space
     */
    public static CharSequence lexAnyURI(CharSequence lexical_value) {
        /*  // Reg exp from RFC2396, but it's too forgiving for XQTS
        Pattern p = Pattern.compile("^([^:/?#]+:)?(//[^/?#]*)?([^?#]*)(\\?[^#]*)?(#.*)?");
        Matcher m = p.matcher(lexical_value);
        if ( !m.matches() )
            throw new InvalidLexicalValueException("invalid anyURI value");
        else
        {
            for ( int i = 0; i<= m.groupCount(); i++ )
            {
                System.out.print("  " + i + ": " + m.group(i));
            }
            System.out.println("");
            return lexical_value;
        } */

        // Per XMLSchema spec allow spaces inside URIs
        StringBuilder s = new StringBuilder(lexical_value.toString());
        for (int ic = 0; ic < URI_CHARS_TO_BE_REPLACED.length; ic++) {
            int i = 0;
            while ((i = s.indexOf(URI_CHARS_TO_BE_REPLACED[ic], i)) >= 0) {
                s.replace(i, i + 1, URI_CHARS_REPLACED_WITH[ic]);
                i += 3;
            }
        }

        try {
            URI.create(s.toString());
        } catch (IllegalArgumentException e) {
            throw new InvalidLexicalValueException("invalid anyURI value: " + lexical_value, e);
        }

        return lexical_value;
    }
}