package com.jd.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect
@Slf4j
@Component
public class TestAspect {

    @Around(value = "execution(* com.jd.Module.*.service.impl..*.*(..))")
    public Object service(ProceedingJoinPoint point) {
        String method = point.getTarget().getClass().getSimpleName() + "." + point.getSignature().getName() + "(..)";
        Object response = null;
        // 调用接口方法
        try {
            log.info("服务开始调用. 方法名 : {} , 参数 : {}", method, Arrays.toString(point.getArgs()));
            response = point.proceed();
            log.info("服务结束调用. 方法名 : {}, 结果集 : {}", method, response);
        } catch (Throwable e) {
            log.error("服务调用异常. 方法名 : {} , 异常原因 : {}", method, e);
        }
        return response;
    }
}
