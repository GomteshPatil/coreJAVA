package com.xworkz.main;

import com.xworkz.main.createEvent.PanOperator;
import com.xworkz.main.exception.PanCardValidationException;

public class PanCardScammer {

	public static void main(String[] args) throws PanCardValidationException {
		
		PanOperator pan=new PanOperator();
		pan.save("AAAAA1212F");
		//pan.save("qqqqqqqqdd1w112");
		

	}

}
