package com.just.dao;

import com.just.bean.StuFunction;

public interface StuFunctionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(StuFunction record);

    int insertSelective(StuFunction record);

    StuFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StuFunction record);

    int updateByPrimaryKey(StuFunction record);
}