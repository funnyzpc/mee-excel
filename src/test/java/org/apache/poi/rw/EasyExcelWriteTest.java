package org.apache.poi.rw;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.longconverter.LongStringConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.data.ImageData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.util.FileUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import org.apache.poi.util.SeqGenUtil;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * EasyExcelWriteTest
 *
 * @author shaoow
 * @version 1.0
 * @className EasyExcelWriteTest
 * @date 2024/12/6 14:21
 */
public class EasyExcelWriteTest {


    @Test
    public void test01(){
        // 注意 simpleWrite在数据量不大的情况下可以使用（5000以内，具体也要看实际情况），数据量大参照 重复多次写入

        // 写法1 JDK8+
        // since: 3.0.0-beta1
        String fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\write.xls";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, TestEntity.class)
                .registerConverter(new LongStringConverter())
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .sheet("模板")
                .doWrite(() -> {
                    // 分页查询数据
                    return data();
                });

        // 写法2
        fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\write2.xls";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, TestEntity.class)
                .registerConverter(new LongStringConverter()).sheet("模板").doWrite(data());

        // 写法3
        fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\write3.xls";
        // 这里 需要指定写用哪个class去写
        try (ExcelWriter excelWriter = EasyExcel.write(fileName, TestEntity2.class).registerConverter(new LongStringConverter()).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
            excelWriter.write(data(), writeSheet);
        }
    }


    private List<TestEntity> data() {
        List<TestEntity> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestEntity data = new TestEntity();
            data.setSerialNo(System.currentTimeMillis());
            data.setName("《树上的男爵》");
            data.setPrice(23.33);
            data.setTag("推荐");
            data.setPublishDate(new Date());
            data.setStatue(true);
            data.setPubNo(SeqGenUtil.genLongSeq());
            data.setCreateTime(new Date(System.currentTimeMillis()/100*100));
            list.add(data);
        }
        return list;
    }

    // no support image
    @Test
    public void test02() throws IOException {
        String fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\write4.xlsx";

        // 这里注意下 所有的图片都会放到内存 暂时没有很好的解法，大量图片的情况下建议 2选1:
        // 1. 将图片上传到oss 或者其他存储网站: https://www.aliyun.com/product/oss ，然后直接放链接
        // 2. 使用: https://github.com/coobird/thumbnailator 或者其他工具压缩图片

        String imagePath = "C:\\Users\\zoupengcheng\\Desktop\\tu.jpg";
        try (InputStream inputStream = FileUtils.openInputStream(new File(imagePath))) {
            List<TestImageEntity> list = new ArrayList<>();
            TestImageEntity imageDemoData = new TestImageEntity();
            list.add(imageDemoData);
            // 放入五种类型的图片 实际使用只要选一种即可
            imageDemoData.setByteArray(FileUtils.readFileToByteArray(new File(imagePath)));
            imageDemoData.setFile(new File(imagePath));
            imageDemoData.setName(imagePath);
            imageDemoData.setInputStream(inputStream);
            imageDemoData.setUrl(new URL(
                    "http://himg.bdimg.com/sys/portrait/item/public.1.d18cd897.y2YzYiutsx-pmtFrmL0etA.jpg"));

            // 这里演示
            // 需要额外放入文字
            // 而且需要放入2个图片
            // 第一个图片靠左
            // 第二个靠右 而且要额外的占用他后面的单元格
            WriteCellData<Void> writeCellData = new WriteCellData<>();
            imageDemoData.setWriteCellDataFile(writeCellData);
//            imageDemoData.dat(writeCellData);
            // 这里可以设置为 EMPTY 则代表不需要其他数据了
            writeCellData.setType(CellDataTypeEnum.STRING);
            writeCellData.setStringValue("额外的放一些文字");

            // 可以放入多个图片
            List<ImageData> imageDataList = new ArrayList<>();
            ImageData imageData = new ImageData();
            imageDataList.add(imageData);
            writeCellData.setImageDataList(imageDataList);
            // 放入2进制图片
            imageData.setImage(FileUtils.readFileToByteArray(new File(imagePath)));
            // 图片类型
            imageData.setImageType(ImageData.ImageType.PICTURE_TYPE_PNG);
            // 上 右 下 左 需要留空
            // 这个类似于 css 的 margin
            // 这里实测 不能设置太大 超过单元格原始大小后 打开会提示修复。暂时未找到很好的解法。
            imageData.setTop(5);
            imageData.setRight(40);
            imageData.setBottom(5);
            imageData.setLeft(5);

            // 放入第二个图片
            imageData = new ImageData();
            imageDataList.add(imageData);
            writeCellData.setImageDataList(imageDataList);
            imageData.setImage(FileUtils.readFileToByteArray(new File(imagePath)));
            imageData.setImageType(ImageData.ImageType.PICTURE_TYPE_PNG);
            imageData.setTop(5);
            imageData.setRight(5);
            imageData.setBottom(5);
            imageData.setLeft(50);
            // 设置图片的位置 假设 现在目标 是 覆盖 当前单元格 和当前单元格右边的单元格
            // 起点相对于当前单元格为0 当然可以不写
            imageData.setRelativeFirstRowIndex(0);
            imageData.setRelativeFirstColumnIndex(0);
            imageData.setRelativeLastRowIndex(0);
            // 前面3个可以不写  下面这个需要写 也就是 结尾 需要相对当前单元格 往右移动一格
            // 也就是说 这个图片会覆盖当前单元格和 后面的那一格
            imageData.setRelativeLastColumnIndex(1);

            // 写入数据
            EasyExcel.write(fileName, TestImageEntity.class).sheet().doWrite(list);
        }
    }

    // no support image
    @Test
    public void test03() throws IOException {
        String fileName = "E:\\self\\mee-excel_20241209\\src\\test\\java\\org\\apache\\poi\\rw\\write5.xlsx";

        // 这里注意下 所有的图片都会放到内存 暂时没有很好的解法，大量图片的情况下建议 2选1:
        // 1. 将图片上传到oss 或者其他存储网站: https://www.aliyun.com/product/oss ，然后直接放链接
        // 2. 使用: https://github.com/coobird/thumbnailator 或者其他工具压缩图片


        List<TestImageEntity2> list = new ArrayList<TestImageEntity2>();
        TestImageEntity2 imageDemoData = new TestImageEntity2 ();
        list.add(imageDemoData);
        // 放入五种类型的图片 实际使用只要选一种即可
        imageDemoData.setName("测试图片01");
        imageDemoData.setUrl(new URL("http://himg.bdimg.com/sys/portrait/item/public.1.d18cd897.y2YzYiutsx-pmtFrmL0etA.jpg"));

        // 写入数据
        EasyExcel.write(fileName, TestImageEntity2.class).sheet().doWrite(list);

    }
}
