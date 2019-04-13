package com.just.dao;

import com.just.bean.DefaultConf;

public interface DefaultConfDao {
    int deleteByPrimaryKey(Integer id);

    int insert(DefaultConf record);

    int insertSelective(DefaultConf record);

    DefaultConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DefaultConf record);

    int updateByPrimaryKey(DefaultConf record);
}