package com.example.hexagonalarchitecture.global.error;

import com.example.hexagonalarchitecture.error.ErrorProperty;
import lombok.Getter;

@Getter
public class ErrorResponse {
    private final int status;
    private final String message;


    public ErrorResponse(ErrorProperty errorProperty) {
        this.status = errorProperty.getStatus();
        this.message = errorProperty.getMessage();
    }
}
