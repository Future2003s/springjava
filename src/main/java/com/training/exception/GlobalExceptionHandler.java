package com.training.exception;


import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;

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


    @ExceptionHandler({CustomException.class, SQLException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handError(CustomException ex, WebRequest request) {
        String msgError = ex.getMessage();

        ErrorResponse err = ErrorResponse.builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(msgError)
                .build();
        return err;
    }


}
