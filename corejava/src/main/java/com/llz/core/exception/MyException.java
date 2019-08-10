package com.llz.core.exception;

/**
 * 自定义checked-exception（编译时异常）
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
