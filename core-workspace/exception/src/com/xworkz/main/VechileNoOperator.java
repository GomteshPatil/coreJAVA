package com.xworkz.main;

import com.xworkz.main.exception.VechileArrayFullRuntimeException;
import com.xworkz.main.exception.VechileValidationException;

public class VechileNoOperator {

	private String[] vechileNos = new String[5];
	private int counter = 0;

	public void save(String vechileNo) throws VechileValidationException {
		System.out.println("Invoked save method for vechile ");
		if (vechileNo != null && this.counter < this.vechileNos.length) {
			if (vechileNo.startsWith("KA")) {
				this.vechileNos[this.counter++] = vechileNo;
				System.out.println(vechileNo + " vachile no is saved at index " + this.counter);

			} else {
				throw new VechileValidationException("You are not passing valid format of vechile No");
			}
		} else {
			throw new VechileArrayFullRuntimeException("we can only store 5 vechile Nos");
		}
	}

}
