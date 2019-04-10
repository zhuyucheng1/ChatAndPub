package com.just.util;

/**
 * @ProjectName: Enterprise-WeChat
 * @Package: com.yayin.tool
 * @ClassName: StringUtil
 * @Author: fangchao
 * @Email: 1337710567@qq.com
 * @Description:处理字符串工具类
 * @Date: 2019/1/9 4:05 PM
 * @Version: 1.0
 */
public class StringUtil {

    /**
     * 判断字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str)
    {
        if (str != null && !"".equals(str))
        {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str)
    {
        if (str != null && !"".equals(str))
        {
            return false;
        }
        return true;
    }

    /**
     * 判断是否为空
     */
    public static boolean isEmpty(Object... obj) {
        if(obj == null)
            return true;
        for(Object object : obj) {
            if (object == null)
                return true;
            if (object.toString().trim().length() == 0)
                return true;
        }

        return false;
    }



    /**
     * 是否空,或者为空串,或者为"null"
     */
    public static boolean isBlankEmpty(Object... objs) {
        if (objs == null || objs.length == 0)
            return true;
        for (Object obj : objs) {
            if (isBlankEmpty(obj)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 字符串转大写
     * @param str
     * @return
     */
    public static String toUpper(String str)
    {
        return str.toUpperCase();
    }

    /**
     * 字符串转小写
     * @param str
     * @return
     */
    public static String toLower(String str)
    {
        return str.toLowerCase();
    }

    public static String subString(String str, int startIdx, int endIdx)
    {

        if (str == null)
        {
            return null;
        }
        else
        {
            if (endIdx < 0)
            {
                endIdx += str.length();
            }

            if (startIdx < 0)
            {
                startIdx += str.length();
            }

            if (endIdx > str.length())
            {
                endIdx = str.length();
            }

            if (startIdx > endIdx)
            {
                return "";
            }
            else
            {
                if (startIdx < 0)
                {
                    startIdx = 0;
                }

                if (endIdx < 0)
                {
                    endIdx = 0;
                }

                return str.substring(startIdx, endIdx);
            }
        }

    }

    public static boolean isEmptyObject(Object... obj) {
        if(obj == null)
            return true;
        for(Object object : obj) {
            if (object == null)
                return true;
            if (object.toString().trim().length() == 0)
                return true;
        }

        return false;
    }

    public static boolean isBlank(String pattern) {
        return isBlankEmpty(pattern);
    }

    public static boolean isBlankEmpty(Object obj) {
        if (obj == null || "".equals(obj) || "".equals(obj.toString().trim()) || "null".equalsIgnoreCase(obj.toString()))
            return true;

        return false;
    }
}
