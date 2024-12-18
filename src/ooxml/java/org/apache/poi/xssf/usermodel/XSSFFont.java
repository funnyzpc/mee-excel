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

import java.util.Objects;

import org.apache.poi.common.usermodel.fonts.FontCharset;
import org.apache.poi.ooxml.POIXMLException;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.FontFamily;
import org.apache.poi.ss.usermodel.FontScheme;
import org.apache.poi.ss.usermodel.FontUnderline;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.model.ThemesTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontFamily;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontScheme;

/**
 * Represents a font used in a workbook.
 */
public class XSSFFont implements Font {

    /**
     * By default, Microsoft Office Excel 2007 uses the Calibri font in font size 11
     */
    public static final String DEFAULT_FONT_NAME = "Calibri";
    /**
     * By default, Microsoft Office Excel 2007 uses the Calibri font in font size 11
     */
    public static final short DEFAULT_FONT_SIZE = 11;
    /**
     * Default font color is black
     * @see org.apache.poi.ss.usermodel.IndexedColors#BLACK
     */
    public static final short DEFAULT_FONT_COLOR = IndexedColors.BLACK.getIndex();

    private IndexedColorMap _indexedColorMap;
    private ThemesTable _themes;
    private final CTFont _ctFont;
    private int _index;

    /**
     * Create a new XSSFFont
     *
     * @param font the underlying CTFont bean
     */
    @Internal
    public XSSFFont(CTFont font) {
        _ctFont = font;
        _index = 0;
    }

    /**
     * Called from parsing styles.xml
     * @param font CTFont
     * @param index font index
     * @param colorMap for default or custom indexed colors
     */
    @Internal
    public XSSFFont(CTFont font, int index, IndexedColorMap colorMap) {
        _ctFont = font;
        _index = (short)index;
        _indexedColorMap = colorMap;
    }

    /**
     * Create a new XSSFont. This method is protected to be used only by XSSFWorkbook
     */
    public XSSFFont() {
        this._ctFont = CTFont.Factory.newInstance();
        setFontName(DEFAULT_FONT_NAME);
        setFontHeight((double)DEFAULT_FONT_SIZE);
    }

    /**
     * get the underlying CTFont font
     */
    @Internal
    public CTFont getCTFont() {
        return _ctFont;
    }

    /**
     * get a boolean value for the boldness to use.
     *
     * @return boolean - bold
     */
    @Override
    public boolean getBold() {
        CTBooleanProperty bold = _ctFont.sizeOfBArray() == 0 ? null : _ctFont.getBArray(0);
        return (bold != null && bold.getVal());
    }

    /**
     * get character-set to use.
     *
     * @return int - character-set (0-255)
     * @see FontCharset
     */
    @Override
    public int getCharSet() {
        CTIntProperty charset = _ctFont.sizeOfCharsetArray() == 0 ? null : _ctFont.getCharsetArray(0);
        return charset == null ? FontCharset.ANSI.getNativeId() : FontCharset.valueOf(charset.getVal()).getNativeId();
    }
    /**
     * get type of text underlining to use
     *
     * @return byte - underlining type
     * @see org.apache.poi.ss.usermodel.FontUnderline
     */
    @Override
    public byte getUnderline() {
        CTUnderlineProperty underline = _ctFont.sizeOfUArray() == 0 ? null : _ctFont.getUArray(0);
        if (underline != null) {
            FontUnderline val = FontUnderline.valueOf(underline.getVal().intValue());
            return val.getByteValue();
        }
        return Font.U_NONE;
    }
    /**
     * get the indexed color value for the font
     * References a color defined in IndexedColors.
     *
     * @return short - indexed color to use
     * @see IndexedColors
     */
    @Override
    public short getColor() {
        CTColor color = _ctFont.sizeOfColorArray() == 0 ? null : _ctFont.getColorArray(0);
        if (color == null) return IndexedColors.BLACK.getIndex();

        long index = color.getIndexed();
        if (index == XSSFFont.DEFAULT_FONT_COLOR) {
            return IndexedColors.BLACK.getIndex();
        } else if (index == IndexedColors.RED.getIndex()) {
            return IndexedColors.RED.getIndex();
        } else {
            return (short)index;
        }
    }


    /**
     * get the color value for the font
     * References a color defined as  Standard Alpha Red Green Blue color value (ARGB).
     *
     * @return XSSFColor - rgb color to use
     */
    public XSSFColor getXSSFColor() {
        CTColor ctColor = _ctFont.sizeOfColorArray() == 0 ? null : _ctFont.getColorArray(0);
        if(ctColor != null) {
           XSSFColor color = XSSFColor.from(ctColor, _indexedColorMap);
           if(_themes != null) {
              _themes.inheritFromThemeAsRequired(color);
           }
           return color;
        } else {
           return null;
        }
    }


    /**
     * get the color value for the font
     * References a color defined in theme.
     *
     * @return short - theme defined to use
     */
    public short getThemeColor() {
        CTColor color = _ctFont.sizeOfColorArray() == 0 ? null : _ctFont.getColorArray(0);
        long index = color == null ? 0 : color.getTheme();
        return (short) index;
    }

    /**
     * Get the font height in unit's of 1/20th of a point.
     * <p>
     * For many users, the related {@link #getFontHeightInPoints()}
     *  will be more helpful, as that returns font heights in the
     *  more familiar points units, eg 10, 12, 14.

     * @return short - height in 1/20ths of a point
     * @see #getFontHeightInPoints()
     */
    @Override
    public short getFontHeight() {
        return (short)(getFontHeightRaw()*Font.TWIPS_PER_POINT);
    }

    /**
     * Get the font height in points.
     * <p>
     * This will return the same font height that is shown in Excel,
     *  such as 10 or 14 or 28.
     * @return short - height in the familiar unit of measure - points
     * @see #getFontHeight()
     */
    @Override
    public short getFontHeightInPoints() {
        return (short)getFontHeightRaw();
    }

    /**
     * Return the raw font height, in points, but also
     *  including fractions.
     */
    private double getFontHeightRaw() {
        CTFontSize size = _ctFont.sizeOfSzArray() == 0 ? null : _ctFont.getSzArray(0);
        if (size != null) {
            return size.getVal();
        }
        return DEFAULT_FONT_SIZE;
    }

    /**
     * get the name of the font (i.e. Arial)
     *
     * @return String - a string representing the name of the font to use
     */
    @Override
    public String getFontName() {
        CTFontName name = _ctFont.sizeOfNameArray() == 0 ? null : _ctFont.getNameArray(0);
        return name == null ? DEFAULT_FONT_NAME : name.getVal();
    }

    /**
     * get a boolean value that specify whether to use italics or not
     *
     * @return boolean - value for italic
     */
    @Override
    public boolean getItalic() {
        CTBooleanProperty italic = _ctFont.sizeOfIArray() == 0 ? null : _ctFont.getIArray(0);
        return italic != null && italic.getVal();
    }

    /**
     * get a boolean value that specify whether to use a strikeout horizontal line through the text or not
     *
     * @return boolean - value for strikeout
     */
    @Override
    public boolean getStrikeout() {
        CTBooleanProperty strike = _ctFont.sizeOfStrikeArray() == 0 ? null : _ctFont.getStrikeArray(0);
        return strike != null && strike.getVal();
    }

    /**
     * set a boolean value for the boldness to use. If omitted, the default value is true.
     *
     * @param bold - boldness to use
     */
    @Override
    public void setBold(boolean bold) {
        if(bold){
            CTBooleanProperty ctBold = _ctFont.sizeOfBArray() == 0 ? _ctFont.addNewB() : _ctFont.getBArray(0);
            ctBold.setVal(true);
        } else {
            _ctFont.setBArray(null);
        }
    }

    /**
     * set character-set to use.
     *
     * @param charset - charset
     * @see FontCharset
     */
    @Override
    public void setCharSet(byte charset) {
       int cs = charset & 0xff;
       setCharSet(cs);
    }

    /**
     * set character-set to use.
     *
     * @param charset - charset
     * @see FontCharset
     */
    @Override
    public void setCharSet(int charset) {
        FontCharset fontCharset = FontCharset.valueOf(charset);
        if(fontCharset != null) {
           setCharSet(fontCharset);
        } else {
           throw new POIXMLException("Attention: an attempt to set a type of unknown charset and charset");
        }
    }

    /**
     * set character-set to use.
     *
     * @since 5.0.0
     */
    public void setCharSet(FontCharset charSet) {
        CTIntProperty charsetProperty;
        if(_ctFont.sizeOfCharsetArray() == 0) {
            charsetProperty = _ctFont.addNewCharset();
        } else {
            charsetProperty = _ctFont.getCharsetArray(0);
        }
        // We know that FontCharset only has valid entries in it,
        //  so we can just set the int value from it
        charsetProperty.setVal( charSet.getNativeId() );
    }

    /**
     * set the indexed color for the font
     *
     * @param color - color to use
     * @see #DEFAULT_FONT_COLOR - Note: default font color
     * @see IndexedColors
     */
    @Override
    public void setColor(short color) {
        CTColor ctColor = _ctFont.sizeOfColorArray() == 0 ? _ctFont.addNewColor() : _ctFont.getColorArray(0);
        if (color == Font.COLOR_NORMAL) {
            ctColor.setIndexed(XSSFFont.DEFAULT_FONT_COLOR);
        } else {
            ctColor.setIndexed(color);
        }
    }

    /**
     * set the color for the font in Standard Alpha Red Green Blue color value
     *
     * @param color - color to use
     */
    public void setColor(XSSFColor color) {
        if(color == null) _ctFont.setColorArray(null);
        else {
            CTColor ctColor = _ctFont.sizeOfColorArray() == 0 ? _ctFont.addNewColor() : _ctFont.getColorArray(0);
            if (ctColor.isSetIndexed()) {
                ctColor.unsetIndexed();
            }
            ctColor.setRgb(color.getARGB());
        }
    }

    /**
     * set the font height in points.
     *
     * @param height - height in points
     */
    @Override
    public void setFontHeight(short height) {
        setFontHeight((double) height/Font.TWIPS_PER_POINT);
    }

    /**
     * set the font height in points.
     *
     * @param height - height in points
     */
    public void setFontHeight(double height) {
        CTFontSize fontSize = _ctFont.sizeOfSzArray() == 0 ? _ctFont.addNewSz() : _ctFont.getSzArray(0);
        fontSize.setVal(height);
    }

    /**
     * set the font height in points.
     *
     * @see #setFontHeight
     */
    @Override
    public void setFontHeightInPoints(short height) {
        setFontHeight((double)height);
    }

    /**
     * set the theme color for the font to use
     *
     * @param theme - theme color to use
     */
    public void setThemeColor(short theme) {
        CTColor ctColor = _ctFont.sizeOfColorArray() == 0 ? _ctFont.addNewColor() : _ctFont.getColorArray(0);
        ctColor.setTheme(theme);
    }

    /**
     * set the name for the font (i.e. Arial).
     * If the font doesn't exist (because it isn't installed on the system),
     * or the charset is invalid for that font, then another font should
     * be substituted.
     * The string length for this attribute shall be 0 to 31 characters.
     * Default font name is Calibri.
     *
     * @param name - value representing the name of the font to use
     * @see #DEFAULT_FONT_NAME
     */
    @Override
    public void setFontName(String name) {
        CTFontName fontName = _ctFont.sizeOfNameArray() == 0 ? _ctFont.addNewName() : _ctFont.getNameArray(0);
        fontName.setVal(name == null ? DEFAULT_FONT_NAME : name);
    }


    /**
     * set a boolean value for the property specifying whether to use italics or not
     * If omitted, the default value is true.
     *
     * @param italic - value for italics or not
     */
    @Override
    public void setItalic(boolean italic) {
        if(italic){
            CTBooleanProperty bool = _ctFont.sizeOfIArray() == 0 ? _ctFont.addNewI() : _ctFont.getIArray(0);
            bool.setVal(true);
        } else {
            _ctFont.setIArray(null);
        }
    }


    /**
     * set a boolean value for the property specifying whether to use a strikeout horizontal line through the text or not
     * If omitted, the default value is true.
     *
     * @param strikeout - value for strikeout or not
     */
    @Override
    public void setStrikeout(boolean strikeout) {
        if(strikeout) {
            CTBooleanProperty strike = _ctFont.sizeOfStrikeArray() == 0 ? _ctFont.addNewStrike() : _ctFont.getStrikeArray(0);
            strike.setVal(true);
        } else {
            _ctFont.setStrikeArray(null);
        }
    }



    public String toString() {
        return _ctFont.toString();
    }


    /**
     * Perform a registration of ourselves
     *  to the style table
     */
    public long registerTo(StylesTable styles) {
        return registerTo(styles, true);
    }

    public long registerTo(StylesTable styles, boolean force) {
        this._themes = styles.getTheme();
        this._index = styles.putFont(this, force);
        return this._index;
    }


    /**
     * Records the Themes Table that is associated with
     *  the current font, used when looking up theme
     *  based colours and properties.
     */
    public void setThemesTable(ThemesTable themes) {
       this._themes = themes;
    }

    /**
     * get the font scheme property.
     * is used only in StylesTable to create the default instance of font
     *
     * @return FontScheme
     * @see org.apache.poi.xssf.model.StylesTable#createDefaultFont()
     */
    @SuppressWarnings("JavadocReference")
    public FontScheme getScheme() {
        CTFontScheme scheme = _ctFont.sizeOfSchemeArray() == 0 ? null : _ctFont.getSchemeArray(0);
        return scheme == null ? FontScheme.NONE : FontScheme.valueOf(scheme.getVal().intValue());
    }

    /**
     * set font scheme property
     *
     * @param scheme - FontScheme enum value
     * @see FontScheme
     */
    public void setScheme(FontScheme scheme) {
        CTFontScheme ctFontScheme = _ctFont.sizeOfSchemeArray() == 0 ? _ctFont.addNewScheme() : _ctFont.getSchemeArray(0);
        STFontScheme.Enum val = STFontScheme.Enum.forInt(scheme.getValue());
        ctFontScheme.setVal(val);
    }

    /**
     * get the font family to use.
     *
     * @return the font family to use
     * @see org.apache.poi.ss.usermodel.FontFamily
     */
    public int getFamily() {
        CTFontFamily family = _ctFont.sizeOfFamilyArray() == 0 ? null : _ctFont.getFamilyArray(0);
        return family == null ? FontFamily.NOT_APPLICABLE.getValue() : FontFamily.valueOf(family.getVal()).getValue();
    }

    /**
     * Set the font family this font belongs to.
     * A font family is a set of fonts having common stroke width and serif characteristics.
     * The font name overrides when there are conflicting values.
     *
     * @param value - font family
     * @see FontFamily
     */
    public void setFamily(int value) {
        CTFontFamily family = _ctFont.sizeOfFamilyArray() == 0 ? _ctFont.addNewFamily() : _ctFont.getFamilyArray(0);
        family.setVal(value);
    }

    /**
     * set an enumeration representing the font family this font belongs to.
     * A font family is a set of fonts having common stroke width and serif characteristics.
     *
     * @param family font family
     * @see #setFamily(int value)
     */
    public void setFamily(FontFamily family) {
        setFamily(family.getValue());
    }

    @Override
    public int getIndex() {
        return _index;
    }

    /**
     * @return index
     * @deprecated use {@link #getIndex()} instead
     */
    @Deprecated
    @Removal(version = "6.0.0")
    @Override
    public int getIndexAsInt()
    {
        return _index;
    }

    public int hashCode(){
        return _ctFont.toString().hashCode();
    }

    public boolean equals(Object o){
        if(!(o instanceof XSSFFont)) return false;

        XSSFFont cf = (XSSFFont)o;

        // BUG 60845
        return Objects.equals(this.getItalic(), cf.getItalic())
                        && Objects.equals(this.getBold(), cf.getBold())
                        && Objects.equals(this.getStrikeout(), cf.getStrikeout())
                        && Objects.equals(this.getCharSet(), cf.getCharSet())
                        && Objects.equals(this.getColor(), cf.getColor())
                        && Objects.equals(this.getFamily(), cf.getFamily())
                        && Objects.equals(this.getFontHeight(), cf.getFontHeight())
                        && Objects.equals(this.getFontName(), cf.getFontName())
                        && Objects.equals(this.getScheme(), cf.getScheme())
                        && Objects.equals(this.getThemeColor(), cf.getThemeColor())
//                        && Objects.equals(this.getTypeOffset(), cf.getTypeOffset())
//                        && Objects.equals(this.getUnderline(), cf.getUnderline())
                        && Objects.equals(this.getXSSFColor(), cf.getXSSFColor());
    }

}
