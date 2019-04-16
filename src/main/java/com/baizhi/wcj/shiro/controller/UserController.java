package com.baizhi.wcj.shiro.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    DruidDataSource druidDataSource;

    @RequestMapping("testDruid")
    @ResponseBody
    public String testDruid(){

        return "Hello World";
    }
}
