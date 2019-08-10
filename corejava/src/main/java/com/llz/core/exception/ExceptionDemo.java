package com.llz.core.exception;

/**
 * 1、抛异常：方法上的throws的异常可以声明为方法体里面的throw的父异常，但真实抛出的仍然是方法体里面的子异常（类似多态的意思）
 * 2、捕获异常：自上而下的循序必须是  子异常 -> 父异常  (因为父异常可以捕获子异常，反之不成立)
 * 3、异常中断(发生异常时，下面的代码不再执行）例如test3()后，不再执行test4()
 * 1）未捕获异常
 * a)运行时异常
 * b)编译时异常，直接throws
 * 2)捕获异常，但是又重新throw/throws
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.test1();
        exceptionDemo.test2();
//        exceptionDemo.test3();
//        exceptionDemo.test4();
        exceptionDemo.test33();
        exceptionDemo.test44();
    }

    public void exception1() throws Exception {
        throw new MyException("MyException");
    }

    public void exception2() throws Exception {
        throw new Exception("exception");
    }

    public void exception3() {
        throw new MyRuntimeException("MyRuntimeException");
    }

    public void exception4() {
        throw new RuntimeException("RuntimeException");
    }

    /**
     * 捕获异常（子异常必须在父异常上面捕获）
     */
    public void test1() {
        try {
            exception1();
        } catch (MyRuntimeException e) {
            System.out.println("MyRuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (MyException e) {
            System.out.println("MyException:" + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Throwable:" + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 捕获异常（子异常必须在父异常上面捕获）
     */
    public void test2() {
        try {
            exception2();
        } catch (MyRuntimeException e) {
            System.out.println("MyRuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (MyException e) {
            System.out.println("MyException:" + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Throwable:" + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 运行时异常
     */
    public void test3() {
        exception3();
    }

    /**
     * 运行时异常
     */
    public void test4() {
        exception4();
    }

    /**
     * 捕获运行是异常
     */
    public void test33() {
        try {
            exception3();
        } catch (MyRuntimeException e) {
            System.out.println("MyRuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Throwable:" + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 捕获运行时异常
     */
    public void test44() {
        try {
            exception4();
        } catch (MyRuntimeException e) {
            System.out.println("MyRuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Throwable:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
