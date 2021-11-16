package com.xworkz.chocolate.operations;

public class CoolDrinks {

	private String drinkType;
	private String[] coolDrinkNames = new String[7];
	private int king = 0;

	public CoolDrinks() {
		this("CoolDrinks");
	}

	public CoolDrinks(String drinkType) {
		this.drinkType = drinkType;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public void addCoolDrinkNames(String name) {
		if (this.king < this.coolDrinkNames.length) {

			this.coolDrinkNames[this.king] = name;
			this.king++;
			System.out.println("invoked the add Method , Ver added : ".concat(name));

		} else {
			System.err.println("Error : the array is full cant add");
		}
	}

	public String[] getCoolDrinkNames() {
		return this.coolDrinkNames;
	}

	public void delete(int no) {

		if (no >= 0 && no < this.coolDrinkNames.length) {
			this.coolDrinkNames[no] = null;
			System.out.println("deleted index is : ".concat(String.valueOf(no)));

		} else {
			System.err.println("Error : Cant be deleted");
		}
	}

	public void update(int ind, String updatedRef) {

		if (ind >= 0 && ind < coolDrinkNames.length) {
			this.coolDrinkNames[ind] = updatedRef;
			System.out.println("New updated index is : ".concat(String.valueOf(ind)));

		} else {
			System.err.println("Error : Index cant be updated");
		}

	}

}
