package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 订单的控制器
 * @Author: admin
 * @CreateDate: 2019/4/24 16:03
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/24 16:03
 * @UpdateRemark:
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/orders")
public class OrdersController {


    @RequestMapping("/toOrders")
    public String toOrders() {
        return "orders/orders";
    }
}
