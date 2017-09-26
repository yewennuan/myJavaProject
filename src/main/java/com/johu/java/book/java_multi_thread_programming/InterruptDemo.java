package com.johu.java.book.java_multi_thread_programming;

import com.johu.java.book.java_multi_thread_programming.common.MyThread;

/**
 * Created by yewen on 2017/8/6.
 */
public class InterruptDemo {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止isInterrupted"+thread.isInterrupted());
            System.out.println("是否停止interrupted"+thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
