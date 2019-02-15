package com.demo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class CompanyActivity {
    // 主键序号
    private Integer id;

    // 活动编号
    private String activityCode;

    // 活动名称
    private String activityName;

    // 活动类型
    private Byte activityType;

    // 活动开始日期
    private Date activityBeginDate;

    // 活动结束日期
    private Date activityEndDate;

    // 报名开始时间
    private Date enteredBeginDate;

    // 报名结束时间
    private Date enteredEndDate;

    // 活动地点
    private String activityPlace;

    // 出发城市
    private String departureCity;

    // 活动议题
    private String activityIssues;

    // 邀请函图片路径
    private String invitationPath;

    // 发布人员
    private String activityPublishers;

    // 活动状态 0:关闭（DEFAULT）；1：启用  默认：0
    private Byte activityStatus;

    // 创建时间
    private Date createAt;

    // 创建人
    private String createBy;

    // 更新人
    private String updateBy;

    // 更新时间
    private Date updateAt;

    // 删除标记：1-未删除，2-删除  默认：1
    private Byte deleteFlag;

    // 删除时间
    private Date deleteAt;

    // 删除人
    private String deleteBy;

}