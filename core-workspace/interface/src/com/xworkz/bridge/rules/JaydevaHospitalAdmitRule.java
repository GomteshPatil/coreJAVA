package com.xworkz.bridge.rules;

public class JaydevaHospitalAdmitRule implements HospitalAdmitRule {

	@Override
	public String register() {
		//System.out.println(" patient is Regestered ");
		return "Ramesh";
	}

	@Override
	public double payAdvance() {
		//System.out.println("advance paid by the patient ");
		return 19400.40D;
	}

	@Override
	public boolean validInsurance() {
		//System.out.println("yes patient has insurance");
		return false;
	}

}
