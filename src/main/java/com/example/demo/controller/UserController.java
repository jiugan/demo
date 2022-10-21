package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    //登录接口
    @PostMapping
    public Result login(@RequestParam String username,@RequestParam String password){
        return userService.login(username,password);
    }

    //注册接口
    @PutMapping
    public Result register(@RequestParam String username,@RequestParam String password){
        return userService.register(username,password);
    }

    //测试token接口
    @GetMapping
    public Result test(@RequestParam String token){
        return userService.test(token);
    }
}
