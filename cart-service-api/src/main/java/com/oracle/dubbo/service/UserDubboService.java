package com.oracle.dubbo.service;

import com.oracle.dubbo.model.SysUser;

/**
 * @Description: 用户的业务层接口
 * @Author: admin
 * @CreateDate: 2019/4/22 10:34
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/22 10:34
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface UserDubboService {

    /**
     * @Description: 登录方法
     * @Author: admin
     * @Param: [account, password]
     * @Return SysUser
     **/
    SysUser loginUser(String account, String password);
}
