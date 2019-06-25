package com.jd.Module.userModule.service.impl;

import com.jd.Module.userModule.service.IUserService;
import com.jd.mapper.UserMapper;
import com.jd.pojo.User;
import com.jd.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public void add(User user) {
        int insert = mapper.insert(user);
    }

    @Override
    public User login(String username, String pwd) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username).andPwdEqualTo(pwd);
        List<User> users = mapper.selectByExample(userExample);
        if (users.size() > 0) {
            User user = users.get(0);
            return user;
        }
        return null;
    }
}
