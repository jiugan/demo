package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.controller.Result;
import com.example.demo.dao.ChDao;
import com.example.demo.dao.TimeDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domin.Sign;
import com.example.demo.domin.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.Createtoken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Autowired
    TimeDao timeDao;

    //登录
    @Override
    public Result login(String username, String password) {
        User user1 = userDao.selectOne(new QueryWrapper<User>().eq("username",username)
                .eq("password",password));
        if (user1 != null){
            String token = Createtoken.getToken(user1);
            user1.setToken(token);
//            timeDao.insert(new Sign(username, "0",user1.getId()));
            userDao.updateById(user1);
            return new Result(200,user1,"登陆成功！");
        }else {
            return new Result(200,null,"用户名或密码错误！");
        }
    }


    //注册
    @Override
    public Result register(String username, String password) {
        User user1 = userDao.selectOne(new QueryWrapper<User>().eq("username",username));
        if (user1 == null){
            User user = new User(username,password);
            int i = userDao.insert(user);
            if (i == 1){
                return new Result(200,user,"注册成功！");
            }else {
                return new Result(400,user,"注册失败，请检查网络！");
            }
        }else {
            return new Result(500,null,"用户名已经存在");
        }
    }

    //测试
    @Override
    public Result test(String token) {
        User user = userDao.selectOne(new QueryWrapper<User>().eq("token",token));
        if (user != null){
            return new Result(200,null,"访问成功！");
        }else {
            return new Result(500,null,"您没有权限");
        }
    }

    //传递参数test
//    @Override
//    public Result saveData(String data1,String data2,String data3) {
//
//        return null;
//    }
}
