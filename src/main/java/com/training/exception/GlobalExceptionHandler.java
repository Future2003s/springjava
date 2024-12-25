package com.training.exception;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleValidException(MethodArgumentNotValidException ex, WebRequest ws) {
        ErrorResponse err = new ErrorResponse();
        err.setCode(409);
        err.setMessage(ex.getFieldError().getDefaultMessage());
        return err;
    }

}
