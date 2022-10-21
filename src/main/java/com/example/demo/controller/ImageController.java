package com.example.demo.controller;


import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    ImageService imageService;

    //查询全部图片列表接口
    @GetMapping
    public Result getImage(@RequestParam String token){
        return imageService.getImage(token);
    }

    //按种类进行查询图片
    @PostMapping
    public Result getImageById(@RequestParam String token,@RequestParam int kinds){
        return imageService.getImageByKind(token,kinds);
    }

}
