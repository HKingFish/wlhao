package com.kingfish.flowdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/8 19:23
 * @Des:
 */
@RestController
@RequestMapping("flow")
public class FlowController {

    @RequestMapping("hello")
    public String flow(){
        return "hello world";
    }

}