package com.kingfish.springjdbcdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/13 18:21
 * @Des:
 */

@RestController
@RequestMapping("say")
public class SayController {

    @RequestMapping("hello")
    public String hello() {
        return "/hello.html";
    }
}