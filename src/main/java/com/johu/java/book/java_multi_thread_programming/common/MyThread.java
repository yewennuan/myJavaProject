package com.johu.java.book.java_multi_thread_programming.common;

/**
 * Created by yewen on 2017/8/6.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i =0;i<500000;i++){
            System.out.println(i);
        }
    }
}
