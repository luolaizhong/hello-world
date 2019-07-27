package com.llz.core.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    private int i;
    private Lock lock;

    public LockDemo(int i, Lock lock) {
        this.i = i;
        this.lock = lock;
    }

    private void print() {
        while (i < 10) {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + ":" + (i++));
                print();
            } finally {
                lock.unlock();
            }
        }
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            print();
        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyThread mt1 = new LockDemo(1, lock).new MyThread();
        MyThread mt2 = new LockDemo(1, lock).new MyThread();

        mt1.start();
        mt2.start();
    }
}
