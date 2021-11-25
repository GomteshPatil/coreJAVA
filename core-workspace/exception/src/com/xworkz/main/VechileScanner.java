package com.xworkz.main;

import com.xworkz.main.exception.VechileValidationException;

public class VechileScanner {

	public static void main(String[] args) throws VechileValidationException {
		
		VechileNoOperator vachile=new VechileNoOperator();
		vachile.save("KA23 1212");
		//vachile.save("MH23 1212");
		vachile.save(null);

	}

}
