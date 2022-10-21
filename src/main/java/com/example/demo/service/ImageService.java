package com.example.demo.service;

import com.example.demo.controller.Result;

public interface ImageService {
    Result getImage(String token);
    Result getImageByKind(String token,int kinds);
}
