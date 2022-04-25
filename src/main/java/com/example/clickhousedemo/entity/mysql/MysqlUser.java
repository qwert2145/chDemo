package com.example.clickhousedemo.entity.mysql;

import lombok.Data;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:07
 * @description:
 */
@Data
public class MysqlUser {
    private Integer id;
    private String name;
    private Boolean sex;
    private String password;
}
