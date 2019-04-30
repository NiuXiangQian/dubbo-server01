package com.oracle.controller;


import com.oracle.dubbo.exception.UnifyException;
import com.oracle.dubbo.redis.RedisKey;
import com.oracle.dubbo.redis.RedisKeyExpire;
import com.oracle.dubbo.service.JedisDubboService;
import com.oracle.dubbo.service.UserDubboService;
import com.oracle.dubbo.model.SysUser;
import com.oracle.dubbo.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.JedisCluster;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * @Description: 登录控制器
 * @Author: admin
 * @CreateDate: 2019/4/18 16:08
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/18 16:08
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class LoginController {


    @Autowired(required = false)
    private UserDubboService userDubboService;

    @Autowired(required = false)
    private JedisDubboService jedisDubboService;

    /**
     * @Description: 去登录
     * @Author: admin
     * @Param: []
     * @Return java.lang.String
     **/
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * @Description: 去主页
     * @Author: admin
     * @Param: []
     * @Return java.lang.String
     **/
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }

    /**
     * @Description: 退出登录
     * @Author: admin
     * @Param: []
     * @Return java.lang.String
     **/
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        String key = RedisKey.SESSION + request.getRemoteAddr();
        jedisDubboService.del(key);
        return "index";
    }


    /**
     * @Description:登录方法
     * @Author: admin
     * @Param: [user]
     * @Return ServerResponse
     **/
    @RequestMapping("/login")
    @ResponseBody
    public ServerResponse login(HttpServletRequest request, SysUser user) throws Exception {
        user = userDubboService.loginUser(user.getLoginName(), user.getPassword());
        if (user == null) {
            return ServerResponse.createByException("账号密码有误");
        } else {
            String key = RedisKey.SESSION + request.getRemoteAddr();
            jedisDubboService.putUserSessionToRedis(key, user);
            return ServerResponse.createBySuccess(true);
        }
    }

    /**
     * @Description: 登录成功跳到主页
     * @Author: admin
     * @Param: []
     * @Return java.lang.String
     **/
    @RequestMapping("/success")
    public String success() {
        return "redirect:/user/toIndex.do";
    }

}
