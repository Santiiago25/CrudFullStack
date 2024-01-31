package com.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice //clase interceptor para todas las peticiones que haga el cliente
public class GlobalExceptionHandler {

    @ExceptionHandler(ResorceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResorceNotFoundException resorceNotFoundException,
                                                                        WebRequest webRequest){
        ErrorDetails error = new ErrorDetails(
                LocalDateTime.now(),
                resorceNotFoundException.getMessage(),
                webRequest.getDescription(false),
                "NOT FOUND"
                );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }



}
