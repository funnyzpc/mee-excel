package org.apache.poi.rw;

import com.alibaba.excel.metadata.data.WriteCellData;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;

/**
 * TestImageEntity
 *
 * @author shaoow
 * @version 1.0
 * @className TestImageEntity
 * @date 2024/12/6 14:50
 */
public class TestImageEntity implements Serializable {


    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 1L;

    private String name;

    private File file;
    private InputStream inputStream;

//    @ExcelProperty(converter = StringImageConverter.class)
    private byte[] byteArray;
    /**
     * 根据url导出
     *
     * @since 2.1.1
     */
    private URL url;

    /**
     * 根据文件导出 并设置导出的位置。
     *
     * @since 3.0.0-beta1
     */
    private WriteCellData<Void> writeCellDataFile;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public WriteCellData<Void> getWriteCellDataFile() {
        return writeCellDataFile;
    }

    public void setWriteCellDataFile(WriteCellData<Void> writeCellDataFile) {
        this.writeCellDataFile = writeCellDataFile;
    }

    @Override
    public String toString() {
        return "TestImageEntity{" +
                "name='" + name + '\'' +
                ", file=" + file +
                ", inputStream=" + inputStream +
                ", byteArray=" + Arrays.toString(byteArray) +
                ", url=" + url +
                ", writeCellDataFile=" + writeCellDataFile +
                '}';
    }
}
