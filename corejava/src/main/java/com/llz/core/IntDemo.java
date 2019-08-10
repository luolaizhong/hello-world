package com.llz.core;

/**
 * 理解四舍五入
 */
public class IntDemo {
    public static void main(String[] args) {
        //取整数部分
        System.out.println(5 / 2);  // 2
        System.out.println(-5 / 2); //-2
        System.out.println(5 / 4);  // 1
        System.out.println(-5 / 4); //-1

        System.out.println("====================");

        //向左取整，返回double类型
        System.out.println(Math.floor(2.4));    // 2.0
        System.out.println(Math.floor(-2.4));   //-3.0
        System.out.println(Math.floor(2.5));    // 2.0
        System.out.println(Math.floor(-2.5));   //-3.0

        System.out.println("====================");

        //相当于+0.5后向左取整，返回long类型
        System.out.println(Math.round(2.4));    // 2
        System.out.println(Math.round(-2.4));   //-2
        System.out.println(Math.round(2.5));    // 3
        System.out.println(Math.round(-2.5));   //-2

        System.out.println("====================");

        // 上面任何一种都不是四舍五入，真正的四舍五入是绝对值进行四舍五入，最后加上符号
        System.out.println(realRound(2.4));     // 2
        System.out.println(realRound(-2.4));    //-2
        System.out.println(realRound(2.5));     // 3
        System.out.println(realRound(-2.5));    //-3
    }

    /**
     * 真正的四舍五入
     *
     * @param d 小数
     * @return 整数
     */
    private static long realRound(double d) {
        if (d >= 0) {
            return Math.round(d);
        } else {
            return -Math.round(-d);
        }
    }
}
