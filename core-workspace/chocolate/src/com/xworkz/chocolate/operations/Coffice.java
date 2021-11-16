package com.xworkz.chocolate.operations;

public class Coffice {

	private String[] cofficeBrands = new String[6];
	private int count = 0;

	public String[] getCofficeBrand() {
		return cofficeBrands;
	}

	public void addCofficeBrand(String name) {
		if (this.count < this.cofficeBrands.length) {
			this.cofficeBrands[count] = name;
			System.out.println("passed arg :-->".concat(name));
			count++;
		} else {
			System.err.println("Error : The array is full can not add more Brabds");
		}
	}

	public void deleteCofficeBrand(int index) {

		if (index >= 0 && index < this.cofficeBrands.length) {
			this.cofficeBrands[index] = null;
			System.out.println("deleted index is :-->".concat(String.valueOf(index)));
		} else {
			System.err.println("can not abele to delete");
		}
	}

	public void updateCofficeBrand(int no, String coffice) {

		if (no >= 0 && no < cofficeBrands.length) {
			this.cofficeBrands[no] = coffice;
			System.out.println("Coffice Brand updated at index :--> "
					.concat(String.valueOf(no).concat(" and updated value is : ".concat(coffice))));
		} else {
			System.err.println("Error : unable to update the value at given index");
		}

	}
}
