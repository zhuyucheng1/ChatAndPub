package com.just;

import com.just.util.MyCache;
import com.just.util.NoLookSet;
import com.just.util.UseDemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages ="com.just.dao")
@EnableScheduling   // 2.开启定时任务
public class ChatAndPubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatAndPubApplication.class, args);
	}

	@Bean
	public MyCache getCache(){
	    return new MyCache();
    }
	@Bean
	public NoLookSet getNoLookSet(){
		return new NoLookSet();
	}

}
