package com.liyy.mybatis.activemq;

/**
 * @ClassName: TestConsumer 
 * @Description: 消费者开始消费消息
 * @author: liyanyong
 * @date: 2018年3月28日 上午11:28:36
 */
public class TestConsumer {
	public static void main(String[] args){
        Comsumer comsumer = new Comsumer();
        comsumer.init();
        TestConsumer testConsumer = new TestConsumer();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
//        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
//        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
//        new Thread(testConsumer.new ConsumerMq(comsumer)).start();
    }

    private class ConsumerMq implements Runnable{
        Comsumer comsumer;
        public ConsumerMq(Comsumer comsumer){
            this.comsumer = comsumer;
        }

        @Override
        public void run() {
            while(true){
                try {
                    comsumer.getMessage("Zero-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
