package com.kingfish.aopdemo.service.impl;

import com.kingfish.aopdemo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/4 11:29
 * @Des:
 */
@Service
public class DemoServiceImpl  implements DemoService {
    private String msg;

    public DemoServiceImpl() {
    }

    public DemoServiceImpl(String msg) {
        this.msg = msg;
    }
}