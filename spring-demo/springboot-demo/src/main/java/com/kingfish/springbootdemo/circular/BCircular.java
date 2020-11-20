package com.kingfish.springbootdemo.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/5/16 12:54
 * @Des:
 */
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BCircular {
    private ACircular aCircular;

//    public BCircular(ACircular aCircular) {
//        this.aCircular = aCircular;
//    }

    @Autowired
    public void setaCircular(ACircular aCircular) {
        this.aCircular = aCircular;
    }
}