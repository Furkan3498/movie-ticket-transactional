package com.movie.booking.exception;

public class InsufficentBalanceError extends RuntimeException{
    public InsufficentBalanceError(String message){
        super(message);
    }
}
