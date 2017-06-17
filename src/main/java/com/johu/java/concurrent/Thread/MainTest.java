package com.johu.java.concurrent.Thread;

/**
 * Created by yewen on 2017/5/30.
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());


    }
}
