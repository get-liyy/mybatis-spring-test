package com.liyy.mybatis.activemq;

/**
 * @ClassName: TestMq 
 * @Description: 生产者开始生产消息
 * @author: liyanyong
 * @date: 2018年3月28日 上午11:27:38
 */
public class TestMq {
	public static void main(String[] args){
        Producter producter = new Producter();
        producter.init();
        TestMq testMq = new TestMq();
        new Thread(testMq.new ProductorMq(producter)).start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //Thread 1
//        new Thread(testMq.new ProductorMq(producter)).start();
//        //Thread 2
//        new Thread(testMq.new ProductorMq(producter)).start();
//        //Thread 3
//        new Thread(testMq.new ProductorMq(producter)).start();
//        //Thread 4
//        new Thread(testMq.new ProductorMq(producter)).start();
//        //Thread 5
//        new Thread(testMq.new ProductorMq(producter)).start();
    }

    private class ProductorMq implements Runnable{
        Producter producter;
        public ProductorMq(Producter producter){
            this.producter = producter;
        }

        @Override
        public void run() {
            while(true){
                try {
                    producter.sendMessage("Zero-MQ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
