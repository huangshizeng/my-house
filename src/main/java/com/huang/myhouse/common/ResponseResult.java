package com.huang.myhouse.common;

import lombok.Builder;
import lombok.Data;

/**
 * @param <T>
 * @author hsz
 */

@Data
@Builder
public class ResponseResult<T> {
    private int code;
    private T data;
    private String msg;

    public static <T> ResponseResult<T> ok(T t) {
        return ResponseResult.<T>builder()
                .code(ApiStatusCodeEnum.SUCCESS.code())
                .msg(ApiStatusCodeEnum.SUCCESS.message())
                .data(t)
                .build();
    }

    public static ResponseResult error(ApiStatusCodeEnum apiStatusCodeEnum) {
        return ResponseResult.builder()
                .code(apiStatusCodeEnum.code())
                .msg(apiStatusCodeEnum.message())
                .build();
    }

    public static ResponseResult error(int code, String message) {
        return ResponseResult.builder()
                .code(code)
                .msg(message)
                .build();
    }

    /**
     * @param t 若是无需返回业务数据时，t统一为true
     */
    public static <T> ResponseResult<T> result(ApiStatusCodeEnum apiStatusCodeEnum, T t) {
        return ResponseResult.<T>builder()
                .code(apiStatusCodeEnum.code())
                .data(t)
                .msg(apiStatusCodeEnum.message())
                .build();
    }
}
