package com.xworkz.chocolate.operations;

public class CrudChocolate {

	private String[] chocolateNames = new String[7];
	private String parentCompany;
	private int index = 0;

	public CrudChocolate() {
		this("Cadbury");
		System.out.println("invoked no-arg public const");
	}

	public CrudChocolate(String parentCompany) {
		this.parentCompany = parentCompany;
	}

	public String getParentCompany() {
		return parentCompany;
	}

	public void addChocolateName(String name) {
		System.out.println("Invoked addChocolate method");
		System.out.println("passed arrgument is ".concat(name));

		if (index < 7) {
			this.chocolateNames[index] = name;
			this.index++;
		} else {
			System.err.println("Error :the array is full");
		}

	}

	public void displayChocolateName() {
		for (int i = 0; i < chocolateNames.length; i++) {
			System.out.println(chocolateNames[i]);
		}
	}

}
