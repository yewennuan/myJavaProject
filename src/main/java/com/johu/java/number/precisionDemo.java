package com.johu.java.number;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * Created by johu on 17-7-19.
 */
public class precisionDemo {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("呵呵{0},{1}",Demo.HEHE,"gaga"));
        List<Long> list = Collections.emptyList();
        System.out.println(list.stream().mapToLong(x->x).sum());
    }
    enum Demo{
        HEHE(1);
        Demo(int value){
            this.value = value;
        }
        private Integer value;

        public Integer getValue() {
            return value;
        }
    }
}
