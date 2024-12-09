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

package org.apache.poi.xssf.usermodel;

import static org.apache.poi.ooxml.POIXMLTypeLoader.DEFAULT_XML_OPTIONS;
import static org.apache.poi.xssf.usermodel.helpers.XSSFPasswordHelper.setPassword;
import static org.apache.poi.xssf.usermodel.helpers.XSSFPasswordHelper.validatePassword;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.ooxml.POIXMLException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.*;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.SSCellRange;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.util.Beta;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.util.Units;
import org.apache.poi.xssf.model.Comments;
import org.apache.poi.xssf.usermodel.helpers.ColumnHelper;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.*;

/**
 * High level representation of a SpreadsheetML worksheet.
 *
 * <p>
 * Sheets are the central structures within a workbook, and are where a user does most of his spreadsheet work.
 * The most common type of sheet is the worksheet, which is represented as a grid of cells. Worksheet cells can
 * contain text, numbers, dates, and formulas. Cells can also be formatted.
 * </p>
 */
public class XSSFSheet extends POIXMLDocumentPart implements Sheet/*, OoxmlSheetExtensions*/  {
    private static final Logger LOG = LogManager.getLogger(XSSFSheet.class);

    private static final double DEFAULT_ROW_HEIGHT = 15.0;
    private static final double DEFAULT_MARGIN_HEADER = 0.3;
    private static final double DEFAULT_MARGIN_FOOTER = 0.3;
    private static final double DEFAULT_MARGIN_TOP = 0.75;
    private static final double DEFAULT_MARGIN_BOTTOM = 0.75;
    private static final double DEFAULT_MARGIN_LEFT = 0.7;
    private static final double DEFAULT_MARGIN_RIGHT = 0.7;

    //TODO make the two variable below private!
    protected CTSheet sheet;
    protected CTWorksheet worksheet;

    private final SortedMap<Integer, XSSFRow> _rows = new TreeMap<>();
    private List<XSSFHyperlink> hyperlinks;
    private ColumnHelper columnHelper;
    private Comments sheetComments;
    /**
     * cache of master shared formulas in this sheet.
     * Master shared formula is the first formula in a group of shared formulas is saved in the f element.
     */
    private Map<Integer, CTCellFormula> sharedFormulas;
    private SortedMap<String,XSSFTable> tables;
    private List<CellRangeAddress> arrayFormulas;
    private final XSSFDataValidationHelper dataValidationHelper;
//    private XSSFVMLDrawing xssfvmlDrawing;
    private CellRangeAddress dimensionOverride;

    /**
     * Creates new XSSFSheet   - called by XSSFWorkbook to create a sheet from scratch.
     *
     * @see XSSFWorkbook#createSheet()
     */
    protected XSSFSheet() {
        super();
        dataValidationHelper = new XSSFDataValidationHelper(this);
        onDocumentCreate();
    }

    /**
     * Creates an XSSFSheet representing the given package part and relationship.
     * Should only be called by XSSFWorkbook when reading in an existing file.
     *
     * @param part - The package part that holds xml data representing this sheet.
     *
     * @since POI 3.14-Beta1
     */
    protected XSSFSheet(PackagePart part) {
        super(part);
        dataValidationHelper = new XSSFDataValidationHelper(this);
    }

    /**
     * Returns the parent XSSFWorkbook
     *
     * @return the parent XSSFWorkbook
     */
    @Override
    public XSSFWorkbook getWorkbook() {
        return (XSSFWorkbook)getParent();
    }

    /**
     * Initialize worksheet data when reading in an exisiting file.
     */
    @Override
    protected void onDocumentRead() {
        try (InputStream stream = getPackagePart().getInputStream()) {
            read(stream);
        } catch (IOException | ArithmeticException e){
            throw new POIXMLException(e);
        }
    }

    protected void read(InputStream is) throws IOException {
        try {
            worksheet = WorksheetDocument.Factory.parse(is, DEFAULT_XML_OPTIONS).getWorksheet();
        } catch (XmlException e){
            throw new POIXMLException(e);
        }

        columnHelper = new ColumnHelper(worksheet);
        initRows(worksheet);
        // Look for bits we're interested in
        for(RelationPart rp : getRelationParts()){
            POIXMLDocumentPart p = rp.getDocumentPart();
            if(p instanceof Comments) {
                sheetComments = (Comments)p;
                sheetComments.setSheet(this);
            }
            if(p instanceof XSSFTable) {
                tables.put( rp.getRelationship().getId(), (XSSFTable)p );
            }
//            if(p instanceof XSSFPivotTable) {
//                getWorkbook().getPivotTables().add((XSSFPivotTable) p);
//            }
        }

        // Process external hyperlinks for the sheet, if there are any
        initHyperlinks();
    }

    /**
     * Initialize worksheet data when creating a new sheet.
     */
    @Override
    protected void onDocumentCreate(){
        worksheet = newSheet();
        initRows(worksheet);
        columnHelper = new ColumnHelper(worksheet);
        hyperlinks = new ArrayList<>();
    }

    private void initRows(CTWorksheet worksheetParam) {
        if (worksheetParam.getSheetData() == null || worksheetParam.getSheetData().getRowArray() == null) {
            throw new IllegalArgumentException("Had empty sheet data when initializing the sheet");
        }

        _rows.clear();
        tables = new TreeMap<>();
        sharedFormulas = new HashMap<>();
        arrayFormulas = new ArrayList<>();
        for (CTRow row : worksheetParam.getSheetData().getRowArray()) {
            XSSFRow r = new XSSFRow(row, this);
            // Performance optimization: explicit boxing is slightly faster than auto-unboxing, though may use more memory
            //noinspection UnnecessaryBoxing
            final Integer rownumI = Integer.valueOf(r.getRowNum()); // NOSONAR
            _rows.put(rownumI, r);
        }
    }

    /**
     * Read hyperlink relations, link them with CTHyperlink beans in this worksheet
     * and initialize the internal array of XSSFHyperlink objects
     */
    private void initHyperlinks() {
        hyperlinks = new ArrayList<>();

        if(!worksheet.isSetHyperlinks()) {
            return;
        }

        try {
            PackageRelationshipCollection hyperRels =
                    getPackagePart().getRelationshipsByType(XSSFRelation.SHEET_HYPERLINKS.getRelation());

            // Turn each one into a XSSFHyperlink
            for(CTHyperlink hyperlink : worksheet.getHyperlinks().getHyperlinkArray()) {
                PackageRelationship hyperRel = null;
                if(hyperlink.getId() != null) {
                    hyperRel = hyperRels.getRelationshipByID(hyperlink.getId());
                }

                hyperlinks.add( new XSSFHyperlink(hyperlink, hyperRel) );
            }
        } catch (InvalidFormatException e){
            throw new POIXMLException(e);
        }
    }

    /**
     * Create a new CTWorksheet instance with all values set to defaults
     *
     * @return a new instance
     */
    private static CTWorksheet newSheet(){
        CTWorksheet worksheet = CTWorksheet.Factory.newInstance();
        CTSheetFormatPr ctFormat = worksheet.addNewSheetFormatPr();
        ctFormat.setDefaultRowHeight(DEFAULT_ROW_HEIGHT);

        CTSheetView ctView = worksheet.addNewSheetViews().addNewSheetView();
        ctView.setWorkbookViewId(0);

        worksheet.addNewDimension().setRef("A1");

        worksheet.addNewSheetData();

        CTPageMargins ctMargins = worksheet.addNewPageMargins();
        ctMargins.setBottom(DEFAULT_MARGIN_BOTTOM);
        ctMargins.setFooter(DEFAULT_MARGIN_FOOTER);
        ctMargins.setHeader(DEFAULT_MARGIN_HEADER);
        ctMargins.setLeft(DEFAULT_MARGIN_LEFT);
        ctMargins.setRight(DEFAULT_MARGIN_RIGHT);
        ctMargins.setTop(DEFAULT_MARGIN_TOP);

        return worksheet;
    }

    /**
     * Provide access to the CTWorksheet bean holding this sheet's data
     *
     * @return the CTWorksheet bean holding this sheet's data
     */
    @Internal
    public CTWorksheet getCTWorksheet() {
        return this.worksheet;
    }

    public ColumnHelper getColumnHelper() {
        return columnHelper;
    }

    /**
     * Returns the name of this sheet
     *
     * @return the name of this sheet
     */
    @Override
    public String getSheetName() {
        return sheet.getName();
    }

    /**
     * Adds a merged region of cells on a sheet.
     *
     * @param region to merge
     * @return index of this region
     * @throws IllegalArgumentException if region contains fewer than 2 cells
     * @throws IllegalStateException if region intersects with a multi-cell array formula
     * @throws IllegalStateException if region intersects with an existing region on this sheet
     */
    @Override
    public int addMergedRegion(CellRangeAddress region) {
        return addMergedRegion(region, true);
    }

    /**
     * Adds a merged region of cells (hence those cells form one).
     * Skips validation. It is possible to create overlapping merged regions
     * or create a merged region that intersects a multi-cell array formula
     * with this formula, which may result in a corrupt workbook.
     *
     * To check for merged regions overlapping array formulas or other merged regions
     * after addMergedRegionUnsafe has been called, call {@link #validateMergedRegions()}, which runs in O(n^2) time.
     *
     * @param region to merge
     * @return index of this region
     * @throws IllegalArgumentException if region contains fewer than 2 cells
     */
    @Override
    public int addMergedRegionUnsafe(CellRangeAddress region) {
        return addMergedRegion(region, false);
    }

    /**
     * Adds a merged region of cells (hence those cells form one).
     * If validate is true, check to make sure adding the merged region to the sheet doesn't create a corrupt workbook
     * If validate is false, skips the expensive merged region checks, but may produce a corrupt workbook.
     *
     * @param region to merge
     * @param validate whether to validate merged region
     * @return 0-based index of this region
     * @throws IllegalArgumentException if region contains fewer than 2 cells (this check is inexpensive and is performed regardless of {@code validate})
     * @throws IllegalStateException if region intersects with a multi-cell array formula
     * @throws IllegalStateException if region intersects with an existing region on this sheet
     */
    private int addMergedRegion(CellRangeAddress region, boolean validate) {
        if (region.getNumberOfCells() < 2) {
            throw new IllegalArgumentException("Merged region " + region.formatAsString() + " must contain 2 or more cells");
        }
        region.validate(SpreadsheetVersion.EXCEL2007);

        if (validate) {
            // throw IllegalStateException if the argument CellRangeAddress intersects with
            // a multi-cell array formula defined in this sheet
            validateArrayFormulas(region);

            // Throw IllegalStateException if the argument CellRangeAddress intersects with
            // a merged region already in this sheet
            validateMergedRegions(region);
        }

        CTMergeCells ctMergeCells = worksheet.isSetMergeCells() ? worksheet.getMergeCells() : worksheet.addNewMergeCells();
        CTMergeCell ctMergeCell = ctMergeCells.addNewMergeCell();
        ctMergeCell.setRef(region.formatAsString());

        long count = ctMergeCells.getCount();

        if (count == 0) {
            count=ctMergeCells.sizeOfMergeCellArray();
        } else {
            count++;
        }

        // also adjust the number of merged regions overall
        ctMergeCells.setCount(count);

        return Math.toIntExact(count-1);
    }

    /**
     * Verify that the candidate region does not intersect with an existing multi-cell array formula in this sheet
     *
     * @param region a region that is validated.
     * @throws IllegalStateException if candidate region intersects an existing array formula in this sheet
     */
    private void validateArrayFormulas(CellRangeAddress region) {
        // FIXME: this may be faster if it looped over array formulas directly rather than looping over each cell in
        // the region and searching if that cell belongs to an array formula
        int firstRow = region.getFirstRow();
        int firstColumn = region.getFirstColumn();
        int lastRow = region.getLastRow();
        int lastColumn = region.getLastColumn();
        // for each cell in sheet, if cell belongs to an array formula, check if merged region intersects array formula cells
        for (int rowIn = firstRow; rowIn <= lastRow; rowIn++) {
            XSSFRow row = getRow(rowIn);
            if (row == null) {
                continue;
            }

            for (int colIn = firstColumn; colIn <= lastColumn; colIn++) {
                XSSFCell cell = row.getCell(colIn);
                if (cell == null) {
                    continue;
                }

                if (cell.isPartOfArrayFormulaGroup()) {
                    CellRangeAddress arrayRange = cell.getArrayFormulaRange();
                    if (arrayRange.getNumberOfCells() > 1 && region.intersects(arrayRange)) {
                        String msg = "The range " + region.formatAsString() + " intersects with a multi-cell array formula. " +
                                "You cannot merge cells of an array.";
                        throw new IllegalStateException(msg);
                    }
                }
            }
        }
    }

    /**
     * Verify that none of the merged regions intersect a multi-cell array formula in this sheet
     *
     * @throws IllegalStateException if candidate region intersects an existing array formula in this sheet
     */
    private void checkForMergedRegionsIntersectingArrayFormulas() {
        for (CellRangeAddress region : getMergedRegions()) {
            validateArrayFormulas(region);
        }
    }

    /**
     * Verify that candidate region does not intersect with an existing merged region in this sheet
     *
     * @param candidateRegion the range of cells to verify
     * @throws IllegalStateException if candidate region intersects an existing merged region in this sheet (or candidateRegion is already merged in this sheet)
     */
    private void validateMergedRegions(CellRangeAddress candidateRegion) {
        for (final CellRangeAddress existingRegion : getMergedRegions()) {
            if (existingRegion.intersects(candidateRegion)) {
                throw new IllegalStateException("Cannot add merged region " + candidateRegion.formatAsString() +
                        " to sheet because it overlaps with an existing merged region (" + existingRegion.formatAsString() + ").");
            }
        }
    }

    /**
     * Verify that no merged regions intersect another merged region in this sheet.
     *
     * @throws IllegalStateException if at least one region intersects with another merged region in this sheet
     */
    private void checkForIntersectingMergedRegions() {
        final List<CellRangeAddress> regions = getMergedRegions();
        final int size = regions.size();
        for (int i=0; i < size; i++) {
            final CellRangeAddress region = regions.get(i);
            for (final CellRangeAddress other : regions.subList(i+1, regions.size())) {
                if (region.intersects(other)) {
                    String msg = "The range " + region.formatAsString() +
                            " intersects with another merged region " +
                            other.formatAsString() + " in this sheet";
                    throw new IllegalStateException(msg);
                }
            }
        }
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
        checkForMergedRegionsIntersectingArrayFormulas();
        checkForIntersectingMergedRegions();
    }

    /**
     * Adjusts the column width to fit the contents.
     *
     * This process can be relatively slow on large sheets, so this should
     *  normally only be called once per column, at the end of your
     *  processing.
     *
     * @param column the column index
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
     * @param column the column index
     * @param useMergedCells whether to use the contents of merged cells when calculating the width of the column
     */
    @Override
    public void autoSizeColumn(int column, boolean useMergedCells) {
        double width = SheetUtil.getColumnWidth(this, column, useMergedCells);

        if (width != -1) {
            width *= 256;
            int maxColumnWidth = 255*256; // The maximum column width for an individual cell is 255 characters
            if (width > maxColumnWidth) {
                width = maxColumnWidth;
            }
            setColumnWidth(column, Math.toIntExact(Math.round(width)));
            columnHelper.setColBestFit(column, true);
        }
    }

    /**
     * Create a new row within the sheet and return the high level representation
     *
     * Note: If a row already exists at this position, it is removed/overwritten and
     *      any existing cell is removed!
     *
     * @param rownum  row number
     * @return High level {@link XSSFRow} object representing a row in the sheet
     * @see #removeRow(Row)
     */
    @Override
    public XSSFRow createRow(int rownum) {
        // Performance optimization: explicit boxing is slightly faster than auto-unboxing, though may use more memory
        //noinspection UnnecessaryBoxing
        final Integer rownumI = Integer.valueOf(rownum); // NOSONAR
        CTRow ctRow;
        XSSFRow prev = _rows.get(rownumI);
        if(prev != null){
            // the Cells in an existing row are invalidated on-purpose, in order to clean up correctly, we
            // need to call the remove, so things like ArrayFormulas and CalculationChain updates are done
            // correctly.
            // We remove the cell this way as the internal cell-list is changed by the remove call and
            // thus would cause ConcurrentModificationException otherwise
            while(prev.getFirstCellNum() != -1) {
                prev.removeCell(prev.getCell(prev.getFirstCellNum()));
            }

            ctRow = prev.getCTRow();
            ctRow.set(CTRow.Factory.newInstance());
        } else {
            if(_rows.isEmpty() || rownum > _rows.lastKey()) {
                // we can append the new row at the end
                ctRow = worksheet.getSheetData().addNewRow();
            } else {
                // get number of rows where row index < rownum
                // --> this tells us where our row should go
                int idx = _rows.headMap(rownumI).size();
                ctRow = worksheet.getSheetData().insertNewRow(idx);
            }
        }
        XSSFRow r = new XSSFRow(ctRow, this);
        r.setRowNum(rownum);
        _rows.put(rownumI, r);
        return r;
    }

    /**
     * Get a Hyperlink in this sheet anchored at row, column
     *
     * @param row The row where the hyperlink is anchored
     * @param column The column where the hyperlink is anchored
     * @return hyperlink if there is a hyperlink anchored at row, column; otherwise returns null
     */
    @Override
    public XSSFHyperlink getHyperlink(int row, int column) {
        return getHyperlink(new CellAddress(row, column));
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
        for (XSSFHyperlink hyperlink : getHyperlinkList()) {
            if (addr.getRow() >= hyperlink.getFirstRow() && addr.getRow() <= hyperlink.getLastRow()
                    && addr.getColumn() >= hyperlink.getFirstColumn() && addr.getColumn() <= hyperlink.getLastColumn()) {
                return hyperlink;
            }
        }
        return null;
    }

    /**
     * Get a list of Hyperlinks in this sheet
     *
     * @return Hyperlinks for the sheet
     */
    @Override
    public List<XSSFHyperlink> getHyperlinkList() {
        return Collections.unmodifiableList(hyperlinks);
    }

    /**
     * Get the actual column width (in units of 1/256th of a character width )
     *
     * <p>
     * Note, the returned  value is always greater that {@link #getDefaultColumnWidth()} because the latter does not include margins.
     * Actual column width measured as the number of characters of the maximum digit width of the
     * numbers 0, 1, 2, ..., 9 as rendered in the normal style's font. There are 4 pixels of margin
     * padding (two on each side), plus 1 pixel padding for the gridlines.
     * </p>
     *
     * @param columnIndex - the column to set (0-based)
     * @return width - the width in units of 1/256th of a character width
     */
    @Override
    public int getColumnWidth(int columnIndex) {
        CTCol col = columnHelper.getColumn(columnIndex, false);
        double width = col == null || !col.isSetWidth() ? getDefaultColumnWidth() : col.getWidth();
        return Math.toIntExact(Math.round(width*256));
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
        float widthIn256 = getColumnWidth(columnIndex);
        return (float)(widthIn256/256.0*Units.DEFAULT_CHARACTER_WIDTH);
    }

    /**
     * Get the default column width for the sheet (if the columns do not define their own width) in
     * characters.
     * <p>
     * Note, this value is different from {@link #getColumnWidth(int)}. The latter is always greater and includes
     * 4 pixels of margin padding (two on each side), plus 1 pixel padding for the gridlines.
     * </p>
     * @return column width, default value is 8
     */
    @Override
    public int getDefaultColumnWidth() {
        CTSheetFormatPr pr = worksheet.getSheetFormatPr();
        return pr == null ? 8 : Math.toIntExact(pr.getBaseColWidth());
    }

    /**
     * Get the default row height for the sheet (if the rows do not define their own height) in
     * twips (1/20 of a point)
     *
     * @return  default row height
     */
    @Override
    public short getDefaultRowHeight() {
        return (short)(getDefaultRowHeightInPoints() * Font.TWIPS_PER_POINT);
    }


    /**
     * Get the default row height for the sheet measured in point size (if the rows do not define their own height).
     *
     * @return  default row height in points
     */
    @Override
    public float getDefaultRowHeightInPoints() {
        CTSheetFormatPr pr = worksheet.getSheetFormatPr();
        return (float)(pr == null ? 0 : pr.getDefaultRowHeight());
    }

    private CTSheetFormatPr getSheetTypeSheetFormatPr(final boolean createIfNotExists) {
        if (worksheet.isSetSheetFormatPr()) {
            return worksheet.getSheetFormatPr();
        }
        return createIfNotExists ? worksheet.addNewSheetFormatPr() : null;
    }

    /**
     * Returns the CellStyle that applies to the given
     *  (0 based) column, or null if no style has been
     *  set for that column
     */
    @Override
    public CellStyle getColumnStyle(int column) {
        int idx = columnHelper.getColDefaultStyle(column);
        return getWorkbook().getCellStyleAt(idx == -1 ? 0 : idx);
    }

    /**
     * Sets whether the worksheet is displayed from right to left instead of from left to right.
     *
     * @param value true for right to left, false otherwise.
     */
    @Override
    public void setRightToLeft(boolean value) {
        final CTSheetView dsv = getDefaultSheetView(true);
        assert(dsv != null);
        dsv.setRightToLeft(value);
    }

    /**
     * Whether the text is displayed in right-to-left mode in the window
     *
     * @return whether the text is displayed in right-to-left mode in the window
     */
    @Override
    public boolean isRightToLeft() {
        final CTSheetView dsv = getDefaultSheetView(false);
        return (dsv != null && dsv.getRightToLeft());
    }

    /**
     * Gets the flag indicating whether the window should show 0 (zero) in cells containing zero value.
     * When false, cells with zero value appear blank instead of showing the number zero.
     *
     * @return whether all zero values on the worksheet are displayed (defaults to true)
     */
    @Override
    public boolean isDisplayZeros(){
        final CTSheetView dsv = getDefaultSheetView(false);
        return (dsv == null) || dsv.getShowZeros();
    }

    /**
     * Set whether the window should show 0 (zero) in cells containing zero value.
     * When false, cells with zero value appear blank instead of showing the number zero.
     *
     * @param value whether to display or hide all zero values on the worksheet
     */
    @Override
    public void setDisplayZeros(boolean value){
        final CTSheetView view = getDefaultSheetView(true);
        assert(view != null);
        view.setShowZeros(value);
    }

    /**
     * Gets the first row on the sheet
     *
     * @return the number of the first logical row on the sheet, zero based
     */
    @Override
    public int getFirstRowNum() {
        return _rows.isEmpty() ? -1 : _rows.firstKey();
    }

    private CTSheetPr getSheetTypeSheetPr() {
        if (worksheet.getSheetPr() == null) {
            worksheet.setSheetPr(CTSheetPr.Factory.newInstance());
        }
        return worksheet.getSheetPr();
    }

    private CTHeaderFooter getSheetTypeHeaderFooter() {
        if (worksheet.getHeaderFooter() == null) {
            worksheet.setHeaderFooter(CTHeaderFooter.Factory.newInstance());
        }
        return worksheet.getHeaderFooter();
    }



    /**
     * Returns the default footer for the sheet,
     *  creating one as needed.
     * You may also want to look at
     *  {@link #getFirstFooter()},
     *  {@link #getOddFooter()} and
     *  {@link #getEvenFooter()}
     */
    @Override
    public Footer getFooter() {
        // The default footer is an odd footer
        return getOddFooter();
    }

    /**
     * Returns the default header for the sheet,
     *  creating one as needed.
     * You may also want to look at
     *  {@link #getFirstHeader()},
     *  {@link #getOddHeader()} and
     *  {@link #getEvenHeader()}
     */
    @Override
    public Header getHeader() {
        // The default header is an odd header
        return getOddHeader();
    }

    /**
     * Returns the odd footer. Used on all pages unless
     *  other footers also present, when used on only
     *  odd pages.
     */
    public Footer getOddFooter() {
        return new XSSFOddFooter(getSheetTypeHeaderFooter());
    }
    /**
     * Returns the even footer. Not there by default, but
     *  when set, used on even pages.
     */
    public Footer getEvenFooter() {
        return new XSSFEvenFooter(getSheetTypeHeaderFooter());
    }
    /**
     * Returns the first page footer. Not there by
     *  default, but when set, used on the first page.
     */
    public Footer getFirstFooter() {
        return new XSSFFirstFooter(getSheetTypeHeaderFooter());
    }

    /**
     * Returns the odd header. Used on all pages unless
     *  other headers also present, when used on only
     *  odd pages.
     */
    public Header getOddHeader() {
        return new XSSFOddHeader(getSheetTypeHeaderFooter());
    }
    /**
     * Returns the even header. Not there by default, but
     *  when set, used on even pages.
     */
    public Header getEvenHeader() {
        return new XSSFEvenHeader(getSheetTypeHeaderFooter());
    }
    /**
     * Returns the first page header. Not there by
     *  default, but when set, used on the first page.
     */
    public Header getFirstHeader() {
        return new XSSFFirstHeader(getSheetTypeHeaderFooter());
    }


    /**
     * Determine whether printed output for this sheet will be horizontally centered.
     */
    @Override
    public boolean getHorizontallyCenter() {
        CTPrintOptions opts = worksheet.getPrintOptions();
        return opts != null && opts.getHorizontalCentered();
    }

    @Override
    public int getLastRowNum() {
        // _rows.getLastKey() (O(logN)) or caching last row (O(1))?
        // A test with 1_000_000 rows shows that querying getLastRowNum with lastKey() implementation takes ~40 ms,
        // and ~1.2 ms with cached implementation. 40 ms is negligible compared to the time of evaluation a million
        // cells, and the lastKey implementation is much more elegant and less error prone than caching.
        return _rows.isEmpty() ? -1 : _rows.lastKey();
    }

    @Override
    public short getLeftCol() {
        String cellRef = worksheet.getSheetViews().getSheetViewArray(0).getTopLeftCell();
        if(cellRef == null) {
            return 0;
        }
        CellReference cellReference = new CellReference(cellRef);
        return cellReference.getCol();
    }

    /**
     * Gets the size of the margin in inches.
     *
     * @param margin which margin to get
     * @return the size of the margin
     * @see Sheet#LeftMargin
     * @see Sheet#RightMargin
     * @see Sheet#TopMargin
     * @see Sheet#BottomMargin
     * @see Sheet#HeaderMargin
     * @see Sheet#FooterMargin
     * @deprecated use {@link #getMargin(PageMargin)}
     */
    @Override
    @Deprecated
    @Removal(version = "7.0.0")
    public double getMargin(short margin) {
        return getMargin(PageMargin.getByShortValue(margin));
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
        if (!worksheet.isSetPageMargins()) {
            return 0;
        }

        CTPageMargins pageMargins = worksheet.getPageMargins();
        switch (margin) {
            case LEFT:
                return pageMargins.getLeft();
            case RIGHT:
                return pageMargins.getRight();
            case TOP:
                return pageMargins.getTop();
            case BOTTOM:
                return pageMargins.getBottom();
            case HEADER:
                return pageMargins.getHeader();
            case FOOTER:
                return pageMargins.getFooter();
            default :
                throw new IllegalArgumentException("Unknown margin constant:  " + margin);
        }
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
        final PageMargin pageMargin = PageMargin.getByShortValue(margin);
        if (pageMargin == null) {
            throw new IllegalArgumentException( "Unknown margin constant:  " + margin );
        }
        setMargin(pageMargin, size);
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
        CTPageMargins pageMargins = worksheet.isSetPageMargins() ?
                worksheet.getPageMargins() : worksheet.addNewPageMargins();
        switch (margin) {
            case LEFT:
                pageMargins.setLeft(size);
                break;
            case RIGHT:
                pageMargins.setRight(size);
                break;
            case TOP:
                pageMargins.setTop(size);
                break;
            case BOTTOM:
                pageMargins.setBottom(size);
                break;
            case HEADER:
                pageMargins.setHeader(size);
                break;
            case FOOTER:
                pageMargins.setFooter(size);
                break;
            default:
                throw new IllegalArgumentException( "Unknown margin constant:  " + margin );
        }
    }

    /**
     * Returns the list of merged regions. If you want multiple regions, this is
     * faster than calling {@link #getMergedRegion(int)} each time.
     *
     * @return the list of merged regions
     */
    @Override
    public List<CellRangeAddress> getMergedRegions() {
        List<CellRangeAddress> addresses = new ArrayList<>();
        CTMergeCells ctMergeCells = worksheet.getMergeCells();
        if(ctMergeCells == null) {
            return addresses;
        }

        for(CTMergeCell ctMergeCell : ctMergeCells.getMergeCellArray()) {
            String ref = ctMergeCell.getRef();
            addresses.add(CellRangeAddress.valueOf(ref));
        }
        return addresses;
    }

    /**
     * Returns the number of merged regions defined in this worksheet
     *
     * @return number of merged regions in this worksheet
     */
    @Override
    public int getNumMergedRegions() {
        CTMergeCells ctMergeCells = worksheet.getMergeCells();
        return ctMergeCells == null ? 0 : ctMergeCells.sizeOfMergeCellArray();
    }

    public int getNumHyperlinks() {
        return hyperlinks.size();
    }

    /**
     * Returns the number of physically defined rows (NOT the number of rows in the sheet)
     *
     * @return the number of physically defined rows
     */
    @Override
    public int getPhysicalNumberOfRows() {
        return _rows.size();
    }

    /**
     * Answer whether protection is enabled or disabled
     *
     * @return true =&gt; protection enabled; false =&gt; protection disabled
     */
    @Override
    public boolean getProtect() {
        return isSheetLocked();
    }

    /**
     * Enables sheet protection and sets the password for the sheet.
     * Also sets some attributes on the {@link CTSheetProtection} that correspond to
     * the default values used by Excel
     *
     * @param password to set for protection. Pass {@code null} to remove protection
     */
    @Override
    public void protectSheet(String password) {
        if (password != null) {
            CTSheetProtection sheetProtection = safeGetProtectionField();
            setSheetPassword(password, null); // defaults to xor password
            sheetProtection.setSheet(true);
            sheetProtection.setScenarios(true);
            sheetProtection.setObjects(true);
        } else {
            worksheet.unsetSheetProtection();
        }
    }

    /**
     * Sets the sheet password.
     *
     * @param password if null, the password will be removed
     * @param hashAlgo if null, the password will be set as XOR password (Excel 2010 and earlier)
     *  otherwise the given algorithm is used for calculating the hash password (Excel 2013)
     */
    public void setSheetPassword(String password, HashAlgorithm hashAlgo) {
        if (password == null && !isSheetProtectionEnabled()) {
            return;
        }
        setPassword(safeGetProtectionField(), password, hashAlgo, null);
    }

    /**
     * Validate the password against the stored hash, the hashing method will be determined
     *  by the existing password attributes
     * @return true, if the hashes match (... though original password may differ ...)
     */
    public boolean validateSheetPassword(String password) {
        if (!isSheetProtectionEnabled()) {
            return (password == null);
        }
        return validatePassword(safeGetProtectionField(), password, null);
    }

    /**
     * Returns the logical row ( 0-based).  If you ask for a row that is not
     * defined you get a null.  This is to say row 4 represents the fifth row on a sheet.
     *
     * @param rownum  row to get
     * @return {@code XSSFRow} representing the rownumber or {@code null} if its not defined on the sheet
     */
    @Override
    public XSSFRow getRow(int rownum) {
        // Performance optimization: explicit boxing is slightly faster than auto-unboxing, though may use more memory
        //noinspection UnnecessaryBoxing
        final Integer rownumI = Integer.valueOf(rownum); // NOSONAR
        return _rows.get(rownumI);
    }

    /**
     * returns all rows between startRow and endRow, inclusive.
     * Rows between startRow and endRow that haven't been created are not included
     * in result unless createRowIfMissing is true
     *
     * @param startRowNum the first row number in this sheet to return
     * @param endRowNum the last row number in this sheet to return
     * @param createRowIfMissing If missing rows should be created.
     * @return All rows between startRow and endRow, inclusive. If createRowIfMissing is false,
     *      only previously existing rows are returned, otherwise empty rows are added as necessary
     * @throws IllegalArgumentException if startRowNum and endRowNum are not in ascending order
     */
    private List<XSSFRow> getRows(int startRowNum, int endRowNum, boolean createRowIfMissing) {
        if (startRowNum > endRowNum) {
            throw new IllegalArgumentException("getRows: startRowNum must be less than or equal to endRowNum");
        }
        final List<XSSFRow> rows = new ArrayList<>();
        if (createRowIfMissing) {
            for (int i = startRowNum; i <= endRowNum; i++) {
                XSSFRow row = getRow(i);
                if (row == null) {
                    row = createRow(i);
                }
                rows.add(row);
            }
        }
        else {
            // Performance optimization: explicit boxing is slightly faster than auto-unboxing, though may use more memory
            //noinspection UnnecessaryBoxing
            final Integer startI = Integer.valueOf(startRowNum); // NOSONAR
            //noinspection UnnecessaryBoxing
            final Integer endI = Integer.valueOf(endRowNum+1); // NOSONAR
            final Collection<XSSFRow> inclusive = _rows.subMap(startI, endI).values();
            rows.addAll(inclusive);
        }
        return rows;
    }
    /**
     * A flag indicating whether scenarios are locked when the sheet is protected.
     *
     * @return true =&gt; protection enabled; false =&gt; protection disabled
     */
    @Override
    public boolean getScenarioProtect() {
        return worksheet.isSetSheetProtection() && worksheet.getSheetProtection().getScenarios();
    }

    /**
     * The top row in the visible view when the sheet is
     * first viewed after opening it in a viewer
     *
     * @return integer indicating the rownum (0 based) of the top row
     */
    @Override
    public short getTopRow() {
        final CTSheetView dsv = getDefaultSheetView(false);
        final String cellRef = (dsv == null) ? null : dsv.getTopLeftCell();
        if(cellRef == null) {
            return 0;
        }
        return (short) new CellReference(cellRef).getRow();
    }

    /**
     * Determine whether printed output for this sheet will be vertically centered.
     *
     * @return whether printed output for this sheet will be vertically centered.
     */
    @Override
    public boolean getVerticallyCenter() {
        CTPrintOptions opts = worksheet.getPrintOptions();
        return opts != null && opts.getVerticalCentered();
    }

    /**
     * Group between (0 based) columns
     */
    @Override
    public void groupColumn(int fromColumn, int toColumn) {
        groupColumn1Based(fromColumn+1, toColumn+1);
    }

    private void groupColumn1Based(int fromColumn, int toColumn) {
        CTCols ctCols=worksheet.getColsArray(0);
        CTCol ctCol=CTCol.Factory.newInstance();

        // copy attributes, as they might be removed by merging with the new column
        // TODO: check if this fix is really necessary or if the sweeping algorithm
        // in addCleanColIntoCols needs to be adapted ...
        CTCol fixCol_before = this.columnHelper.getColumn1Based(toColumn, false);
        if (fixCol_before != null) {
            fixCol_before = (CTCol)fixCol_before.copy();
        }

        ctCol.setMin(fromColumn);
        ctCol.setMax(toColumn);
        this.columnHelper.addCleanColIntoCols(ctCols, ctCol);

        CTCol fixCol_after = this.columnHelper.getColumn1Based(toColumn, false);
        if (fixCol_before != null && fixCol_after != null) {
            this.columnHelper.setColumnAttributes(fixCol_before, fixCol_after);
        }

        int maxLevelCol = -1;
        for(int index = fromColumn; index <= toColumn; index++){
            CTCol col = columnHelper.getColumn1Based(index, false);
            //col must exist
            final short outlineLevel = col.getOutlineLevel();
            final int newOutlineLevel = outlineLevel + 1;
            col.setOutlineLevel((short) newOutlineLevel);
            maxLevelCol = Math.max(maxLevelCol, newOutlineLevel);
            index = Math.toIntExact(col.getMax());
        }
        worksheet.setColsArray(0, ctCols);
        increaseSheetFormatPrOutlineLevelColIfNecessary((short) Math.min(Short.MAX_VALUE, maxLevelCol));
    }

    /**
     * Do not leave the width attribute undefined (see #52186).
     */
    private void setColWidthAttribute(CTCols ctCols) {
        for (CTCol col : ctCols.getColArray()) {
            if (!col.isSetWidth()) {
                col.setWidth(getDefaultColumnWidth());
                col.setCustomWidth(false);
            }
        }
    }

    /**
     * Tie a range of cell together so that they can be collapsed or expanded
     *
     * @param fromRow   start row (0-based)
     * @param toRow     end row (0-based)
     */
    @Override
    public void groupRow(int fromRow, int toRow) {
        int maxOutlineLevel = -1;
        for (int i = fromRow; i <= toRow; i++) {
            XSSFRow xrow = getRow(i);
            if (xrow == null) {
                xrow = createRow(i);
            }
            CTRow ctrow = xrow.getCTRow();
            final short outlineLevel = ctrow.getOutlineLevel();
            final int newOutlineLevel = outlineLevel + 1;
            maxOutlineLevel = Math.max(maxOutlineLevel, newOutlineLevel);
            ctrow.setOutlineLevel((short) newOutlineLevel);
        }
        increaseSheetFormatPrOutlineLevelRowIfNecessary((short) Math.min(Short.MAX_VALUE, maxOutlineLevel));
    }

    private short getMaxOutlineLevelRows(){
        int outlineLevel = 0;
        for (XSSFRow xrow : _rows.values()) {
            outlineLevel = Math.max(outlineLevel, xrow.getCTRow().getOutlineLevel());
        }
        return (short) outlineLevel;
    }

    private short getMaxOutlineLevelCols() {
        CTCols ctCols = worksheet.getColsArray(0);
        int outlineLevel = 0;
        for (CTCol col : ctCols.getColArray()) {
            outlineLevel = Math.max(outlineLevel, col.getOutlineLevel());
        }
        return (short) outlineLevel;
    }

    /**
     * Get the hidden state for a given column.
     *
     * @param columnIndex - the column to set (0-based)
     * @return hidden - {@code false} if the column is visible
     */
    @Override
    public boolean isColumnHidden(int columnIndex) {
        CTCol col = columnHelper.getColumn(columnIndex, false);
        return col != null && col.getHidden();
    }

    /**
     * Gets the flag indicating whether this sheet should display formulas.
     *
     * @return {@code true} if this sheet should display formulas.
     */
    @Override
    public boolean isDisplayFormulas() {
        final CTSheetView dsv = getDefaultSheetView(false);
        return dsv != null && dsv.getShowFormulas();
    }

    /**
     * Gets the flag indicating whether this sheet should display row and column headings.
     * <p>
     * Row heading are the row numbers to the side of the sheet
     * </p>
     * <p>
     * Column heading are the letters or numbers that appear above the columns of the sheet
     * </p>
     *
     * @return {@code true} (default) if this sheet should display row and column headings.
     */
    @Override
    public boolean isDisplayRowColHeadings() {
        final CTSheetView dsv = getDefaultSheetView(false);
        return (dsv == null) || dsv.getShowRowColHeaders();
    }

    /**
     * Returns whether row and column headings are printed.
     *
     * @return whether row and column headings are printed
     */
    @Override
    public boolean isPrintRowAndColumnHeadings() {
        CTPrintOptions opts = worksheet.getPrintOptions();
        return opts != null && opts.getHeadings();
    }


    /**
     * Removes a merged region of cells (hence letting them free)
     *
     * @param index of the region to unmerge
     */
    @Override
    public void removeMergedRegion(int index) {
        if (!worksheet.isSetMergeCells()) {
            return;
        }

        CTMergeCells ctMergeCells = worksheet.getMergeCells();
        int size = ctMergeCells.sizeOfMergeCellArray();
        assert(0 <= index && index < size);
        if (size > 1) {
            ctMergeCells.removeMergeCell(index);
        } else {
            worksheet.unsetMergeCells();
        }
    }

    /**
     * Remove a row from this sheet.  All cells contained in the row are removed as well
     *
     * @param row  the row to remove.
     */
    @Override
    public void removeRow(Row row) {
        if (row.getSheet() != this) {
            throw new IllegalArgumentException("Specified row does not belong to this sheet");
        }
        // collect cells into a temporary array to avoid ConcurrentModificationException
        ArrayList<XSSFCell> cellsToDelete = new ArrayList<>();
        for (Cell cell : row) {
            cellsToDelete.add((XSSFCell)cell);
        }

        for (XSSFCell cell : cellsToDelete) {
            row.removeCell(cell);
        }

        final int rowNum = row.getRowNum();
        // Performance optimization: explicit boxing is slightly faster than auto-unboxing, though may use more memory
        //noinspection UnnecessaryBoxing
        final Integer rowNumI = Integer.valueOf(rowNum); // NOSONAR
        // this is not the physical row number!
        final int idx = _rows.headMap(rowNumI).size();
        _rows.remove(rowNumI);
        worksheet.getSheetData().removeRow(idx);

//        // also remove any comment located in that row
//        if(sheetComments != null) {
//            for (CellAddress ref : getCellComments().keySet()) {
//                if (ref.getRow() == rowNum) {
//                    sheetComments.removeComment(ref);
//                }
//            }
//        }
    }

    /**
     * Control if Excel should be asked to recalculate all formulas on this sheet
     * when the workbook is opened.
     *
     *  <p>
     *  Calculating the formula values with {@link FormulaEvaluator} is the
     *  recommended solution, but this may be used for certain cases where
     *  evaluation in POI is not possible.
     *  </p>
     *
     *  <p>
     *  It is recommended to force recalcuation of formulas on workbook level using
     *  {@link Workbook#setForceFormulaRecalculation(boolean)}
     *  to ensure that all cross-worksheet formuals and external dependencies are updated.
     *  </p>
     * @param value true if the application will perform a full recalculation of
     * this worksheet values when the workbook is opened
     *
     * @see Workbook#setForceFormulaRecalculation(boolean)
     */
    @Override
    public void setForceFormulaRecalculation(boolean value) {
        CTCalcPr calcPr = getWorkbook().getCTWorkbook().getCalcPr();

        if(worksheet.isSetSheetCalcPr()) {
            // Change the current setting
            CTSheetCalcPr calc = worksheet.getSheetCalcPr();
            calc.setFullCalcOnLoad(value);
        }
        else if(value) {
            // Add the Calc block and set it
            CTSheetCalcPr calc = worksheet.addNewSheetCalcPr();
            calc.setFullCalcOnLoad(value);
        }
        if(value && calcPr != null && calcPr.getCalcMode() == STCalcMode.MANUAL) {
            calcPr.setCalcMode(STCalcMode.AUTO);
        }

    }

    /**
     * Whether Excel will be asked to recalculate all formulas of this sheet
     * when the workbook is opened.
     *
     * Note: This just returns if the sheet has the recalculate flag set and
     * will still return false even if recalculation is enabled on workbook-level.
     *
     * @return true if the Sheet has the recalculate-flag set.
     */
    @Override
    public boolean getForceFormulaRecalculation() {
        if(worksheet.isSetSheetCalcPr()) {
            CTSheetCalcPr calc = worksheet.getSheetCalcPr();
            return calc.getFullCalcOnLoad();
        }
        return false;
    }

    /**
     * @return an iterator of the PHYSICAL rows.  Meaning the 3rd element may not
     * be the third row if say for instance the second row is undefined.
     * Call getRowNum() on each row if you care which one it is.
     */
    @Override
    @SuppressWarnings("unchecked")
    public Iterator<Row> rowIterator() {
        return (Iterator<Row>)(Iterator<? extends Row>) _rows.values().iterator();
    }

    /**
     * @return a spliterator of the PHYSICAL rows.  Meaning the 3rd element may not
     * be the third row if say for instance the second row is undefined.
     * Call getRowNum() on each row if you care which one it is.
     *
     * @since POI 5.2.0
     */
    @Override
    @SuppressWarnings("unchecked")
    public Spliterator<Row> spliterator() {
        return (Spliterator<Row>)(Spliterator<? extends Row>) _rows.values().spliterator();
    }
    @Override
    public void setColumnGroupCollapsed(int columnNumber, boolean collapsed) {
        if (collapsed) {
            collapseColumn(columnNumber);
        } else {
            expandColumn(columnNumber);
        }
    }

    private void collapseColumn(int columnNumber) {
        CTCols cols = worksheet.getColsArray(0);
        CTCol col = columnHelper.getColumn(columnNumber, false);
        int colInfoIx = columnHelper.getIndexOfColumn(cols, col);
        if (colInfoIx == -1) {
            return;
        }
        // Find the start of the group.
        int groupStartColInfoIx = findStartOfColumnOutlineGroup(colInfoIx);

        CTCol columnInfo = cols.getColArray(groupStartColInfoIx);

        // Hide all the columns until the end of the group
        int lastColMax = setGroupHidden(groupStartColInfoIx, columnInfo
                .getOutlineLevel(), true);

        // write collapse field
        setColumn(lastColMax + 1, 0, null, null, Boolean.TRUE);

    }

    private void setColumn(int targetColumnIx, Integer style,
                           Integer level, Boolean hidden, Boolean collapsed) {
        CTCols cols = worksheet.getColsArray(0);
        CTCol ci = null;
        for (CTCol tci : cols.getColArray()) {
            long tciMin = tci.getMin();
            long tciMax = tci.getMax();
            if (tciMin >= targetColumnIx && tciMax <= targetColumnIx) {
                ci = tci;
                break;
            }
            if (tciMin > targetColumnIx) {
                // call column infos after k are for later columns
                break; // exit now so k will be the correct insert pos
            }
        }

        if (ci == null) {
            // okay so there ISN'T a column info record that covers this column
            // so lets create one!
            CTCol nci = CTCol.Factory.newInstance();
            nci.setMin(targetColumnIx);
            nci.setMax(targetColumnIx);
            unsetCollapsed(collapsed, nci);
            this.columnHelper.addCleanColIntoCols(cols, nci);
            return;
        }

        boolean styleChanged = style != null && ci.getStyle() != style;
        boolean levelChanged = level != null && ci.getOutlineLevel() != level;
        boolean hiddenChanged = hidden != null && ci.getHidden() != hidden;
        boolean collapsedChanged = collapsed != null && ci.getCollapsed() != collapsed;
        boolean columnChanged = levelChanged || hiddenChanged || collapsedChanged || styleChanged;
        if (!columnChanged) {
            // do nothing...nothing changed.
            return;
        }

        long ciMin = ci.getMin();
        long ciMax = ci.getMax();
        if (ciMin == targetColumnIx && ciMax == targetColumnIx) {
            // ColumnInfo ci for a single column, the target column
            unsetCollapsed(collapsed, ci);
            return;
        }

        if (ciMin == targetColumnIx || ciMax == targetColumnIx) {
            // The target column is at either end of the multi-column ColumnInfo ci
            // we'll just divide the info and create a new one
            if (ciMin == targetColumnIx) {
                ci.setMin(targetColumnIx + 1L);
            } else {
                ci.setMax(targetColumnIx - 1L);
            }
            CTCol nci = columnHelper.cloneCol(cols, ci);
            nci.setMin(targetColumnIx);
            unsetCollapsed(collapsed, nci);
            this.columnHelper.addCleanColIntoCols(cols, nci);

        } else {
            // split to 3 records
            CTCol ciMid = columnHelper.cloneCol(cols, ci);
            CTCol ciEnd = columnHelper.cloneCol(cols, ci);
            int lastcolumn = Math.toIntExact(ciMax);

            ci.setMax(targetColumnIx - 1L);

            ciMid.setMin(targetColumnIx);
            ciMid.setMax(targetColumnIx);
            unsetCollapsed(collapsed, ciMid);
            this.columnHelper.addCleanColIntoCols(cols, ciMid);

            ciEnd.setMin(targetColumnIx + 1L);
            ciEnd.setMax(lastcolumn);
            this.columnHelper.addCleanColIntoCols(cols, ciEnd);
        }
    }

    private void unsetCollapsed(Boolean collapsed, CTCol ci) {
        if (collapsed != null && collapsed) {
            ci.setCollapsed(true);
        } else {
            ci.unsetCollapsed();
        }
    }

    /**
     * Sets all adjacent columns of the same outline level to the specified
     * hidden status.
     *
     * @param pIdx
     *                the col info index of the start of the outline group
     * @return the column index of the last column in the outline group
     */
    private int setGroupHidden(int pIdx, int level, boolean hidden) {
        CTCols cols = worksheet.getColsArray(0);
        int idx = pIdx;
        CTCol[] colArray = cols.getColArray();
        CTCol columnInfo = colArray[idx];
        while (idx < colArray.length) {
            columnInfo.setHidden(hidden);
            if (idx + 1 < colArray.length) {
                CTCol nextColumnInfo = colArray[idx + 1];

                if (!isAdjacentBefore(columnInfo, nextColumnInfo)) {
                    break;
                }

                if (nextColumnInfo.getOutlineLevel() < level) {
                    break;
                }
                columnInfo = nextColumnInfo;
            }
            idx++;
        }
        return Math.toIntExact(columnInfo.getMax());
    }

    private boolean isAdjacentBefore(CTCol col, CTCol otherCol) {
        return col.getMax() == otherCol.getMin() - 1;
    }

    private int findStartOfColumnOutlineGroup(int pIdx) {
        // Find the start of the group.
        CTCols cols = worksheet.getColsArray(0);
        CTCol[] colArray = cols.getColArray();
        CTCol columnInfo = colArray[pIdx];
        int level = columnInfo.getOutlineLevel();
        int idx = pIdx;
        while (idx != 0) {
            CTCol prevColumnInfo = colArray[idx - 1];
            if (!isAdjacentBefore(prevColumnInfo, columnInfo)) {
                break;
            }
            if (prevColumnInfo.getOutlineLevel() < level) {
                break;
            }
            idx--;
            columnInfo = prevColumnInfo;
        }
        return idx;
    }

    private int findEndOfColumnOutlineGroup(int colInfoIndex) {
        CTCols cols = worksheet.getColsArray(0);
        // Find the end of the group.
        CTCol[] colArray = cols.getColArray();
        CTCol columnInfo = colArray[colInfoIndex];
        int level = columnInfo.getOutlineLevel();
        int idx = colInfoIndex;
        int lastIdx = colArray.length - 1;
        while (idx < lastIdx) {
            CTCol nextColumnInfo = colArray[idx + 1];
            if (!isAdjacentBefore(columnInfo, nextColumnInfo)) {
                break;
            }
            if (nextColumnInfo.getOutlineLevel() < level) {
                break;
            }
            idx++;
            columnInfo = nextColumnInfo;
        }
        return idx;
    }

    private void expandColumn(int columnIndex) {
        CTCols cols = worksheet.getColsArray(0);
        CTCol col = columnHelper.getColumn(columnIndex, false);
        int colInfoIx = columnHelper.getIndexOfColumn(cols, col);

        int idx = col == null ? -1 : findColInfoIdx(Math.toIntExact(col.getMax()), colInfoIx);
        if (idx == -1) {
            return;
        }

        // If it is already expanded do nothing.
        if (!isColumnGroupCollapsed(idx)) {
            return;
        }

        // Find the start/end of the group.
        int startIdx = findStartOfColumnOutlineGroup(idx);
        int endIdx = findEndOfColumnOutlineGroup(idx);

        // expand:
        // collapsed bit must be unset
        // hidden bit gets unset _if_ surrounding groups are expanded you can
        // determine
        // this by looking at the hidden bit of the enclosing group. You will
        // have
        // to look at the start and the end of the current group to determine
        // which
        // is the enclosing group
        // hidden bit only is altered for this outline level. ie. don't
        // uncollapse contained groups
        CTCol[] colArray = cols.getColArray();
        CTCol columnInfo = colArray[endIdx];
        if (!isColumnGroupHiddenByParent(idx)) {
            short outlineLevel = columnInfo.getOutlineLevel();
            boolean nestedGroup = false;
            for (int i = startIdx; i <= endIdx; i++) {
                CTCol ci = colArray[i];
                if (outlineLevel == ci.getOutlineLevel()) {
                    ci.unsetHidden();
                    if (nestedGroup) {
                        nestedGroup = false;
                        ci.setCollapsed(true);
                    }
                } else {
                    nestedGroup = true;
                }
            }
        }
        // Write collapse flag (stored in a single col info record after this
        // outline group)
        setColumn(Math.toIntExact(columnInfo.getMax() + 1), null, null,
                Boolean.FALSE, Boolean.FALSE);
    }

    private boolean isColumnGroupHiddenByParent(int idx) {
        CTCols cols = worksheet.getColsArray(0);
        // Look out outline details of end
        int endLevel = 0;
        boolean endHidden = false;
        int endOfOutlineGroupIdx = findEndOfColumnOutlineGroup(idx);
        CTCol[] colArray = cols.getColArray();
        if (endOfOutlineGroupIdx < (colArray.length - 1)) {
            CTCol nextInfo = colArray[endOfOutlineGroupIdx + 1];
            if (isAdjacentBefore(colArray[endOfOutlineGroupIdx], nextInfo)) {
                endLevel = nextInfo.getOutlineLevel();
                endHidden = nextInfo.getHidden();
            }
        }
        // Look out outline details of start
        int startLevel = 0;
        boolean startHidden = false;
        int startOfOutlineGroupIdx = findStartOfColumnOutlineGroup(idx);
        if (startOfOutlineGroupIdx > 0) {
            CTCol prevInfo = colArray[startOfOutlineGroupIdx - 1];

            if (isAdjacentBefore(prevInfo, colArray[startOfOutlineGroupIdx])) {
                startLevel = prevInfo.getOutlineLevel();
                startHidden = prevInfo.getHidden();
            }

        }
        if (endLevel > startLevel) {
            return endHidden;
        }
        return startHidden;
    }

    private int findColInfoIdx(int columnValue, int fromColInfoIdx) {
        CTCols cols = worksheet.getColsArray(0);

        if (columnValue < 0) {
            throw new IllegalArgumentException(
                    "column parameter out of range: " + columnValue);
        }
        if (fromColInfoIdx < 0) {
            throw new IllegalArgumentException(
                    "fromIdx parameter out of range: " + fromColInfoIdx);
        }

        CTCol[] colArray = cols.getColArray();
        for (int k = fromColInfoIdx; k < colArray.length; k++) {
            CTCol ci = colArray[k];

            if (containsColumn(ci, columnValue)) {
                return k;
            }

            if (ci.getMin() > fromColInfoIdx) {
                break;
            }

        }
        return -1;
    }

    private boolean containsColumn(CTCol col, int columnIndex) {
        return col.getMin() <= columnIndex && columnIndex <= col.getMax();
    }

    /**
     * 'Collapsed' state is stored in a single column col info record
     * immediately after the outline group
     *
     * @param idx The column-index to check
     * @return a boolean represented if the column is collapsed
     */
    private boolean isColumnGroupCollapsed(int idx) {
        CTCols cols = worksheet.getColsArray(0);
        CTCol[] colArray = cols.getColArray();
        int endOfOutlineGroupIdx = findEndOfColumnOutlineGroup(idx);
        int nextColInfoIx = endOfOutlineGroupIdx + 1;
        if (nextColInfoIx >= colArray.length) {
            return false;
        }
        CTCol nextColInfo = colArray[nextColInfoIx];

        CTCol col = colArray[endOfOutlineGroupIdx];
        if (!isAdjacentBefore(col, nextColInfo)) {
            return false;
        }

        return nextColInfo.getCollapsed();
    }

    /**
     * Set the visibility state for a given column.
     *
     * @param columnIndex - the column to get (0-based)
     * @param hidden - the visibility state of the column
     */
    @Override
    public void setColumnHidden(int columnIndex, boolean hidden) {
        columnHelper.setColHidden(columnIndex, hidden);
    }

    /**
     * Set the width (in units of 1/256th of a character width)
     *
     * <p>
     * The maximum column width for an individual cell is 255 characters.
     * This value represents the number of characters that can be displayed
     * in a cell that is formatted with the standard font (first font in the workbook).
     * </p>
     *
     * <p>
     * Character width is defined as the maximum digit width
     * of the numbers {@code 0, 1, 2, ... 9} as rendered
     * using the default font (first font in the workbook).
     * <br>
     * Unless you are using a very special font, the default character is '0' (zero),
     * this is true for Arial (default font in HSSF) and Calibri (default font in XSSF)
     * </p>
     *
     * <p>
     * Please note, that the width set by this method includes 4 pixels of margin padding (two on each side),
     * plus 1 pixel padding for the gridlines (Section 3.3.1.12 of the OOXML spec).
     * This results is a slightly less value of visible characters than passed to this method (approx. 1/2 of a character).
     * </p>
     * <p>
     * To compute the actual number of visible characters,
     *  Excel uses the following formula (Section 3.3.1.12 of the OOXML spec):
     * </p>
     * {@code
     *     width = Truncate([{Number of Visible Characters} *
     *      {Maximum Digit Width} + {5 pixel padding}]/{Maximum Digit Width}*256)/256
     * }
     * <p>Using the Calibri font as an example, the maximum digit width of 11 point font size is 7 pixels (at 96 dpi).
     *  If you set a column width to be eight characters wide, e.g. {@code setColumnWidth(columnIndex, 8*256)},
     *  then the actual value of visible characters (the value shown in Excel) is derived from the following equation:
     *  {@code
     Truncate([numChars*7+5]/7*256)/256 = 8;
     *  }
     *
     *  which gives {@code 7.29}.
     *
     * @param columnIndex - the column to set (0-based)
     * @param width - the width in units of 1/256th of a character width
     * @throws IllegalArgumentException if width &gt; 255*256 (the maximum column width in Excel is 255 characters)
     */
    @Override
    public void setColumnWidth(int columnIndex, int width) {
        if(width > 255*256) {
            throw new IllegalArgumentException("The maximum column width for an individual cell is 255 characters.");
        }

        columnHelper.setColWidth(columnIndex, (double)width/256);
        columnHelper.setCustomWidth(columnIndex, true);
    }

    @Override
    public void setDefaultColumnStyle(int column, CellStyle style) {
        columnHelper.setColDefaultStyle(column, style);
    }

    /**
     * Specifies the number of characters of the maximum digit width of the normal style's font.
     * This value does not include margin padding or extra padding for gridlines. It is only the
     * number of characters.
     *
     * @param width the number of characters. Default value is {@code 8}.
     */
    @Override
    public void setDefaultColumnWidth(int width) {
        getSheetTypeSheetFormatPr(true).setBaseColWidth(width);
    }

    /**
     * Set the default row height for the sheet (if the rows do not define their own height) in
     * twips (1/20 of  a point)
     *
     * @param  height default row height in  twips (1/20 of  a point)
     */
    @Override
    public void setDefaultRowHeight(short height) {
        setDefaultRowHeightInPoints((float)height / Font.TWIPS_PER_POINT);
    }

    /**
     * Sets default row height measured in point size.
     *
     * @param height default row height measured in point size.
     */
    @Override
    public void setDefaultRowHeightInPoints(float height) {
        CTSheetFormatPr pr = getSheetTypeSheetFormatPr(true);
        pr.setDefaultRowHeight(height);
        pr.setCustomHeight(true);
    }

    /**
     * Sets the flag indicating whether this sheet should display formulas.
     *
     * @param show {@code true} if this sheet should display formulas.
     */
    @Override
    public void setDisplayFormulas(boolean show) {
        final CTSheetView dsv = getDefaultSheetView(true);
        assert(dsv != null);
        dsv.setShowFormulas(show);
    }

    /**
     * Center on page horizontally when printing.
     *
     * @param value whether to center on page horizontally when printing.
     */
    @Override
    public void setHorizontallyCenter(boolean value) {
        CTPrintOptions opts = worksheet.isSetPrintOptions() ?
                worksheet.getPrintOptions() : worksheet.addNewPrintOptions();
        opts.setHorizontalCentered(value);
    }

    /**
     * Whether the output is vertically centered on the page.
     *
     * @param value true to vertically center, false otherwise.
     */
    @Override
    public void setVerticallyCenter(boolean value) {
        CTPrintOptions opts = worksheet.isSetPrintOptions() ?
                worksheet.getPrintOptions() : worksheet.addNewPrintOptions();
        opts.setVerticalCentered(value);
    }

    /**
     * group the row It is possible for collapsed to be false and yet still have
     * the rows in question hidden. This can be achieved by having a lower
     * outline level collapsed, thus hiding all the child rows. Note that in
     * this case, if the lowest level were expanded, the middle level would
     * remain collapsed.
     *
     * @param rowIndex -
     *                the row involved, 0 based
     * @param collapse -
     *                boolean value for collapse
     */
    @Override
    public void setRowGroupCollapsed(int rowIndex, boolean collapse) {
        if (collapse) {
            collapseRow(rowIndex);
        } else {
            expandRow(rowIndex);
        }
    }

    /**
     * @param rowIndex the zero based row index to collapse
     */
    private void collapseRow(int rowIndex) {
        XSSFRow row = getRow(rowIndex);
        if (row != null) {
            int startRow = findStartOfRowOutlineGroup(rowIndex);

            // Hide all the columns until the end of the group
            int lastRow = writeHidden(row, startRow, true);
            if (getRow(lastRow) != null) {
                getRow(lastRow).getCTRow().setCollapsed(true);
            } else {
                XSSFRow newRow = createRow(lastRow);
                newRow.getCTRow().setCollapsed(true);
            }
        }
    }

    /**
     * @param rowIndex the zero based row index to find from
     */
    private int findStartOfRowOutlineGroup(int rowIndex) {
        // Find the start of the group.
        short level = getRow(rowIndex).getCTRow().getOutlineLevel();
        int currentRow = rowIndex;
        while (getRow(currentRow) != null) {
            if (getRow(currentRow).getCTRow().getOutlineLevel() < level) {
                return currentRow + 1;
            }
            currentRow--;
        }
        return currentRow;
    }

    private int writeHidden(XSSFRow xRow, int rowIndex, boolean hidden) {
        short level = xRow.getCTRow().getOutlineLevel();
        for (Iterator<Row> it = rowIterator(); it.hasNext();) {
            xRow = (XSSFRow) it.next();

            // skip rows before the start of this group
            if(xRow.getRowNum() < rowIndex) {
                continue;
            }

            if (xRow.getCTRow().getOutlineLevel() >= level) {
                xRow.getCTRow().setHidden(hidden);
                rowIndex++;
            }

        }
        return rowIndex;
    }

    /**
     * @param rowNumber the zero based row index to expand
     */
    private void expandRow(int rowNumber) {
        if (rowNumber == -1) {
            return;
        }
        XSSFRow row = getRow(rowNumber);
        // If it is already expanded do nothing.
        if (!row.getCTRow().isSetHidden()) {
            return;
        }

        // Find the start of the group.
        int startIdx = findStartOfRowOutlineGroup(rowNumber);

        // Find the end of the group.
        int endIdx = findEndOfRowOutlineGroup(rowNumber);

        // expand:
        // collapsed must be unset
        // hidden bit gets unset _if_ surrounding groups are expanded you can
        // determine
        // this by looking at the hidden bit of the enclosing group. You will
        // have
        // to look at the start and the end of the current group to determine
        // which
        // is the enclosing group
        // hidden bit only is altered for this outline level. ie. don't
        // un-collapse contained groups
        short level = row.getCTRow().getOutlineLevel();
        if (!isRowGroupHiddenByParent(rowNumber)) {
            for (int i = startIdx; i < endIdx; i++) {
                if (level == getRow(i).getCTRow().getOutlineLevel()) {
                    getRow(i).getCTRow().unsetHidden();
                } else if (!isRowGroupCollapsed(i)) {
                    getRow(i).getCTRow().unsetHidden();
                }
            }
        }
        // Write collapse field
        CTRow ctRow = getRow(endIdx).getCTRow();
        // This avoids an IndexOutOfBounds if multiple nested groups are collapsed/expanded
        if(ctRow.getCollapsed()) {
            ctRow.unsetCollapsed();
        }
    }

    /**
     * @param row the zero based row index to find from
     */
    public int findEndOfRowOutlineGroup(int row) {
        short level = getRow(row).getCTRow().getOutlineLevel();
        int currentRow;
        final int lastRowNum = getLastRowNum();
        for (currentRow = row; currentRow < lastRowNum; currentRow++) {
            if (getRow(currentRow) == null
                    || getRow(currentRow).getCTRow().getOutlineLevel() < level) {
                break;
            }
        }
        return currentRow;
    }

    /**
     * @param row the zero based row index to find from
     */
    private boolean isRowGroupHiddenByParent(int row) {
        // Look out outline details of end
        int endLevel;
        boolean endHidden;
        int endOfOutlineGroupIdx = findEndOfRowOutlineGroup(row);
        if (getRow(endOfOutlineGroupIdx) == null) {
            endLevel = 0;
            endHidden = false;
        } else {
            endLevel = getRow(endOfOutlineGroupIdx).getCTRow().getOutlineLevel();
            endHidden = getRow(endOfOutlineGroupIdx).getCTRow().getHidden();
        }

        // Look out outline details of start
        int startLevel;
        boolean startHidden;
        int startOfOutlineGroupIdx = findStartOfRowOutlineGroup(row);
        if (startOfOutlineGroupIdx < 0
                || getRow(startOfOutlineGroupIdx) == null) {
            startLevel = 0;
            startHidden = false;
        } else {
            startLevel = getRow(startOfOutlineGroupIdx).getCTRow()
                    .getOutlineLevel();
            startHidden = getRow(startOfOutlineGroupIdx).getCTRow()
                    .getHidden();
        }
        if (endLevel > startLevel) {
            return endHidden;
        }
        return startHidden;
    }

    /**
     * @param row the zero based row index to find from
     */
    private boolean isRowGroupCollapsed(int row) {
        int collapseRow = findEndOfRowOutlineGroup(row) + 1;
        if (getRow(collapseRow) == null) {
            return false;
        }
        return getRow(collapseRow).getCTRow().getCollapsed();
    }

    /**
     * Window zoom magnification for current view representing percent values.
     * Valid values range from 10 to 400. Horizontal &amp; Vertical scale together.
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
        if (scale < 10 || scale > 400) {
            throw new IllegalArgumentException("Valid scale values range from 10 to 400");
        }
        final CTSheetView dsv = getDefaultSheetView(true);
        assert(dsv != null);
        dsv.setZoomScale(scale);
    }

    @Override
    public void ungroupColumn(int fromColumn, int toColumn) {
        CTCols cols = worksheet.getColsArray(0);
        int maxLevelCol = -1;
        for (int index = fromColumn; index <= toColumn; index++) {
            CTCol col = columnHelper.getColumn(index, false);
            if (col != null) {
                final short outlineLevel = col.getOutlineLevel();
                maxLevelCol = Math.max(maxLevelCol, outlineLevel);
                col.setOutlineLevel((short) (outlineLevel - 1));
                index = Math.toIntExact(col.getMax());

                if (col.getOutlineLevel() <= 0) {
                    int colIndex = columnHelper.getIndexOfColumn(cols, col);
                    worksheet.getColsArray(0).removeCol(colIndex);
                }
            }
        }
        worksheet.setColsArray(0, cols);
        if (maxLevelCol >= getSheetFormatPrOutlineLevelCol()) {
            setSheetFormatPrOutlineLevelCol();
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
        int maxOutlineLevel = -1;
        for (int i = fromRow; i <= toRow; i++) {
            XSSFRow xrow = getRow(i);
            if (xrow != null) {
                CTRow ctRow = xrow.getCTRow();
                final short outlineLevel = ctRow.getOutlineLevel();
                ctRow.setOutlineLevel((short) (outlineLevel - 1));
                maxOutlineLevel = Math.max(maxOutlineLevel, outlineLevel);
                //remove a row only if the row has no cell and if the outline level is 0
                if (outlineLevel == 1 && xrow.getFirstCellNum() == -1) {
                    removeRow(xrow);
                }
            }
        }
        if (maxOutlineLevel >= getSheetFormatPrOutlineLevelRow()) {
            setSheetFormatPrOutlineLevelRow();
        }
    }

    private void increaseSheetFormatPrOutlineLevelRowIfNecessary(final short levelRow) {
        if (levelRow > getSheetFormatPrOutlineLevelRow()) {
            getSheetTypeSheetFormatPr(true).setOutlineLevelRow(levelRow);
        }
    }

    private void increaseSheetFormatPrOutlineLevelColIfNecessary(final short levelCol) {
        if (levelCol > getSheetFormatPrOutlineLevelCol()) {
            getSheetTypeSheetFormatPr(true).setOutlineLevelCol(levelCol);
        }
    }

    private void setSheetFormatPrOutlineLevelRow() {
        final short maxLevelRow = getMaxOutlineLevelRows();
        getSheetTypeSheetFormatPr(true).setOutlineLevelRow(maxLevelRow);
    }

    @Internal // used by SXSSFSHeet
    public short getSheetFormatPrOutlineLevelRow() {
        final CTSheetFormatPr pr = getSheetTypeSheetFormatPr(false);
        return pr == null ? 0 : pr.getOutlineLevelRow();
    }

    @Internal // used by SXSSFSHeet
    public short getSheetFormatPrOutlineLevelCol() {
        final CTSheetFormatPr pr = getSheetTypeSheetFormatPr(false);
        return pr == null ? 0 : pr.getOutlineLevelCol();
    }

    private void setSheetFormatPrOutlineLevelCol() {
        final short maxLevelCol = getMaxOutlineLevelCols();
        getSheetTypeSheetFormatPr(true).setOutlineLevelCol(maxLevelCol);
    }

    protected CTSheetViews getSheetTypeSheetViews(final boolean create) {
        final CTSheetViews views = (worksheet.isSetSheetViews() || !create)
                ? worksheet.getSheetViews() : worksheet.addNewSheetViews();
        assert(views != null || !create);
        if (views == null) {
            return null;
        }
        if (views.sizeOfSheetViewArray() == 0 && create) {
            views.addNewSheetView();
        }
        return views;
    }

    /**
     * Returns a flag indicating whether this sheet is selected.
     * <p>
     * When only 1 sheet is selected and active, this value should be in synch with the activeTab value.
     * In case of a conflict, the Start Part setting wins and sets the active sheet tab.
     * </p>
     * Note: multiple sheets can be selected, but only one sheet can be active at one time.
     *
     * @return {@code true} if this sheet is selected
     */
    @Override
    public boolean isSelected() {
        final CTSheetView dsv = getDefaultSheetView(false);
        return dsv != null && dsv.getTabSelected();
    }

    /**
     * Sets a flag indicating whether this sheet is selected.
     *
     * <p>
     * When only 1 sheet is selected and active, this value should be in synch with the activeTab value.
     * In case of a conflict, the Start Part setting wins and sets the active sheet tab.
     * </p>
     * Note: multiple sheets can be selected, but only one sheet can be active at one time.
     *
     * @param value {@code true} if this sheet is selected
     */
    @Override
    public void setSelected(boolean value) {
        final CTSheetViews views = getSheetTypeSheetViews(true);
        assert(views != null);
        for (CTSheetView view : views.getSheetViewArray()) {
            view.setTabSelected(value);
        }
    }

    /**
     * Register a hyperlink in the collection of hyperlinks on this sheet.
     * Use {@link XSSFCell#setHyperlink(Hyperlink)} if the hyperlink is just for that one cell.
     * Use this method if you want to add a Hyperlink that covers a range of sells. If you use
     * this method, you will need to call {@link XSSFHyperlink#setCellReference(String)} to
     * explicitly cell the value, eg B2 or B2:C3 (the 4 cells with B2 at top left and C3 at bottom right)
     *
     * @param hyperlink the link to add
     */
    public void addHyperlink(XSSFHyperlink hyperlink) {
        hyperlinks.add(hyperlink);
    }

    /**
     * Remove a hyperlink in the collection of hyperlinks on this sheet.
     * {@link XSSFCell#removeHyperlink()} can be used if the hyperlink is just for that one cell.
     *
     * @param hyperlink the link to remove
     * @since POI 5.1.0
     */
    public void removeHyperlink(XSSFHyperlink hyperlink) {
        hyperlinks.remove(hyperlink);
    }

    /**
     * Removes a hyperlink in the collection of hyperlinks on this sheet
     *
     * @param row row index
     * @param column column index
     */
    @Internal
    public void removeHyperlink(int row, int column) {
        // CTHyperlinks is regenerated from scratch when writing out the spreadsheet
        // so don't worry about maintaining hyperlinks and CTHyperlinks in parallel.
        // only maintain hyperlinks
        XSSFHyperlink hyperlink = getHyperlink(row, column);
        if (hyperlink != null) {
            if (hyperlink.getFirstRow() == row && hyperlink.getLastRow() == row
                && hyperlink.getFirstColumn() == column && hyperlink.getLastColumn() == column) {
                removeHyperlink(hyperlink);
            } else {
                //we have a cellRef that spans multiple cells - we just want to remove the hyperlink from one cell
                //we delete this hyperlink but add new hyperlinks to cover the other cells that were served
                //by the old hyperlink
                boolean leftCreated = false;
                boolean rightCreated = false;
                if (hyperlink.getFirstColumn() < column) {
                    XSSFHyperlink newLink = new XSSFHyperlink(hyperlink);
                    newLink.setFirstColumn(hyperlink.getFirstColumn());
                    newLink.setLastColumn(column - 1);
                    newLink.setFirstRow(hyperlink.getFirstRow());
                    newLink.setLastRow(hyperlink.getLastRow());
                    addHyperlink(newLink);
                    leftCreated = true;
                }
                if (hyperlink.getLastColumn() > column) {
                    XSSFHyperlink newLink = new XSSFHyperlink(hyperlink);
                    newLink.setFirstColumn(column + 1);
                    newLink.setLastColumn(hyperlink.getLastColumn());
                    newLink.setFirstRow(hyperlink.getFirstRow());
                    newLink.setLastRow(hyperlink.getLastRow());
                    addHyperlink(newLink);
                    rightCreated = true;
                }
                if (hyperlink.getFirstRow() < row) {
                    XSSFHyperlink newLink = new XSSFHyperlink(hyperlink);
                    int firstColumn = leftCreated ? row : hyperlink.getFirstColumn();
                    int lastColumn = rightCreated ? row : hyperlink.getLastColumn();
                    newLink.setFirstColumn(firstColumn);
                    newLink.setLastColumn(lastColumn);
                    newLink.setFirstRow(hyperlink.getFirstRow());
                    newLink.setLastRow(row - 1);
                    addHyperlink(newLink);
                }
                if (hyperlink.getLastRow() > row) {
                    XSSFHyperlink newLink = new XSSFHyperlink(hyperlink);
                    int firstColumn = leftCreated ? row : hyperlink.getFirstColumn();
                    int lastColumn = rightCreated ? row : hyperlink.getLastColumn();
                    newLink.setFirstColumn(firstColumn);
                    newLink.setLastColumn(lastColumn);
                    newLink.setFirstRow(row + 1);
                    newLink.setLastRow(hyperlink.getLastRow());
                    addHyperlink(newLink);
                }
                removeHyperlink(hyperlink);
            }
        }
    }

    /**
     * Return location of the active cell, e.g. {@code A1}.
     *
     * @return the location of the active cell.
     */
    @Override
    public CellAddress getActiveCell() {
        final CTSelection sts = getSheetTypeSelection(false);
        final String address = (sts != null) ? sts.getActiveCell() : null;
        return (address != null) ? new CellAddress(address) : null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setActiveCell(CellAddress address) {
        final CTSelection ctsel = getSheetTypeSelection(true);
        assert(ctsel != null);
        String ref = address.formatAsString();
        ctsel.setActiveCell(ref);
        ctsel.setSqref(Collections.singletonList(ref));
    }

    /**
     * Does this sheet have any comments on it? We need to know,
     *  so we can decide about writing it to disk or not
     */
    public boolean hasComments() {
        return sheetComments != null && sheetComments.getNumberOfComments() > 0;
    }

    protected int getNumberOfComments() {
        return sheetComments == null ? 0 : sheetComments.getNumberOfComments();
    }

    private CTSelection getSheetTypeSelection(final boolean create) {
        final CTSheetView dsv = getDefaultSheetView(create);
        assert(dsv != null || !create);
        if (dsv == null) {
            return null;
        }
        final int sz = dsv.sizeOfSelectionArray();
        if (sz == 0) {
            return create ? dsv.addNewSelection() : null;
        }
        return dsv.getSelectionArray(sz - 1);
    }

    /**
     * Return the default sheet view. This is the last one if the sheet's views, according to sec. 3.3.1.83
     * of the OOXML spec: "A single sheet view definition. When more than 1 sheet view is defined in the file,
     * it means that when opening the workbook, each sheet view corresponds to a separate window within the
     * spreadsheet application, where each window is showing the particular sheet. containing the same
     * workbookViewId value, the last sheetView definition is loaded, and the others are discarded.
     * When multiple windows are viewing the same sheet, multiple sheetView elements (with corresponding
     * workbookView entries) are saved."
     */
    private CTSheetView getDefaultSheetView(final boolean create) {
        final CTSheetViews views = getSheetTypeSheetViews(create);
        assert(views != null || !create);
        if (views == null) {
            return null;
        }
        final int sz = views.sizeOfSheetViewArray();
        assert(sz > 0 || !create);
        return (sz == 0) ? null : views.getSheetViewArray(sz - 1);
    }

    /**
     * Return a master shared formula by index
     *
     * @param sid shared group index
     * @return a CTCellFormula bean holding shared formula or {@code null} if not found
     */
    @Internal
    public CTCellFormula getSharedFormula(int sid){
        return sharedFormulas.get(sid);
    }

    void onReadCell(XSSFCell cell){
        //collect cells holding shared formulas
        CTCell ct = cell.getCTCell();
        CTCellFormula f = ct.getF();
        if (f != null && f.getT() == STCellFormulaType.SHARED && f.isSetRef() && f.getStringValue() != null) {
            // save a detached  copy to avoid XmlValueDisconnectedException,
            // this may happen when the master cell of a shared formula is changed
            CTCellFormula sf = (CTCellFormula)f.copy();
            CellRangeAddress sfRef = CellRangeAddress.valueOf(sf.getRef());
            CellReference cellRef = new CellReference(cell);
            // If the shared formula range precedes the master cell then the preceding  part is discarded, e.g.
            // if the cell is E60 and the shared formula range is C60:M85 then the effective range is E60:M85
            // see more details in https://issues.apache.org/bugzilla/show_bug.cgi?id=51710
            if(cellRef.getCol() > sfRef.getFirstColumn() || cellRef.getRow() > sfRef.getFirstRow()){
                String effectiveRef = new CellRangeAddress(
                        Math.max(cellRef.getRow(), sfRef.getFirstRow()), Math.max(cellRef.getRow(), sfRef.getLastRow()),
                        Math.max(cellRef.getCol(), sfRef.getFirstColumn()), Math.max(cellRef.getCol(), sfRef.getLastColumn()))
                        .formatAsString();
                sf.setRef(effectiveRef);
            }

            sharedFormulas.put(Math.toIntExact(f.getSi()), sf);
        }
        if (f != null && f.getT() == STCellFormulaType.ARRAY && f.getRef() != null) {
            arrayFormulas.add(CellRangeAddress.valueOf(f.getRef()));
        }
    }

    @Override
    protected void commit() throws IOException {
        PackagePart part = getPackagePart();
        try (OutputStream out = part.getOutputStream()) {
            write(out);
        }
    }

    protected void write(OutputStream out) throws IOException {
        if (worksheet == null) {
            throw new POIXMLException("Cannot write invalid sheet, internal data is missing");
        }

        boolean setToNull = false;
        if(worksheet.sizeOfColsArray() == 1) {
            CTCols col = worksheet.getColsArray(0);
            if(col.sizeOfColArray() == 0) {
                setToNull = true;
                // this is necessary so that we do not write an empty <cols/> item into the sheet-xml in the xlsx-file
                // Excel complains about a corrupted file if this shows up there!
                worksheet.setColsArray(null);
            } else {
                setColWidthAttribute(col);
            }
        }

        // Now re-generate our CTHyperlinks, if needed
        if (!hyperlinks.isEmpty()) {
            if(worksheet.getHyperlinks() == null) {
                worksheet.addNewHyperlinks();
            }
            CTHyperlink[] ctHls = new CTHyperlink[hyperlinks.size()];
            for(int i=0; i<ctHls.length; i++) {
                // If our sheet has hyperlinks, have them add
                //  any relationships that they might need
                XSSFHyperlink hyperlink = hyperlinks.get(i);
                hyperlink.generateRelationIfNeeded(getPackagePart());
                // Now grab their underling object
                ctHls[i] = hyperlink.getCTHyperlink();
            }
            worksheet.getHyperlinks().setHyperlinkArray(ctHls);
        }
        else {
            if (worksheet.getHyperlinks() != null) {
                final int count = worksheet.getHyperlinks().sizeOfHyperlinkArray();
                for (int i=count-1; i>=0; i--) {
                    worksheet.getHyperlinks().removeHyperlink(i);
                }
                // For some reason, we have to remove the hyperlinks one by one from the CTHyperlinks array
                // before unsetting the hyperlink array.
                // Resetting the hyperlink array seems to break some XML nodes.
                //worksheet.getHyperlinks().setHyperlinkArray(new CTHyperlink[0]);
                worksheet.unsetHyperlinks();
            } /*else {
                // nothing to do
            }*/
        }

        CellRangeAddress cellRangeAddress = dimensionOverride;
        if (cellRangeAddress == null) {
            int minCell = Integer.MAX_VALUE, maxCell = Integer.MIN_VALUE;
            for(Map.Entry<Integer, XSSFRow> entry : _rows.entrySet()) {
                XSSFRow row = entry.getValue();

                // first perform the normal write actions for the row
                row.onDocumentWrite();

                // then calculate min/max cell-numbers for the worksheet-dimension
                if(row.getFirstCellNum() != -1) {
                    minCell = Math.min(minCell, row.getFirstCellNum());
                }
                if(row.getLastCellNum() != -1) {
                    maxCell = Math.max(maxCell, row.getLastCellNum()-1);
                }
            }

            // finally, if we had at least one cell we can populate the optional dimension-field
            if(minCell != Integer.MAX_VALUE) {
                cellRangeAddress = new CellRangeAddress(getFirstRowNum(), getLastRowNum(), minCell, maxCell);
            }
        }
        if (cellRangeAddress != null) {
            if (worksheet.isSetDimension()) {
                worksheet.getDimension().setRef(cellRangeAddress.formatAsString());
            } else {
                worksheet.addNewDimension().setRef(cellRangeAddress.formatAsString());
            }
        }

        XmlOptions xmlOptions = new XmlOptions(DEFAULT_XML_OPTIONS);
        xmlOptions.setSaveSyntheticDocumentElement(new QName(CTWorksheet.type.getName().getNamespaceURI(), "worksheet"));

        worksheet.save(out, xmlOptions);

        // Bug 52233: Ensure that we have a col-array even if write() removed it
        if(setToNull) {
            worksheet.addNewCols();
        }
    }

    /**
     * @return true when Sheet is Protected.
     */
    public boolean isSheetLocked() {
        return worksheet.isSetSheetProtection() && safeGetProtectionField().getSheet();
    }

    /**
     * Reads the dimensions of the sheet data
     * @return dimensions of the sheet data as a Cell Range (can be null)
     * @since POI 5.2.3
     */
    public CellRangeAddress getDimension() {
        if (dimensionOverride != null) {
            return dimensionOverride;
        }
        CTSheetDimension ctSheetDimension = worksheet.getDimension();
        String ref = ctSheetDimension == null ? null : ctSheetDimension.getRef();
        if (ref != null) {
            return CellRangeAddress.valueOf(ref);
        }
        return null;
    }

    private CTSheetProtection safeGetProtectionField() {
        if (!isSheetProtectionEnabled()) {
            return worksheet.addNewSheetProtection();
        }
        return worksheet.getSheetProtection();
    }

    /* package */ boolean isSheetProtectionEnabled() {
        return (worksheet.isSetSheetProtection());
    }

    /* package */ boolean isCellInArrayFormulaContext(XSSFCell cell) {
        final int rowIndex = cell.getRowIndex();
        final int columnIndex = cell.getColumnIndex();
        for (CellRangeAddress range : arrayFormulas) {
            if (range.isInRange(rowIndex, columnIndex)) {
                return true;
            }
        }
        return false;
    }

    /* package */ XSSFCell getFirstCellInArrayFormula(XSSFCell cell) {
        final int rowIndex = cell.getRowIndex();
        final int columnIndex = cell.getColumnIndex();
        for (CellRangeAddress range : arrayFormulas) {
            if (range.isInRange(rowIndex, columnIndex)) {
                return getRow(range.getFirstRow()).getCell(range.getFirstColumn());
            }
        }
        return null;
    }

    /**
     * Also creates cells if they don't exist
     */
    private CellRange<XSSFCell> getCellRange(CellRangeAddress range) {
        int firstRow = range.getFirstRow();
        int firstColumn = range.getFirstColumn();
        int lastRow = range.getLastRow();
        int lastColumn = range.getLastColumn();
        int height = lastRow - firstRow + 1;
        int width = lastColumn - firstColumn + 1;
        List<XSSFCell> temp = new ArrayList<>(height * width);
        for (int rowIn = firstRow; rowIn <= lastRow; rowIn++) {
            for (int colIn = firstColumn; colIn <= lastColumn; colIn++) {
                XSSFRow row = getRow(rowIn);
                if (row == null) {
                    row = createRow(rowIn);
                }
                XSSFCell cell = row.getCell(colIn);
                if (cell == null) {
                    cell = row.createCell(colIn);
                }
                temp.add(cell);
            }
        }
        return SSCellRange.create(firstRow, firstColumn, height, width, temp, XSSFCell.class);
    }

    @Override
    public CellRange<XSSFCell> setArrayFormula(String formula, CellRangeAddress range) {
        CellRange<XSSFCell> cr = getCellRange(range);

        XSSFCell mainArrayFormulaCell = cr.getTopLeftCell();
        mainArrayFormulaCell.setCellArrayFormula(formula, range);
        arrayFormulas.add(range);
        return cr;
    }

    @Override
    public CellRange<XSSFCell> removeArrayFormula(Cell cell) {
        if (cell.getSheet() != this) {
            throw new IllegalArgumentException("Specified cell does not belong to this sheet.");
        }
        for (CellRangeAddress range : arrayFormulas) {
            if (range.isInRange(cell)) {
                arrayFormulas.remove(range);
                CellRange<XSSFCell> cr = getCellRange(range);
                for (XSSFCell c : cr) {
                    c.setBlank();
                }
                return cr;
            }
        }
        String ref = new CellReference(cell).formatAsString();
        throw new IllegalArgumentException("Cell " + ref + " is not part of an array formula.");
    }


    @Override
    public DataValidationHelper getDataValidationHelper() {
        return dataValidationHelper;
    }

    /**
     * Returns any tables associated with this Sheet
     */
    public List<XSSFTable> getTables() {
        return new ArrayList<>(tables.values());
    }

    /**
     * Remove table references and relations
     * @param t table to remove
     */
    public void removeTable(XSSFTable t) {
        String rId = getRelationId(t);
        long id = t.getCTTable().getId();
        Map.Entry<String, XSSFTable> toDelete = null;

        for (Map.Entry<String, XSSFTable> entry : tables.entrySet()) {
            if (entry.getValue().getCTTable().getId() == id) toDelete = entry;
        }
        if (toDelete != null) {
            removeRelation(getRelationById(toDelete.getKey()), true);
            tables.remove(toDelete.getKey());
            toDelete.getValue().onTableDelete();
            CTTableParts tblParts = worksheet.getTableParts();
            int matchedPos = -1;
            if (rId != null) {
                for (int i = 0; i < tblParts.sizeOfTablePartArray(); i++) {
                    if (rId.equals(tblParts.getTablePartArray(i).getId())) {
                        matchedPos = i;
                        break;
                    }
                }
            }
            if (matchedPos != -1) {
                tblParts.removeTablePart(matchedPos);
            }
        }
    }

    @Override
    public XSSFSheetConditionalFormatting getSheetConditionalFormatting(){
        return new XSSFSheetConditionalFormatting(this);
    }

    /**
     * Get background color of the sheet tab.
     * Returns {@code null} if no sheet tab color is set.
     *
     * @return the background color of the sheet tab
     */
    public XSSFColor getTabColor() {
        CTSheetPr pr = worksheet.getSheetPr();
        if(pr == null) {
            pr = worksheet.addNewSheetPr();
        }
        if (!pr.isSetTabColor()) {
            return null;
        }
        return XSSFColor.from(pr.getTabColor(), getWorkbook().getStylesSource().getIndexedColors());
    }

    /**
     * Set background color of the sheet tab
     *
     * @param color the color to set
     */
    public void setTabColor(XSSFColor color) {
        CTSheetPr pr = worksheet.getSheetPr();
        if(pr == null) {
            pr = worksheet.addNewSheetPr();
        }
        pr.setTabColor(color.getCTColor());
    }

    @Override
    public CellRangeAddress getRepeatingRows() {
        return getRepeatingRowsOrColumns(true);
    }


    @Override
    public CellRangeAddress getRepeatingColumns() {
        return getRepeatingRowsOrColumns(false);
    }
    private static String getReferenceBuiltInRecord(
            String sheetName, int startC, int endC, int startR, int endR) {
        // Excel example for built-in title:
        //   'second sheet'!$E:$F,'second sheet'!$2:$3

        CellReference colRef =
                new CellReference(sheetName, 0, startC, true, true);
        CellReference colRef2 =
                new CellReference(sheetName, 0, endC, true, true);
        CellReference rowRef =
                new CellReference(sheetName, startR, 0, true, true);
        CellReference rowRef2 =
                new CellReference(sheetName, endR, 0, true, true);

        String escapedName = SheetNameFormatter.format(sheetName);

        String c = "";
        String r = "";

        if (startC != -1 || endC != -1) {
            String col1 = colRef.getCellRefParts()[2];
            String col2 = colRef2.getCellRefParts()[2];
            c = escapedName + "!$" + col1 + ":$" + col2;
        }

        if (startR != -1 || endR != -1) {
            String row1 = rowRef.getCellRefParts()[1];
            String row2 = rowRef2.getCellRefParts()[1];
            if (!row1.equals("0") && !row2.equals("0")) {
                r = escapedName + "!$" + row1 + ":$" + row2;
            }
        }

        StringBuilder rng = new StringBuilder();
        rng.append(c);
        if(rng.length() > 0 && r.length() > 0) {
            rng.append(',');
        }
        rng.append(r);
        return rng.toString();
    }


    private CellRangeAddress getRepeatingRowsOrColumns(boolean rows) {
        int sheetIndex = getWorkbook().getSheetIndex(this);
        XSSFName name = getWorkbook().getBuiltInName(
                XSSFName.BUILTIN_PRINT_TITLE, sheetIndex);
        if (name == null ) {
            return null;
        }
        String refStr = name.getRefersToFormula();
        if (refStr == null) {
            return null;
        }
        String[] parts = refStr.split(",");
        int maxRowIndex = SpreadsheetVersion.EXCEL2007.getLastRowIndex();
        int maxColIndex = SpreadsheetVersion.EXCEL2007.getLastColumnIndex();
        for (String part : parts) {
            CellRangeAddress range = CellRangeAddress.valueOf(part);
            if ((range.getFirstColumn() == 0
                    && range.getLastColumn() == maxColIndex)
                    || (range.getFirstColumn() == -1
                    && range.getLastColumn() == -1)) {
                if (rows) {
                    return range;
                }
            } else if (range.getFirstRow() == 0
                    && range.getLastRow() == maxRowIndex
                    || (range.getFirstRow() == -1
                    && range.getLastRow() == -1)) {
                if (!rows) {
                    return range;
                }
            }
        }
        return null;
    }

    @Override
    public int getColumnOutlineLevel(int columnIndex) {
        CTCol col = columnHelper.getColumn(columnIndex, false);
        if (col == null) {
            return 0;
        }
        return col.getOutlineLevel();
    }

    /**
     * called when a sheet is being deleted/removed from a workbook, to clean up relations and other document pieces tied to the sheet
     */
    protected void onSheetDelete() {
        for (RelationPart part : getRelationParts()) {
            if (part.getDocumentPart() instanceof XSSFTable) {
                // call table delete
                removeTable(part.getDocumentPart());
                continue;
            }
            removeRelation(part.getDocumentPart(), true);
        }
    }

    /**
     *  when a cell with a 'master' shared formula is removed,  the next cell in the range becomes the master
     * @param cell The cell that is removed
     * @param evalWb BaseXSSFEvaluationWorkbook in use, if one exists
     */
    protected void onDeleteFormula(final XSSFCell cell, final BaseXSSFEvaluationWorkbook evalWb) {
        final int rowIndex = cell.getRowIndex();
        final int columnIndex = cell.getColumnIndex();
        CTCellFormula f = cell.getCTCell().getF();
        if (f != null && f.getT() == STCellFormulaType.SHARED && f.isSetRef() && f.getStringValue() != null) {

            CellRangeAddress ref = CellRangeAddress.valueOf(f.getRef());
            if(ref.getNumberOfCells() > 1){
                DONE:
                for(int i = rowIndex; i <= ref.getLastRow(); i++){
                    XSSFRow row = getRow(i);
                    if(row != null) {
                        for(int j = columnIndex; j <= ref.getLastColumn(); j++){
                            XSSFCell nextCell = row.getCell(j);
                            if(nextCell != null && nextCell != cell && nextCell.getCellType() == CellType.FORMULA) {
                                CTCellFormula nextF = nextCell.getCTCell().getF();
                                if (nextF.getT() == STCellFormulaType.SHARED && nextF.getSi() == f.getSi()) {
                                    nextF.setStringValue(nextCell.getCellFormula(evalWb));
                                    CellRangeAddress nextRef = new CellRangeAddress(
                                            nextCell.getRowIndex(), ref.getLastRow(),
                                            nextCell.getColumnIndex(), ref.getLastColumn());
                                    nextF.setRef(nextRef.formatAsString());

                                    sharedFormulas.put(Math.toIntExact(nextF.getSi()), nextF);
                                    break DONE;
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    /**
     * Currently, this is for internal use. Overrides the default dimensions of the sheet.
     * @param dimension {@link CellRangeAddress}, <code>null</code> removes the existing override
     * @since POI 5.2.3
     */
    @Beta
    public void setDimensionOverride(CellRangeAddress dimension) {
        this.dimensionOverride = dimension;
    }

    private static String getSubtotalFormulaStartFromTotalsRowFunction(int intTotalsRowFunction) {
        final int INT_NONE = 1;
        final int INT_SUM = 2;
        final int INT_MIN = 3;
        final int INT_MAX = 4;
        final int INT_AVERAGE = 5;
        final int INT_COUNT = 6;
        final int INT_COUNT_NUMS = 7;
        final int INT_STD_DEV = 8;
        final int INT_VAR = 9;
        final int INT_CUSTOM = 10;
        String subtotalFormulaStart = null;
        switch (intTotalsRowFunction) {
            case INT_NONE:
                subtotalFormulaStart = null;
                break;
            case INT_SUM:
                subtotalFormulaStart = "SUBTOTAL(109";
                break;
            case INT_MIN:
                subtotalFormulaStart = "SUBTOTAL(105";
                break;
            case INT_MAX:
                subtotalFormulaStart = "SUBTOTAL(104";
                break;
            case INT_AVERAGE:
                subtotalFormulaStart = "SUBTOTAL(101";
                break;
            case INT_COUNT:
                subtotalFormulaStart = "SUBTOTAL(103";
                break;
            case INT_COUNT_NUMS:
                subtotalFormulaStart = "SUBTOTAL(102";
                break;
            case INT_STD_DEV:
                subtotalFormulaStart = "SUBTOTAL(107";
                break;
            case INT_VAR:
                subtotalFormulaStart = "SUBTOTAL(110";
                break;
            case INT_CUSTOM:
                subtotalFormulaStart = null;
                break;
            default:
                subtotalFormulaStart = null;
        }
        return subtotalFormulaStart;
    }
}
