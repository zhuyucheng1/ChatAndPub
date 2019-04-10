package com.just.dao;

import com.just.bean.Reply;
import com.just.util.ParamMap;

import java.util.List;

public interface ReplyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ParamMap record);

    int insertSelective(ParamMap record);

    Reply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKeyWithBLOBs(Reply record);

    int updateByPrimaryKey(Reply record);

    List<Reply> getListByReplyId(ParamMap paramMap);
    List<Reply> getListByNotRead();

    void updatLook(Integer id);
}