package com.example.dao.impl;

import com.example.bean.Page;
import com.example.dao.SystemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by huc on 2017/4/7.
 */
@Repository
public class SystemDaoImpl implements SystemDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> systemList(Page page) {
        String sql = "select * from dw_system order by id desc limit ?,?";
        return jdbcTemplate.queryForList(sql,new Object[]{page.getOffset(),page.getLimit()});
    }

    @Override
    public Map<String, Object> systemCount() {
        String sql = "select count(1) as total_num from dw_system";
        return jdbcTemplate.queryForMap(sql);
    }
}
