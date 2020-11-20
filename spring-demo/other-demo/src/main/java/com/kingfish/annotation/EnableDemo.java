package com.kingfish.annotation;

import com.kingfish.auto.DemoImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/5 16:26
 * @Des:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DemoImportSelector.class)
public @interface EnableDemo {
}