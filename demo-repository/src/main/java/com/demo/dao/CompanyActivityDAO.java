package com.demo.dao;

import com.demo.common.mybatis.MybatisBaseMapper;
import com.demo.entity.CompanyActivity;
import com.demo.entity.CompanyActivityExample;
import org.apache.ibatis.annotations.Mapper;

public interface CompanyActivityDAO extends MybatisBaseMapper<Integer, CompanyActivity, CompanyActivityExample> {
}