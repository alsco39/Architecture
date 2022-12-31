package com.example.hexagonalarchitecture.domain.user.persistence.entity;

import com.example.hexagonalarchitecture.global.entity.BaseUUIDEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "user")
public class UserEntity extends BaseUUIDEntity {

    @Column(columnDefinition = "VARCHAR(256)", nullable = false)
    private String email;

    @Column(columnDefinition = "VARCHAR(256)", nullable = false)
    private String password;
}
