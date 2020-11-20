package com.kingfish.selfioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Author : wlhao
 * @Email : wlhao@iflytek.com
 * @Data: 2020/2/15
 * @Des:
 */
@Documented // 可以被文档化
@Target(ElementType.FIELD)      // 可以在属性上使用
@Autowired
public @interface SelfAutowired {
    boolean required() default true;
}
