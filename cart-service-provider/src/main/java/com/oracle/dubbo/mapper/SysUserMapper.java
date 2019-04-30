package com.oracle.dubbo.mapper;

import com.oracle.dubbo.base.BaseDao;
import com.oracle.dubbo.model.SysUser;

public interface SysUserMapper extends BaseDao<SysUser> {


    /**
     * @Description:根据用户名查找一个用户
     * @Author: admin
     * @Param: [loginName]
     * @Return SysUser
     **/
    SysUser findByLoginName(String loginName);

}