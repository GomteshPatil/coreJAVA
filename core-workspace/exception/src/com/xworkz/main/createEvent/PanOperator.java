package com.xworkz.main.createEvent;

import com.xworkz.main.exception.PanCardArrayFullRuntimeException;
import com.xworkz.main.exception.PanCardValidationException;

public class PanOperator {

	private String[] panCards = new String[5];
	private int counter;

	public void save(String pan)throws PanCardValidationException {
		System.out.println("Invoked email save method");
		if (pan != null && this.counter < this.panCards.length) {
			if (pan.startsWith("AAAA") && pan.endsWith("F")) {
				this.panCards[this.counter++] = pan;
				System.out.println(pan +" is saved at index "+this.counter);
			} else {
				System.err.println("You are not passing correct format of pancard");
				throw new PanCardValidationException();
			}
		} else {
			System.err.println("Either the array is full or you passing null");
			throw new PanCardArrayFullRuntimeException();
		}
	}

}
