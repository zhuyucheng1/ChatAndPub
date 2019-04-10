package com.just.service;

import com.just.bean.Student;
import com.just.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 朱玉成
 * @Date by 2019/3/27
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student getStudentByAccount(String account){
        return studentDao.selectByAccount(account);
    }

    public Student regest(Student student){
        studentDao.insertSelective(student);
        return studentDao.selectByAccount(student.getAccount());
    }
}
