/*
 *  ====================================================================
 *    Licensed to the Apache Software Foundation (ASF) under one or more
 *    contributor license agreements.  See the NOTICE file distributed with
 *    this work for additional information regarding copyright ownership.
 *    The ASF licenses this file to You under the Apache License, Version 2.0
 *    (the "License"); you may not use this file except in compliance with
 *    the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 * ====================================================================
 */

package org.apache.poi.xssf.usermodel;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting.IconSet;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeUtil;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;

/**
 * XSSF Conditional Formattings
 */
public class XSSFSheetConditionalFormatting implements SheetConditionalFormatting {
    /** Office 2010 Conditional Formatting extensions namespace */
//    protected static final String CF_EXT_2009_NS_X14 = "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main";

    private final XSSFSheet _sheet;

    /* package */ XSSFSheetConditionalFormatting(XSSFSheet sheet) {
        _sheet = sheet;
    }

    @Override
    public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule[] cfRules) {
        if (regions == null) {
            throw new IllegalArgumentException("regions must not be null");
        }
        for(CellRangeAddress range : regions) range.validate(SpreadsheetVersion.EXCEL2007);

        if (cfRules == null) {
            throw new IllegalArgumentException("cfRules must not be null");
        }
        if (cfRules.length == 0) {
            throw new IllegalArgumentException("cfRules must not be empty");
        }

        CellRangeAddress[] mergeCellRanges = CellRangeUtil.mergeCellRanges(regions);
        CTConditionalFormatting cf = _sheet.getCTWorksheet().addNewConditionalFormatting();
        List<String> refs = new ArrayList<>();
        for(CellRangeAddress a : mergeCellRanges) refs.add(a.formatAsString());
        cf.setSqref(refs);

        int priority = 1;
        for(CTConditionalFormatting c : _sheet.getCTWorksheet().getConditionalFormattingArray()){
            priority += c.sizeOfCfRuleArray();
        }

        for(ConditionalFormattingRule rule : cfRules){
            XSSFConditionalFormattingRule xRule = (XSSFConditionalFormattingRule)rule;
            xRule.getCTCfRule().setPriority(priority++);
            cf.addNewCfRule().set(xRule.getCTCfRule());
        }
        return _sheet.getCTWorksheet().sizeOfConditionalFormattingArray() - 1;
    }

    @Override
    public int addConditionalFormatting(CellRangeAddress[] regions,
                                        ConditionalFormattingRule rule1, ConditionalFormattingRule rule2)
    {
        return addConditionalFormatting(regions,
                rule1 == null ? null : new XSSFConditionalFormattingRule[] {
                        (XSSFConditionalFormattingRule)rule1,
                        (XSSFConditionalFormattingRule)rule2
                });
    }

    /**
     * Adds a copy of HSSFConditionalFormatting object to the sheet
     * <p>This method could be used to copy HSSFConditionalFormatting object
     * from one sheet to another. For example:
     * <pre>
     * HSSFConditionalFormatting cf = sheet.getConditionalFormattingAt(index);
     * newSheet.addConditionalFormatting(cf);
     * </pre>
     *
     * @param cf HSSFConditionalFormatting object
     * @return index of the new Conditional Formatting object
     */
    @Override
    public int addConditionalFormatting( ConditionalFormatting cf ) {
        XSSFConditionalFormatting xcf = (XSSFConditionalFormatting)cf;
        CTWorksheet sh = _sheet.getCTWorksheet();
        sh.addNewConditionalFormatting().set(xcf.getCTConditionalFormatting().copy());
        return sh.sizeOfConditionalFormattingArray() - 1;
    }

    /**
     * gets Conditional Formatting object at a particular index
     *
     * @param index
     *          of the Conditional Formatting object to fetch
     * @return Conditional Formatting object
     */
    @Override
    public XSSFConditionalFormatting getConditionalFormattingAt(int index) {
        checkIndex(index);
        CTConditionalFormatting cf = _sheet.getCTWorksheet().getConditionalFormattingArray(index);
        return new XSSFConditionalFormatting(_sheet, cf);
    }

    /**
     * @return number of Conditional Formatting objects of the sheet
     */
    @Override
    public int getNumConditionalFormattings() {
        return _sheet.getCTWorksheet().sizeOfConditionalFormattingArray();
    }

    /**
     * removes a Conditional Formatting object by index
     * @param index of a Conditional Formatting object to remove
     */
    @Override
    public void removeConditionalFormatting(int index) {
        checkIndex(index);
        _sheet.getCTWorksheet().removeConditionalFormatting(index);
    }

    private void checkIndex(int index) {
        int cnt = getNumConditionalFormattings();
        if (index < 0 || index >= cnt) {
            throw new IllegalArgumentException("Specified CF index " + index
                    + " is outside the allowable range (0.." + (cnt - 1) + ")");
        }
    }

}