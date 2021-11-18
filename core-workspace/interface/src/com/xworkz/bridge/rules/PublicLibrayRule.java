package com.xworkz.bridge.rules;

public class PublicLibrayRule implements LibrayRule {

	@Override
	public String idCard() {
		System.out.println("Invoked Id-card");
		return "4BB17ME005";
	}

	@Override
	public double startTime() {
		System.out.println("Invoked startTime");
		return 9.00;
	}

	@Override
	public double returnTime() {
		System.out.println("Invoked returnTime");
		return 16.00;
	}

	@Override
	public float dueCharges() {
		System.out.println("Invoked dueCharge");
		return 150;
	}

	@Override
	public float regesterationFees() {
		System.out.println("overrided regesteration Fees ");
		return LibrayRule.super.regesterationFees();
	}

}
