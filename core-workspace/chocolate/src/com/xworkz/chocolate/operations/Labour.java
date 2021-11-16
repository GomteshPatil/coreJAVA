package com.xworkz.chocolate.operations;

public class Labour {

	private String company;
	private String[] labourname = new String[7];
	private int count = 0;

	public Labour() {
		this("X-workz");
	}

	public Labour(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public String[] getLabourname() {
		return labourname;
	}

	public void addLabourNames(String name) {

		System.out.println("Invoked the add  Method");
		if (this.count < this.labourname.length) {
			System.out.println("The arg passed is :--->".concat(name));
			labourname[this.count++] = name;
		} else {
			System.err.println("Error : Array is full cant add any more");
		}

	}

	public void deleteLabourName(int index) {
		
		if (index >= 0 && index < labourname.length) {
			this.labourname[index] = null;
			System.out.println("deleted index is :-->".concat(String.valueOf(index)));
		} 
		else {
			System.err.println("Error : value at index ".concat(String.valueOf(index)).concat(" not abale to delete"));
		}
	}

	public void updateLabourName(int no, String lbr) {
		
		if (no >= 0 && no < labourname.length) {
			this.labourname[no] = lbr;
		}
		else {
			System.err.println("Not abale to update index addeble up to ".concat(String.valueOf(labourname.length)));
		}
	}

}