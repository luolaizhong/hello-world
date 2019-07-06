package com.llz.core.io.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOClient {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 10; i++) {
            final int n = i + 1;
            executorService.execute(() -> {
                OutputStream out = null;
                try {
                    Socket socket = new Socket("localhost", 50050);
                    out = socket.getOutputStream();
                    String str = n + " say hello world";
                    System.out.println(str);
                    out.write(str.getBytes("utf-8"));
                    out.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
