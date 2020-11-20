package com.kingfish.springmvcdemo.config;

import com.kingfish.springmvcdemo.interceptor.DemoHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/7/15 20:03
 * @Des:
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private DemoHandlerInterceptor demoHandlerInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(demoHandlerInterceptor);
//    }

//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//
//
//    }

//    @Bean
//    public DispatcherServlet dispatcherServlet(){
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        dispatcherServlet.setDetectAllHandlerMappings(false);
//
//        return dispatcherServlet;
//
//    }
//
//    @Bean
//    public HandlerMapping handlerAdapter(){
//        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
//        Map<String, Object> map = new HashMap<>();
//        map.put("/beanNameSay", "beanNameSayController");
//        simpleUrlHandlerMapping.setUrlMap(map);
//        return simpleUrlHandlerMapping;
//    }
}