package com.kingfish.selfioc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * @Author : wlhao
 * @Email : wlhao@iflytek.com
 * @Data: 2020/2/15
 * @Des:  自定义需要注入的 bean 的 注解
 */
@Inherited
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})    // 可以在类上和方法上使用
public @interface SelfComponent {
}
