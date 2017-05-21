package com.johu.java.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by yewen on 2017/5/16.
 */
public class AtomicDemo2 {
    static int[] value = new int[] { 1, 2 };
    static AtomicIntegerArray ai = new AtomicIntegerArray(value);
    public static void main(String[] args) {
        ai.getAndSet(0, 3);
        System.out.println(ai.get(0));
        System.out.println(value[0]);
    }

}
