package com.example.action;

import com.example.bean.Page;
import com.example.service.SystemService;
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
    private SystemService systemService;

    @RequestMapping("/system")
    public String system(ModelMap modelMap, Page page){
        modelMap.addAttribute("system_list",systemService.systemList(page));
        modelMap.addAttribute("count",systemService.systemCount());
        modelMap.addAttribute("offset",page.getOffset());
        modelMap.addAttribute("url","/system/system");
        return "system";
    }

}
