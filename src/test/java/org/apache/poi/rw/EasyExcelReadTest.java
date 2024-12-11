package org.apache.poi.rw;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.PageReadListener;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * test
 *
 * @author shaoow
 * @version 1.0
 * @className EasyExcelReadTest
 * @date 2024/12/6 13:32
 */
public class EasyExcelReadTest {


    @Test
    public void test01(){
        // 写法1：JDK8+ ,不用额外写一个DemoDataListener
        // since: 3.0.0-beta1
        String fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\read.xlsx";
        // 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
        // 具体需要返回多少行可以在`PageReadListener`的构造函数设置
        EasyExcel.read(fileName, TestEntity.class, new PageReadListener<TestEntity>(dataList -> {
            for (TestEntity testEntity : dataList) {
                System.out.println("读取到数据："+testEntity);
            }
        })).sheet().doRead();

//        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
//        // 写法3：
//        fileName = "read.xlsx";
//        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
//        EasyExcel.read(fileName, BookDTO.class, new DemoDataListener()).sheet().doRead();
//
//        // 写法4
//        fileName = "read.xlsx";
//        // 一个文件一个reader
//        try (ExcelReader excelReader = EasyExcel.read(fileName, BookDTO.class, new DemoDataListener()).build()) {
//            // 构建一个sheet 这里可以指定名字或者no
//            ReadSheet readSheet = EasyExcel.readSheet(0).build();
//            // 读取一个sheet
//            excelReader.read(readSheet);
//        }

    }


    @Test
    public void test02(){

    }

}
