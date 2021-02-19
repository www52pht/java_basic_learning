package com.www.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/19 12:28
 */
public class c3p0Demo1 {
    public static void main(String[] args) throws SQLException {
        //获取dataSource，使用默认配置
//        ComboPooledDataSource ds = new ComboPooledDataSource();

        //1.1 获取DataSource，使用指定名称配置
        ComboPooledDataSource ds = new ComboPooledDataSource("otherc3p0");

        Connection connection = ds.getConnection();

        System.out.println(connection);
    }
}
