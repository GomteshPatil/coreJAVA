package com.xworkz.chocolate.operations;

public class GinCrud {

	private String[] ginName = new String[6];
	private float[] price = new float[6];
	private String ShopName;
	private int len = 0;

	public GinCrud() {
		this("Tonique");
		System.out.println("invoked no-arg const");
	}

	public GinCrud(String shopName) {
		this.ShopName = shopName;
		System.out.println("invoked parameterized const");
	}

	public String getShopName() {
		return ShopName;
	}

	public void addGinNames(String name) {
		System.out.println("arg passed is : ".concat(name));

		if (len < ginName.length) {
			this.ginName[len] = name;
			this.len++;
		} else {
			System.err.println("Error : The array is full no element can be added to this");
		}
	}

	public void displayGinNames() {

		System.out.println("invoked display method".concat("\n"));
		for (int gn = 0; gn < ginName.length; gn++) {
			System.out.println("Gin name : " + ginName[gn]);
		}

	}

	public void addGinprice() {
		System.out.println("invoked add price method");

	}

}
