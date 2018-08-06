package com.zt.controller;


import com.zt.entity.User;
import com.zt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("saveUser")
    public String saveUser() {
        User user = new User();
        user.setUsername("xiaoming");
        user.setDateTime(LocalDateTime.now());
        userService.save(user);
        return "success";
    }
}
