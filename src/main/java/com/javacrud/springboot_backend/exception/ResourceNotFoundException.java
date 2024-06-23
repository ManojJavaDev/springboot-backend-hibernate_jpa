package com.javacrud.springboot_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldNAME;

    private String fieldValue;


    public ResourceNotFoundException(String message, String resourceName, String fieldNAME, String fieldValue) {
        super(String.format("%s not found with : '%s'  ",resourceName,fieldNAME,fieldValue));
        this.resourceName = resourceName;
        this.fieldNAME = fieldNAME;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldNAME() {
        return fieldNAME;
    }

    public String getFieldValue() {
        return fieldValue;
    }
}
