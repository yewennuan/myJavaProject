package com.johu.java.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yewen on 2017/5/15.
 */
public class AtomicDemo1 {
    private  AtomicInteger j = new AtomicInteger(0) ;
    private int k=0;

    public static void main(String[] args) {
        AtomicDemo1 atomicDemo1 = new AtomicDemo1();
        new Thread(()->{
            for(int i =0;i<1000000;i++){
                atomicDemo1.j.getAndIncrement();
                atomicDemo1.k++;
            }
        }).start();
        new Thread(()->{
            for(int i =0;i<1000000;i++){
                atomicDemo1.j.getAndIncrement();
                atomicDemo1.k++;
            }
        }).start();
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(atomicDemo1.j.get());
        System.out.println(atomicDemo1.k);

    }

}
