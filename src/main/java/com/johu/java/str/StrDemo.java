package com.johu.java.str;

/**
 * Created by johu on 17-8-14.
 */
public class StrDemo {
    public static void main(String[] args) {
        String str= "hehehe#{}";
        String str1 =str;
        str1 = str1.replaceFirst("#\\{\\}", "gaga");
        System.out.println(str);
        System.out.println(str1);
    }

}


