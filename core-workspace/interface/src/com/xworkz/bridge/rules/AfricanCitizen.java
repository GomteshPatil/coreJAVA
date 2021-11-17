package com.xworkz.bridge.rules;

import com.xworkz.bridge.constants.Adress;

public class AfricanCitizen implements VotingRule,TrafficRule,MarriageRule{
	
	@Override
	public boolean validAge(char gender, int age) {
		System.out.println("Invoked validAge from interface MarriageRule");
		if (age >=18) {
			return true;
		}
		return false;
	}

	@Override
	public String licenseNo() {
		System.out.println("Invoked licenseNo from interface TrafficRule");
		return "DL12294831";
	}

	@Override
	public boolean validlicenseNo() {
		System.out.println("Invoked validlicenseNo from interface TrafficRule");
		return false;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked validInsurance from interface TrafficRule");
		return false;
	}

	@Override
	public int votingAge() {
		System.out.println("Invoked votingAge from interface VotingRule");

		return 18;
	}

	@Override
	public String validId() {
		System.out.println("Invoked volidId from interface VotingRule");
		return "Rock";
	}

}
