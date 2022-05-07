package com.example.demo.customer;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(int id) {
        super("Could not find customer " + id);
    }
}
