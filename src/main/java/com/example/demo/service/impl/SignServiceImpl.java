package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.controller.Result;
import com.example.demo.dao.TimeDao;
import com.example.demo.domin.Sign;
import com.example.demo.domin.User;
import com.example.demo.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class SignServiceImpl implements SignService {

    @Autowired
    TimeDao timeDao;

    //用户签到
    @Override
    public Result Sign(String username) {
       Sign user = timeDao.selectOne(new QueryWrapper<Sign>().eq("username",username));
       if (user!=null){
           Date date = new Date();
           String time = String.valueOf(date.getTime());
           user.setSigntime(time);
           int i = timeDao.updateById(user);
           if (i == 1){
               return new Result(200,user,"签到成功！");
           }else {
               return new Result(400,"签到失败！请检查网络");
           }
       }else {
           return new Result(500,"签到失败！");
       }
    }

    @Override
    public Result SignOut(String username) {
        return null;
    }
}
