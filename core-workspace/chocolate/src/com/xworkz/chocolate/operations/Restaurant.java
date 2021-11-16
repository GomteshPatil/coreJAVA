package com.xworkz.chocolate.operations;

public class Restaurant {
	private String restaurantName;
	private String[] foodMenu = new String[5];
	private int itemNo = 0;

	public Restaurant() {
		this("Costal Resto");
		System.out.println("invoked on-arg const");

	}

	public Restaurant(String restaurantName) {
		this.restaurantName = restaurantName;

	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void addFoodMenu(String name) {
		System.out.println("Arg passeed is : ".concat(name));
		if (itemNo < foodMenu.length) {
			this.foodMenu[itemNo] = name;
			itemNo++;
		} else {
			System.err.println("Error : The array is full can not add more items");
		}
	}

	public void displayFoodMenu() {
		System.out.println("display method is invoked");

		for (int Q = 0; Q < foodMenu.length; Q++) {
			System.out.println("Food item : " + foodMenu[Q]);
		}
	}

}
