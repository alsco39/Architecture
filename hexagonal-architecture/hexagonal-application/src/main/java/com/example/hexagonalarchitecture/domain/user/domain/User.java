package com.example.hexagonalarchitecture.domain.user.domain;

import com.example.hexagonalarchitecture.annotation.Aggregate;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@Aggregate
public class User {

    private final UUID id;

    private final String email;

    private final String password;
}
