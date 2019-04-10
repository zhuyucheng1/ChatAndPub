package com.just.dao;

import com.just.bean.Artical;
import com.just.util.ParamMap;

import java.util.List;

public interface ArticalDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Artical record);

    int insertSelective(ParamMap record);

    Artical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParamMap record);

    int updateByPrimaryKeyWithBLOBs(Artical record);

    int updateByPrimaryKey(Artical record);

    List<Artical> getAll(ParamMap paramMap);
}