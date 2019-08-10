package com.llz.core.exception;

/**
 * 自定义unchecked-exception(运行时异常)
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}
