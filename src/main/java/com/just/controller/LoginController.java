package com.just.controller;

import com.just.bean.Student;
import com.just.service.StudentService;
import com.just.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 朱玉成
 * @Date by 2019/3/27
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
public class LoginController {
    @Autowired
    MyCache myCache;
    @Autowired
    StudentService studentService;
    @RequestMapping("login")
    public Response login(@RequestBody Student student, HttpServletResponse resp){
        Response response = Response.newResponse();
        Student student1 = studentService.getStudentByAccount(student.getAccount());
        if(student1.getStatus()!=0){
            response.setCodeAndMessage(101,"该用户已经被禁用！请联系管理员！");
            response.setData("该用户已经被禁用！请联系管理员！!");
        }else{
            if(student1 != null && student1.getPassword().equals(student.getPassword())){
                response.setData(student1);
                String uuid = SysUUID.getId();
                myCache.put(uuid,student1);
                Cookie cookie = new Cookie("loginUser",uuid);
                resp.addCookie(cookie);
            }else{

                response.setCodeAndMessage(101,"账号或密码错误");
                response.setData("账号或密码错误!");
            }
        }

        return response;
    }

    @RequestMapping("getLoginUser")
    public Response getLoginUser(HttpServletRequest request){
        Response response = Response.newResponse();
        String uuid = GetSessionId.getSessionId(request);
        response.setData(myCache.getLoginUser(uuid));
        return response;
    }
    @RequestMapping("reg")
    public Response regest(@RequestBody Student student){
        Response response = Response.newResponse();
        if(studentService.getStudentByAccount(student.getAccount())!=null){
            response.setCodeAndMessage(101,"该用户已存在");
        }
        else{
            student.setHead("https://img.52z.com/upload/news/image/20180419/20180419051251_75340.jpg");
            student.setExec(0);
            student.setIsLeader(1);
            student.setPocket(0);
            student = studentService.regest(student);
            response.setData(student);
        }
        return response;
    }
}
