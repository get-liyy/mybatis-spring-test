package com.liyy.mybatis.test;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
//import com.myc.param.Tool;
//
//import android.content.Context;
//import android.os.Handler;
//import android.os.Message;

/**
 * @ClassName: ApolloTest 
 * @Description: 
 * @author: liyanyong
 * @date: 2018年1月9日 上午9:49:53
 */
public class ApolloTest {
/*
	public static void main(String[] args) {

	}

	*//**连接访问者id，不能重复*//*
	private String clientId;
	*//**默认连接路径*//*
	private String host = "tcp://192.168.1.130:61613";
	*//**MQTT访问默认用户名*//*
	private String userName = "admin";
	*//**MQTT访问默密码*//*
	private String passWord = "password";
	*//**发送的订阅号集合*//*
	private String[] publishTopics = { "test" };
	*//**订阅者的订阅号集合*//*
	private String[] subTopics = { "test" };
	*//**消息发送时的消息模式集合*//*
	private int[] publishQos = { 2 };
	*//**消息订阅式的消息模式集合*//*
	private int[] subQos = { 2 };
	*//**单次MQTT连接*//*
	private MqttClient client;
	*//**连接时的一些额外设置*//*
	private MqttConnectOptions options;
	*//**发送消息是的个体topic*//*
	private MqttTopic topic;

	*//**消息传递hander*//*
	private Handler mHandler;

	public ApolloTest(Context context, final Handler handler) {
		clientId = Tool.getIdentifyNumber(context);
		if (client == null || !client.isConnected()) {
			try {
				// 设置连接指定的额ip，连接人
				client = new MqttClient(host, clientId, new MemoryPersistence());
				// 开始设置连接时的参数
				options = new MqttConnectOptions();
				// 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，这里设置为true表示每次连接到服务器都以新的身份连接
				options.setCleanSession(true);
				// 设置连接用户名
				options.setUserName(userName);
				// 设置连接密码
				options.setPassword(passWord.toCharArray());
				// 设置超时连接
				options.setConnectionTimeout(10);
				// 设置心跳间隔
				options.setKeepAliveInterval(20);
				// 设置当连接断开时发送的死亡预告，当这句被接受到时 证明本连接断开
				// options.setWill(publishTopic,
				// (clientId+"destroy").getBytes(), 0, true);
				// 连接回调函数
				client.setCallback(new MqttCallback() {
					@Override
					public void messageArrived(String topicName, MqttMessage message) throws Exception {
						Message msg = new Message();
						msg.what = 1;
						msg.obj = message.toString();
						handler.sendMessage(msg);
					}

					@Override
					public void deliveryComplete(IMqttDeliveryToken token) {
						// TODO Auto-generated method stub

					}

					@Override
					public void connectionLost(Throwable cause) {
						// TODO Auto-generated method stub

					}
				});
				client.connect(options);
				client.subscribe(subTopics, subQos);
			} catch (MqttException e) {
				e.printStackTrace();
			}
		}
	}

	*//**
	 * 发送消息
	 * @param msg
	 *//*
	public void sendMessage(String msg) {
		if (client != null && client.isConnected()) {
			System.out.println("MQTT发送消息了呀 " + msg);
			try {
				MqttMessage message = new MqttMessage();
				// 设置消息传输的类型 0,1,2可选
				message.setQos(2);
				// 设置是否在服务器中保存消息体
				message.setRetained(false);
				// 设置消息的内容
				message.setPayload(msg.getBytes());
				// 循环发送，因为一次只能一个
				for (String publishTopic : publishTopics) {
					topic = client.getTopic(publishTopic);
					MqttDeliveryToken token = topic.publish(message);
					token.waitForCompletion();
				}
			} catch (MqttPersistenceException e) {
				e.printStackTrace();
			} catch (MqttException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

	*//**
	 * @Title: getClient 
	 * @Description: 获取连接
	 * @author: liyanyong 
	 * @param: @return
	 * @return: MqttClient 
	 * @throws
	 *//*
	public MqttClient getClient() {
		return client;
	}

	*//**
	 * @Title: disConnect 
	 * @Description: 断开连接
	 * @author: liyanyong 
	 * @param: 
	 * @return: void 
	 * @throws
	 *//*
	public void disConnect() {
		try {
			if (client.isConnected()) {
				client.disconnect();
			}
		} catch (MqttException e) {
			e.printStackTrace();
		}
	}

	*//**
	 * @Title: connect 
	 * @Description: 重新连接
	 * @author: liyanyong 
	 * @param: @return
	 * @return: boolean 
	 * @throws
	 *//*
	public boolean connect() {
		try {
			if (client != null && client.isConnected()) {
				client.disconnect();
				client.connect(options);
			} else {
				client.connect(options);
			}
			return true;
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
	}

	*//**
	 * @Title: reConnect 
	 * @Description: 重新连接
	 * @author: liyanyong 
	 * @param: @return
	 * @return: boolean 
	 * @throws
	 *//*
	public boolean reConnect() {
		try {
			if (client.isConnected()) {
				client.disconnect();
				client.connect(options);
			} else {
				client.connect(options);
			}
			return true;
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
	}

	*//**
	 * @Title: closeConnect 
	 * @Description: 关闭连接并释放所有资源
	 * @author: liyanyong 
	 * @param: @return
	 * @return: boolean 
	 * @throws
	 *//*
	public boolean closeConnect() {
		try {
			if (client.isConnected()) {
				client.disconnect();
				client.close();
			} else {
				client.close();
			}
			return true;
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
	}

	*//**
	 * @Title: subScribe 
	 * @Description: 订阅订阅号
	 * @author: liyanyong 
	 * @param: @return
	 * @return: boolean 
	 * @throws
	 *//*
	public boolean subScribe() {
		try {
			client.subscribe(subTopics, subQos);
			return true;
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
	}

	*//**
	 * @Title: unSubScribe 
	 * @Description: 退订订阅号
	 * @author: liyanyong 
	 * @param: @return
	 * @return: boolean 
	 * @throws
	 *//*
	public boolean unSubScribe() {
		try {
			client.unsubscribe(subTopics);
			return true;
		} catch (MqttException e) {
			e.printStackTrace();
			return false;
		}
	}*/
}
