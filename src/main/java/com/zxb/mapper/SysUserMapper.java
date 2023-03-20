package com.zxb.mapper;

import com.zxb.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
@author shkstart
@create 2023-03-18 14:29
*/
@Repository
public interface SysUserMapper {

    SysUser findByUserNameAndPassword(@Param("userName") String userName);

}