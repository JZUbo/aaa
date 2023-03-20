package com.zxb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author shkstart
@create 2023-03-18 14:29
*/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 登录账号  
    */
    private String loginName;

    /**
    * 用户姓名 
    */
    private String userName;

    /**
    * 密码
    */
    private String password;


}