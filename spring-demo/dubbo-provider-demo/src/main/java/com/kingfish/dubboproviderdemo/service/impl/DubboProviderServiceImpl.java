package com.kingfish.dubboproviderdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kingfish.dubbocommondemo.service.DubboProviderService;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/10/10 14:10
 * @Des:
 */
@Service(version = "1.0.0")
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public String say(String name) {
        System.out.println("name = " + name);
        return name + " hello";
    }
}