package com.kingfish.springmvcdemo.config;

import com.kingfish.springmvcdemo.interceptor.DemoHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/15 20:03
 * @Des:
 */
@Component
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private DemoHandlerInterceptor demoHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoHandlerInterceptor);
    }
}