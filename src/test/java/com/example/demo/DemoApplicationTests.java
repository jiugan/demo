package com.example.demo;

import com.example.demo.service.ImageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ImageService imageService;

    @Test
    void contextLoads() {
//        imageService.getImageByKind("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ6aGFvIiwianRpIjoiMiIsImlhdCI6MTY2MDU2ODQzOSwiZXhwIjoxNjYwNjU0ODM5fQ.xCDRt7AqMl-nTpJ0zCx2nE7cvNzqf35KpYO2GftyqD0", );
    }

}
