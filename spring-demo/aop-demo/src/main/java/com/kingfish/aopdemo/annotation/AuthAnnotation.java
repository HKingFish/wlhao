package com.kingfish.aopdemo.annotation;

import java.lang.annotation.*;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/12 11:35
 * @Des: 权限校验 注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAnnotation {
    // 是否需要校验，默认需要
    boolean verify() default true;
}