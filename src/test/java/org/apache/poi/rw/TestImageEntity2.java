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
public class TestImageEntity2 implements Serializable {


    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * 根据url导出
     *
     * @since 2.1.1
     */
    private URL url;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "TestImageEntity{" +
                "name='" + name + '\'' +
                ", url=" + url +
                '}';
    }
}
