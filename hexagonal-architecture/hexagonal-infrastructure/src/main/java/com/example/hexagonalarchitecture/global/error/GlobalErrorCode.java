package com.example.hexagonalarchitecture.global.error;

import com.example.hexagonalarchitecture.error.ErrorProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum GlobalErrorCode implements ErrorProperty {

    INVALID_TOKEN(401, "토큰이 유효하지 않습니다."),

    INTERNAL_SERVER(500, "서버에러입니다.");

    private int status;
    private String message;
}
