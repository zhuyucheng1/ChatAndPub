package com.just.controller;

import com.just.bean.Notice;
import com.just.service.NoticeService;
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
public class NoticeController {
    @Autowired
    NoticeService noticeService;
    @RequestMapping("insertNotice")
    public void insert(Notice notice){
        noticeService.insert(notice);
    }

    public void delete(Integer id){
        noticeService.delete(id);
    }

    public Response getNotices(@RequestBody ParamMap paramMap){
        Response response = Response.newResponse();
        response.setData(noticeService.getList(paramMap));
        return response;
    }
}
