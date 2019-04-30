package com.oracle.dubbo.mapper;

import com.oracle.dubbo.base.BaseDao;
import com.oracle.dubbo.model.Items;

import java.util.List;

public interface ItemsMapper extends BaseDao<Items> {


    /**
     * @Description: 查询所有
     * @Author: admin
     * @Param: []
     * @Return java.util.List<com.oracle.dubbo.model.Items>
     **/
    List<Items> selectAll();

    Long findCount();

}