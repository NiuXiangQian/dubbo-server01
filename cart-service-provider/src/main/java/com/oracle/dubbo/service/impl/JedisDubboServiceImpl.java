package com.oracle.dubbo.service.impl;

import com.oracle.dubbo.model.SysUser;
import com.oracle.dubbo.redis.RedisKeyExpire;
import com.oracle.dubbo.service.JedisDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 操作的redis的业务层实现类
 * @Author: admin
 * @CreateDate: 2019/4/24 19:27
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 19:27
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Service("jedisDubboService")
public class JedisDubboServiceImpl implements JedisDubboService {

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public Boolean putUserSessionToRedis(String sessionKey, SysUser user) throws Exception {

        Map<String, String> map = new HashMap<>();
        map.put("id", user.getId() + "");
        map.put("loginName", user.getLoginName() + "");
        jedisCluster.hmset(sessionKey, map);
        jedisCluster.expire(sessionKey, RedisKeyExpire.SESSION);
        return false;
    }

    @Override
    public Boolean existUserSessionInRedis(String sessionKey) throws Exception {
        return jedisCluster.exists(sessionKey);

    }

    @Override
    public Map<String, String> getUserPropertyMapInRedisSession(String sessionKey) {
        return jedisCluster.hgetAll(sessionKey);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public Long del(String key) {
        return jedisCluster.del(key);
    }
}
