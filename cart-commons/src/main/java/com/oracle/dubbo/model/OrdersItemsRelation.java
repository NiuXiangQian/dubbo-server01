package com.oracle.dubbo.model;

import java.io.Serializable;

public class OrdersItemsRelation implements Serializable {
    /**
     *
     */
    private Integer ordersId;

    /**
     *
     */
    private Integer itemsId;

    /**
     *
     */
    private Integer count;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}