package com.example.clickhousedemo.dao.click;

import com.example.clickhousedemo.entity.click.DwdActDimMemberActivityC;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DwdActDimMemberActivityCMapper {

    DwdActDimMemberActivityC selectById(Integer id);
}