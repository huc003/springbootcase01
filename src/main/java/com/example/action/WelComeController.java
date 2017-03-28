package com.example.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hucheng on 2017/3/28.
 */
@RestController
public class WelComeController {
    @RequestMapping("/")
    public String welcome(){
        return "welcome!!!";
    }
}
