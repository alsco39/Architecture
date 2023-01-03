package com.example.hexagonalarchitecture.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HexagonalArchitectureException extends RuntimeException {

    private final ErrorProperty errorProperty;
}
