package com.www.jdbcTemplate;

import com.www.pojo.User;
import com.www.util.JDBCUtil;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author www
 * @version 1.0
 * @create 2021/2/19 14:47
 */

public class Test1 {

    JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDataSource());
    /**
     * 查询name为“张三”的记录，并且封装为map集合
     * 注意：这个合集只能查询到的结果集的长度只能是 1
     */
    @Test
    public void queryForMap() {

        String sql = "select * from user where name=?";
        Map<String, Object> map = template.queryForMap(sql,"张三");
        System.out.println(map);
    }


    /**
     * 查询所有记录，将其封装成一个list集合
     *  注意：这是将每一条记录封装为一份map集合，再将map集合装载到list集合中
     */
    @Test
    public void queryForList() {
        String sql = "select * from user";
        List<Map<String, Object>> list = template.queryForList(sql);

        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    /**
     * 将查询到的果封装成Javabean对象
     */
    @Test
    public void query() {
        String sql = "select * from user";
        List<User> userList = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        for (User user : userList) {
            System.out.println(user);
        }
    }


    /**
     * 查询总记录数
     *   注意：一般用于聚合函数的查询
     */
    @Test
    public void queryForObject() {
        String sql = "select count(name) from user";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }

}
