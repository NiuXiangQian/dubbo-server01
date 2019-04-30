package com.oracle.dubbo.service;

import com.oracle.dubbo.model.SysUser;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Description: jedis的远程调用接口
 * @Author: admin
 * @CreateDate: 2019/4/24 19:25
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 19:25
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface JedisDubboService {


    /**
     * @Description: 将用户的session放入redis缓存
     * @Author: admin
     * @Param: [request, user]
     * @Return boolean
     **/
    Boolean putUserSessionToRedis(String sessionKey, SysUser user) throws Exception;


    /**
     * @Description: 查看用户的session是否在缓存中存在
     * @Author: admin
     * @Param: [request]
     * @Return boolean
     **/
    Boolean existUserSessionInRedis(String sessionKey) throws Exception;

    /**
     * @Description:从缓存中获取用户的属性map集合
     * @Author: admin
     * @Param: [request]
     * @Return java.util.Map<java.lang.String, java.lang.String>
     **/
    Map<String, String> getUserPropertyMapInRedisSession(String sessionKey);

    /**
     * @Description: 从redis取出数据
     * @Author: admin
     * @Param: [key]
     * @Return java.lang.Object
     **/
    String get(String key);

    Long del(String key);
}
