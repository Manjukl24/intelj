package com.exceptions.custom;

public class OutofLimitsException extends  Exception{
    public OutofLimitsException() {
    }

    public OutofLimitsException(String message) {
        super(message);
    }
}
