//package com.jd.demo1Controller.service.impl;
//
//import com.jd.demo1Controller.service.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements IUserService {
//
//    @Autowired
//    private com.jd.mapper.UserMapper UserMapper;
//
//    @Override
//    public User getUserById(Long userId) {
//        User user = UserMapper.selectByPrimaryKey(userId.intValue());
//        return user;
//    }
//
//    @Override
//    public User updateDbAndCache(User user) {
//        int i = UserMapper.updateByPrimaryKey(user);
//        User user1 = UserMapper.selectByPrimaryKey(i);
//        return user1;
//    }
//}
