package com.example.demo.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domin.Sign;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeDao extends BaseMapper<Sign> {
}
