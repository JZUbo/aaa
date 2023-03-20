package com.zxb.service;

import com.zxb.entity.SysUser;

/**
@author shkstart
@create 2023-03-18 14:29
*/
public interface SysUserService{

    SysUser findByUserNameAndPassword(String userName);
}
