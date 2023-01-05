package com.example.hexagonalarchitecture.global.property;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.Base64;

@Getter
@ConfigurationProperties("jwt")
@ConstructorBinding
public class JwtProperties {

    private final String secret;
    private final Long accessExp;
    private final Long refreshExp;

    public JwtProperties(String secret, Long accessExp, Long refreshExp) {
        this.secret = Base64.getEncoder().encodeToString(StringUtils.rightPad(secret, 256).getBytes());
        this.accessExp = accessExp * 1000;
        this.refreshExp = refreshExp * 1000;
    }
}
