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
public class ACircular {
    private BCircular bCircular;

//    public ACircular(BCircular bCircular) {
//        this.bCircular = bCircular;
//    }

    @Autowired
    public void setbCircular(BCircular bCircular) {
        this.bCircular = bCircular;
    }
}