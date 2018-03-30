package com.liyy.mybatis.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @ClassName: MessageConsumer 
 * @Description: 消费接收
 * @author: liyanyong
 * @date: 2018年3月29日 下午4:28:22
 */
public class MessageConsumer implements MessageListener {
	private final static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	
	@Override
	public void onMessage(Message message) {
//		byte[] byt = message.getBody();
		logger.info("receive message:{}", message);
	}
}
