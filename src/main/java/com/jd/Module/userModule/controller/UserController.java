package com.jd.Module.userModule.controller;

import com.google.common.collect.ImmutableList;
import com.jd.Module.userModule.service.IUserService;
import com.jd.common.enums.ResultCode;
import com.jd.common.result.Result;
import com.jd.pojo.User;
import com.jd.util.CDKUtil;
import com.jd.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService service;

    @Autowired
    public UserController(IUserService service) {
        this.service = service;
    }


    @PostMapping("/login")
    public Result login(User user) {
        User login;
        String token;
        try {
            login = service.login(user.getUsername(), user.getPwd());
            token = UUID.randomUUID().toString().replace("-", "").toString();
        } catch (Exception e) {
            return Result.failure(ResultCode.USER_LOGIN_ERROR);
        }
        ImmutableList<?> of = ImmutableList.of(login, token);
        return Result.success(of);
//        String password = person.getPassword();
//        String username = person.getUsername();
//        if ("zard".equals(username) && "1991".equals(password)) {
//            return Result.success();
//        }
//        return Result.failure(ResultCode.USER_LOGIN_ERROR);
    }

    @GetMapping("/activityCode")
    public Result activityCode(String email) {
        String emailCDK = CDKUtil.getEmailCDK(6);
        MailUtil.sendHtmlEmail(email, emailCDK);
        return Result.success(emailCDK);
    }

    @PostMapping("/register")
    public Result register(User user) {
        try {
            service.add(user);
        } catch (Exception e) {
            return Result.failure(ResultCode.USER_NOT_REGISTER);
        }
        return Result.success();
    }

}

