package com.just.controller;

import com.just.bean.Reply;
import com.just.service.ReplyService;
import com.just.util.NoLookSet;
import com.just.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @Author 朱玉成
 * @Date by 2019/4/3
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Component
public class SaticScheduleTask {
//    RestTemplate restTemplate = new RestTemplate();
    @Autowired
    ReplyService replyService;
    @Autowired
    NoLookSet noLookSet;
    //3.添加定时任务
    @Scheduled(cron = "0/4 * * * * ?")
    //或直接指定时间间隔，例如：5秒
//    @Scheduled(fixedRate=4000)
    private void configureTasks() {
        List<Reply> replies =  replyService.getListByNotRead();
        noLookSet.clear();
        for(Reply reply :replies){

            noLookSet.add(reply);
        }
    }
}
