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

package org.apache.poi.xssf.streaming;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PaneInformation;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.usermodel.*;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;

/**
 * Streaming version of XSSFSheet implementing the "BigGridDemo" strategy.
 */
public class SXSSFSheet implements Sheet/*, OoxmlSheetExtensions*/ {
    private static final Logger LOG = LogManager.getLogger(SXSSFSheet.class);

    /*package*/ final XSSFSheet _sh;
    protected final SXSSFWorkbook _workbook;
    private final TreeMap<Integer,SXSSFRow> _rows = new TreeMap<>();
    protected SheetDataWriter _writer;
    private int _randomAccessWindowSize = SXSSFWorkbook.DEFAULT_WINDOW_SIZE;
    protected AutoSizeColumnTracker _autoSizeColumnTracker;
    private int lastFlushedRowNumber = -1;
    private boolean allFlushed;
    private int leftMostColumn = SpreadsheetVersion.EXCEL2007.getLastColumnIndex();
    private int rightMostColumn;

    protected SXSSFSheet(SXSSFWorkbook workbook, XSSFSheet xSheet, int randomAccessWindowSize) {
        _workbook = workbook;
        _sh = xSheet;
        calculateLeftAndRightMostColumns(xSheet);
        setRandomAccessWindowSize(randomAccessWindowSize);
        try {
            _autoSizeColumnTracker = new AutoSizeColumnTracker(this);
        } catch (UnsatisfiedLinkError | NoClassDefFoundError | InternalError |
                 // thrown when no fonts are available in the workbook
                 IndexOutOfBoundsException e) {
            // only handle special NoClassDefFound
            if (!e.getMessage().contains("X11FontManager")) {
                throw e;
            }
            LOG.atWarn()
                    .withThrowable(e)
                    .log("Failed to create AutoSizeColumnTracker, possibly due to fonts not being installed in your OS");
        }
    }

    private void calculateLeftAndRightMostColumns(XSSFSheet xssfSheet) {
        if (_workbook.shouldCalculateSheetDimensions()) {
            int rowCount = 0;
            int leftMostColumn = Integer.MAX_VALUE;
            int rightMostColumn = 0;
            for (Row row : xssfSheet) {
                rowCount++;
                if (row.getFirstCellNum() < leftMostColumn) {
                    final int first = row.getFirstCellNum();
                    final int last = row.getLastCellNum() - 1;
                    leftMostColumn = Math.min(first, leftMostColumn);
                    rightMostColumn = Math.max(last, rightMostColumn);
                }
            }
            if (rowCount > 0) {
                this.leftMostColumn = leftMostColumn;
                this.rightMostColumn = rightMostColumn;
            }
        }
    }

    public SXSSFSheet(SXSSFWorkbook workbook, XSSFSheet xSheet) throws IOException {
        _workbook = workbook;
        _sh = xSheet;
        _writer = workbook.createSheetDataWriter();
        setRandomAccessWindowSize(_workbook.getRandomAccessWindowSize());
        try {
            _autoSizeColumnTracker = new AutoSizeColumnTracker(this);
        } catch (UnsatisfiedLinkError | NoClassDefFoundError | InternalError |
                 // thrown when no fonts are available in the workbook
                 IndexOutOfBoundsException e) {
            // only handle special NoClassDefFound
            if (!e.getMessage().contains("X11FontManager")) {
                // close temporary resources when throwing exception in the constructor
                _writer.close();

                throw e;
            }
            LOG.atWarn()
                    .withThrowable(e)
                    .log("Failed to create AutoSizeColumnTracker, possibly due to fonts not being installed in your OS");
        } catch (Throwable e) {
            // close temporary resources when throwing exception in the constructor
            _writer.close();

            throw e;
        }
    }

    /**
     * for testing purposes only
     */
    @Internal
    SheetDataWriter getSheetDataWriter(){
        return _writer;
    }

    /* Gets "<sheetData>" document fragment*/
    public InputStream getWorksheetXMLInputStream() throws IOException {
        // flush all remaining data and close the temp file writer
        flushRows(0);
        _writer.close();
        return _writer.getWorksheetXMLInputStream();
    }

    //start of interface implementation
    /**
     * Create a new row within the sheet and return the high level representation
     *
     * @param rownum  row number
     * @return high level Row object representing a row in the sheet
     * @throws IllegalArgumentException If the max. number of rows is exceeded or
     *      a rownum is provided where the row is already flushed to disk.
     * @see #removeRow(Row)
     */
    @Override
    public SXSSFRow createRow(int rownum) {
        int maxrow = SpreadsheetVersion.EXCEL2007.getLastRowIndex();
        if (rownum < 0 || rownum > maxrow) {
            throw new IllegalArgumentException("Invalid row number (" + rownum
                    + ") outside allowable range (0.." + maxrow + ")");
        }

        // attempt to overwrite a row that is already flushed to disk
        if(_writer != null && rownum <= _writer.getLastFlushedRow() ) {
            throw new IllegalArgumentException(
                    "Attempting to write a row["+rownum+"] " +
                            "in the range [0," + _writer.getLastFlushedRow() + "] that is already written to disk.");
        }

        // attempt to overwrite an existing row in the input template
        if(_sh.getPhysicalNumberOfRows() > 0 && rownum <= _sh.getLastRowNum() ) {
            throw new IllegalArgumentException(
                    "Attempting to write a row["+rownum+"] " +
                            "in the range [0," + _sh.getLastRowNum() + "] that is already written to disk.");
        }

        SXSSFRow newRow = new SXSSFRow(this);
        newRow.setRowNumWithoutUpdatingSheet(rownum);
        _rows.put(rownum, newRow);
        allFlushed = false;
        if(_randomAccessWindowSize >= 0 && _rows.size() > _randomAccessWindowSize) {
            try {
                flushRows(_randomAccessWindowSize);
            } catch (IOException ioe) {
                throw new IllegalStateException(ioe);
            }
        }
        return newRow;
    }

    /**
     * Remove a row from this sheet.  All cells contained in the row are removed as well
     *
     * @param row   representing a row to remove.
     */
    @Override
    public void removeRow(Row row) {
        if (row.getSheet() != this) {
            throw new IllegalArgumentException("Specified row does not belong to this sheet");
        }

        for(Iterator<Map.Entry<Integer, SXSSFRow>> iter = _rows.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<Integer, SXSSFRow> entry = iter.next();
            if(entry.getValue() == row) {
                iter.remove();
                return;
            }
        }
    }

    /**
     * Returns the logical row (not physical) 0-based.  If you ask for a row that is not
     * defined you get a null.  This is to say row 4 represents the fifth row on a sheet.
     *
     * @param rownum  row to get (0-based)
     * @return Row representing the rownumber or null if its not defined on the sheet
     */
    @Override
    public SXSSFRow getRow(int rownum) {
        return _rows.get(rownum);
    }

    /**
     * Returns the number of physically defined rows (NOT the number of rows in the sheet)
     *
     * @return the number of physically defined rows in this sheet
     */
    @Override
    public int getPhysicalNumberOfRows() {
        return _rows.size() + _writer.getNumberOfFlushedRows();
    }

    /**
     * Gets the first row on the sheet
     *
     * @return the number of the first logical row on the sheet (0-based)
     */
    @Override
    public int getFirstRowNum() {
        if(_writer.getNumberOfFlushedRows() > 0) {
            return _writer.getLowestIndexOfFlushedRows();
        }
        return _rows.isEmpty() ? -1 : _rows.firstKey();
    }

    /**
     * Gets the last row on the sheet
     *
     * @return last row contained n this sheet (0-based)
     */
    @Override
    public int getLastRowNum() {
        return _rows.isEmpty() ? -1 : _rows.lastKey();
    }

    /**
     * Set the visibility state for a given column
     *
     * @param columnIndex - the column to get (0-based)
     * @param hidden - the visibility state of the column
     */
    @Override
    public void setColumnHidden(int columnIndex, boolean hidden) {
        _sh.setColumnHidden(columnIndex,hidden);
    }

    /**
     * Get the hidden state for a given column
     *
     * @param columnIndex - the column to set (0-based)
     * @return hidden - <code>false</code> if the column is visible
     */
    @Override
    public boolean isColumnHidden(int columnIndex) {
        return _sh.isColumnHidden(columnIndex);
    }

    /**
     * Set the width (in units of 1/256th of a character width)
     * <p>
     * The maximum column width for an individual cell is 255 characters.
     * This value represents the number of characters that can be displayed
     * in a cell that is formatted with the standard font.
     * </p>
     *
     * @param columnIndex - the column to set (0-based)
     * @param width - the width in units of 1/256th of a character width
     */
    @Override
    public void setColumnWidth(int columnIndex, int width) {
        _sh.setColumnWidth(columnIndex,width);
    }

    /**
     * get the width (in units of 1/256th of a character width )
     * @param columnIndex - the column to set (0-based)
     * @return width - the width in units of 1/256th of a character width
     */
    @Override
    public int getColumnWidth(int columnIndex) {
        return _sh.getColumnWidth(columnIndex);
    }

    /**
     * Get the actual column width in pixels
     *
     * <p>
     * Please note, that this method works correctly only for workbooks
     * with the default font size (Calibri 11pt for .xlsx).
     * </p>
     */
    @Override
    public float getColumnWidthInPixels(int columnIndex) {
        return _sh.getColumnWidthInPixels(columnIndex);
    }

    /**
     * Set the default column width for the sheet (if the columns do not define their own width)
     * in characters
     *
     * @param width default column width measured in characters
     */
    @Override
    public void setDefaultColumnWidth(int width) {
        _sh.setDefaultColumnWidth(width);
    }

    /**
     * Get the default column width for the sheet (if the columns do not define their own width)
     * in characters
     *
     * @return default column width measured in characters
     */
    @Override
    public int getDefaultColumnWidth() {
        return _sh.getDefaultColumnWidth();
    }


    /**
     * Get the default row height for the sheet (if the rows do not define their own height) in
     * twips (1/20 of  a point)
     *
     * @return  default row height measured in twips (1/20 of  a point)
     */
    @Override
    public short getDefaultRowHeight() {
        return _sh.getDefaultRowHeight();
    }

    /**
     * Get the default row height for the sheet (if the rows do not define their own height) in
     * points.
     *
     * @return  default row height in points
     */
    @Override
    public float getDefaultRowHeightInPoints() {
        return _sh.getDefaultRowHeightInPoints();
    }

    /**
     * Set the default row height for the sheet (if the rows do not define their own height) in
     * twips (1/20 of  a point)
     *
     * @param  height default row height measured in twips (1/20 of  a point)
     */
    @Override
    public void setDefaultRowHeight(short height) {
        _sh.setDefaultRowHeight(height);
    }

    /**
     * Set the default row height for the sheet (if the rows do not define their own height) in
     * points
     * @param height default row height
     */
    @Override
    public void setDefaultRowHeightInPoints(float height) {
        _sh.setDefaultRowHeightInPoints(height);
    }

    /**
     * Returns the CellStyle that applies to the given
     *  (0 based) column, or null if no style has been
     *  set for that column
     */
    @Override
    public CellStyle getColumnStyle(int column) {
        return _sh.getColumnStyle(column);
    }

    /*
     * Sets the CellStyle that applies to the given
     *  (0 based) column.
     */
//    public CellStyle setColumnStyle(int column, CellStyle style);

    /**
     * Adds a merged region of cells (hence those cells form one)
     *
     * @param region (rowfrom/colfrom-rowto/colto) to merge
     * @return index of this region
     */
    @Override
    public int addMergedRegion(CellRangeAddress region) {
        return _sh.addMergedRegion(region);
    }

    /**
     * Adds a merged region of cells (hence those cells form one)
     *
     * @param region (rowfrom/colfrom-rowto/colto) to merge
     * @return index of this region
     */
    @Override
    public int addMergedRegionUnsafe(CellRangeAddress region) {
        return _sh.addMergedRegionUnsafe(region);
    }

    /**
     * Verify that merged regions do not intersect multi-cell array formulas and
     * no merged regions intersect another merged region in this sheet.
     *
     * @throws IllegalStateException if region intersects with a multi-cell array formula
     * @throws IllegalStateException if at least one region intersects with another merged region in this sheet
     */
    @Override
    public void validateMergedRegions() {
        _sh.validateMergedRegions();
    }

    /**
     * Determines whether the output is vertically centered on the page.
     *
     * @param value true to vertically center, false otherwise.
     */
    @Override
    public void setVerticallyCenter(boolean value) {
        _sh.setVerticallyCenter(value);
    }

    /**
     * Determines whether the output is horizontally centered on the page.
     *
     * @param value true to horizontally center, false otherwise.
     */
    @Override
    public void setHorizontallyCenter(boolean value) {
        _sh.setHorizontallyCenter(value);
    }

    /**
     * Determine whether printed output for this sheet will be horizontally centered.
     */
    @Override
    public boolean getHorizontallyCenter() {
        return _sh.getHorizontallyCenter();
    }

    /**
     * Determine whether printed output for this sheet will be vertically centered.
     */
    @Override
    public boolean getVerticallyCenter() {
        return _sh.getVerticallyCenter();
    }

    /**
     * Removes a merged region of cells (hence letting them free)
     *
     * @param index of the region to unmerge
     */
    @Override
    public void removeMergedRegion(int index) {
        _sh.removeMergedRegion(index);
    }

    /**
     * Returns the number of merged regions
     *
     * @return number of merged regions
     */
    @Override
    public int getNumMergedRegions() {
        return _sh.getNumMergedRegions();
    }

    /**
     * Returns the list of merged regions. If you want multiple regions, this is
     * faster than calling {@link #getMergedRegion(int)} each time.
     *
     * @return the list of merged regions
     */
    @Override
    public List<CellRangeAddress> getMergedRegions() {
        return _sh.getMergedRegions();
    }

    /**
     *  Returns an iterator of the physical rows
     *
     * @return an iterator of the PHYSICAL rows.  Meaning the 3rd element may not
     * be the third row if say for instance the second row is undefined.
     */
    @Override
    public Iterator<Row> rowIterator() {
        @SuppressWarnings("unchecked")
        Iterator<Row> result = (Iterator<Row>)(Iterator<? extends Row>)_rows.values().iterator();
        return result;
    }

    /**
     *  Returns a spliterator of the physical rows
     *
     * @return a spliterator of the PHYSICAL rows.  Meaning the 3rd element may not
     * be the third row if say for instance the second row is undefined.
     *
     * @since POI 5.2.0
     */
    @Override
    @SuppressWarnings("unchecked")
    public Spliterator<Row> spliterator() {
        return (Spliterator<Row>)(Spliterator<? extends Row>) _rows.values().spliterator();
    }

    /**
     * Set whether the window should show 0 (zero) in cells containing zero value.
     * When false, cells with zero value appear blank instead of showing the number zero.
     *
     * @param value whether to display or hide all zero values on the worksheet
     */
    @Override
    public void setDisplayZeros(boolean value) {
        _sh.setDisplayZeros(value);
    }


    /**
     * Gets the flag indicating whether the window should show 0 (zero) in cells containing zero value.
     * When false, cells with zero value appear blank instead of showing the number zero.
     *
     * @return whether all zero values on the worksheet are displayed
     */
    @Override
    public boolean isDisplayZeros() {
        return _sh.isDisplayZeros();
    }

    /**
     * Sets whether the worksheet is displayed from right to left instead of from left to right.
     *
     * @param value true for right to left, false otherwise.
     */
    @Override
    public void setRightToLeft(boolean value) {
        _sh.setRightToLeft(value);
    }

    /**
     * Whether the text is displayed in right-to-left mode in the window
     *
     * @return whether the text is displayed in right-to-left mode in the window
     */
    @Override
    public boolean isRightToLeft() {
        return _sh.isRightToLeft();
    }

    /**
     * Returns whether row and column headings are printed.
     *
     * @return whether row and column headings are printed
     */
    @Override
    public boolean isPrintRowAndColumnHeadings() {
        return _sh.isPrintRowAndColumnHeadings();
    }

    /**
     * Gets the user model for the default document header.
     * <p>
     * Note that XSSF offers more kinds of document headers than HSSF does
     * </p>
     * @return the document header. Never <code>null</code>
     */
    @Override
    public Header getHeader() {
        return _sh.getHeader();
    }

    /**
     * Gets the user model for the default document footer.
     * <p>
     * Note that XSSF offers more kinds of document footers than HSSF does.
     * </p>
     * @return the document footer. Never <code>null</code>
     */
    @Override
    public Footer getFooter() {
        return _sh.getFooter();
    }

    /**
     * Sets a flag indicating whether this sheet is selected.
     * <p>
     * Note: multiple sheets can be selected, but only one sheet can be active at one time.
     * </p>
     * @param value <code>true</code> if this sheet is selected
     * @see Workbook#setActiveSheet(int)
     */
    @Override
    public void setSelected(boolean value) {
        _sh.setSelected(value);
    }

    /**
     * Gets the size of the margin in inches.
     *
     * @param margin which margin to get
     * @return the size of the margin
     * @deprecated use {@link #getMargin(PageMargin)}
     */
    @Override
    @Deprecated
    @Removal(version = "7.0.0")
    public double getMargin(short margin) {
        return _sh.getMargin(margin);
    }


    /**
     * Gets the size of the margin in inches.
     *
     * @param margin which margin to get
     * @return the size of the margin
     * @since POI 5.2.3
     */
    @Override
    public double getMargin(PageMargin margin) {
        return _sh.getMargin(margin);
    }

    /**
     * Sets the size of the margin in inches.
     *
     * @param margin which margin to set
     * @param size the size of the margin
     * @see Sheet#LeftMargin
     * @see Sheet#RightMargin
     * @see Sheet#TopMargin
     * @see Sheet#BottomMargin
     * @see Sheet#HeaderMargin
     * @see Sheet#FooterMargin
     * @deprecated use {@link #setMargin(PageMargin, double)} instead
     */
    @Override
    @Deprecated
    @Removal(version = "7.0.0")
    public void setMargin(short margin, double size) {
        _sh.setMargin(margin, size);
    }

    /**
     * Sets the size of the margin in inches.
     *
     * @param margin which margin to set
     * @param size the size of the margin
     * @since POI 5.2.3
     */
    @Override
    public void setMargin(PageMargin margin, double size) {
        _sh.setMargin(margin, size);
    }

    /**
     * Answer whether protection is enabled or disabled
     *
     * @return true means protection enabled; false means protection disabled
     */
    @Override
    public boolean getProtect() {
        return _sh.getProtect();
    }

    /**
     * Sets the protection enabled as well as the password
     * @param password to set for protection. Pass <code>null</code> to remove protection
     */
    @Override
    public void protectSheet(String password) {
        _sh.protectSheet(password);
    }

    /**
     * Answer whether scenario protection is enabled or disabled
     *
     * @return true means protection enabled; false means protection disabled
     */
    @Override
    public boolean getScenarioProtect() {
        return _sh.getScenarioProtect();
    }

    /**
     * Window zoom magnification for current view representing percent values.
     * Valid values range from 10 to 400. Horizontal and Vertical scale together.
     *
     * For example:
     * <pre>
     * 10 - 10%
     * 20 - 20%
     * ...
     * 100 - 100%
     * ...
     * 400 - 400%
     * </pre>
     *
     * Current view can be Normal, Page Layout, or Page Break Preview.
     *
     * @param scale window zoom magnification
     * @throws IllegalArgumentException if scale is invalid
     */
    @Override
    public void setZoom(int scale) {
        _sh.setZoom(scale);
    }

    /**
     * The top row in the visible view when the sheet is
     * first viewed after opening it in a viewer
     *
     * @return short indicating the rownum (0 based) of the top row
     */
    @Override
    public short getTopRow() {
        return _sh.getTopRow();
    }

    /**
     * The left col in the visible view when the sheet is
     * first viewed after opening it in a viewer
     *
     * @return short indicating the rownum (0 based) of the top row
     */
    @Override
    public short getLeftCol() {
        return _sh.getLeftCol();
    }

    /**
     * Control if Excel should be asked to recalculate all formulas when the
     *  workbook is opened, via the "sheetCalcPr fullCalcOnLoad" option.
     *  Calculating the formula values with {@link org.apache.poi.ss.usermodel.FormulaEvaluator} is the
     *  recommended solution, but this may be used for certain cases where
     *  evaluation in POI is not possible.
     */
    @Override
    public void setForceFormulaRecalculation(boolean value) {
        _sh.setForceFormulaRecalculation(value);
    }

    /**
     * Whether Excel will be asked to recalculate all formulas when the
     *  workbook is opened.
     */
    @Override
    public boolean getForceFormulaRecalculation() {
        return _sh.getForceFormulaRecalculation();
    }

    /**
     * Sets whether the formulas are shown in a viewer
     *
     * @param show whether to show formulas or not
     */
    @Override
    public void setDisplayFormulas(boolean show) {
        _sh.setDisplayFormulas(show);
    }

    /**
     * Returns if formulas are displayed
     *
     * @return whether formulas are displayed
     */
    @Override
    public boolean isDisplayFormulas() {
        return _sh.isDisplayFormulas();
    }

    /**
     * Returns if RowColHeadings are displayed.
     * @return whether RowColHeadings are displayed
     */
    @Override
    public boolean isDisplayRowColHeadings() {
        return _sh.isDisplayRowColHeadings();
    }


    /**
     * Expands or collapses a column group.
     *
     * @param columnNumber      One of the columns in the group.
     * @param collapsed         true = collapse group, false = expand group.
     */
    @Override
    public void setColumnGroupCollapsed(int columnNumber, boolean collapsed) {
        _sh.setColumnGroupCollapsed(columnNumber, collapsed);
    }

    /**
     * Create an outline for the provided column range.
     *
     * @param fromColumn        beginning of the column range.
     * @param toColumn          end of the column range.
     */
    @Override
    public void groupColumn(int fromColumn, int toColumn) {
        _sh.groupColumn(fromColumn, toColumn);
    }

    /**
     * Ungroup a range of columns that were previously grouped
     *
     * @param fromColumn   start column (0-based)
     * @param toColumn     end column (0-based)
     */
    @Override
    public void ungroupColumn(int fromColumn, int toColumn) {
        _sh.ungroupColumn(fromColumn, toColumn);
    }

    /**
     * Tie a range of rows together so that they can be collapsed or expanded
     *
     * <p>
     *     Please note the rows being grouped <em>must</em> be in the current window,
     *     if the rows are already flushed then groupRow has no effect.
     * </p>
     *
     *      Correct code:
     *      <pre><code>
     *       Workbook wb = new SXSSFWorkbook(100);  // keep 100 rows in memory
     *       Sheet sh = wb.createSheet();
     *       for (int rownum = 0; rownum &lt; 1000; rownum++) {
     *           Row row = sh.createRow(rownum);
     *           if(rownum == 200)  {
     *               sh.groupRow(100, 200);
     *           }
     *       }
     *
     *      </code></pre>
     *
     *
     *      Incorrect code:
     *      <pre><code>
     *       Workbook wb = new SXSSFWorkbook(100);  // keep 100 rows in memory
     *       Sheet sh = wb.createSheet();
     *       for (int rownum = 0; rownum &lt; 1000; rownum++) {
     *           Row row = sh.createRow(rownum);
     *       }
     *       sh.groupRow(100, 200); // the rows in the range [100, 200] are already flushed and groupRows has no effect
     *
     *      </code></pre>
     *
     *
     * @param fromRow   start row (0-based)
     * @param toRow     end row (0-based)
     */
    @Override
    public void groupRow(int fromRow, int toRow) {
        int maxLevelRow = -1;
        for(SXSSFRow row : _rows.subMap(fromRow, toRow + 1).values()){
            final int level = row.getOutlineLevel() + 1;
            row.setOutlineLevel(level);
            maxLevelRow = Math.max(maxLevelRow, level);
        }

        setWorksheetOutlineLevelRowIfNecessary((short) Math.min(Short.MAX_VALUE, maxLevelRow));
    }

    /**
     * Set row groupings (like groupRow) in a stream-friendly manner
     *
     * <p>
     *    groupRows requires all rows in the group to be in the current window.
     *    This is not always practical.  Instead use setRowOutlineLevel to
     *    explicitly set the group level.  Level 1 is the top level group,
     *    followed by 2, etc.  It is up to the user to ensure that level 2
     *    groups are correctly nested under level 1, etc.
     * </p>
     *
     * @param rownum    index of row to update (0-based)
     * @param level     outline level (greater than 0)
     */
    public void setRowOutlineLevel(int rownum, int level) {
        SXSSFRow row = _rows.get(rownum);
        row.setOutlineLevel(level);
        setWorksheetOutlineLevelRowIfNecessary((short) Math.min(Short.MAX_VALUE, level));
    }

    private void setWorksheetOutlineLevelRowIfNecessary(final short levelRow) {
        CTWorksheet ct = _sh.getCTWorksheet();
        CTSheetFormatPr pr = ct.isSetSheetFormatPr() ?
                ct.getSheetFormatPr() :
                ct.addNewSheetFormatPr();
        if(levelRow > _sh.getSheetFormatPrOutlineLevelRow()) {
            pr.setOutlineLevelRow(levelRow);
        }
    }

    /**
     * Ungroup a range of rows that were previously grouped
     *
     * @param fromRow   start row (0-based)
     * @param toRow     end row (0-based)
     */
    @Override
    public void ungroupRow(int fromRow, int toRow) {
        _sh.ungroupRow(fromRow, toRow);
    }

    /**
     * Set view state of a grouped range of rows.
     *
     * <i>Not implemented for expanding (i.e. collapse == false)</i>
     *
     * @param row   start row of a grouped range of rows (0-based)
     * @param collapse whether to expand/collapse the detail rows
     * @throws IllegalStateException if collapse is false as this is not implemented for SXSSF.
     */
    @Override
    public void setRowGroupCollapsed(int row, boolean collapse) {
        if (collapse) {
            collapseRow(row);
        } else {
            //expandRow(rowIndex);
            throw new IllegalStateException("Unable to expand row: Not Implemented");
        }
    }

    /**
     * @param rowIndex the zero based row index to collapse
     */
    private void collapseRow(int rowIndex) {
        SXSSFRow row = getRow(rowIndex);
        if(row == null) {
            throw new IllegalArgumentException("Invalid row number("+ rowIndex + "). Row does not exist.");
        } else {
            int startRow = findStartOfRowOutlineGroup(rowIndex);

            // Hide all the columns until the end of the group
            int lastRow = writeHidden(row, startRow);
            SXSSFRow lastRowObj = getRow(lastRow);
            if (lastRowObj != null) {
                lastRowObj.setCollapsed(true);
            } else {
                SXSSFRow newRow = createRow(lastRow);
                newRow.setCollapsed(true);
            }
        }
    }

    /**
     * @param rowIndex the zero based row index to find from
     */
    private int findStartOfRowOutlineGroup(int rowIndex) {
        // Find the start of the group.
        Row row = getRow(rowIndex);
        int level = row.getOutlineLevel();
        if(level == 0) {
            throw new IllegalArgumentException("Outline level is zero for the row (" + rowIndex + ").");
        }
        int currentRow = rowIndex;
        while (getRow(currentRow) != null) {
            if (getRow(currentRow).getOutlineLevel() < level) {
                return currentRow + 1;
            }
            currentRow--;
        }
        return currentRow + 1;
    }

    private int writeHidden(SXSSFRow xRow, int rowIndex) {
        int level = xRow.getOutlineLevel();
        SXSSFRow currRow = getRow(rowIndex);

        while (currRow != null && currRow.getOutlineLevel() >= level) {
            currRow.setHidden(true);
            rowIndex++;
            currRow = getRow(rowIndex);
        }
        return rowIndex;
    }

    /**
     * Sets the default column style for a given column.  POI will only apply this style to new cells added to the sheet.
     *
     * @param column the column index
     * @param style the style to set
     */
    @Override
    public void setDefaultColumnStyle(int column, CellStyle style) {
        _sh.setDefaultColumnStyle(column, style);
    }


    /**
     * Track a column in the sheet for auto-sizing.
     * Note this has undefined behavior if a column is tracked after one or more rows are written to the sheet.
     * If <code>column</code> is already tracked, this call does nothing.
     *
     * @param column the column to track for auto-sizing
     * @throws IllegalStateException if autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)
     * @since 3.14beta1
     * @see #trackColumnsForAutoSizing(Collection)
     * @see #trackAllColumnsForAutoSizing()
     */
    public void trackColumnForAutoSizing(int column) {
        if (_autoSizeColumnTracker == null) {
            throw new IllegalStateException("Cannot trackColumnForAutoSizing because autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)");
        }
        _autoSizeColumnTracker.trackColumn(column);
    }

    /**
     * Track several columns in the sheet for auto-sizing.
     * Note this has undefined behavior if columns are tracked after one or more rows are written to the sheet.
     * Any column in <code>columns</code> that are already tracked are ignored by this call.
     *
     * @param columns the columns to track for auto-sizing
     * @throws IllegalStateException if autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)
     * @since 3.14beta1
     */
    public void trackColumnsForAutoSizing(Collection<Integer> columns) {
        if (_autoSizeColumnTracker == null) {
            throw new IllegalStateException("Cannot trackColumnForAutoSizing because autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)");
        }
        _autoSizeColumnTracker.trackColumns(columns);
    }

    /**
     * Tracks all columns in the sheet for auto-sizing. If this is called, individual columns do not need to be tracked.
     * Because determining the best-fit width for a cell is expensive, this may affect the performance.
     * @throws IllegalStateException if autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)
     * @since 3.14beta1
     */
    public void trackAllColumnsForAutoSizing() {
        if (_autoSizeColumnTracker == null) {
            throw new IllegalStateException("Cannot trackColumnForAutoSizing because autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)");
        }
        _autoSizeColumnTracker.trackAllColumns();
    }

    /**
     * Removes a column that was previously marked for inclusion in auto-size column tracking.
     * When a column is untracked, the best-fit width is forgotten.
     * If <code>column</code> is not tracked, it will be ignored by this call.
     *
     * @param column the index of the column to track for auto-sizing
     * @return true if column was tracked prior to this call, false if no action was taken
     * @since 3.14beta1
     * @see #untrackColumnsForAutoSizing(Collection)
     * @see #untrackAllColumnsForAutoSizing()
     */
    public boolean untrackColumnForAutoSizing(int column) {
        return _autoSizeColumnTracker != null && _autoSizeColumnTracker.untrackColumn(column);
    }

    /**
     * Untracks several columns in the sheet for auto-sizing.
     * When a column is untracked, the best-fit width is forgotten.
     * Any column in <code>columns</code> that is not tracked will be ignored by this call.
     *
     * @param columns the indices of the columns to track for auto-sizing
     * @return true if one or more columns were untracked as a result of this call
     * @since 3.14beta1
     */
    public boolean untrackColumnsForAutoSizing(Collection<Integer> columns) {
        return _autoSizeColumnTracker != null && _autoSizeColumnTracker.untrackColumns(columns);
    }

    /**
     * Untracks all columns in the sheet for auto-sizing. Best-fit column widths are forgotten.
     * If this is called, individual columns do not need to be untracked.
     * @since 3.14beta1
     */
    public void untrackAllColumnsForAutoSizing() {
        if (_autoSizeColumnTracker != null) {
            _autoSizeColumnTracker.untrackAllColumns();
        }
    }

    /**
     * Returns true if column is currently tracked for auto-sizing.
     *
     * @param column the index of the column to check
     * @return true if column is tracked
     * @since 3.14beta1
     */
    public boolean isColumnTrackedForAutoSizing(int column) {
        return _autoSizeColumnTracker != null && _autoSizeColumnTracker.isColumnTracked(column);
    }

    /**
     * Get the currently tracked columns for auto-sizing.
     * Note if all columns are tracked, this will only return the columns that have been explicitly or implicitly tracked,
     * which is probably only columns containing 1 or more non-blank values
     *
     * @return a set of the indices of all tracked columns
     * @since 3.14beta1
     */
    public Set<Integer> getTrackedColumnsForAutoSizing() {
        return _autoSizeColumnTracker == null ? Collections.emptySet() : _autoSizeColumnTracker.getTrackedColumns();
    }

    /**
     * Adjusts the column width to fit the contents.
     *
     * <p>
     * This process can be relatively slow on large sheets, so this should
     *  normally only be called once per column, at the end of your
     *  processing.
     * </p>
     * You can specify whether the content of merged cells should be considered or ignored.
     *  Default is to ignore merged cells.
     *
     *  <p>
     *  Special note about SXSSF implementation: You must register the columns you wish to track with
     *  the SXSSFSheet using {@link #trackColumnForAutoSizing(int)} or {@link #trackAllColumnsForAutoSizing()}.
     *  This is needed because the rows needed to compute the column width may have fallen outside the
     *  random access window and been flushed to disk.
     *  Tracking columns is required even if all rows are in the random access window.
     *  </p>
     *  <p><i>New in POI 3.14 beta 1: auto-sizes columns using cells from current and flushed rows.</i></p>
     *
     * @param column the column index to auto-size
     */
    @Override
    public void autoSizeColumn(int column) {
        autoSizeColumn(column, false);
    }

    /**
     * Adjusts the column width to fit the contents.
     * <p>
     * This process can be relatively slow on large sheets, so this should
     *  normally only be called once per column, at the end of your
     *  processing.
     * </p>
     * You can specify whether the content of merged cells should be considered or ignored.
     *  Default is to ignore merged cells.
     *
     *  <p>
     *  Special note about SXSSF implementation: You must register the columns you wish to track with
     *  the SXSSFSheet using {@link #trackColumnForAutoSizing(int)} or {@link #trackAllColumnsForAutoSizing()}.
     *  This is needed because the rows needed to compute the column width may have fallen outside the
     *  random access window and been flushed to disk.
     *  Tracking columns is required even if all rows are in the random access window.
     *  </p>
     *  <p><i>New in POI 3.14 beta 1: auto-sizes columns using cells from current and flushed rows.</i></p>
     *
     * @param column the column index to auto-size
     * @param useMergedCells whether to use the contents of merged cells when calculating the width of the column
     * @throws IllegalStateException if autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)
     */
    @Override
    public void autoSizeColumn(int column, boolean useMergedCells) {
        if (_autoSizeColumnTracker == null) {
            throw new IllegalStateException("Cannot trackColumnForAutoSizing because autoSizeColumnTracker failed to initialize (possibly due to fonts not being installed in your OS)");
        }

        // Multiple calls to autoSizeColumn need to look up the best-fit width
        // of rows already flushed to disk plus re-calculate the best-fit width
        // of rows in the current window. It isn't safe to update the column
        // widths before flushing to disk because columns in the random access
        // window rows may change in best-fit width. The best-fit width of a cell
        // is only fixed when it becomes inaccessible for modification.
        // Changes to the shared strings table, styles table, or formulas might
        // be able to invalidate the auto-size width without the opportunity
        // to recalculate the best-fit width for the flushed rows. This is an
        // inherent limitation of SXSSF. If having correct auto-sizing is
        // critical, the flushed rows would need to be re-read by the read-only
        // XSSF eventmodel (SAX) or the memory-heavy XSSF usermodel (DOM).
        final int flushedWidth;
        try {
            // get the best fit width of rows already flushed to disk
            flushedWidth = _autoSizeColumnTracker.getBestFitColumnWidth(column, useMergedCells);
        }
        catch (final IllegalStateException e) {
            throw new IllegalStateException("Could not auto-size column. Make sure the column was tracked prior to auto-sizing the column.", e);
        }

        // get the best-fit width of rows currently in the random access window
        final int activeWidth = (int) (256 * SheetUtil.getColumnWidth(this, column, useMergedCells));

        // the best-fit width for both flushed rows and random access window rows
        // flushedWidth or activeWidth may be negative if column contains only blank cells
        final int bestFitWidth = Math.max(flushedWidth,  activeWidth);

        if (bestFitWidth > 0) {
            final int maxColumnWidth = 255*256; // The maximum column width for an individual cell is 255 characters
            final int width = Math.min(bestFitWidth,  maxColumnWidth);
            setColumnWidth(column, width);
        }
    }

    /**
     * Get a Hyperlink in this sheet anchored at row, column
     *
     * @param row The 0-base row number
     * @param column The 0-based column number
     * @return hyperlink if there is a hyperlink anchored at row, column; otherwise returns null
     */
    @Override
    public XSSFHyperlink getHyperlink(int row, int column) {
        return _sh.getHyperlink(row, column);
    }

    /**
     * Get a Hyperlink in this sheet located in a cell specified by {code addr}
     *
     * @param addr The address of the cell containing the hyperlink
     * @return hyperlink if there is a hyperlink anchored at {@code addr}; otherwise returns {@code null}
     * @since POI 3.15 beta 3
     */
    @Override
    public XSSFHyperlink getHyperlink(CellAddress addr) {
        return _sh.getHyperlink(addr);
    }

    /**
     * Register a hyperlink in the collection of hyperlinks on this sheet.
     * Use {@link SXSSFCell#setHyperlink(Hyperlink)} if the hyperlink is just for that one cell.
     * Use this method if you want to add a Hyperlink that covers a range of sells. If you use
     * this method, you will need to call {@link XSSFHyperlink#setCellReference(String)} to
     * explicitly cell the value, eg B2 or B2:C3 (the 4 cells with B2 at top left and C3 at bottom right)
     *
     * @param hyperlink the link to add
     * @since POI 5.2.3
     */
    public void addHyperlink(XSSFHyperlink hyperlink) {
        _sh.addHyperlink(hyperlink);
    }

    /**
     * Get a list of Hyperlinks in this sheet
     *
     * @return Hyperlinks for the sheet
     */
    @Override
    public List<XSSFHyperlink> getHyperlinkList() {
        return _sh.getHyperlinkList();
    }



    /**
     * Return the parent workbook
     *
     * @return the parent workbook
     */
    @Override
    public SXSSFWorkbook getWorkbook() {
        return _workbook;
    }

    /**
     * Returns the name of this sheet
     *
     * @return the name of this sheet
     */
    @Override
    public String getSheetName() {
        return _sh.getSheetName();
    }

    /**
     * Note - this is not the same as whether the sheet is focused (isActive)
     * @return <code>true</code> if this sheet is currently selected
     */
    @Override
    public boolean isSelected() {
        return _sh.isSelected();
    }


    /**
     * Sets array formula to specified region for result.
     *
     * @param formula text representation of the formula
     * @param range Region of array formula for result.
     * @return the {@link CellRange} of cells affected by this change
     */
    @Override
    public CellRange<? extends Cell> setArrayFormula(String formula, CellRangeAddress range) {
        // the simple approach via _sh does not work as it creates rows in the XSSFSheet and thus causes
        // corrupted .xlsx files as rows appear multiple times in the resulting sheetX.xml files
        // return _sh.setArrayFormula(formula, range);

        throw new IllegalStateException("Not Implemented");
    }

    /**
     * Remove a Array Formula from this sheet.  All cells contained in the Array Formula range are removed as well
     *
     * @param cell   any cell within Array Formula range
     * @return the {@link CellRange} of cells affected by this change
     */
    @Override
    public CellRange<? extends Cell> removeArrayFormula(Cell cell) {
        // the simple approach via _sh does not work as it creates rows in the XSSFSheet and thus causes
        // corrupted .xlsx files as rows appear multiple times in the resulting sheetX.xml files
        // return _sh.removeArrayFormula(cell);

        throw new IllegalStateException("Not Implemented");
    }

    @Override
    public DataValidationHelper getDataValidationHelper() {
        return _sh.getDataValidationHelper();
    }

    @Override
    public SheetConditionalFormatting getSheetConditionalFormatting(){
        return _sh.getSheetConditionalFormatting();
    }


    @Override
    public CellRangeAddress getRepeatingRows() {
        return _sh.getRepeatingRows();
    }

    @Override
    public CellRangeAddress getRepeatingColumns() {
        return _sh.getRepeatingColumns();
    }



//end of interface implementation
    /**
     * Specifies how many rows can be accessed at most via getRow().
     * When a new node is created via createRow() and the total number
     * of unflushed records would exceed the specified value, then the
     * row with the lowest index value is flushed and cannot be accessed
     * via getRow() anymore.
     * A value of -1 indicates unlimited access. In this case all
     * records that have not been flushed by a call to flush() are available
     * for random access.
     * A value of 0 is not allowed because it would flush any newly created row
     * without having a chance to specify any cells.
     */
    public void setRandomAccessWindowSize(int value) {
        if(value == 0 || value < -1) {
            throw new IllegalArgumentException("RandomAccessWindowSize must be either -1 or a positive integer");
        }
        _randomAccessWindowSize = value;
    }

    /**
     * Are all rows flushed to disk?
     */
    public boolean areAllRowsFlushed() {
        return allFlushed;
    }
    /**
     * @return Last row number to be flushed to disk, or -1 if none flushed yet
     */
    public int getLastFlushedRowNum() {
        return lastFlushedRowNumber;
    }

    /**
     * Specifies how many rows can be accessed at most via getRow().
     * The excess rows (if any) are flushed to the disk while rows
     * with lower index values are flushed first.
     */
    public void flushRows(int remaining) throws IOException {
        while(_rows.size() > remaining) {
            flushOneRow();
        }
        if (remaining == 0) {
            allFlushed = true;
        }
    }

    /**
     * Flush all rows to disk. After this call no rows can be accessed via getRow()
     *
     * @throws IOException If an I/O error occurs
     */
    public void flushRows() throws IOException {
        this.flushRows(0);
    }

    /**
     * Flush all the data in the buffered stream to the temp file.
     *
     * @throws IOException If an I/O error occurs
     */
    public void flushBufferedData() throws IOException {
        this._writer.flush();
    }

    private void flushOneRow() throws IOException {
        Integer firstRowNum = _rows.firstKey();
        if (firstRowNum!=null) {
            int rowIndex = firstRowNum;
            SXSSFRow row = _rows.get(firstRowNum);
            if (_autoSizeColumnTracker != null) {
                // Update the best fit column widths for auto-sizing just before the rows are flushed
                _autoSizeColumnTracker.updateColumnWidths(row);
            }
            if (_writer != null) {
                _writer.writeRow(rowIndex, row);
            }
            _rows.remove(firstRowNum);
            lastFlushedRowNumber = rowIndex;
        }
    }

    public void changeRowNum(SXSSFRow row, int newRowNum) {
        removeRow(row);
        row.setRowNumWithoutUpdatingSheet(newRowNum);
        _rows.put(newRowNum, row);
    }

    public int getRowNum(SXSSFRow row) {
        return row.getRowNum();
    }

    /**
     * Deletes the temporary file that backed this sheet on disk.
     * @return true if the file was deleted, false if it wasn't.
     */
    boolean dispose() throws IOException {
        boolean ret;
        try {
            if (!allFlushed) {
                flushRows();
            }
        } finally {
            ret = _writer == null || _writer.dispose();
        }
        return ret;
    }

    @Override
    public int getColumnOutlineLevel(int columnIndex) {
        return _sh.getColumnOutlineLevel(columnIndex);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CellAddress getActiveCell() {
        return _sh.getActiveCell();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setActiveCell(CellAddress address) {
        _sh.setActiveCell(address);
    }

    public XSSFColor getTabColor() {
        return _sh.getTabColor();
    }

    public void setTabColor(XSSFColor color) {
        _sh.setTabColor(color);
    }


    void trackNewCell(SXSSFCell cell) {
        leftMostColumn = Math.min(cell.getColumnIndex(), leftMostColumn);
        rightMostColumn = Math.max(cell.getColumnIndex(), rightMostColumn);
    }

    void deriveDimension() {
        if (_workbook.shouldCalculateSheetDimensions()) {
            try {
                CellRangeAddress cellRangeAddress = new CellRangeAddress(
                        getFirstRowNum(), getLastRowNum(), leftMostColumn, rightMostColumn);
                _sh.setDimensionOverride(cellRangeAddress);
            } catch (Exception e) {
                LOG.atDebug().log("Failed to set dimension details on sheet", e);
            }
        }
    }
}
