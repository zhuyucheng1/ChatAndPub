package com.just.dao;

import com.just.bean.Function;

import java.util.List;

public interface FunctionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    List<Function> getFunctionByUserId(Integer id);
}