package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hucheng on 2017/3/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(String username,String password){
        return "redirect:/index/main?url_address=/index/rule&off=user";
    }

    @RequestMapping("/out")
    public String loginOut(){
        return "redirect:/";
    }
}
