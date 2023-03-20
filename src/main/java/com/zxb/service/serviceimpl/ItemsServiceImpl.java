package com.zxb.service.serviceimpl;

import com.zxb.mapper.ItemsMapper;
import com.zxb.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
@author shkstart
@create 2023-03-18 14:40
*/
@Service
public class ItemsServiceImpl implements ItemsService{

    @Resource
    private ItemsMapper itemsMapper;

}
