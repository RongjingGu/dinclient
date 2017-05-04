package com.ding.thread;

/**
 * Created by Gurongjing on 2017/5/3.
 * Huifang Company
 */
public class main {

    public static void main(String[] args) {
        final MultiThread multiThread = new MultiThread();
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while(true){
                            multiThread.pruduce();}
                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        while (true){
                            multiThread.consum();}
                    }
                }
        );

        t1.start();
        t2.start();
    }

}
