package com.ding.thread;

/**
 * Created by Gurongjing on 2017/5/3.
 * Huifang Company
 */
public class SingletonTest {
    private static SingletonTest ourInstance = new SingletonTest();

    public static SingletonTest getInstance() {
        return ourInstance;
    }

    private SingletonTest() {
    }
}
