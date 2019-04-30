package com.oracle.dubbo.model;

import java.io.Serializable;

public class Items implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String price;

    /**
     *
     */
    private String imgUrl;

    /**
     *
     */
    private Integer count;

    /**
     *
     */
    private String itemsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", count=" + count +
                ", itemsName='" + itemsName + '\'' +
                '}';
    }
}