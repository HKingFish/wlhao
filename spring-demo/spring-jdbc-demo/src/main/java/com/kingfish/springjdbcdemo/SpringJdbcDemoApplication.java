package com.kingfish.springjdbcdemo;

import com.kingfish.springjdbcdemo.service.UserProxyServiceImpl;
import com.kingfish.springjdbcdemo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement
public class SpringJdbcDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringJdbcDemoApplication.class, args);
        UserService userService = run.getBean(UserService.class);
        UserProxyServiceImpl userProxyService = run.getBean(UserProxyServiceImpl.class);
        userProxyService.findAll();
        //        UserMapper userMapper = run.getBean(UserMapper.class);
//
//
//        List<User> users = userMapper.findAll();
//        System.out.println("users = " + users);
//
//
//        JdbcTemplate jdbcTemplate = run.getBean(JdbcTemplate.class);
//        String sql = "select * from user";
//        List<User> maps = jdbcTemplate.query("select * from user ", new BeanPropertyRowMapper<>(User.class));
//        System.out.println("maps = " + maps);

    }


}
