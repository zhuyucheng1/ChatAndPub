package com.just.controller;


import com.just.baidu.ActionEnter1;
import com.just.util.LogUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @Author 朱玉成
 * @Date by 2019/2/12
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
@CrossOrigin
@RequestMapping("/web/ueditor")
public class UeditorController   {
    /**
     * 上传图片配置
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    @RequestMapping(value = "/exec")
     @ResponseBody
     public String exec(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("gbk");
        String rootPath = "src/main/resources/";
//        System.out.println("我进来了");
        ActionEnter1 actionEnter1 = new ActionEnter1( request, rootPath,null);
        LogUtils.warn(actionEnter1);
        String json = actionEnter1.exec();
        LogUtils.warn(json);
        return json;
    }

}
