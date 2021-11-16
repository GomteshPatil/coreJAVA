package com.xworkz.inheritance.shop;

/**
 * 
 * @author Gomtesh Patil
 *
 *         About this class--->this is the child class of Saloon and it inherits
 *         all properties and states of parent class
 */
public class NaturalSaloons extends Saloon {

	public String name;
	public int noOfHajamas;

	public NaturalSaloons() {
		this("Owner-amit",10);
		System.out.println("Invoked NaturalSaloon child class no arg const");
	}

	public NaturalSaloons(String name,int noOfHajamas) {
		super();
		System.out.println("Invoked Natural Saloon parametarized const");
		this.name = name;
		this.noOfHajamas=noOfHajamas;
	}
}
