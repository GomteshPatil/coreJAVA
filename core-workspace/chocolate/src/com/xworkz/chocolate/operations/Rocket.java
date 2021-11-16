package com.xworkz.chocolate.operations;

public class Rocket {

	private String organization;
	private String[] rocketName = new String[5];
	private int rocketNo = 0;

	public Rocket() {
		this("ISRO");
	}

	public Rocket(String organization) {
		this.organization = organization;
	}

	public String getOrganization() {
		return organization;
	}

	public void addRocketNames(String name) {
		if (rocketNo < rocketName.length) {
			this.rocketName[rocketNo] = name;
			rocketNo++;
		} else {
			System.err.println("Error : The Array is full");
		}
	}

	public void displayRocketNames() {
		for (int i = 0; i < rocketName.length; i++) {
			System.out.println("Rocket Name:  " + rocketName[i]);
		}
	}

}
