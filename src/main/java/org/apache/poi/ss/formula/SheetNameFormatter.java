/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.ss.formula;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.SpreadsheetVersion;

/**
 * Formats sheet names for use in formula expressions.
 */
public final class SheetNameFormatter {

    private static final char DELIMITER = '\'';

    /**
     * Matches a single cell ref with no absolute ('$') markers
     */
    private static final Pattern CELL_REF_PATTERN = Pattern.compile("([A-Za-z]+)([0-9]+)");

    private SheetNameFormatter() {
        // no instances of this class
    }
    /**
     * Used to format sheet names as they would appear in cell formula expressions.
     * @return the sheet name unchanged if there is no need for delimiting.  Otherwise the sheet
     * name is enclosed in single quotes (').  Any single quotes which were already present in the
     * sheet name will be converted to double single quotes ('').
     */
    public static String format(String rawSheetName) {
        StringBuilder sb = new StringBuilder((rawSheetName == null ? 0 : rawSheetName.length()) + 2);
        appendFormat(sb, rawSheetName);
        return sb.toString();
    }

    /**
     * Convenience method for ({@link #format(String)}) when a StringBuffer is already available.
     *
     * @param out - sheet name will be appended here possibly with delimiting quotes
     * @param rawSheetName - sheet name
     */
    public static void appendFormat(Appendable out, String rawSheetName) {
        try {
            boolean needsQuotes = needsDelimiting(rawSheetName);
            if(needsQuotes) {
                out.append(DELIMITER);
                appendAndEscape(out, rawSheetName);
                out.append(DELIMITER);
            } else {
                appendAndEscape(out, rawSheetName);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Convenience method for ({@link #format(String)}) when a StringBuffer is already available.
     *
     * @param out - sheet name will be appended here possibly with delimiting quotes
     * @param workbookName - workbook name
     * @param rawSheetName - sheet name
     */
    public static void appendFormat(Appendable out, String workbookName, String rawSheetName) {
        try {
            boolean needsQuotes = needsDelimiting(workbookName) || needsDelimiting(rawSheetName);
            if(needsQuotes) {
                out.append(DELIMITER);
                out.append('[');
                appendAndEscape(out, workbookName.replace('[', '(').replace(']', ')'));
                out.append(']');
                appendAndEscape(out, rawSheetName);
                out.append(DELIMITER);
            } else {
                out.append('[');
                appendOrREF(out, workbookName);
                out.append(']');
                appendOrREF(out, rawSheetName);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static void appendOrREF(Appendable out, String name) throws IOException {
        if(name == null) {
            out.append("#REF");
        } else {
            out.append(name);
        }
    }

    static void appendAndEscape(Appendable sb, String rawSheetName) {
        try {
            if (rawSheetName == null) {
                sb.append("#REF");
                return;
            }

            int len = rawSheetName.length();
            for (int i = 0; i < len; i++) {
                char ch = rawSheetName.charAt(i);
                if (ch == DELIMITER) {
                    // single quotes (') are encoded as ('')
                    sb.append(DELIMITER);
                }
                sb.append(ch);
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Tell if the given raw sheet name needs screening/delimiting.
     * @param rawSheetName the sheet name.
     * @return true if the given raw sheet name needs screening/delimiting, false otherwise or
     *          if the sheet name is null.
     */
    static boolean needsDelimiting(String rawSheetName) {
        if(rawSheetName == null) {
            return false;
        }

        int len = rawSheetName.length();
        if(len < 1) {
            return false; // some cases we get missing external references, resulting in empty sheet names
        }
        if(Character.isDigit(rawSheetName.charAt(0))) {
            // sheet name with digit in the first position always requires delimiting
            return true;
        }
        for(int i=0; i<len; i++) {
            char ch = rawSheetName.charAt(i);
            if(isSpecialChar(ch)) {
                return true;
            }
        }
        if(Character.isLetter(rawSheetName.charAt(0))
                && Character.isDigit(rawSheetName.charAt(len-1))) {
            // note - values like "A$1:$C$20" don't get this far
            if(nameLooksLikePlainCellReference(rawSheetName)) {
                return true;
            }
        }
        if (nameLooksLikeBooleanLiteral(rawSheetName)) {
            return true;
        }
        if (nameStartsWithR1C1CellReference(rawSheetName)) {
            return true;
        }
        // Error constant literals all contain '#' and other special characters
        // so they don't get this far
        return false;
    }

    private static boolean nameLooksLikeBooleanLiteral(String rawSheetName) {
        switch(rawSheetName.charAt(0)) {
            case 'T': case 't':
                return "TRUE".equalsIgnoreCase(rawSheetName);
            case 'F': case 'f':
                return "FALSE".equalsIgnoreCase(rawSheetName);
        }
        return false;
    }

    /**
     * @return {@code true} if the presence of the specified character in a sheet name would
     * require the sheet name to be delimited in formulas.  This includes every non-alphanumeric
     * character besides underscore '_' and dot '.'.
     */
    /* package */ static boolean isSpecialChar(char ch) {
        // note - Character.isJavaIdentifierPart() would allow dollars '$'
        if(Character.isLetterOrDigit(ch)) {
            return false;
        }
        switch(ch) {
            case '.': // dot is OK
            case '_': // underscore is OK
                return false;
            case '\n':
            case '\r':
            case '\t':
                throw new IllegalStateException("Illegal character (0x"
                        + Integer.toHexString(ch) + ") found in sheet name");
        }
        return true;
    }


    /**
     * Used to decide whether sheet names like 'AB123' need delimiting due to the fact that they
     * look like cell references.
     * <p>
     * This code is currently being used for translating formulas represented with {@code Ptg}
     * tokens into human readable text form.  In formula expressions, a sheet name always has a
     * trailing '!' so there is little chance for ambiguity.  It doesn't matter too much what this
     * method returns but it is worth noting the likely consumers of these formula text strings:
     * <ol>
     * <li>POI's own formula parser</li>
     * <li>Visual reading by human</li>
     * <li>VBA automation entry into Excel cell contents e.g.  ActiveCell.Formula = "=c64!A1"</li>
     * <li>Manual entry into Excel cell contents</li>
     * <li>Some third party formula parser</li>
     * </ol>
     *
     * At the time of writing, POI's formula parser tolerates cell-like sheet names in formulas
     * with or without delimiters.  The same goes for Excel(2007), both manual and automated entry.
     * <p>
     * For better or worse this implementation attempts to replicate Excel's formula renderer.
     * Excel uses range checking on the apparent 'row' and 'column' components.  Note however that
     * the maximum sheet size varies across versions.
     * @see CellReference
     */
    /* package */ static boolean cellReferenceIsWithinRange(String lettersPrefix, String numbersSuffix) {
        return CellReference.cellReferenceIsWithinRange(lettersPrefix, numbersSuffix, SpreadsheetVersion.EXCEL97);
    }

    /**
     * Note - this method assumes the specified rawSheetName has only letters and digits.  It
     * cannot be used to match absolute or range references (using the dollar or colon char).
     * <p>
     * Some notable cases:
     *    <table>
     *      <caption>Notable cases</caption>
     *      <tr><th>Input&nbsp;</th><th>Result&nbsp;</th><th>Comments</th></tr>
     *      <tr><td>"A1"&nbsp;&nbsp;</td><td>true</td><td>&nbsp;</td></tr>
     *      <tr><td>"a111"&nbsp;&nbsp;</td><td>true</td><td>&nbsp;</td></tr>
     *      <tr><td>"AA"&nbsp;&nbsp;</td><td>false</td><td>&nbsp;</td></tr>
     *      <tr><td>"aa1"&nbsp;&nbsp;</td><td>true</td><td>&nbsp;</td></tr>
     *      <tr><td>"A1A"&nbsp;&nbsp;</td><td>false</td><td>&nbsp;</td></tr>
     *      <tr><td>"A1A1"&nbsp;&nbsp;</td><td>false</td><td>&nbsp;</td></tr>
     *      <tr><td>"A$1:$C$20"&nbsp;&nbsp;</td><td>false</td><td>Not a plain cell reference</td></tr>
     *      <tr><td>"SALES20080101"&nbsp;&nbsp;</td><td>true</td>
     *      <td>Still needs delimiting even though well out of range</td></tr>
     *    </table>
     *
     * @return {@code true} if there is any possible ambiguity that the specified rawSheetName
     * could be interpreted as a valid cell name.
     */
    /* package */ static boolean nameLooksLikePlainCellReference(String rawSheetName) {
        Matcher matcher = CELL_REF_PATTERN.matcher(rawSheetName);
        if(!matcher.matches()) {
            return false;
        }

        // rawSheetName == "Sheet1" gets this far.
        String lettersPrefix = matcher.group(1);
        String numbersSuffix = matcher.group(2);
        return cellReferenceIsWithinRange(lettersPrefix, numbersSuffix);
    }

    /**
     * Checks if the sheet name starts with R1C1 style cell reference.
     * If this is the case Excel requires the sheet name to be enclosed in single quotes.
     * @return {@code true} if the specified rawSheetName starts with R1C1 style cell reference
     */
    static boolean nameStartsWithR1C1CellReference(String rawSheetName) {
        int len = rawSheetName.length();
        char firstChar = rawSheetName.charAt(0);
        if (firstChar == 'R' || firstChar == 'r') {
            if (len > 1) {
                char secondChar = rawSheetName.charAt(1);
                if (secondChar == 'C' || secondChar == 'c') {
                    if (len > 2) {
                        char thirdChar = rawSheetName.charAt(2);
                        return Character.isDigit(thirdChar);
                    } else {
                        return true;
                    }
                } else {
                    return Character.isDigit(secondChar);
                }
            } else {
                return true;
            }
        } else if (firstChar == 'C' || firstChar == 'c') {
            if (len > 1) {
                char secondChar = rawSheetName.charAt(1);
                return Character.isDigit(secondChar);
            } else {
                return true;
            }
        }
        return false;
    }
}
