package com.just.util;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import com.just.bean.Student;
import org.springframework.stereotype.Component;

@Component
public class MyCache extends HashMap<String, Student>{
	@Override
	public void clear() {
		for (Iterator<Entry<String, Student>> it = this.entrySet().iterator(); it.hasNext();){
		    Entry<String, Student> item = it.next();
		    if((new Date().getTime()-item.getValue().getCreateTime().getTime())>=(1000*60*30)){
		    	it.remove();
		    }
		}
	}
	public Student getLoginUser(String key){
		if(this.get(key) != null){
			updateTime(key);
			return this.get(key);
		}
		return null;
	}
	public void updateTime(String key){
		this.get(key).setCreateTime(new Date());
	}

}
