package com.example.demo.domin;


import lombok.Data;

@Data
public class User {
    public int id;
    public  String username;
    public  String password;
    public  String token;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String token) {
        this.username = username;
        this.password = password;
        this.token = token;
    }

    public User() {
    }
}
