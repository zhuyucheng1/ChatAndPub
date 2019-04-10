package com.just.service;

import com.just.bean.Artical;
import com.just.dao.ArticalDao;
import com.just.util.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/1
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class ArticleService {
    @Autowired
    ArticalDao articalDao;
    public void insert(ParamMap paramMap){
        articalDao.insertSelective(paramMap);
    }

    public List<Artical> getAll(ParamMap paramMap){
       return articalDao.getAll(paramMap);
    }

    public void getSee(ParamMap paramMap){
        articalDao.updateByPrimaryKeySelective(paramMap);
    }

    public Artical getById(Integer id){
        return articalDao.selectByPrimaryKey(id);
    }
}
