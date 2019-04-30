package com.oracle.interceptor;

import com.oracle.dubbo.redis.RedisKey;
import com.oracle.dubbo.service.JedisDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.JedisCluster;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 登录拦截器
 * @Author: admin
 * @CreateDate: 2019/4/24 19:16
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 19:16
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired(required = false)
    private JedisDubboService jedisDubboService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        if (requestURI.contains("user") || requestURI.contains("items")) {
            return true;
        } else {
            String key = RedisKey.SESSION + request.getRemoteAddr();
            if (jedisDubboService.existUserSessionInRedis(key)) {
                return true;
            } else {
                response.sendRedirect(request.getContextPath() + "/user/toLogin.do");
                return false;
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
