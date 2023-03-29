package com.ferhat.employeeApp.exception;


/**
 * @author Ferhat on 3/26/2023
 * @project employeeApp
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
