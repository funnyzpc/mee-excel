package org.apache.poi.rw;

import org.apache.poi.excel.ExcelReadUtil;

import java.io.File;
import java.util.List;
import java.util.Map;

public class ExcelReadTest {


    public static void main(String[] args) {
        ExcelReadTest excelReadTest = new ExcelReadTest();
        excelReadTest.readXls();
//        excelReadTest.readXlsx();
    }
    /**
     * read data by xlsx
     */
    public void readXlsx(){
        File file = new File("D:\\tmp\\export_dir\\2412031747121000.xlsx");
        //        List<Map<String,String>> results = ExcelReadUtil.readXlsx2Map(file,8);
        List<Map> results = ExcelReadUtil.xlsx2Map(file,8);
        System.out.println(results);

    }
    /**
     * read data by xlsx
     */
    public void readXls(){
        File file = new File("D:\\tmp\\export_dir\\2412031754581000.xls");
        List<Map> results = ExcelReadUtil.xls2Map(file,8);
        System.out.println(results);

    }

}
