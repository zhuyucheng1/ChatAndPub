package com.just.dao;

import com.just.bean.Student;
import com.just.util.ParamMap;

import java.util.List;

public interface StudentDao {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectByAccount(String account);

    List<Student> getStudents(ParamMap paramMap);
}