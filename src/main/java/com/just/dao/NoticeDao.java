package com.just.dao;

import com.just.bean.Notice;
import com.just.util.ParamMap;

import java.util.List;

public interface NoticeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> getAllNotice(ParamMap paramMap);
}