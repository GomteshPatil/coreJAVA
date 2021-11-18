package com.xworkz.bridge.constants;

import com.xworkz.bridge.rules.LibrayRule;

public class LibrayAssociation {

	private String name;
	private LibrayRule librayRule;

	public LibrayAssociation(String name) {
		this.name = name;
	}

	public void setLibrayRule(LibrayRule librayRule) {
		this.librayRule = librayRule;
	}

	public void lendBook() { /*
								 * method to provide the rules for implimentation class by using the functions
								 * of librayRule interface
								 */
		System.out.println("Invoked method lend book");

		double regester = this.librayRule.regesterationFees();
		System.out.println(regester + " Regestered for libray");

		if (this.librayRule != null) {

			String id = this.librayRule.idCard();
			double start = this.librayRule.startTime();
			double rerurnBook = this.librayRule.returnTime();
			if (id != null) {
				System.out.println("Id of user is : ".concat(id));
				System.out.println("start time :".concat(String.valueOf(start)));
				System.out.println("return time :".concat(String.valueOf(rerurnBook)));
			} else {
				System.err.println("the id is not present or passing null");
			}
		} else {
			System.err.println("First provide implimentation");
		}
	}

}
