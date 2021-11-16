package com.xworkz.inheritance.device;

public class Kalla {

	private String name;
	private String area;
	private float exp;
	private int age;
	private int noOfCases;

	public Kalla() {
		System.out.println("Invoked kalla no-arg const");
	}

	public Kalla(String name, String area, float exp, int age, int noOfCases) {
		super();
		this.name = name;
		this.area = area;
		this.exp = exp;
		this.age = age;
		this.noOfCases = noOfCases;
	}

	public String getName() {
		return name;
	}

	public String getArea() {
		return area;
	}

	public float getExp() {
		return exp;
	}

	public int getAge() {
		return age;
	}

	public int getNoOfCases() {
		return noOfCases;
	}

	public void robbary(String item) {
		System.out.println("Invoked method robbary from kalla");

		System.out.println("The robbed item is ".concat(item));

	}

	public String item() {
		System.out.println("Invoked method item from kalla");
		return "Laptop";
	}

	public void displyDetails() {
		System.out.println("Kalla name : " + this.name);
		System.out.println("Area : " + this.area);
		System.out.println("Exp in robbary : " + this.exp);
		System.out.println("Age : " + this.age);
		System.out.println("Total no of case : " + this.noOfCases);
	}

}
