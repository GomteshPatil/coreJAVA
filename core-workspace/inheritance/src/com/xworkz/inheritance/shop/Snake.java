package com.xworkz.inheritance.shop;

public class Snake {

	public String breed = "ABC";
	boolean venomous;
	String foundInRegion;

	public Snake() {
		System.out.println("Invoked snake no-arg const");
	}

	public Snake(String breed) {
		System.out.println("Invoked string const");
		this.breed = breed;
	}

}
