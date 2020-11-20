package com.kingfish.springmvcdemo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/13 18:21
 * @Des:
 */
@Component("/beanNameSay")
public class BeanNameSayController implements Controller, LastModified {
    private long lastModified;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("/hello");
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        if (lastModified == 0L){
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}