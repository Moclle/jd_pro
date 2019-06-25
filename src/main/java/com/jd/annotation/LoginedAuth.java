package com.jd.annotation;


import java.lang.annotation.*;

/**
 * @desc 已登录权限验证注解
 *
 * @author
 * @since
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginedAuth {

}
