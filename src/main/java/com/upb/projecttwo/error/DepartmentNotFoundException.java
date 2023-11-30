package com.upb.projecttwo.error;

public class DepartmentNotFoundException extends RuntimeException{
    
    public DepartmentNotFoundException(String message){
        super(message);
    }
}
