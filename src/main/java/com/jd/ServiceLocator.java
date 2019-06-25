package com.jd;

import com.jd.mapper2.mapper类顶层注入接口;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Deprecated
@Component
public class ServiceLocator implements ApplicationContextAware {
    /**
     * 用于保存接口实现类名及对应的类
     */
    private Map<String, mapper类顶层注入接口> map;

    /**
     * 获取应用上下文并获取相应的接口实现类
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //根据接口类型返回相应的所有bean
        map = applicationContext.getBeansOfType(mapper类顶层注入接口.class);
    }

    public Map<String, mapper类顶层注入接口> getMap() {
        return map;
    }
}