package com.app.sonatrach.exceptions;

import lombok.Getter;

import java.util.List;

public class InvalidEntityException extends RuntimeException{
    @Getter
    private List<String> errors;

    @Getter
    private ErrorCodes errorCode;

    public InvalidEntityException() {
    }

    public InvalidEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEntityException(String message, Throwable cause,ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public InvalidEntityException(String message, Throwable cause,ErrorCodes errorCode,List<String> errors) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errors = errors;
    }

    public InvalidEntityException(String message, ErrorCodes errorCode,List<String> errors) {
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
    }

    public InvalidEntityException(String message) {
        super(message);
    }

    public InvalidEntityException(String message,ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
