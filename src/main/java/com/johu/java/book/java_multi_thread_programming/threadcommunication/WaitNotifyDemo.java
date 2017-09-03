package com.johu.java.book.java_multi_thread_programming.threadcommunication;

/**
 * Created by yewen on 2017/8/12.
 */

//单个消费这和生产者的时候，同步代码块里用 if 或者notify 也是可以的。
//多个消费者和多个生产者，同步代码块里一定要用while和 notifyAll，因为，
public class WaitNotifyDemo {

}

class ThreadA extends  Thread{
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {

        }catch (Exception e){

        }
    }
}
