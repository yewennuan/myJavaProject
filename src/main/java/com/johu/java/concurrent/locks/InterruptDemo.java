package com.johu.java.concurrent.locks;

/**
 * Created by yewen on 2017/6/22.
 */
public class InterruptDemo {
    public static Thread thread;

    public static void main(String[] args) {
        thread = Thread.currentThread();
        thread.interrupt();
        System.out.println("hehe");
         new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    thread.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            System.out.println("我被中断了");
            e.printStackTrace();
        }
    }
}
