package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hucheng on 2017/3/29.
 */
@Controller
@RequestMapping("/login")
public class UserController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){
        return "登录成功,用户名："+username+",密码："+password;
    }
}
