package com.example.demo.service;

import com.example.demo.controller.Result;

public interface UserService {
     Result login(String username, String password);
     Result register(String username, String password);
     Result test(String token);
}
