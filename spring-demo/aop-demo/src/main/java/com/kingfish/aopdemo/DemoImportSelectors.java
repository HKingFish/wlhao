package com.kingfish.aopdemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/30 18:34
 * @Des:
 */
public class DemoImportSelectors implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}