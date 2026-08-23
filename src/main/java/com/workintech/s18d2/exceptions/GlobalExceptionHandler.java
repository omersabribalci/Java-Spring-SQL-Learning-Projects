package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<GroceryErrorResponce> handleException(PlantException groceryException) {
        GroceryErrorResponce errorResponse = new GroceryErrorResponce(
                groceryException.getStatus().value(),
                groceryException.getMessage(),
                System.currentTimeMillis()
        );

        return new ResponseEntity<>(errorResponse, groceryException.getStatus());
    }


    @ExceptionHandler
    public ResponseEntity<GroceryErrorResponce> handleException(Exception exception) {
        GroceryErrorResponce errorResponse = new GroceryErrorResponce(
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                System.currentTimeMillis()
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
