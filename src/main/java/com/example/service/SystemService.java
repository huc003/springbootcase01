package com.example.service;

import com.example.bean.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by huc on 2017/4/7.
 */
public interface SystemService {
    public List<Map<String,Object>> systemList(Page page);

    public Map<String,Object> systemCount();
}
