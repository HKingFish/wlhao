package com.kingfish.beaninitdemo.factory;

import com.kingfish.beaninitdemo.bean.DemoBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/6 14:07
 * @Des:
 */
@Component
public class DemoFactoryBean implements FactoryBean<DemoBean> {
    @Override
    public DemoBean getObject() throws Exception {
        System.out.println("DemoFactoryBean.getObject");
        return new DemoBean();
    }

    @Override
    public Class<?> getObjectType() {
        return DemoBean.class;
    }
}