package com.example.action;

import com.example.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 返回数据的类
 * Created by hucheng on 2017/4/4.
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/variable")
    public String variable(ModelMap modelMap){
//        modelMap.addAttribute("url_address","");
        System.out.println(newsService.newsById(1));
        return "variable";
    }

}
