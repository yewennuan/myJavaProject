package com.johu.java.concurrent.Thread;

/**
 * Created by johu on 17-8-16.
 */
public class UncaugthExceptionhandlerDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            Integer i = null;
            System.out.println(i.toString());
        });
//        thread.setUncaughtExceptionHandler((x,y)->{
//            System.out.println("线程"+x.getName()+y.getMessage());
//            System.out.println(1);
//        });
        thread.start();
    }
}
