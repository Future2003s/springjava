package com.training.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;


@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class ResponseData<T> implements Serializable {
    final int status;
    final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    T data;
    
    public ResponseData(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
