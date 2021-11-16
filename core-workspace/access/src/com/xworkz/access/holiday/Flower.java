package com.xworkz.access.holiday;

public class Flower {

	private String name="rose";
	public int totalFlowers;
	public static String colour;
	
	
	public String getName() {
	return name;
	}
	public  void setTotalFlowers(int totalFlowers) {
		this.totalFlowers=totalFlowers;
	}
	public void setColour(String colour) {
		Flower.colour = colour;
	}
	
	
}	
