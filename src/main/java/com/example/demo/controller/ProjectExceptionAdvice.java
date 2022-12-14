package com.example.demo.controller;

import com.example.demo.exception.BusinessException;
import com.example.demo.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //记录日志
        //发送消息给运维
        //发送消息给开发人员
        System.out.println(e.getMessage());
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        System.out.println(e.getMessage());
        return new Result(e.getCode(),null,e.getMessage());
    }

    //处理其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println(e.getMessage());
        return new Result(Code.system_unknow_err,null,e.getMessage());
    }
}
