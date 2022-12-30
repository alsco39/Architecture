package com.example.hexagonalarchitecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후 런타임 시기에도 JVM에 의해 참조가 가능 -> 리플렉션
@Target(ElementType.TYPE)
public @interface Aggregate {
}
