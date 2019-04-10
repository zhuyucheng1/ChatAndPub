package com.just.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author 朱玉成
 * @Date by 2019/3/27
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
public class GetSessionId {
    public static  String getSessionId(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie :cookies){
                if(cookie.getName().equals("loginUser")){
                    return cookie.getValue();
                }
            }
        }

        return null;
    }
}
