package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回页面的类
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
        map1.put("name","zhangsan");
        map2.put("name","lisi");
        map3.put("name","wangwu");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        modelMap.addAttribute("peoplo",list);
        modelMap.addAttribute("singlePerson",map);
        return "index";// return模板文件的名称，对应src/main/resources/templates/index.html
    }

    @RequestMapping("/main")//返回页面的方法
    public String main(ModelMap modelMap,String url_address,String off){
        modelMap.addAttribute("url_address",url_address);
        modelMap.addAttribute("off",off);
//        System.out.println(url_address+"?off="+off);
        return "main";
    }

    @RequestMapping("/rule")
    public String rule(){
        return "rule";
    }
}
