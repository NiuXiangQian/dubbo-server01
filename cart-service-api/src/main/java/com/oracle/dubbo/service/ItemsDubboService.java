package com.oracle.dubbo.service;

import com.github.pagehelper.PageInfo;
import com.oracle.dubbo.model.Items;

/**
 * @Description: 商品的业务层远程调用接口
 * @Author: admin
 * @CreateDate: 2019/4/24 11:35
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 11:35
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface ItemsDubboService {

    /**
     * @Description:查询一页商品数据
     * @Author: admin
     * @Param: [pageNum 当前页码, pageSize 每页大小]
     * @Return com.github.pagehelper.PageInfo<com.oracle.dubbo.model.Items>
     **/
    PageInfo<Items> findOnePage(Integer pageNum, Integer pageSize);
}
