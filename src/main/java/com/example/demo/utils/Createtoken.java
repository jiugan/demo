package com.example.demo.utils;

import com.example.demo.domin.User;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class Createtoken {
    public static String getToken(User user){
        JwtBuilder builder = Jwts.builder()
                .setSubject(user.getUsername())
                .setId(user.getId()+"")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"my-123")
                .setExpiration(new Date(new Date().getTime()+86400000));

        System.out.println(builder.compact());
        return builder.compact();
    }
}
