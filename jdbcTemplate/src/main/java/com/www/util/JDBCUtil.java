package com.www.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/19 13:41
 */
public class JDBCUtil {

    private static ComboPooledDataSource ds;

    static {
        try {
            //1、加载配置文件
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
             ds = new ComboPooledDataSource();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }


    // 释放资源

    public static void close(Statement stmt, Connection conn) {
        close(null, stmt, conn);
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();  //归还连接
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


    //获取连接池方法
    public static DataSource getDataSource() {
        return ds;
    }

}
