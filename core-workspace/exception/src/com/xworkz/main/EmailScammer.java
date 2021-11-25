package com.xworkz.main;

import com.xworkz.main.createEvent.EmailOperator;
import com.xworkz.main.exception.EmailValidationException;

public class EmailScammer {

	public static void main(String[] args) throws EmailValidationException {

		EmailOperator operator = new EmailOperator();
		operator.save("gomteshpatil009@Gmail.com");
		operator.save("gomteshpatil009@Gmail.com");
		operator.save("gomteshpatil009@Gmail.in");
		operator.save("gomteshpatil009@Gmail.com");
		operator.save("gomteshpatil009@Gmail.com");
		operator.save("gomteshpatil009@Gmail.com");



	}

}
