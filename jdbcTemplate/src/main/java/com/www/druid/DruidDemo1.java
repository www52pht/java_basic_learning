package com.www.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/19 13:05
 */
public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、导入jar包
        // 2、定义配置文件
        // 3、加载配置文件
        Properties properties = new Properties();
//        InputStream inputStream = DruidDemo1.class.getResourceAsStream("/druid.properties");
        InputStream inputStream = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(inputStream);
        // 4、获得连接对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);

        Connection connection = ds.getConnection();

        System.out.println(connection);
    }
}
