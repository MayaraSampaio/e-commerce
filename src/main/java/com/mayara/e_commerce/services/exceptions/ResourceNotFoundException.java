package com.mayara.e_commerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
                super(message);
    }
}
