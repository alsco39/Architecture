package com.example.hexagonalarchitecture.global.annotation.config;

import com.example.hexagonalarchitecture.annotation.ReadOnlyUseCase;
import com.example.hexagonalarchitecture.annotation.UseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.Filter;

@Configuration
@ComponentScan (
        basePackages = {"com.example.hexagonalarchitecture"},
        includeFilters = {
                @Filter(
                        type = FilterType.ANNOTATION,
                        value = UseCase.class
                ),
                @Filter(
                        type = FilterType.ANNOTATION,
                        value = ReadOnlyUseCase.class
                )
        }
)
public class AnnotationConfig {
}
