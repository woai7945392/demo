package com.demo.common.mybatis;


import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface MybatisBaseMapper<pk extends Serializable, T , E> {
    /**
     * 查询数量
     * @param example 条件对象
     */
    long countByExample(E example);

    /**
     * 根据条件删除
     * @param example 条件对象
     */
    int deleteByExample(E example);

    /**
     * 根据ID删除
     * @param id 主键ID
     */
    int deleteByPrimaryKey(pk id);

    /**
     * 添加对象所有字段
     * @param record 插入字段对象(必须含ID）
     */
    int insert(T record);

    /**
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     */
    int insertSelective(T record);

    /**
     * 根据条件查询（二进制大对象）
     * @param example 条件对象
     */
    List<T> selectByExample(E example);

    /**
     * 根据ID查询
     * @param id 主键ID
     */
    T selectByPrimaryKey(pk id);

    /**
     * 根据条件修改对应字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    /**
     * 根据条件修改所有字段
     * @param record 修改字段对象 (JOPO)
     * @param example 条件对象
     */
    int updateByExample(@Param("record") T record, @Param("example") E example);

    /**
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据ID修改所有字段(必须含ID）
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKey(T record);
}
