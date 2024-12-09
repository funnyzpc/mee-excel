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

package org.apache.poi.hssf.extractor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Locale;

import org.apache.poi.extractor.POIOLE2TextExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.usermodel.HeaderFooter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

/**
 * A text extractor for Excel files.
 * <p>
 * Returns the textual content of the file, suitable for
 *  indexing by something like Lucene, but not really
 *  intended for display to the user.
 * </p>
 * <p>
 * To turn an excel file into a CSV or similar, then see
 *  the XLS2CSVmra example
 * </p>
 *
 * @see <a href="http://svn.apache.org/repos/asf/poi/trunk/poi-examples/src/main/java/org/apache/poi/hssf/eventusermodel/examples/XLS2CSVmra.java">XLS2CSVmra</a>
 */
public class ExcelExtractor implements POIOLE2TextExtractor, org.apache.poi.ss.extractor.ExcelExtractor {
    private final HSSFWorkbook _wb;
    private final HSSFDataFormatter _formatter;
    private boolean doCloseFilesystem = true;
    private boolean _includeSheetNames = true;
    private boolean _shouldEvaluateFormulas = true;
    private boolean _includeCellComments;
    private boolean _includeBlankCells;
    private boolean _includeHeadersFooters = true;

    public ExcelExtractor(HSSFWorkbook wb) {
        _wb = wb;
        _formatter = new HSSFDataFormatter();
    }

    public ExcelExtractor(POIFSFileSystem fs) throws IOException {
        this(fs.getRoot());
    }

    public ExcelExtractor(DirectoryNode dir) throws IOException {
        this(new HSSFWorkbook(dir, true));
    }

    private static final class CommandParseException extends Exception {
        public CommandParseException(String msg) {
            super(msg);
        }
    }
    private static final class CommandArgs {
        private final boolean _requestHelp;
        private final File _inputFile;
        private final boolean _showSheetNames;
        private final boolean _evaluateFormulas;
        private final boolean _showCellComments;
        private final boolean _showBlankCells;
        private final boolean _headersFooters;
        public CommandArgs(String[] args) throws CommandParseException {
            int nArgs = args.length;
            File inputFile = null;
            boolean requestHelp = false;
            boolean showSheetNames = true;
            boolean evaluateFormulas = true;
            boolean showCellComments = false;
            boolean showBlankCells = false;
            boolean headersFooters = true;
            for (int i=0; i<nArgs; i++) {
                String arg = args[i];
                if ("-help".equalsIgnoreCase(arg)) {
                    requestHelp = true;
                    break;
                }
                if ("-i".equals(arg)) {
                     // step to next arg
                    if (++i >= nArgs) {
                        throw new CommandParseException("Expected filename after '-i'");
                    }
                    arg = args[i];
                    if (inputFile != null) {
                        throw new CommandParseException("Only one input file can be supplied");
                    }
                    inputFile = new File(arg);
                    if (!inputFile.exists()) {
                        throw new CommandParseException("Specified input file '" + arg + "' does not exist");
                    }
                    if (inputFile.isDirectory()) {
                        throw new CommandParseException("Specified input file '" + arg + "' is a directory");
                    }
                    continue;
                }
                if ("--show-sheet-names".equals(arg)) {
                    showSheetNames = parseBoolArg(args, ++i);
                    continue;
                }
                if ("--evaluate-formulas".equals(arg)) {
                    evaluateFormulas = parseBoolArg(args, ++i);
                    continue;
                }
                if ("--show-comments".equals(arg)) {
                    showCellComments = parseBoolArg(args, ++i);
                    continue;
                }
                if ("--show-blanks".equals(arg)) {
                    showBlankCells = parseBoolArg(args, ++i);
                    continue;
                }
                if ("--headers-footers".equals(arg)) {
                    headersFooters = parseBoolArg(args, ++i);
                    continue;
                }
                throw new CommandParseException("Invalid argument '" + arg + "'");
            }
            _requestHelp = requestHelp;
            _inputFile = inputFile;
            _showSheetNames = showSheetNames;
            _evaluateFormulas = evaluateFormulas;
            _showCellComments = showCellComments;
            _showBlankCells = showBlankCells;
            _headersFooters = headersFooters;
        }
        private static boolean parseBoolArg(String[] args, int i) throws CommandParseException {
            if (i >= args.length) {
                throw new CommandParseException("Expected value after '" + args[i-1] + "'");
            }
            String value = args[i].toUpperCase(Locale.ROOT);
            if ("Y".equals(value) || "YES".equals(value) || "ON".equals(value) || "TRUE".equals(value)) {
                return true;
            }
            if ("N".equals(value) || "NO".equals(value) || "OFF".equals(value) || "FALSE".equals(value)) {
                return false;
            }
            throw new CommandParseException("Invalid value '" + args[i] + "' for '" + args[i-1] + "'. Expected 'Y' or 'N'");
        }
        public boolean isRequestHelp() {
            return _requestHelp;
        }
        public File getInputFile() {
            return _inputFile;
        }
        public boolean shouldShowSheetNames() {
            return _showSheetNames;
        }
        public boolean shouldEvaluateFormulas() {
            return _evaluateFormulas;
        }
        public boolean shouldShowCellComments() {
            return _showCellComments;
        }
        public boolean shouldShowBlankCells() {
            return _showBlankCells;
        }
        public boolean shouldIncludeHeadersFooters() {
            return _headersFooters;
        }
    }

    private static void printUsageMessage(PrintStream ps) {
        ps.println("Use:");
        ps.println("    " + ExcelExtractor.class.getName() + " [<flag> <value> [<flag> <value> [...]]] [-i <filename.xls>]");
        ps.println("       -i <filename.xls> specifies input file (default is to use stdin)");
        ps.println("       Flags can be set on or off by using the values 'Y' or 'N'.");
        ps.println("       Following are available flags and their default values:");
        ps.println("       --show-sheet-names  Y");
        ps.println("       --evaluate-formulas Y");
        ps.println("       --show-comments     N");
        ps.println("       --show-blanks       Y");
        ps.println("       --headers-footers   Y");
    }


    @Override
    public void setIncludeSheetNames(boolean includeSheetNames) {
        _includeSheetNames = includeSheetNames;
    }

    @Override
    public void setFormulasNotResults(boolean formulasNotResults) {
        _shouldEvaluateFormulas = !formulasNotResults;
    }

    @Override
    public void setIncludeCellComments(boolean includeCellComments) {
        _includeCellComments = includeCellComments;
    }

    /**
     * Should blank cells be output? Default is to only
     *  output cells that are present in the file and are
     *  non-blank.
     *
     * @param includeBlankCells {@code true} if blank cells should be included
     */
    public void setIncludeBlankCells(boolean includeBlankCells) {
        _includeBlankCells = includeBlankCells;
    }

    @Override
    public void setIncludeHeadersFooters(boolean includeHeadersFooters) {
        _includeHeadersFooters = includeHeadersFooters;
    }

    public static String _extractHeaderFooter(HeaderFooter hf) {
        StringBuilder text = new StringBuilder();

        if(hf.getLeft() != null) {
            text.append(hf.getLeft());
        }
        if(hf.getCenter() != null) {
            if(text.length() > 0)
                text.append("\t");
            text.append(hf.getCenter());
        }
        if(hf.getRight() != null) {
            if(text.length() > 0)
                text.append("\t");
            text.append(hf.getRight());
        }
        if(text.length() > 0)
            text.append("\n");

        return text.toString();
    }

    @Override
    public HSSFWorkbook getDocument() {
        return _wb;
    }

    @Override
    public boolean isCloseFilesystem() {
        return doCloseFilesystem;
    }

    @Override
    public HSSFWorkbook getFilesystem() {
        return _wb;
    }
}
