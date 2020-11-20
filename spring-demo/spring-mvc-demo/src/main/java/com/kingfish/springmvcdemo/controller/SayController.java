package com.kingfish.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/13 18:21
 * @Des:
 */

@Controller
@RequestMapping("say")
public class SayController {

    @RequestMapping("hello")
    public String hello() {
        return "/hello.html";
    }
}