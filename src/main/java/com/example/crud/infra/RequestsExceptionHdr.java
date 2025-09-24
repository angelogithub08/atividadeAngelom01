package com.example.crud.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RequestsExceptionHdr {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Exception> handleEntityNotFoundException() {
        Exception response = new Exception("Data not found with provided ID", 404);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
