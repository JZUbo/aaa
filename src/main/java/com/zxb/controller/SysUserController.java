package com.zxb.controller;

import com.zxb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author shkstart
 * @create 2023-03-20 17:18
 */
@RestController
@RequestMapping
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/login")
    private String login(HttpSession session, String userName){
        session.setAttribute("username",userName);


        return null;
    }
}
