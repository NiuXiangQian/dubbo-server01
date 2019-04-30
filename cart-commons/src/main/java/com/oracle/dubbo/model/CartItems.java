package com.oracle.dubbo.model;

import java.io.Serializable;
import java.util.Date;

public class CartItems implements Serializable {
    /**
    * 
    */
    private Integer id;

    /**
    * 加购时间
    */
    private Date createTime;

    /**
    * 购买数量
    */
    private Integer num;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 商品id
    */
    private Integer itemsId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }
}