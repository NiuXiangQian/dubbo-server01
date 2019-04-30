package com.oracle.dubbo.service;

import com.oracle.dubbo.model.CartItems;

import java.util.List;

/**
 * @Description: 购物车项的业务层远程调用接口
 * @Author: admin
 * @CreateDate: 2019/4/24 13:02
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 13:02
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface CartItemsDubboService {

    /**
     * @Description: 添加进购物车项
     * @Author: admin
     * @Param: [cartItems]
     * @Return boolean
     **/
    boolean addCartItems(CartItems cartItems);


    /**
     * @Description: 根据用户id查找购物车项
     * @Author: admin
     * @Param: [userId]
     * @Return java.util.List<com.oracle.dubbo.model.CartItems>
     **/
    List<CartItems> findCartItemsByUserId(Integer userId);
}
