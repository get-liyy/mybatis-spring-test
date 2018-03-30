package com.liyy.mybatis.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

/** 
 * @ClassName: RAbbitmqController 
 * @Description: 测试发送
 * @author: liyanyong
 * @date: 2018年3月30日 下午1:23:45
 */
@Controller
@RequestMapping(value = "/liyy")
public class RAbbitmqController {
	
	@Autowired
	private MessageProducer messageProducer;
	
	@RequestMapping(value = "/testRAbbitmq")
	@ResponseBody
    public String testRAbbitmq(String name, Integer age) {
		messageProducer.sendMessage(JSONObject.toJSONString(new Person(name, age)));
		return "success";
    }
}
