package com.example.service.impl;

import com.example.dao.SystemDao;
import com.example.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by huc on 2017/4/7.
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemDao systemDao;
    @Override
    public List<Map<String, Object>> systemList() {
        return systemDao.systemList();
    }
}
