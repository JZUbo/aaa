package com.zxb.service.serviceimpl;

import com.zxb.mapper.OrdersMapper;
import com.zxb.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
@author shkstart
@create 2023-03-18 14:39
*/
@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

}
