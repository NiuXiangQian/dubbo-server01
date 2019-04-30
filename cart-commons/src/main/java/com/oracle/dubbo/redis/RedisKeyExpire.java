package com.oracle.dubbo.redis;

/**
 * @Description: redis中key的过期时间设置
 * @Author: admin
 * @CreateDate: 2019/4/24 16:27
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 16:27
 * @UpdateRemark:
 * @Version: 1.0
 **/
public interface RedisKeyExpire {

    /**
     * session的过期时间 一小时
     */
    int SESSION = 60 * 60;
    /**
     * 商品items过期时间 一分钟
     */
    int ITEMS = 60;
    /**
     * 购物车cartItems过期时间 三天
     */
    int CART_ITEMS = 60 * 60 * 24 * 3;


}
