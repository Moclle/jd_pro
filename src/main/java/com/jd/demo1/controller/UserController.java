//package com.jd.demo1Controller.controller;
//
//import com.jd.common.enums.ResultCode;
//import com.jd.common.result.Result;
//import com.jd.demo1Controller.service.impl.UserServiceImpl;
//import com.jd.pojo.User;
//import com.jd.util.JsonUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//@Slf4j
//public class userController {
//
//    private UserServiceImpl UserServiceImpl;
//
//    @Autowired
//    public userController(UserServiceImpl UserServiceImpl) {
//        this.UserServiceImpl = UserServiceImpl;
//    }
//
//    @GetMapping("/{userId}")
//    Result getUser(@PathVariable("userId") Long userId) {
//        log.info("有人调用了");
//        User user = UserServiceImpl.getUserById(userId);
//        return Result.success(user);
//    }
//
//    @GetMapping("/test/{test1}")
//    Result test() {
//        return Result.success();
//    }
//
//    @PutMapping("/{userId}")
//    public Result updateUser(@PathVariable("userId") Long userId, @RequestBody User user) {
//        log.info("Call updateUser start, params:{}", JsonUtil.object2Json(user));//注意此处打印日志有不合理的地方，user里可能带有pwd
//        // 密码等明文敏感信息，需要做过滤打印。
//
//        Result result = new Result();
//
//        //参数校验
//        if (user.getUserId() == null || user.getName() == null) {
//            result.setResultCode(ResultCode.PARAM_IS_INVALID);
//            log.info("Call updateUser end, result:{}", JsonUtil.object2Json(result));
//            return result;
//        }
//
//        try {
//            //更新数据
//            User dbUser = UserServiceImpl.getUserById(user.getUserId().longValue());
//
//            if (dbUser == null) {
//                result.setResultCode(ResultCode.USER_NOT_EXIST);
//            } else {
//                User updatedUser = UserServiceImpl.updateDbAndCache(user);
//                result.setData(updatedUser);
//                result.setResultCode(ResultCode.SUCCESS);
//            }
//        } catch (Exception e) {
//            log.info("Call updateUser occurs exception, caused by: ", e);
//            result.setResultCode(ResultCode.SYSTEM_INNER_ERROR);
//        }
//
//        log.info("Call updateUser end, result:{}", JsonUtil.object2Json(result));
//        return result;
//    }
//
//
//}
