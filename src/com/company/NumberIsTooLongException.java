package com.company;

public class NumberIsTooLongException extends Exception {
    public NumberIsTooLongException(String message) {
        super(message);
    }
}