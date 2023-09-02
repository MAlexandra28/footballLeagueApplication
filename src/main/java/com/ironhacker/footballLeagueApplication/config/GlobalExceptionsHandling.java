package com.ironhacker.footballLeagueApplication.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.servlet.function.ServerResponse.status;

@ControllerAdvice
public class GlobalExceptionsHandling {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleGlobalException(Exception exception){
        // Create a custom response entity or log the exception
        return ResponseEntity.status( HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
    }

}
