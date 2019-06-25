package com.jd.config.web;

import com.jd.interceptor.HeaderParamsCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private HeaderParamsCheckInterceptor HeaderParamsCheckInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String apiUri = "/**";
        registry.addInterceptor(HeaderParamsCheckInterceptor).addPathPatterns(apiUri);


    }
}
