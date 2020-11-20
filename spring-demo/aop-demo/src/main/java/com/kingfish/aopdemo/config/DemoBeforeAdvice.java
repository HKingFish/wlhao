package com.kingfish.aopdemo.config;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/1 21:27
 * @Des:
 */
@Component
public class DemoBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("DemoBeforeAdvice.before");
    }
}