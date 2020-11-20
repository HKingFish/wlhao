package com.kingfish.flowdemo.interceptor;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/8 19:26
 * @Des:
 */
@Component
@Slf4j
public class FlowInterceptor implements HandlerInterceptor {
    private static final Integer LIMIT_COUNT = 3;
    private static final Integer LIMIT_TIME = 5;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private DefaultRedisScript<Number> redisScript;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Number number = redisTemplate.execute(redisScript, Lists.newArrayList(""), LIMIT_COUNT +"", LIMIT_TIME +"");
        if (number != null && number.intValue() != 0 && number.intValue() <= LIMIT_COUNT) {
            log.info("限流时间段内访问第：{} 次", number.toString());
            return true;
        }

        return false;
    }
}