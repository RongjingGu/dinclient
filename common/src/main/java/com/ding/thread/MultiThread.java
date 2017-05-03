package com.ding.thread;

/**
 * Created by Gurongjing on 2017/5/3.
 * Huifang Company
 */
public class MultiThread {

    private final static Integer MAX_PRODUCT = 30;
    private final static Integer MIN_PRODUCT = 5;
    private Integer product = 0;

    public synchronized void pruduce() {
        try {
            if (this.product > MAX_PRODUCT) {
                System.out.println("产品已经满了");
                wait();
                return;
            }
            this.product++;
            Thread.sleep(500);
            System.out.println("生产者生产第" + this.product + "个产品.");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consum() {
        try {
            if (this.product <= MIN_PRODUCT) {
                System.out.println("缺货稍后再取！");
                wait();
                return;
            }
            Thread.sleep(100);
            System.out.println("消费者取走了第" + this.product + "个产品.");
            this.product--;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

}
