package com.huang.myhouse.exception;

/**
 * 统一数据解析异常
 *
 * @author hsz
 */
public class DateParseException extends RuntimeException {
    public DateParseException(String msg) {
        super(msg);
    }
}
