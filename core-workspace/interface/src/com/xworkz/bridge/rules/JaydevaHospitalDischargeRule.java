package com.xworkz.bridge.rules;

public class JaydevaHospitalDischargeRule implements HospitalDischargeRule {

	@Override
	public boolean payBill() {
		//System.out.println("implimented payBill from HospitalDischargeRule");
		return true;
	}

	@Override
	public double discount() {
		//System.out.println("Discount is provided to patient");
		return 1000.0D;
	}

}
