package com.just.controller;

import com.just.bean.Artical;
import com.just.bean.Question;
import com.just.bean.Student;
import com.just.service.ArticleService;
import com.just.service.QuestionService;
import com.just.service.ReplyService;
import com.just.service.WxUploadService;
import com.just.util.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/1
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
public class ArticleController {
    @Autowired
    WxUploadService wxUploadService;
    @Autowired
    ArticleService articleService;
    @Autowired
    MyCache myCache;
    @Autowired
    ReplyService replyService;
    @Autowired
    QuestionService questionService;

    /**
     * @return com.yayin.tool.Response
     * @Author zhuyucheng
     * @Description 上传文件
     * @Date 10:51 2019/2/25
     * @Email zhuyucheng@jsaepay.com
     * @Param [multipartFile]
     **/
    @RequestMapping("/uploadFile")
    public Response upLoadFile(@RequestParam("upfile") MultipartFile multipartFile) throws IOException {
        Response response = Response.newResponse();
        String path = wxUploadService.upLoadToSelfPath(multipartFile);
        response.setData(path);
        return response;
    }

    @RequestMapping("publish")
    public Response publish(@RequestBody ParamMap paramMap, HttpServletRequest request){
        Response response = Response.newResponse();
        Student student =myCache.getLoginUser(GetSessionId.getSessionId(request));
        paramMap.put("authorId", student.getId());
        paramMap.put("authorName",student.getName());
        System.out.println(student.getId());
        String content = paramMap.getString("content");
        UseDemo u = new UseDemo();
        List<Score> scores = u.fenci(content);
        String str = "";
        for(int i = 0;i<scores.size();i++){
            if(i<20){
                str+= scores.get(i).getKey()+",";
            }
        }
        paramMap.put("tags",str);
        articleService.insert(paramMap);
        return response;
    }
    @RequestMapping("getArticles")
    public Response getArticles( @RequestBody ParamMap paramMap){
        Response response = Response.newResponse();
        paramMap.setPages(paramMap.getPageIndex(),paramMap.getPageSize());
        List<Artical> articals = articleService.getAll(paramMap);
        response.setData(articleService.getAll(paramMap));
        return response;
    }
    @RequestMapping("getSee")
    public Response getSee(Integer id){
        Response response = Response.newResponse();
        ParamMap paramMap = ParamMap.newMap();
        paramMap.put("read",1);
        paramMap.put("id",id);
        articleService.getSee(paramMap);
        paramMap.put("repId",id);
        paramMap.put("type",1);
        response.setData(replyService.getListByRepId(paramMap));
        return response;
    }
    @RequestMapping("like")
    public void like(Integer id){
        ParamMap paramMap = ParamMap.newMap();
        paramMap.put("like",1);
        paramMap.put("id",id);
        articleService.getSee(paramMap);
    }

    /**
    * @return com.just.util.Response
    * @Author zhuyucheng
    * @Description 根据id获取文章或者问题
    * @Date 15:34 2019/4/13
    * @Email zhuyucheng@jsaepay.com
    * @Param []
    **/
    @RequestMapping("getRep")
    public Response getArticleBuId(@RequestBody ParamMap paramMap){
        Response response = Response.newResponse();
        int type = paramMap.getInt("type");
        if(type == 1){
            response.setData(articleService.getById(paramMap.getInt("id")));
            return response;
        }else{
            response.setData(questionService.getById(paramMap.getInt("id")));
            return response;
        }
    }

    @RequestMapping("getArticlesByUser")
    public Response getArticlesByUser(@RequestBody ParamMap paramMap, HttpServletRequest request){
        Student student = myCache.getLoginUser(GetSessionId.getSessionId(request));
        paramMap.setPages(paramMap.getPageIndex(),paramMap.getPageSize());
        Response response = Response.newResponse();
        paramMap.add("userId",student.getId());
        response.setData(articleService.getAll(paramMap));
        return response;
    }

    @RequestMapping("deleteArticle/{id}")
    public void deleteArticle ( @PathVariable("id") Integer id){
        articleService.delete(id);
    }

    @RequestMapping("getTop5")
    public Response getTop5(){
        ParamMap paramMap = ParamMap.newMap();
        paramMap.add("reply",1);
        paramMap.setPages(0,5);
       return Response.newResponse().setData(articleService.getAll(paramMap)) ;
    }

    @RequestMapping("getNew")
    public Response getNew(){
        ParamMap paramMap = ParamMap.newMap();
        paramMap.add("newlest",1);
        paramMap.setPages(0,5);
        return Response.newResponse().setData(articleService.getAll(paramMap)) ;
    }
    @RequestMapping("getRead")
    public Response getRead(){
        ParamMap paramMap = ParamMap.newMap();
        paramMap.add("look",1);
        paramMap.setPages(0,3);
        return Response.newResponse().setData(articleService.getAll(paramMap)) ;
    }
}
