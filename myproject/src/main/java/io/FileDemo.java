package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("myproject/src/main/resources/1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
