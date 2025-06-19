package com.snowflakes.demo.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(int id)
    {
        System.out.println("employee id ," + id + " not found");
    }
}
