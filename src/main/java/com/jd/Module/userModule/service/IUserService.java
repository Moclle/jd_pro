package com.jd.Module.userModule.service;

import com.jd.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    void add(User user);
    User login(String username,String pwd);

}
