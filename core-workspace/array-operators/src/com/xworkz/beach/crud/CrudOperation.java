package com.xworkz.beach.crud;

public class CrudOperation {

	private String country;
	private String[] beachNames = new String[5];
	private int count = 0;

	public CrudOperation() {
		this("INDIA");
		System.out.println("Invoked the public no-arg const");

	}

	public CrudOperation(String country) {
		System.out.println("Involed the paramiterized const");
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void addBeachName(String name) {
		System.out.println("The Add method is invoked");
		System.out.println("passed Arr is :".concat(name));

		if (this.count < 5) {
			this.beachNames[this.count] = name;
			this.count++;
		} else {
			System.err.println("Array is full");

		}
	}

	public void displayBeachNames() {
		System.out.println("Invoked Display BEach names");

		for (int no = 0; no < beachNames.length; no++) {
			System.out.println(beachNames[no]);
		}
	}

}
