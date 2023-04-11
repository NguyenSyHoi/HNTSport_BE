package com.example.ecommerce_be.base;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super((message));
    }
}
