package com.example.demo.service;

import com.example.demo.controller.Result;

public interface SignService {
    Result Sign(String username);
    Result SignOut(String username);
}
