package com.zxb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
@author shkstart
@create 2023-03-18 14:39
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receiver {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 收货人姓名
    */
    private String userName;

    /**
    * 地址
    */
    private String address;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 邮编
    */
    private String zone;

    /**
    * 用户id
    */
    private Integer userId;
    //收货人有多个订单一对多
    private List<Orders> Orders;
}