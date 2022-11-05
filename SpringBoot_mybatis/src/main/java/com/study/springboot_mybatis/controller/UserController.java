package com.study.springboot_mybatis.controller;

import com.study.springboot_mybatis.bean.User;
import com.study.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public User queryUserByID(int id){
        return userService.queryUserByID(id);
    }
}
