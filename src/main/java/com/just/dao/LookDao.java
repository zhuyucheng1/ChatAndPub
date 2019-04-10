package com.just.dao;

import com.just.bean.Look;

public interface LookDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Look record);

    int insertSelective(Look record);

    Look selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Look record);

    int updateByPrimaryKey(Look record);
}