package com.just.service;

import com.just.bean.Notice;
import com.just.dao.NoticeDao;
import com.just.util.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 朱玉成
 * @Date by 2019/4/13
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
@Service
public class NoticeService {
    @Autowired
    NoticeDao noticeDao;

    public void delete(Integer id){
        noticeDao.deleteByPrimaryKey(id);
    }

    public void insert(Notice notice){
        noticeDao.insert(notice);
    }

    public List<Notice> getList(ParamMap p){
        p.setPages(p.getPageIndex(),p.getPageSize());
        return  noticeDao.getAllNotice(p);
    }

}
