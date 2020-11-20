package com.kingfish.dubboconsumerdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kingfish.dubbocommondemo.service.DubboProviderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/10/10 14:09
 * @Des:
 */
@RestController
public class DubboConsumerController {
    @Reference(version = "1.0.0", timeout = 10000, async = true)
    private DubboProviderService dubboProviderService;
}