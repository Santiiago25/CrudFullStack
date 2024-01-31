package com.project.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResorceNotFoundException extends RuntimeException{

    private String message;

    public ResorceNotFoundException(String message){
        super(message);
        this.message = message;
    }


}
