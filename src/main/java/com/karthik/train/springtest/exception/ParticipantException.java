package com.karthik.train.springtest.exception;

public class ParticipantException extends RuntimeException{

    private String errorMessage;    

    public ParticipantException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
    
    
}
