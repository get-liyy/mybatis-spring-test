package com.liyy.mybatis.rabbitmq;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MessageProducer 
 * @Description: 消息产生,提交到队列中去
 * @author: liyanyong
 * @date: 2018年3月29日 下午4:20:03
 */
@Service
public class MessageProducer {
	private final static Logger logger = LoggerFactory.getLogger(MessageProducer.class);

	@Resource
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Object message) {
		logger.info("to send message:{}", message);
		amqpTemplate.convertAndSend("queueTestKey", message);
	}
}
