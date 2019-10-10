package com.signin.controller;

import com.signin.data.UserData;
import com.signin.service.UserService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/signin", method= RequestMethod.GET)
    public String SignIn(HttpServletRequest request, @RequestParam String userId, @RequestParam String userPwd) {
        UserData user = new UserData();
        user.setUserId(userId);
        user.setUserPwd(userPwd);

        JSONObject json = new JSONObject();
        json.put("result", userService.isLogin(user));
        return json.toJSONString();
    }
}
