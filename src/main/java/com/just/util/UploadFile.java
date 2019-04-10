package com.just.util;

import com.alibaba.fastjson.JSONObject;
import com.just.fastdfs.FastDFSClient;
import com.just.fastdfs.FastDFSFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @Author 朱玉成
 * @Date by 2019/3/27
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description: 上传文件
 */
public class UploadFile {
    public static  String getWebPath(MultipartFile multipartFile){
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
