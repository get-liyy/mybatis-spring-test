package com.liyy.mybatis.controller.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SpringTaskTest 
 * @Description: 定时任务
 * @author: liyanyong
 * @date: 2017年11月29日 上午11:11:43
 */
@Component
public class SpringTaskTest {
	private final static Logger logger = LoggerFactory.getLogger(SpringTaskTest.class);
	/**
	 * fixedRate:固定速率执行
	 * fixedDelay:固定延迟(周期是以上一个调用任务的完成时间为基准，在上一个任务完成之后，5s后再次执行)
	 * @author liyanyong
	 */
	@Scheduled(fixedRate = 5000)
	public void test() {
		String str = "定时任务执行咯咯咯咯咯咯:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date());
//		System.out.println(str);
//		logger.info("INFO---"+str);
//		logger.error("ERROR---"+str);
//		logger.debug("DEBUG---"+str);
	}
}
