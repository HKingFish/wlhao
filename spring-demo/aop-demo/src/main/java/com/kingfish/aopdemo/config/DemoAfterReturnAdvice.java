package com.kingfish.aopdemo.config;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/1 21:27
 * @Des:
 */

@Component
public class DemoAfterReturnAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("DemoAfterReturnAdvice.afterReturning");
    }
}