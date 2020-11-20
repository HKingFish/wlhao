package com.kingfish.flowdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/8 19:37
 * @Des:
 */
@Configuration
public class RedisConfig {
    @Bean
    public DefaultRedisScript<Number> redisluaScript() {
        DefaultRedisScript<Number> redisScript = new DefaultRedisScript<>();
        //读取 lua 脚本
        redisScript.setScriptSource(new ResourceScriptSource(new ClassPathResource("redis/flow.lua")));
        redisScript.setResultType(Number.class);
        return redisScript;
    }
}