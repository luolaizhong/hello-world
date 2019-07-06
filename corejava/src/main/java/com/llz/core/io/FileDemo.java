package com.llz.core.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("corejava/src/main/resources/1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
