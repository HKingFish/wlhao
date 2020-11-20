package com.kingfish.flowdemo.config;

import com.kingfish.flowdemo.interceptor.FlowInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/8 19:29
 * @Des:
 */
@Configuration
public class SpringConfig implements WebMvcConfigurer {

    @Autowired
    private FlowInterceptor flowInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(flowInterceptor);
    }
}