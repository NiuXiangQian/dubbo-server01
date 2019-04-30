package com.oracle.dubbo.service.impl;

import com.oracle.dubbo.mapper.CartItemsMapper;
import com.oracle.dubbo.model.CartItems;
import com.oracle.dubbo.service.CartItemsDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 购物车的业务层远程调用实现类
 * @Author: admin
 * @CreateDate: 2019/4/24 13:41
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 13:41
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Service("cartItemsDubboService")
public class CartItemsDubboServiceImpl implements CartItemsDubboService {

    @Autowired
    private CartItemsMapper cartItemsMapper;


    @Override
    public boolean addCartItems(CartItems cartItems) {
        //
        if (cartItems == null) return false;

        //查看用户是否为空  用户是否为登录状态
        Integer userId = cartItems.getUserId();

        if (userId == null) {

        }


        return false;
    }

    @Override
    public List<CartItems> findCartItemsByUserId(Integer userId) {
        return null;
    }
}
