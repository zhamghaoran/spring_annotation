package com.zhr.spring.controller;

import com.zhr.spring.service.UserService;
import com.zhr.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService = new UserServiceImpl();
    public void saveUser() {
        userService.saveUser();
    }
}
