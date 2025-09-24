package com.example.crud.infra;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Exception {

    @JsonProperty("message")
    private final String message;

    @JsonProperty("status")
    private final Integer status;

    public Exception(String message, Integer status) {
        this.message = message;
        this.status = status;
    }
}
