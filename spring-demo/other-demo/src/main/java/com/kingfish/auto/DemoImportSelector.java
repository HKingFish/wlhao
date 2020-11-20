package com.kingfish.auto;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/5 16:24
 * @Des:
 */
public class DemoImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 本来应该在 META-INF/spring.factories 配置类，这里偷个懒
        // 返回类的全路径地址，会被Spring按照路径加载到容器中
        return new String[]{"com.kingfish.auto.Demo"};
    }
}