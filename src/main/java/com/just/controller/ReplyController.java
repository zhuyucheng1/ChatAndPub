package com.just.controller;

import com.just.bean.Question;
import com.just.bean.Reply;
import com.just.bean.Student;
import com.just.service.ArticleService;
import com.just.service.QuestionService;
import com.just.service.ReplyService;
import com.just.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/3
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
public class ReplyController {
    @Autowired
    ReplyService replyService;
    @Autowired
    MyCache myCache;
    @Autowired
    NoLookSet noLookSet;
    @Autowired
    ArticleService articleService;
    @Autowired
    QuestionService questionService;
     @RequestMapping("reply")
    public void reply(@RequestBody ParamMap paramMap, HttpServletRequest request){
         Student student = myCache.getLoginUser(GetSessionId.getSessionId(request));
         paramMap.put("stuId",student.getId());

         LogUtils.info(articleService.getById(paramMap.getInt("repId")).getAuthorId());
         if(paramMap.getInt("type") == 1){
             paramMap.put("repStuId",articleService.getById(paramMap.getInt("repId")).getAuthorId());
             paramMap.put("reply",1);
             articleService.getSee(paramMap);
         }else{
             paramMap.put("repStuId",questionService.getById(paramMap.getInt("repId")).getAutortId());
         }
         replyService.insert(paramMap);
     }

     @RequestMapping("noLook")
    public Response getNotLook(){
         List<Reply> replies =  replyService.getListByNotRead();
         noLookSet.clear();
         for(Reply reply :replies){
             if(reply.getRepStuId()!=reply.getStuId()){
                 noLookSet.add(reply);
             }
         }
         return Response.newResponse();
     }

     @RequestMapping("getNoLook")
    public Response getNoLook(HttpServletRequest request){
         Response response =Response.newResponse();
         if( myCache.getLoginUser(GetSessionId.getSessionId(request))!=null){
             Long id = myCache.getLoginUser(GetSessionId.getSessionId(request)).getId();
             response.setData(noLookSet.getReply(id.intValue()));
             if(!noLookSet.getReply(id.intValue()).isEmpty()){
                 replyService.updateLook(id.intValue());
             }
         }
         return response;
     }

     @RequestMapping("getReplys")
    public Response getReplys(@RequestBody ParamMap paramMap){
//         ParamMap paramMap = ParamMap.newMap();
//         paramMap.put("repId",id);
//         paramMap.put("type",type);
         return Response.newResponse().setData(replyService.getListByRepId(paramMap));
     }
}
