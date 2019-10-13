package com.signin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.signin.service.UserService;

@Controller
public class MainController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/signup")
    public String singup() {
        return "signup";
    }
}
