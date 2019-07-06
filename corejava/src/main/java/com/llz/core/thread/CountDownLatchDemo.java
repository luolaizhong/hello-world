package com.llz.core.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 倒计时器演示
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        // 倒计时器
        CountDownLatch countDownLatch = new CountDownLatch(5);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            final int n = i + 1;
            executorService.execute(() -> {
                try {
                    Thread.sleep((long) (Math.random() * 1000 * 10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 计数器-1
                countDownLatch.countDown();
                System.out.println(n + " done");
            });
        }

        // 线程阻塞
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 倒计时结束，程序继续
        executorService.shutdown();
        System.out.println("all done!");

    }
}
