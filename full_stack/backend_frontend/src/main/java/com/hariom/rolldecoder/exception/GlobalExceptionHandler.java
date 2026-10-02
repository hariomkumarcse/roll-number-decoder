package com.hariom.rolldecoder.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Applies only to the REST API controller (RollNumberApiController).
 * The Thymeleaf view controller handles its own errors and re-renders index.html
 * with a friendly message instead of a raw JSON error body.
 */
@RestControllerAdvice(basePackages = "com.hariom.rolldecoder.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidRollNumberException.class)
    public ResponseEntity<Map<String, Object>> handleInvalidRollNumber(InvalidRollNumberException ex) {
        return ResponseEntity.badRequest().body(errorBody(ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericError(Exception ex) {
        return ResponseEntity.internalServerError().body(errorBody("Something went wrong while decoding the roll number."));
    }

    private Map<String, Object> errorBody(String message) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", message);
        return body;
    }
}
