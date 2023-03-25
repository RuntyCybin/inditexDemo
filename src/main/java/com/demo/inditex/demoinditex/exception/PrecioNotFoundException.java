package com.demo.inditex.demoinditex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PrecioNotFoundException extends Exception {
    public PrecioNotFoundException(String message) {
        super(message);
    }
}
