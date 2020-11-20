package com.kingfish.springbootdemo.controller;

import com.kingfish.springbootdemo.server.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/20 20:17
 * @Des:
 */
//@RestController
//@RequestMapping("demo")
public class DemoController {
    @Autowired
    private DemoService demoService;


    @PostMapping("post")
    public String post(){
        return "post";
    }
}