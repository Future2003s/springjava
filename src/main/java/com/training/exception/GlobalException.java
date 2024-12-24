package com.training.exception;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ErrorResponse handleValidException(MethodArgumentNotValidException ex, WebRequest request) {
        ErrorResponse error = ErrorResponse.builder()
                .code(409)
                .message(ex.getFieldError().getDefaultMessage())
                .build();
        return error;

    }
}
