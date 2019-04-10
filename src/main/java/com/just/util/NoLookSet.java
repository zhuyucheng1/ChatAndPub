package com.just.util;

import com.just.bean.Reply;
import com.just.bean.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/3
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Component
public class NoLookSet extends HashSet<Reply> {
    public List<Reply> getReply(Integer id){
        List<Reply> replies = new ArrayList<>();
        for(Reply reply:this){
            if(reply.getRepStuId() == id){
                replies.add(reply);
            }
        }
        return replies;
    }
}
