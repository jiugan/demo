package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.controller.Result;
import com.example.demo.dao.ImageDao;
import com.example.demo.dao.UserDao;
import com.example.demo.domin.Image;
import com.example.demo.domin.User;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageDao imageDao;

    @Autowired
    UserDao userDao;

    @Override
    public Result getImage(String token) {
        User user = userDao.selectOne(new QueryWrapper<User>().eq("token", token));
        if (user != null){
            List<Image> images = imageDao.selectList(null);
            return new Result(200,images,"查询成功！");
        }else {
            return new Result(400,null,"您没有相关权限！");
        }
    }


    @Override
    public Result getImageByKind(String token,int kinds) {
        User user = userDao.selectOne(new QueryWrapper<User>().eq("token", token));
        if (user != null){
//            List<Image> images = imageDao.selectList(new QueryWrapper<Image>().eq("kinds", kinds));
//            return new Result(200,images,"查询成功！");
            List<Image> kinds2 = imageDao.selectList(new QueryWrapper<Image>().eq("kinds", kinds));
            if (!kinds2.isEmpty()){
                return new Result(200,kinds2,"查询成功！");
            }else {
                return new Result(200,null,"暂无该种类数据！");
            }
        }else {
            return new Result(400,null,"您没有相关权限！");
        }
    }
}
