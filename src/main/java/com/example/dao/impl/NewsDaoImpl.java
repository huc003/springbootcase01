package com.example.dao.impl;

import com.example.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by hucheng on 2017/4/5.
 */
@Repository
public class NewsDaoImpl implements NewsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> newsById(Integer newsId) {
        String sql = "select * from news where id = ?";
        return jdbcTemplate.queryForMap(sql,new Object[]{newsId});
    }
}
