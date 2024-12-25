package com.training.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseSuccess<T> extends ResponseEntity<ResponseSuccess.Payload<T>> {

    public ResponseSuccess(HttpStatus status, String message) {
        super(new Payload<T>(status.value(), message), status);
    }

    public ResponseSuccess(HttpStatus status, String message, T data) {
        super(new Payload<T>(status.value(), message, data), status);
    }


    @Getter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    @RequiredArgsConstructor
    public static class Payload<T> {
        final int status;
        final String message;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        T data;

        public Payload(int status, String message, T data) {
            this.status = status;
            this.message = message;
            this.data = data;
        }
    }
}
