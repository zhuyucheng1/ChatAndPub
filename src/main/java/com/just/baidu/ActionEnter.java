//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.just.baidu;

import com.alibaba.fastjson.JSONObject;
import com.baidu.ueditor.define.ActionMap;
import com.baidu.ueditor.define.BaseState;
import com.baidu.ueditor.define.State;
import com.baidu.ueditor.hunter.FileManager;
import com.baidu.ueditor.hunter.ImageHunter;
import com.baidu.ueditor.upload.Uploader;
import com.just.fastdfs.FastDFSClient;
import com.just.fastdfs.FastDFSFile;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ActionEnter {
    private HttpServletRequest request = null;
    private String rootPath = null;
    private String contextPath = null;
    private String actionType = null;
    private ConfigManager configManager;
    private MultipartFile multipartFile;

    public ActionEnter(HttpServletRequest request, String rootPath, MultipartFile multipartFile) {

        this.request = request;
        this.rootPath = rootPath;
        this.actionType = request.getParameter("action");
        this.contextPath = request.getContextPath();
        this.configManager = ConfigManager.getInstance(this.rootPath, this.contextPath, request.getRequestURI());
//        System.out.println(this.configManager);
    }

    public String exec() {
        String callbackName = this.request.getParameter("callback");
        if (callbackName != null) {
            return !this.validCallbackName(callbackName) ? (new BaseState(false, 401)).toJSONString() : callbackName + "(" + this.invoke() + ");";
        } else {
            return this.invoke();
        }
    }

    public String invoke() {
        if (this.actionType != null && ActionMap.mapping.containsKey(this.actionType)) {
            if (this.configManager != null && this.configManager.valid()) {
                State state = null;
                int actionCode = ActionMap.getType(this.actionType);
                Map<String, Object> conf = null;
                switch ( actionCode ) {
                    //读取配置文件时的请求处理
                    case ActionMap.CONFIG:
                        return this.configManager.getAllConfig().toString();
                    //上传图片、视频、文件时的处理
                    case ActionMap.UPLOAD_IMAGE:
                        return this.getPath();
                    case ActionMap.UPLOAD_SCRAWL:
                    case ActionMap.UPLOAD_VIDEO:
                        return this.getPath();
                    case ActionMap.UPLOAD_FILE:
                        conf = this.configManager.getConfig( actionCode );
                        state = new Uploader( request, conf).doExec();
                        break;
                    //抓取远程图片时的处理方式，此处也可以关闭

                    //当从网页上复制内容到编辑器中，如果图片与该域名不同源，则会自动抓到本地的服务器保存
                    case ActionMap.CATCH_IMAGE:
                        conf = configManager.getConfig( actionCode );
                        String[] list = this.request.getParameterValues( (String)conf.get( "fieldName" ) );
                        state = new ImageHunter( conf ).capture( list );
                        break;
                    //上传多文件时的文件在线管理
                    case ActionMap.LIST_IMAGE:
                    case ActionMap.LIST_FILE:
                        conf = configManager.getConfig( actionCode );
                        int start = this.getStartIndex();
                        state = new FileManager( conf ).listFile( start );
                        break;

                }
                return state.toJSONString();
            } else {
                return (new BaseState(false, 102)).toJSONString();
            }
        } else {
            return (new BaseState(false, 101)).toJSONString();
        }
    }

    public int getStartIndex() {
        String start = this.request.getParameter("start");

        try {
            return Integer.parseInt(start);
        } catch (Exception var3) {
            return 0;
        }
    }

    public boolean validCallbackName(String name) {
        return name.matches("^[a-zA-Z_]+[\\w0-9_]*$");
    }

    public String getPath(){

        Collection<Part> parts = null;
        try {
            parts = request.getParts();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        for (Iterator<Part> iterator = parts.iterator(); iterator.hasNext();) {

            Part part = iterator.next();
            if(part.getName().equals("upfile")){
                try {
                    multipartFile = new MockMultipartFile("upfile",part.getSubmittedFileName(),part.getContentType(),part.getInputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String webPathPic = null;
        try {
            String fileName=multipartFile.getOriginalFilename();
            String ext = fileName.substring(multipartFile.getOriginalFilename().lastIndexOf(".")+1);
            byte[] file_buff = null;
            InputStream inputStream=multipartFile.getInputStream();
            if(inputStream != null){
                int len1 = inputStream.available();
                file_buff = new byte[len1];
                inputStream.read(file_buff);
            }
            inputStream.close();
            FastDFSFile file = new FastDFSFile(file_buff, fileName, ext);
            webPathPic = FastDFSClient.upload(file,null);
            String result = "{'state':'success','src':'"+webPathPic+"'}";
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.toString();
           // response.put("webPathPic",webPathPic);
        }catch (Exception e){
            e.printStackTrace();
        }
       // logger.info("The pic webpath:" + webPathPic);
        return null;
    }
}
