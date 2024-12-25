package com.training.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleValidException(MethodArgumentNotValidException ex, WebRequest ws) {
        String msgError = ex.getFieldError().getDefaultMessage();

        ErrorResponse err = ErrorResponse.builder()
                .code(HttpStatus.CONTINUE.value())
                .message(msgError)
                .build();
        return err;
    }

}
