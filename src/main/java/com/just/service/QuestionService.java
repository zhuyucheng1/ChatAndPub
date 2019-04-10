package com.just.service;

import com.just.bean.Question;
import com.just.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 朱玉成
 * @Date by 2019/4/3
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public Question getById(Integer id){
        return questionDao.selectByPrimaryKey(id);
    }
}
