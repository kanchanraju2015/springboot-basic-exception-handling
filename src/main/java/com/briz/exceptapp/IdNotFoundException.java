package com.briz.exceptapp;

public class IdNotFoundException extends RuntimeException
{
	
String message;

public IdNotFoundException(String message) {
	super(message);// this also must be used 
	this.message = message;
}


	
	
}
