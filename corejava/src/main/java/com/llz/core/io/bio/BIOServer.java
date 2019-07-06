package com.llz.core.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(50050);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream in = socket.getInputStream();
                byte[] buff = new byte[1024];
                int len;
                while ((len = in.read(buff)) != -1) {
                    System.out.println(new String(buff, 0, len));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
