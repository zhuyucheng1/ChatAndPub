package com.just.controller;

import com.just.bean.Student;
import com.just.service.StudentService;
import com.just.util.ParamMap;
import com.just.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 朱玉成
 * @Date by 2019/4/13
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("getStudents")
    public Response getStudents(@RequestBody ParamMap paramMap){
        Response response = Response.newResponse();
        response.setData(studentService.getStudents(paramMap));
        return  response;
    }


    @RequestMapping("updatStudent")
    public Response updatStudent(Student s1){
        Response response = Response.newResponse();
//        response.setData()
        studentService.Update(s1);
        return  response;
    }

    @RequestMapping("resetPassword")
    public Response resetPassword(Long id){
        Response response = Response.newResponse();
        Student student = new Student();
        student.setId(id);
        student.setPassword("111111");
//        response.setData()
        studentService.Update(student);
        return  response;
    }

}
