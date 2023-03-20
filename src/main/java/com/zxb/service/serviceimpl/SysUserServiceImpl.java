package com.zxb.service.serviceimpl;

import com.zxb.entity.SysUser;
import com.zxb.mapper.SysUserMapper;
import com.zxb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shkstart
 * @create 2023-03-20 17:15
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser findByUserNameAndPassword(String userName) {
        return sysUserMapper.findByUserNameAndPassword(userName);
    }
}
