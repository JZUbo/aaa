package com.zxb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author shkstart
@create 2023-03-18 14:40
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersItemsRelation {
    /**
    * 订单id
    */
    private Integer ordersId;

    /**
    *  商品id
    */
    private Integer itemsId;

    /**
    * 商品件数
    */
    private Integer count;
}