package com.xworkz.main.exception;

public class EmailValidationRuntimeException extends RuntimeException{

	public EmailValidationRuntimeException() {
		super();
	}
	
	public EmailValidationRuntimeException(String msg) {
		super(msg);
	}
}
