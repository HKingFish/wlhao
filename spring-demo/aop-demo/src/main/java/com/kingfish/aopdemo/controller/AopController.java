package com.kingfish.aopdemo.controller;

import com.kingfish.aopdemo.annotation.AuthAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/12 11:04
 * @Des:
 */
@RestController
@RequestMapping("aop")
public class AopController {
    /**
     * 不需要校验
     * @param msg
     * @return
     */
    @RequestMapping("hello")
    public String hello(String msg){
        return "hello ," + msg;
    }

    /**
     * 需要校验的方法
     * @param msg
     * @return
     */
    @RequestMapping("verifyHello")
    @AuthAnnotation
    public String verifyHello(String msg){
        return "hello ," + msg;
    }
}