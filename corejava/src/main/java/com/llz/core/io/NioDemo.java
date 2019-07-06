package com.llz.core.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static void main(String[] args) throws IOException {
        copy("myproject/src/main/resources/inputParam", "myproject/src/main/resources/outputParam");
    }

    public static void copy(String src, String dst) throws IOException {
        File inFile = new File(src);
        File outFile = new File(dst);

        FileInputStream in = new FileInputStream(inFile);
        FileOutputStream out = new FileOutputStream(outFile);

        FileChannel inChannel = in.getChannel();
        FileChannel outChannel = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        while ((inChannel.read(buffer)) != -1) {
            buffer.flip();

            outChannel.write(buffer);
            buffer.compact();
        }
        inChannel.close();
        outChannel.close();
        in.close();
        out.close();
    }
}
