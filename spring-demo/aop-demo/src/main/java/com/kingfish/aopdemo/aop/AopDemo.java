package com.kingfish.aopdemo.aop;

import com.kingfish.aopdemo.annotation.AuthAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/4/12 10:46
 * @Des: 定义一个切面
 */
@Slf4j
@Component
@Aspect
public class AopDemo {
    @Autowired
    private HttpServletRequest httpServletRequest;

    @Pointcut("execution(* com.kingfish.aopdemo.controller.AopController.hello(String)) && args(msg)")
    public void pointCut(String msg) {
        System.out.println("AopDemo.pointCut : msg = " + msg);
    }

    @Pointcut("@annotation(com.kingfish.aopdemo.annotation.AuthAnnotation)")
    public void auth() {
    }

    @Around("auth()")
    public Object around(ProceedingJoinPoint joinPoint) {
        try {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature(); // 获取切点的署名
            Method method = signature.getMethod();  // 拦截的方法
            AuthAnnotation annotation = method.getAnnotation(AuthAnnotation.class);
            if (annotation != null && annotation.verify()) {
                String token = httpServletRequest.getHeader("token");
                if (StringUtils.isEmpty(token)) {
                    throw new RuntimeException("token 为空");
                }
            }
          return joinPoint.proceed();    // 放行切点的方法，不放行则会阻塞调用
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw new RuntimeException(throwable);
        }
    }
}