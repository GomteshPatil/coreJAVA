package com.xworkz.main.createEvent;

import com.xworkz.main.exception.EmailValidationException;
import com.xworkz.main.exception.EmailValidationRuntimeException;

public class EmailOperator {

	private String[] emails = new String[5];
	private int counter = 0;

	public void save(String mail) throws EmailValidationException {
		System.out.println("Invoked Save method from email operator");
		if (mail != null && counter <= this.emails.length) {
			if (mail.contains("@") && mail.endsWith(".com") || mail.endsWith(".in")) {
				this.emails[this.counter++] = mail;
			} else {
				throw new EmailValidationException("You are not passing valid email format");
			}

		} else {
			//System.err.println("either array is full or you passing null");
			throw new EmailValidationRuntimeException("Your array can only store 7 emails");
			
		}
	}

}
