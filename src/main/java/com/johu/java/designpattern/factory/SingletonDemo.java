package com.johu.java.designpattern.factory;

import java.util.Objects;

/**
 * Created by johu on 17-9-1.
 */
public class SingletonDemo  {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();
    }

}

//静态内部类,在线程调用该类方法前，会完成静态内部类的初始化，这个初始化会加锁，是线程安全的
class Singleton1{
    private static class LazyHolder{
        private static final Singleton1 INSTANCE = new Singleton1();
    }
    static Singleton1 getInstance(){
        return LazyHolder.INSTANCE;
    }
}

//懒汉式
class Singleton2{
    private static Singleton2 INSTANCE;

    static synchronized Singleton2 getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}

class Singleton3{
    private static Singleton3 INSTANCE = new Singleton3();

    static Singleton3 getInstance(){
        return INSTANCE;
    }
}

class Singleton4{
    private static volatile Singleton4 INSTANCE;
    static Singleton4 getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton4.class){
                if(INSTANCE==null){
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}


