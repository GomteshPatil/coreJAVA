package com.xworkz.inheritance.shop;

public class Saloon {

	public String name = "saloon name-naturals";
	public int noOfHajamas = 3;

	public Saloon() {
		//this("You look Great", 3);
		System.out.println("Invoked Saloon parent class no-arg const");
	}

	public Saloon(String name, int noOfHajamas) {
		super();
		System.out.println("Invoked Saloon parameterized constr");
		this.name = name;
		this.noOfHajamas = noOfHajamas;
	}
}
