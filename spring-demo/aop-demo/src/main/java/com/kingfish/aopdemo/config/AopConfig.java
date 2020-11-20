package com.kingfish.aopdemo.config;

import com.kingfish.aopdemo.interceptor.AopInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/1 21:22
 * @Des:
 */
@Configuration
public class AopConfig extends WebMvcConfigurationSupport {

    /**
     * 注入自定义拦截器到该配置类中
     */
    @Autowired
    private AopInterceptor aopInterceptor;

    /**
     * 添加自定义拦截器
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(aopInterceptor)
                .addPathPatterns("/**")//拦截的访问路径，拦截所有
                .excludePathPatterns("/static/*");//排除的请求路径，排除静态资源路径
        super.addInterceptors(registry);
    }



//    @Bean("demoController")
//    public ProxyFactoryBean proxyFactoryBean() {
//        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//        proxyFactoryBean.setTarget(new DemoController());
//        proxyFactoryBean.setInterceptorNames("demoAfterReturnAdvice", "demoBeforeAdvice");
//        return proxyFactoryBean;
//    }
}