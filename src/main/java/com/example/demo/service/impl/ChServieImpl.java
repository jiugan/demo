package com.example.demo.service.impl;

import com.example.demo.controller.Result;
import com.example.demo.dao.ChDao;
import com.example.demo.domin.Ch;
import com.example.demo.service.ChService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChServieImpl implements ChService {
    @Autowired
    ChDao chDao;

    @Override
    public Result saveData(String ch1, String ch2, String ch3) {
        if (ch1!=null &&  ch2!=null && ch3!=null){
            Ch ch = new Ch(ch1,ch2,ch3);
            int i = chDao.insert(ch);
            if (i == 1){
                return new Result(200,ch,"上传成功！");
            }
            else {
                return new Result(400,ch,"上传失败，请检查网络！");
            }
        }else {
            return new Result(500,null,"相关数据不可为空！");
        }
    }
}
