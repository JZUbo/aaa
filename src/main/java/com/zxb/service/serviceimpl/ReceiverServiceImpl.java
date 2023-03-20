package com.zxb.service.serviceimpl;

import com.zxb.entity.SysUser;
import com.zxb.mapper.ReceiverMapper;
import com.zxb.service.ReceiverService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
@author shkstart
@create 2023-03-18 14:39
*/
@Service
@Transactional
public class ReceiverServiceImpl implements ReceiverService{

    @Resource
    private ReceiverMapper receiverMapper;

    public List<SysUser> selectRAndIAndO() {
      return null;
    }
}
