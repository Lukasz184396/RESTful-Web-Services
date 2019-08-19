package com.zawadal.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsrNotFoundException extends RuntimeException {
    public UsrNotFoundException(String message) {
        super(message);
    }
}
