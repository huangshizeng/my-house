package com.huang.myhouse.common;

import com.huang.myhouse.exception.DataNotFoundException;
import com.huang.myhouse.exception.DateParseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsz
 */

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ResponseResult handleMethodArgumentNotValid(Exception e) {
        log.error("handleMethodArgumentNotValid", e);
        return ResponseResult.error(ApiStatusCodeEnum.PARAM_IS_INVALID);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    protected ResponseResult handleInternalServerError(Exception e) {
        log.error("handleInternalServerError", e);
        return ResponseResult.error(ApiStatusCodeEnum.SYSTEM_INNER_ERROR);
    }

    @ExceptionHandler(value = AuthenticationException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    protected ResponseResult handleAuthenticationException(Exception e) {
        log.error("handleAuthenticationException", e);
        return ResponseResult.error(ApiStatusCodeEnum.PERMISSION_NO_ACCESS);
    }

    @ExceptionHandler(value = DataNotFoundException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    protected ResponseResult handleDataNotFoundException(Exception e) {
        log.error(e.getMessage());
        return ResponseResult.error(ApiStatusCodeEnum.RESULT_DATA_NONE.code(), e.getMessage());
    }

    @ExceptionHandler(value = DateParseException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    protected ResponseResult handleDateParseException(Exception e) {
        log.error(e.getMessage());
        return ResponseResult.error(ApiStatusCodeEnum.DATA_IS_WRONG);
    }
}
