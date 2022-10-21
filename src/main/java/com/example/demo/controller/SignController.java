package com.example.demo.controller;


import com.example.demo.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign")
public class SignController {
    @Autowired
    SignService signService;

    @PostMapping
    public Result sign(@RequestParam String username){
        return signService.Sign(username);
    }
}
