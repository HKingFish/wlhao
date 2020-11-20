package com.kingfish.beaninitdemo.config;

import com.kingfish.beaninitdemo.bean.BaseBean;
import com.kingfish.beaninitdemo.bean.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/6 14:11
 * @Des:
 */
@Configuration


public class DemoConfig {
    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

    @Bean
    public BaseBean baseBean() {
        return new BaseBean();
    }
}