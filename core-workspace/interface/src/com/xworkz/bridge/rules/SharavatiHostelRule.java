package com.xworkz.bridge.rules;

public class SharavatiHostelRule implements HostelRule,Visitor{

	@Override
	public int intime() {
		System.out.println("Invoked imtime from Sharavati hostel rule");
		return 10;
	}

	@Override
	public String visitingDay() {
		System.out.println("Invoked visiting day ");
		return "Sundaty";
	}
	
	public int breakFaast() {
		System.out.println("Invoked breakfast time ");
		return 8;
	}

}
