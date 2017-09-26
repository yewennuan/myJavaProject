package com.johu.java.book.art_of_java_concurrency_programming;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by yewen on 2017/8/28.
 */
public class MultiThread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        Arrays.stream(threadInfos).forEach(x->{
            System.out.println(x.getThreadId()+x.getThreadName());
        });
    }
}
