package com.oracle.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 自定义拦截器
 * @Author: admin
 * @CreateDate: 2019/4/18 16:10
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/18 16:10
 * @UpdateRemark:
 * @Version: 1.0
 **/
//@Component
//@PropertySource("classpath:properties/server.properties")
public class MyInterceptor implements HandlerInterceptor {

    @Value("${items.path}")
    private String itemsPath;
    @Value("${server.imgServerAddr}")
    private String imgServerAddr;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //设置项目路径
        request.setAttribute("path", request.getContextPath());
        //设置商品图片路径
        request.setAttribute("itemsPath", imgServerAddr);

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
