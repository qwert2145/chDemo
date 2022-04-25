package com.example.clickhousedemo.dao.mysql;

import com.example.clickhousedemo.entity.mysql.MysqlUser;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author :ZhangYi
 * @date :2022/4/25 20:23
 * @description:
 */
@Mapper
public interface MysqlUserMapper {
    MysqlUser selectById(Integer id);
}
