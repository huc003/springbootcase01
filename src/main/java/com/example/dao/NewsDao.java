package com.example.dao;

import java.util.Map;

/**
 * Created by hucheng on 2017/4/5.
 */
public interface NewsDao {
    public Map<String,Object> newsById(Integer newsId);
}
