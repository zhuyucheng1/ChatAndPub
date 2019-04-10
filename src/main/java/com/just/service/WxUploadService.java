package com.just.service;


import com.just.fastdfs.FastDFSClient;
import com.just.fastdfs.FastDFSFile;
import com.just.util.ParamMap;
import com.just.util.Response;
import com.just.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;

/**
 * @Author 朱玉成
 * @Date by 2019/2/14
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class WxUploadService {

    public String upLoadToSelfPath(MultipartFile multipartFile){
        String webPathPic="";
        if (StringUtil.isEmptyObject(multipartFile,multipartFile.getOriginalFilename()))
            return "";

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
            if (StringUtil.isEmpty(webPathPic))
                return "";
        }catch (Exception e){
            e.printStackTrace();
        }
        return  webPathPic;

    }
}
