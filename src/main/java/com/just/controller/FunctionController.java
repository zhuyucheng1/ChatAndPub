package com.just.controller;

import com.just.service.FunctionService;
import com.just.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
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
public class FunctionController {
    @Autowired
    FunctionService functionService;
    @RequestMapping("getFunctions")
    public Response getFunctions(Integer id){
        Response response = Response.newResponse();
        response.setData(functionService.getFunctionByUserId(id));
        return response;
    }

}
