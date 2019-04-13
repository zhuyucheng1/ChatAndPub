package com.just.service;

import com.just.bean.Function;
import com.just.dao.FunctionDao;
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
public class FunctionService {
    @Autowired
    FunctionDao functionDao;
    public List<Function> getFunctionByUserId(Integer id){
        return  functionDao.getFunctionByUserId(id);
    }
}
