package com.oracle.dubbo.service.impl;

import com.oracle.dubbo.mapper.SysUserMapper;
import com.oracle.dubbo.model.SysUser;
import com.oracle.dubbo.redis.RedisKey;
import com.oracle.dubbo.service.UserDubboService;
import com.oracle.dubbo.util.IpInfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

/**
 * @Description: 用户的实现类
 * @Author: admin
 * @CreateDate: 2019/4/22 11:12
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/22 11:12
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Service("userDubboService")
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public SysUser loginUser(String account, String password) {
        if (account == null || password == null)
            return null;

        SysUser byLoginName = sysUserMapper.findByLoginName(account);

        System.out.println("byLoginName = " + byLoginName);
        if (byLoginName != null && byLoginName.getPassword().equals(password)) {
            return byLoginName;
        }


        return null;
    }
}
