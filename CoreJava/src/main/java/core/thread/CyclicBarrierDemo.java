package core.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 循环栅栏
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        // 循环栅栏，每次集合5个。
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            final int n = i + 1;
            executorService.execute(() -> {
                try {
                    Thread.sleep((long) (Math.random() * 1000 * 5));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(n + "\t is ready.");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(n + "\t is running...");
            });
        }
        executorService.shutdown();
    }
}
