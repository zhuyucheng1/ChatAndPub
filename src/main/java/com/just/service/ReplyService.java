package com.just.service;

import com.just.bean.Reply;
import com.just.dao.ArticalDao;
import com.just.dao.ReplyDao;
import com.just.util.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/3
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class ReplyService {
    @Autowired
    ReplyDao replyDao;
    @Autowired
    ArticalDao articalDao;

    public void insert(ParamMap paramMap){
        replyDao.insertSelective(paramMap);
    }
    public void delete(Integer id){
        replyDao.deleteByPrimaryKey(id);
    }
    public List<Reply> getListByRepId(ParamMap paramMap){

        List<Reply> replies = replyDao.getListByReplyId(paramMap);

            paramMap.add("id",paramMap.getInt("repId"));
            paramMap.add("read",1);
            articalDao.updateByPrimaryKeySelective(paramMap);


        return  replies;
    }
    public List<Reply> getListByNotRead(){
        return replyDao.getListByNotRead();
    }
    public void updateLook(Integer id){
        replyDao.updatLook(id);
    }
}
