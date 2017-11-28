package com.liyy.mybatis.controller.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**  
 *  
 * @author liyanyong
 */
@Component
public class SpringTaskTest {
	/**
	 * fixedRate:固定速率执行
	 * fixedDelay:固定延迟(周期是以上一个调用任务的完成时间为基准，在上一个任务完成之后，5s后再次执行)
	 * @author liyanyong
	 */
	@Scheduled(fixedRate = 5000)
	public void test() {
//		System.out.println("定时任务执行咯咯咯咯咯咯:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}
