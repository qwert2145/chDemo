package com.example.clickhousedemo.entity.click;

import lombok.Data;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:12
 * @description:
 */
@Data
public class ClickUser {
    private Integer id;
    private String name;
    private Boolean sex;
    private String password;
}
