package com.just.controller;/**
 * Created by zyc on 2019/3/16.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 朱玉成
 * @Date by 2019/3/16
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class MyTestController {
    @RequestMapping("/1")
    public String test(){
        return "我能进来";
    }
}
