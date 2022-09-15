package com.example.clickhousedemo.controller;

import com.alibaba.fastjson.JSON;
import com.example.clickhousedemo.dao.click.ClickUserMapper;
import com.example.clickhousedemo.dao.mysql.MysqlUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:37
 * @description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {



    @Autowired
    private MysqlUserMapper mysqlUserMapper;

    @Autowired
    private ClickUserMapper clickUserMapper;

    @GetMapping("/mysql")
    public String mysqlTest(){
        return JSON.toJSON(mysqlUserMapper.selectById(1)).toString();
    }

    @GetMapping("/click")
    public String clickHouseTest(){
        return JSON.toJSON(clickUserMapper.selectById(1)).toString();
    }
}
