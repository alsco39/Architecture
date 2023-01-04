package com.example.hexagonalarchitecture.global.exception;

import com.example.hexagonalarchitecture.error.HexagonalArchitectureException;
import com.example.hexagonalarchitecture.global.error.GlobalErrorCode;

public class InternalServerErrorException extends HexagonalArchitectureException {

    public static final HexagonalArchitectureException EXCEPTION = new InternalServerErrorException();

    private InternalServerErrorException() {
        super(GlobalErrorCode.INTERNAL_SERVER);
    }
}
