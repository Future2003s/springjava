package com.training.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ResponseError extends ResponseEntity<ResponseError.Payload> {

    public ResponseError(HttpStatus status, String message) {
        super(new ResponseError.Payload(status.value(), message), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @FieldDefaults(level = AccessLevel.PRIVATE)
    @RequiredArgsConstructor
    @Getter
    public static class Payload {
        final int code;
        final String message;
        Object data;

        public Payload(int code, String message, Object data) {
            this.code = code;
            this.message = message;
            this.data = data;
        }
    }
}

