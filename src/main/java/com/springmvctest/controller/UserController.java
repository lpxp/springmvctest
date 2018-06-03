package com.springmvctest.controller;

import com.springmvctest.pojo.User;
import com.springmvctest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("")
    public String findUsers() throws Exception{
        List<User> users = userService.findUsers();
        List<String> usernames = null;
        return String.join(",",usernames);
    }
}
