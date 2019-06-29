package core;

import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(scan.nextByte());
        }
    }
}
