package com.global.exception.handling.globalexception.exception;

import com.global.exception.handling.globalexception.dto.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class ProductExceptionHandler {
    @ExceptionHandler(value= ProductNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleProductNotFound(){
        ApiErrorResponse error= new ApiErrorResponse(400,"no productFound", new Date()) ;

return new ResponseEntity<ApiErrorResponse>(error,HttpStatus.NOT_FOUND);
    }
}
