package com.kingfish.springmvcdemo.service.impl;

import com.kingfish.springmvcdemo.service.SayService;
import org.springframework.stereotype.Service;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/15 21:19
 * @Des:
 */
@Service
public class SayServiceImpl implements SayService {
    @Override
    public void hello() {
        System.out.println("SayServiceImpl.hello");
    }
}