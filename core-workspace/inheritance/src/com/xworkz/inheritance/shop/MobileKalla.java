package com.xworkz.inheritance.shop;

import com.xworkz.inheritance.device.Kalla;

public class MobileKalla extends Kalla {

	public String nativePlace;

	public MobileKalla() {

		System.out.println("Invoked MobileKalla no-arg const");
	}

	public MobileKalla(String name, String area, float exp, int age, int noOfCases, String nativePlace) {
		super(name, area, exp, age, noOfCases);
		this.nativePlace = nativePlace;
	}

	@Override
	public String item() {
		System.out.println("Invoked item from Mobile Kalla class");
		return "Mobile";
	}

	@Override
	public void displyDetails() {
		super.displyDetails();
		System.out.println("Theaf native : "+this.nativePlace);
	}

}
