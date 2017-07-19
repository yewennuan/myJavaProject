package com.johu.java.concurrent.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yewen on 2017/5/30.
 */
public class MainTest {
    public static void main(String[] args) {
        Integer i = 1,j=2;
        System.out.println(i.doubleValue()/2);
        List<Integer> list = new ArrayList<>();
        int i1= list.stream().mapToInt(x->x).sum();
        System.out.println(i1);


    }
}
