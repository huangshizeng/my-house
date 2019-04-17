package com.huang.myhouse.exception;

/**
 * 统一未找到相关数据异常
 *
 * @author hsz
 */
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}
