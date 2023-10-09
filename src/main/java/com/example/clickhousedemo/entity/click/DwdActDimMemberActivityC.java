package com.example.clickhousedemo.entity.click;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
    * 会员活动表
    */
@Data
public class DwdActDimMemberActivityC {
    /**
    * 活动主键
    */
    private Integer id;

    /**
    * 活动名称
    */
    private String activetyName;

    /**
    * 活动状态：0代表取消，1代表有效，2代表终止
    */
    private Integer status;

    /**
    * 是否可以取消：0代表可以取消，2代表不可以取消
    */
    private Integer canCancel;

    /**
    * 删除标识：0代表未删除，1代表删除
    */
    private Integer delFlag;

    /**
    * 选框类型：0代表是公司选框，1是自定义选框
    */
    private Integer activityType;

    /**
    * 员工部门编号
    */
    private Integer departId;

    /**
    * 角色类型：1代表总监，2代表经理，3代表员工
    */
    private Integer roleType;

    /**
    * 开始时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
    * 结束时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
    * 创建时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cteateTime;

    /**
    * 修改时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
    * 操作类型：insert、update、delete
    */
    private String opType;
}