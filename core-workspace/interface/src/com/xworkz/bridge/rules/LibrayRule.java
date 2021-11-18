package com.xworkz.bridge.rules;

public interface LibrayRule {

	String idCard();

	double startTime();

	double returnTime();
	
	float dueCharges();
	
	
	default float regesterationFees() {
		System.out.println("invoked regesteratin Fees");
		return 1240.00F;
	}
}
