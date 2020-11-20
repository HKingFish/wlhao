package com.kingfish.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/13 18:21
 * @Des:
 */

@Controller
@RequestMapping("say")
public class SayController implements LastModified {
    private long lastModified;
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        if (lastModified == 0L){
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}