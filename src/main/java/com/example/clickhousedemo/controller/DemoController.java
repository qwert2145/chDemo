package com.example.clickhousedemo.controller;

import com.example.clickhousedemo.dao.click.ClickUserMapper;
import com.example.clickhousedemo.dao.click.DwdActDimMemberActivityCMapper;
import com.example.clickhousedemo.dao.mysql.MysqlUserMapper;
import com.example.clickhousedemo.entity.click.ClickUser;
import com.example.clickhousedemo.entity.click.DwdActDimMemberActivityC;
import com.example.clickhousedemo.entity.mysql.MysqlUser;
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

    @Autowired
    private DwdActDimMemberActivityCMapper dwdActDimMemberActivityCMapper;

    @GetMapping("/mysql")
    public MysqlUser mysqlTest(){
        return  mysqlUserMapper.selectById(1);
    }

    @GetMapping("/click")
    public ClickUser clickHouseTest(){
        return clickUserMapper.selectById(1);
    }

    @GetMapping("/click/yzl")
    public DwdActDimMemberActivityC clickHouseYzlTest(){
        return dwdActDimMemberActivityCMapper.selectById(1);
    }
}
