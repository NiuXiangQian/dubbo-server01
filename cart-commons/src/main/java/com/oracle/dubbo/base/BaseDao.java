package com.oracle.dubbo.base;

/**
 * @Description: dao基本的方法
 * @Author: admin
 * @CreateDate: 2019/4/22 9:21
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/22 9:21
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface BaseDao<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
