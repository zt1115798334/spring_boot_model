package com.zt.query;


import com.zt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserImpl {

    @Autowired
    private UserService userService;

    @PostMapping("findUser")
    public Object saveUser() {
        return userService.findList();
    }
}
