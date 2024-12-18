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

package org.apache.poi.hssf.record;

import java.util.Map;
import java.util.function.Supplier;

import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.GenericRecordUtil;
import org.apache.poi.util.LittleEndianOutput;

/**
 * Defines with width and formatting for a range of columns
 */
public final class ColumnInfoRecord extends StandardRecord {
    public static final short sid = 0x007D;

    private static final BitField hidden    = BitFieldFactory.getInstance(0x01);
    private static final BitField outlevel  = BitFieldFactory.getInstance(0x0700);
    private static final BitField collapsed = BitFieldFactory.getInstance(0x1000);

    private int _firstCol;
    private int _lastCol;
    private int _colWidth;
    private int _xfIndex;
    private int _options;
    // Excel seems write values 2, 10, and 260, even though spec says "must be zero"
    private int field_6_reserved;

    /**
     * Creates a column info record with default width and format
     */
    public ColumnInfoRecord() {
        setColumnWidth(2275);
        _options = 2;
        _xfIndex = 0x0f;
        field_6_reserved = 2; // seems to be the most common value
    }

    public ColumnInfoRecord(ColumnInfoRecord other) {
        super(other);
        _firstCol = other._firstCol;
        _lastCol = other._lastCol;
        _colWidth = other._colWidth;
        _xfIndex = other._xfIndex;
        _options = other._options;
        field_6_reserved = other.field_6_reserved;
    }

    public ColumnInfoRecord(RecordInputStream in) {
        _firstCol = in.readUShort();
        _lastCol  = in.readUShort();
        _colWidth = in.readUShort();
        _xfIndex  = in.readUShort();
        _options   = in.readUShort();
        switch(in.remaining()) {
            case 2: // usual case
                field_6_reserved  = in.readUShort();
                break;
            case 1:
                // often COLINFO gets encoded 1 byte short
                // shouldn't matter because this field is unused
                field_6_reserved  = in.readByte();
                break;
            case 0:
                // According to bugzilla 48332,
                // "SoftArtisans OfficeWriter for Excel" totally skips field 6
                // Excel seems to be OK with this, and assumes zero.
                field_6_reserved  = 0;
                break;
            default:
                throw new IllegalArgumentException("Unusual record size remaining=(" + in.remaining() + ")");
        }
    }

    /**
     * set the first column this record defines formatting info for
     * @param fc - the first column index (0-based)
     */
    public void setFirstColumn(int fc) {
        _firstCol = fc;
    }

    /**
     * set the last column this record defines formatting info for
     * @param lc - the last column index (0-based)
     */
    public void setLastColumn(int lc) {
        _lastCol = lc;
    }

    /**
     * set the columns' width in 1/256 of a character width
     * @param cw - column width
     */
    public void setColumnWidth(int cw) {
        _colWidth = cw;
    }

    /**
     * set the columns' default format info
     * @param xfi - the extended format index
     * @see ExtendedFormatRecord
     */
    public void setXFIndex(int xfi) {
        _xfIndex = xfi;
    }

    /**
     * set whether or not these cells are hidden
     * @param ishidden - whether the cells are hidden.
     */
    public void setHidden(boolean ishidden) {
        _options = hidden.setBoolean(_options, ishidden);
    }

    /**
     * set the outline level for the cells
     * @param olevel -outline level for the cells
     */
    public void setOutlineLevel(int olevel) {
        _options = outlevel.setValue(_options, olevel);
    }

    /**
     * set whether the cells are collapsed
     * @param isCollapsed - whether the cells are collapsed
     */
    public void setCollapsed(boolean isCollapsed) {
        _options = collapsed.setBoolean(_options, isCollapsed);
    }

    /**
     * get the first column this record defines formatting info for
     * @return the first column index (0-based)
     */
    public int getFirstColumn() {
        return _firstCol;
    }

    /**
     * get the last column this record defines formatting info for
     * @return the last column index (0-based)
     */
    public int getLastColumn() {
        return _lastCol;
    }

    /**
     * @return column width in units of 1/256 of a character width
     */
    public int getColumnWidth() {
        return _colWidth;
    }

    /**
     * get the columns' default format info
     * @return the extended format index
     * @see ExtendedFormatRecord
     */
    public int getXFIndex() {
        return _xfIndex;
    }

    /**
     * @return whether the cells are hidden.
     */
    public boolean getHidden() {
        return hidden.isSet(_options);
    }

    /**
     * @return outline level for the cells
     */
    public int getOutlineLevel() {
        return outlevel.getValue(_options);
    }

    /**
     * @return whether the cells are collapsed
     */
    public boolean getCollapsed() {
        return collapsed.isSet(_options);
    }

    public boolean containsColumn(int columnIndex) {
        return _firstCol <= columnIndex && columnIndex <= _lastCol;
    }
    public boolean isAdjacentBefore(ColumnInfoRecord other) {
        return _lastCol == other._firstCol - 1;
    }

    /**
     * @param other the format to match with
     *
     * @return {@code true} if the format, options and column width match
     */
    public boolean formatMatches(ColumnInfoRecord other) {
        if (_xfIndex != other._xfIndex) {
            return false;
        }
        if (_options != other._options) {
            return false;
        }
        return _colWidth == other._colWidth;
    }

    public short getSid() {
        return sid;
    }

    public void serialize(LittleEndianOutput out) {
        out.writeShort(getFirstColumn());
        out.writeShort(getLastColumn());
        out.writeShort(getColumnWidth());
        out.writeShort(getXFIndex());
        out.writeShort(_options);
        out.writeShort(field_6_reserved);
    }

    protected int getDataSize() {
        return 12;
    }

    @Override
    public ColumnInfoRecord copy() {
        return new ColumnInfoRecord(this);
    }

    @Override
    public HSSFRecordTypes getGenericRecordType() {
        return HSSFRecordTypes.COLUMN_INFO;
    }

    @Override
    public Map<String, Supplier<?>> getGenericProperties() {
        return GenericRecordUtil.getGenericProperties(
            "firstColumn", this::getFirstColumn,
            "lastColumn", this::getLastColumn,
            "columnWidth", this::getColumnWidth,
            "xfIndex", this::getXFIndex,
            "options", () -> _options,
            "hidden", this::getHidden,
            "outlineLevel", this::getOutlineLevel,
            "collapsed", this::getCollapsed
        );
    }
}
