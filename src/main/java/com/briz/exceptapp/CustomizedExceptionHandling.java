package com.briz.exceptapp;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<Object> handleIdNotFoundException(IdNotFoundException exception)
	{
        return new ResponseEntity<Object>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(EmployeeNameNotException.class)
    public ResponseEntity<Object> handleEmployeeNotException(EmployeeNameNotException e)
	{
        return new ResponseEntity<Object>("Employee Name Not Found", HttpStatus.BAD_REQUEST);
    }
	@ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<Object> handleCityNotFoundException(CityNotFoundException e1)
	{
        return new ResponseEntity<Object>("City Name Not Found", HttpStatus.BAD_REQUEST);
    }
	@ExceptionHandler(CityPresentException.class)
    public ResponseEntity<Object> handleCityPresentException(CityPresentException e2)
	{
        return new ResponseEntity<Object>("City Already Present ", HttpStatus.BAD_REQUEST);
    }
	@ExceptionHandler(IdPresentException.class)
    public ResponseEntity<Object> handleIdPresentException(IdPresentException exception)
	{
        return new ResponseEntity<Object>("Id Already Present ", HttpStatus.BAD_REQUEST);
    }
}
