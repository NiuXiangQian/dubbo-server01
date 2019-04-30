package com.oracle.dubbo.redis;

/**
 * @Description: redis定制的key
 * @Author: admin
 * @CreateDate: 2019/4/24 15:30
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 15:30
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface RedisKey {
    /**
     * 用户session前缀
     */
    String SESSION = "session:";
    /**
     * 商品items前缀
     */
    String ITEMS = "items:";
    /**
     * 购物车cartItems前缀
     */
    String CART_ITEMS = "cartItems:";

}
