package com.example.clickhousedemo.dao.click;

import com.example.clickhousedemo.entity.click.ClickUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:23
 * @description:
 */
@Mapper
public interface ClickUserMapper {
    ClickUser selectById(Integer id);
}
