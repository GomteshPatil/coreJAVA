package com.xworkz.bridge;

import com.xworkz.bridge.constants.LibrayAssociation;
import com.xworkz.bridge.rules.LibrayRule;
import com.xworkz.bridge.rules.PublicLibrayRule;

public class LibrayScammer {

	public static void main(String[] args) {

		LibrayRule librayRule = new PublicLibrayRule(); // Instance of implimented class PublicLibrayRule which
														// impliments LibrayRule

		LibrayAssociation librayAssociation = new LibrayAssociation("Central"); // Libray Association making use of
																				// interface LibrayRules to provide
																				// rules
		librayAssociation.setLibrayRule(librayRule); // abstraction librayRule with the librayAssociation
		librayAssociation.lendBook();

	}

}
