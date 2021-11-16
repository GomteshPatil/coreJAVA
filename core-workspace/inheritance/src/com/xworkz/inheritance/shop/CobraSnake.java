package com.xworkz.inheritance.shop;

public class CobraSnake extends Snake {

	public String breed = "qq";
	public String food;
	public int noInDeadlySnakelist;

	public void hoodOrHede() {
		String breed = "XT";
		System.out.println("Invoked hood method from CobraSnake");
		System.out.println(super.breed);
		System.out.println(this.breed);
		System.out.println(breed);

	}

	public CobraSnake(int noInDeadlySnakelist) {
		// super("Indian cobra");
		System.out.println("Invoked int const from CobraSnake");

		this.noInDeadlySnakelist = noInDeadlySnakelist;
	}
	
	public void callSnake() {
		
		System.out.println(super.breed);
		System.out.println(super.venomous);
		System.out.println(super.foundInRegion);
		System.out.println();
		
	}

	public CobraSnake() {
		super("Indian cobra");
		System.out.println("Invoked CobraSnake no-arg const");

	}

}
