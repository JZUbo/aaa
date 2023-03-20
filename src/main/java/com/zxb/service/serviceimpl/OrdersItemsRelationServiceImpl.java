package com.zxb.service.serviceimpl;

import com.zxb.mapper.OrdersItemsRelationMapper;
import com.zxb.service.OrdersItemsRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
@author shkstart
@create 2023-03-18 14:40
*/
@Service
public class OrdersItemsRelationServiceImpl implements OrdersItemsRelationService{

    @Resource
    private OrdersItemsRelationMapper ordersItemsRelationMapper;

}
