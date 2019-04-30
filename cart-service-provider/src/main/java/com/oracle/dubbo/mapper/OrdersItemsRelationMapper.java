package com.oracle.dubbo.mapper;

import com.oracle.dubbo.model.OrdersItemsRelation;

public interface OrdersItemsRelationMapper {
    int insert(OrdersItemsRelation record);

    int insertSelective(OrdersItemsRelation record);
}