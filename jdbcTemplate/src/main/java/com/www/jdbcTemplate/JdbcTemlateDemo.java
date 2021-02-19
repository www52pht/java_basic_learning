package com.www.jdbcTemplate;

import com.www.util.JDBCUtil;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * @author www
 * @version 1.0
 * @create 2021/2/19 11:54
 */
public class JdbcTemlateDemo {
    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());

        String sql = "INSERT into user (name,age) values (?,?)";

        template.update(sql, "李四", 16);
    }
}
