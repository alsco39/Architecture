package com.example.hexagonalarchitecture.global.error.filter;

import com.example.hexagonalarchitecture.error.ErrorProperty;
import com.example.hexagonalarchitecture.error.HexagonalArchitectureException;
import com.example.hexagonalarchitecture.global.error.ErrorResponse;
import com.example.hexagonalarchitecture.global.error.GlobalErrorCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RequiredArgsConstructor
public class GlobalErrorFilter extends OncePerRequestFilter {

    private final ObjectMapper objectMapper;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws IOException {

        try {
            filterChain.doFilter(request, response);
        } catch (HexagonalArchitectureException e) {
            setErrorResponse(e.getErrorProperty(), response);
        } catch (Exception e) {
            e.printStackTrace(); // 에러 발생 근원지 단계별 출력
            setErrorResponse(GlobalErrorCode.INTERNAL_SERVER, response);
        }
    }

    private void setErrorResponse(ErrorProperty errorProperty, HttpServletResponse response) throws IOException {
        response.setStatus(errorProperty.getStatus());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name()); // StandardCharsets -> Charset 포함 할 상수를 정의
        response.getWriter().write(
                objectMapper.writeValueAsString(
                        new ErrorResponse(errorProperty)
                )
        );
    }
}
