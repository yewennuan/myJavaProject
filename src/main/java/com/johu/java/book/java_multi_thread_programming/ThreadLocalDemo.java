package com.johu.java.book.java_multi_thread_programming;

/**
 * Created by yewen on 2017/8/14.
 */
public class ThreadLocalDemo {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        System.out.println( threadLocal.get());
         threadLocal.set(1);
        System.out.println(threadLocal.get());
        threadLocal.set(2);
        System.out.println(threadLocal.get());


    }
}
