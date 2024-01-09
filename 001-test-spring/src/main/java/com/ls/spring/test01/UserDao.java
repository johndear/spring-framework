package com.ls.spring.test01;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ls
 * @date 2023/11/21 13:45
 */
@Component
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void in(String userId, int age) {
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from t_user");
        System.out.println(mapList);
        jdbcTemplate.update("update t_user set age=age - ? where id=?", age, userId);
    }

    public void out(String userId, int age) {
        jdbcTemplate.update("update t_user set age=age + ? where id=?", age, userId);
    }

}
