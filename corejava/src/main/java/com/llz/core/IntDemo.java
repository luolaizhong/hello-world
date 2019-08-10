package com.llz.core;

/**
 * 理解四舍五入
 */
public class IntDemo {
    public static void main(String[] args) {
        //取整数部分
        System.out.println(5 / 2);
        System.out.println(-5 / 2);
        System.out.println(5 / 4);
        System.out.println(-5 / 4);

        System.out.println("====================");

        //向左取整，返回double类型
        System.out.println(Math.floor(2.4));
        System.out.println(Math.floor(-2.4));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.floor(-2.5));

        System.out.println("====================");

        //相当于+0.5后向左取整，返回long类型
        System.out.println(Math.round(2.4));
        System.out.println(Math.round(-2.4));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5));

        System.out.println("====================");

        // 而真正的四舍五入是不考虑符号进行四舍五入，上面任何一种都不是四舍五入
        System.out.println(realRound(2.4));
        System.out.println(realRound(-2.4));
        System.out.println(realRound(2.5));
        System.out.println(realRound(-2.5));
    }

    /**
     * 真正的四舍五入
     *
     * @param f 小数
     * @return 整数
     */
    private static long realRound(double f) {
        if (f >= 0) {
            return Math.round(f);
        } else {
            return -Math.round(-f);
        }
    }
}
