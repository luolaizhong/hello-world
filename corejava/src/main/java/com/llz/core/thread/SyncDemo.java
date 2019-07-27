package com.llz.core.thread;

/**
 * synchronized是可重入锁的demo
 */
public class SyncDemo {

    private int i;

    public SyncDemo(int i) {
        this.i = i;
    }


    private synchronized void print() {
        while (i < 10) {
            System.out.println(Thread.currentThread().getName() + ":" + (i++));
            print();
        }
    }

    class MyThread extends Thread {

        @Override
        public void run() {
            print();
        }

    }

    public static void main(String[] args) {
        MyThread mt = new SyncDemo(1).new MyThread();
        MyThread mt2 = new SyncDemo(1).new MyThread();
        mt.start();
        mt2.start();
    }
}
