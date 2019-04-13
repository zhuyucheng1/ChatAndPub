//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.just.baidu;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.just.util.LogUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;


public final class ConfigManager1 {
    private final String rootPath;
//    private final String originalPath;
    private final String contextPath;
    private static final String configFileName = "config.json";
    private String parentPath = null;
    private JSONObject jsonConfig = null;
    private static final String SCRAWL_FILE_NAME = "scrawl";
    private static final String REMOTE_FILE_NAME = "remote";

    private ConfigManager1(String rootPath, String contextPath, String uri) throws FileNotFoundException, IOException {
        rootPath = rootPath.replace("\\", "/");
        this.rootPath = rootPath;
        this.contextPath = contextPath;
//        if (contextPath.length() > 0) {
//            this.originalPath = this.rootPath + uri.substring(contextPath.length());
//        } else {
//            this.originalPath = this.rootPath + uri;
//        }

//        LogUtils.warn("呵呵哒老子在这");
//        this.originalPath = ConfigManager1.class.getResource("").getPath().substring(0,ConfigManager1.class.getResource("").getPath().indexOf("targ"))+"src/main/resources/"+configFileName;
//        System.out.println(this.originalPath);
        this.initEnv();
    }

    public static ConfigManager1 getInstance(String rootPath, String contextPath, String uri) {
        try {
//            LogUtils.warn("我在构造函数c");
            return new ConfigManager1(rootPath, contextPath, uri);
        } catch (Exception var4) {
            return null;
        }
    }

    public boolean valid() {
        return this.jsonConfig != null;
    }

    public JSONObject getAllConfig() {
        return this.jsonConfig;
    }

    public Map<String, Object> getConfig(int type) {
        Map<String, Object> conf = new HashMap();
        String savePath = null;
        switch(type) {
            case 1:
                conf.put("isBase64", "false");
                conf.put("maxSize", this.jsonConfig.getLong("imageMaxSize"));
                conf.put("allowFiles", this.getArray("imageAllowFiles"));
                conf.put("fieldName", this.jsonConfig.getString("imageFieldName"));
                savePath = this.jsonConfig.getString("imagePathFormat");
                break;
            case 2:
                conf.put("filename", "scrawl");
                conf.put("maxSize", this.jsonConfig.getLong("scrawlMaxSize"));
                conf.put("fieldName", this.jsonConfig.getString("scrawlFieldName"));
                conf.put("isBase64", "true");
                savePath = this.jsonConfig.getString("scrawlPathFormat");
                break;
            case 3:
                conf.put("maxSize", this.jsonConfig.getLong("videoMaxSize"));
                conf.put("allowFiles", this.getArray("videoAllowFiles"));
                conf.put("fieldName", this.jsonConfig.getString("videoFieldName"));
                savePath = this.jsonConfig.getString("videoPathFormat");
                break;
            case 4:
                conf.put("isBase64", "false");
                conf.put("maxSize", this.jsonConfig.getLong("fileMaxSize"));
                conf.put("allowFiles", this.getArray("fileAllowFiles"));
                conf.put("fieldName", this.jsonConfig.getString("fileFieldName"));
                savePath = this.jsonConfig.getString("filePathFormat");
                break;
            case 5:
                conf.put("filename", "remote");
                conf.put("filter", this.getArray("catcherLocalDomain"));
                conf.put("maxSize", this.jsonConfig.getLong("catcherMaxSize"));
                conf.put("allowFiles", this.getArray("catcherAllowFiles"));
                conf.put("fieldName", this.jsonConfig.getString("catcherFieldName") + "[]");
                savePath = this.jsonConfig.getString("catcherPathFormat");
                break;
            case 6:
                conf.put("allowFiles", this.getArray("fileManagerAllowFiles"));
                conf.put("dir", this.jsonConfig.getString("fileManagerListPath"));
                conf.put("count", this.jsonConfig.getIntValue("fileManagerListSize"));
                break;
            case 7:
                conf.put("allowFiles", this.getArray("imageManagerAllowFiles"));
                conf.put("dir", this.jsonConfig.getString("imageManagerListPath"));
                conf.put("count", this.jsonConfig.getIntValue("imageManagerListSize"));
        }

        conf.put("savePath", savePath);
        conf.put("rootPath", this.rootPath);
        return conf;
    }

    /***
    * @return void
    * @Author zhuyucheng
    * @Description 获取config.json
    * @Date 13:46 2019/3/6
    * @Email zhuyucheng@jsaepay.com
    * @Param []
    **/
    private void initEnv() throws FileNotFoundException, IOException {
//        File file = new File(this.originalPath);
//        LogUtils.warn("老子开始读啦");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL("http://118.25.59.30:9091/config.json");
//            File file = ResourceUtils.getFile();
//            String url = "http://118.25.59.30:9091/fenciku.txt";
            URLConnection conn = url.openConnection();
            InputStream stream =  conn.getInputStream();
//            ClassPathResource classPathResource = new ClassPathResource("config.json");
////            InputStream stream = classPathResource.getInputStream();
////            InputStream stream = getClass().getClassLoader().getResourceAsStream(configFileName);
//            InputStream stream = this.getClass().getResourceAsStream("/config.json");
            String path = ConfigManager1.class.getResource("").getPath();
            LogUtils.error(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            String line;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//        LogUtils.info("xxxooooo");
//        LogUtils.info(stringBuffer);
        String configContent = filter(stringBuffer.toString());
        LogUtils.info(configContent);
//        LogUtils.error(configContent);
        try {
            JSONObject jsonConfig = JSONObject.parseObject(configContent);
            this.jsonConfig = jsonConfig;
        } catch (Exception var4) {
            this.jsonConfig = null;
        }

    }



        private InputStream getConfigPath() {

            //获取config.json的输入流
            return this.getClass().getClassLoader().getResourceAsStream("config.json");
        }


    private String[] getArray(String key) {
        JSONArray jsonArray = this.jsonConfig.getJSONArray(key);
        String[] result = new String[jsonArray.size()];
        int i = 0;

        for(int len = jsonArray.size(); i < len; ++i) {
            result[i] = jsonArray.getString(i);
        }

        return result;
    }

    private String readFile(InputStream in) throws IOException {

        StringBuilder builder = new StringBuilder();

        try {

            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader bfReader = new BufferedReader(reader);

            String tmpContent = null;

            while ((tmpContent = bfReader.readLine()) != null) {
                builder.append(tmpContent);
            }

            bfReader.close();

        } catch (UnsupportedEncodingException e) {
            // 忽略
        }

        return this.filter(builder.toString());

    }

        private String filter(String input) {
        return input.replaceAll("/\\*[\\s\\S]*?\\*/", "");
    }
}
