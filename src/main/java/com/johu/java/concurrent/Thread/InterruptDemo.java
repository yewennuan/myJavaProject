package com.johu.java.concurrent.Thread;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by johu on 17-6-5.
 */
public class InterruptDemo {
    public static void main(String[] args) {
//        Thread a  = new Thread(new ATask());
//        a.start();
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        a.stop();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Date start = calendar.getTime();
        System.out.println(start);
        calendar.add(Calendar.SECOND, -1);
        Date end = calendar.getTime();
        System.out.println(end);

    }

}
class ATask implements Runnable{

    private double d = 0.0;

    public void run() {
//死循环执行打印"I am running!" 和做消耗时间的浮点计算
        try {
            while (true) {
                System.out.println("I am running!");

                for (int i = 0; i < 900000; i++) {
                    d = d + (Math.PI + Math.E) / d;
                }
//休眠一断时间,中断时会抛出InterruptedException
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("ATask.run() interrupted!");
        }
    }
}

