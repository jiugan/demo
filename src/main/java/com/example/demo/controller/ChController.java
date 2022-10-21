package com.example.demo.controller;


import com.example.demo.service.ChService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savedata")
public class ChController {

    @Autowired
    ChService chService;

    @PostMapping
    public Result login(@RequestParam String ch1, @RequestParam String ch2,@RequestParam String ch3){
        return chService.saveData(ch1,ch2,ch3);
    }
}
