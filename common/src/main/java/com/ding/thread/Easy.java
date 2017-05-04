package com.ding.thread;

/**
 * Created by Gurongjing on 2017/5/3.
 * HUIFANG COMPANY
 */
public class Easy {
    public static void main(String[] args) throws InterruptedException{
        SingletonTest s = SingletonTest.getInstance();
        SingletonTest s1 = SingletonTest.getInstance();
        System.out.println(s==s1);
    }
}
