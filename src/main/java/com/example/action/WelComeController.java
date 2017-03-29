package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hucheng on 2017/3/28.
 */
@Controller
public class WelComeController {
    @RequestMapping("/")
    public String welcome(){
        return "login";
    }
}
