package core;

public class IntDemo {
    public static void main(String[] args) {
        //向右取整
        System.out.println(5 / 2);
        System.out.println(-5 / 2);

        //四舍五入，返回long类型
        System.out.println(Math.round(2.4));
        System.out.println(Math.round(-2.4));

        //向做取整，返回double类型
        System.out.println(Math.floor(2.4));
        System.out.println(Math.floor(-2.4));
    }
}
