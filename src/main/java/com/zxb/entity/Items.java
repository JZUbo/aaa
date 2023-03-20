package com.zxb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
@author shkstart
@create 2023-03-18 14:40
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    /**
    * 主键
    */
    private Integer id;

    /**
    *  商品名称
    */
    private String itemsName;

    /**
    * 图片url路径 
    */
    private String itemsUrl;

    /**
    *  商品价格
    */
    private Long itemsPrice;

    /**
    *  库存数量
    */
    private String itemsCount;

    private List<Orders> orders;
}