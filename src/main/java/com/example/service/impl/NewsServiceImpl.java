package com.example.service.impl;

import com.example.dao.NewsDao;
import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hucheng on 2017/4/5.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public Map<String, Object> newsById(Integer newsId) {
        return newsDao.newsById(newsId);
    }

    @Override
    public List<Map<String, Object>> newsList() {
        return newsDao.newsList();
    }
}
