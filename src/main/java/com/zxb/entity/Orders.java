package com.zxb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
@author shkstart
@create 2023-03-18 14:39
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 订单号
    */
    private String ordersKey;

    /**
    *  订单金额
    */
    private Long ordersMoney;

    /**
    * 订单状态
    */
    private Integer status;

    /**
    * 用户id 
    */
    private Integer userId;

    /**
    *  创建时间
    */
    private Date createTime;

    /**
    * 收货人id
    */
    private Integer reciverId;
    //订单商品多对多
    private List<Items> items;
}