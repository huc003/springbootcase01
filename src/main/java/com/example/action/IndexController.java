package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huc on 2017/3/28.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/home")
    public String home(ModelMap modelMap){
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("aa","11");
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        Map<String,String> map1 = new LinkedHashMap<String,String>();
        Map<String,String> map2 = new LinkedHashMap<String,String>();
        Map<String,String> map3 = new LinkedHashMap<String,String>();
        map1.put("zhangsan","11");
        map2.put("lisi","22");
        map3.put("wangwu","33");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        modelMap.addAttribute("peoplo",list);
        modelMap.addAttribute("singlePerson",map);
        return "index";// return模板文件的名称，对应src/main/resources/templates/index.html
    }
}
