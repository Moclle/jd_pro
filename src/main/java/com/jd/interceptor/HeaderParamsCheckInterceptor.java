package com.jd.interceptor;

import com.jd.common.enums.CallSource;
import com.jd.constant.HeaderConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhumaer
 * @desc HEADER头参数校验
 * @since 8/29/2017 3:00 PM
 */
@Component
public class HeaderParamsCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            String call_source = request.getHeader(HeaderConstants.CALL_SOURCE);
            String api_version = request.getHeader(HeaderConstants.API_VERSION);
            String app_version = request.getHeader(HeaderConstants.APP_VERSION);
            if (StringUtils.isAnyBlank(call_source, api_version)) {
                throw new RuntimeException("用户机器异常");
            }
            try {
                Double.valueOf(app_version);
            } catch (NumberFormatException e) {
                throw new RuntimeException("用户软件版本异常");
            }
            if ((CallSource.ANDROID.name().equals(call_source)) || (CallSource.IOS.name().equals(call_source)) && StringUtils.isEmpty(app_version)) {
                throw new RuntimeException("用户软件类型异常，必须是ANDROID或者ios");
            }
            if (!CallSource.isValid(call_source)) {
                throw new RuntimeException("用户登录的客户端异常，推荐使用PC");
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {

    }
}
