package core.algorithm;

import java.util.Scanner;

/**
 * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
 * 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
 * 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
 * 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
 * 输入描述: 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
 * 输出描述: 输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。
 * 输入例子1: 10
 * 输出例子1: 12
 */
public class CoinDemo {

    private static String coinStr = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        String str = getCoinStr(n);
        System.out.println(str);
        printCoinStr(str);
    }


    public static String getCoinStr(long num) {
        long preNum;
        if (num % 2 == 1) {
            preNum = (num - 1) / 2;
            coinStr = "1" + coinStr;
        } else {
            preNum = (num - 2) / 2;
            coinStr = "2" + coinStr;
        }

        if (preNum > 0) {
            getCoinStr(preNum);
        }
        return coinStr;
    }

    public static void printCoinStr(String str) {
        int curNum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (num == 1) {
                System.out.println(curNum + " * 2 + 1 = " + (curNum * 2 + 1));
                curNum = curNum * 2 + 1;
            } else {
                System.out.println(curNum + " * 2 + 2 = " + (curNum * 2 + 2));
                curNum = curNum * 2 + 2;
            }
        }
    }
}
