package com.snowflakes.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler (EmployeeNotFoundException.class)
    public ResponseEntity<Object> handleEmployeeNotFound(EmployeeNotFoundException ex)
    {
        Map<String,Object> errorBody = new HashMap<>();
        errorBody.put("timestamp", LocalDateTime.now());
        errorBody.put("status", HttpStatus.NOT_FOUND.value());
        errorBody.put("error", "Employee Not Found");
        errorBody.put("message", ex.getMessage());

        return  new ResponseEntity<>(errorBody , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlegenericException(Exception ex)
    {
        Map<String,Object> errorBody = new HashMap<>();
        errorBody.put("timestamp" ,org.joda.time.LocalDateTime.now());
        errorBody.put("status" , HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorBody.put("Error :" , "internal server Error");
        errorBody.put("message :" , ex.getMessage());

        return  new ResponseEntity<>(errorBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
