package core.thread;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(Math.round(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1");
        });
        System.out.println("===t1===");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(Math.round(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2");
        });
        System.out.println("===t2===");

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(Math.round(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3");
        });
        System.out.println("===t3===");


        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
