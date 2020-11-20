package com.kingfish.springjdbcdemo.service.impl;

import com.kingfish.springjdbcdemo.dao.UserMapper;
import com.kingfish.springjdbcdemo.pojo.User;
import com.kingfish.springjdbcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

/**
 * @Author : wlhao
 * @Email : kingfishx@163.com
 * @Data: 2020/6/14 13:07
 * @Des:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TransactionTemplate transactionTemplate;


    /**
     * 测试事务回滚
     * @return
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public List<User> findAll() {
         int i =  10 / 0;
         return userMapper.findAll();
    }

    /**
     *  测试嵌套事务
     * @return
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public List<User> findAll2() {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                System.out.println("UserServiceImpl.findAll2 begin");
                findAll();
                System.out.println("UserServiceImpl.findAll2 begin");
                return null;
            }
        });

        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateUser(User user) {
        User u1 = new User();
        u1.setId(2);
        u1.setUserId("2");
        u1.setUsername("李四");
        u1.setPassword("李四");

        userMapper.insertUser(u1);
//        int i  = 10 /0;
        u1.setUserId("3");
        userMapper.insertUser(u1);
    }
}