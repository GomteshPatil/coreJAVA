package com.xworkz.chocolate.operations;

public class Resort {

	private String place;
	private String[] resortName = new String[5];
	private int count = 0;

	public Resort() {
		this("madakeri");
	}

	public Resort(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void addResortName(String gp) {
		if (count < resortName.length) {
			this.resortName[count] = gp;
			count++;
		} else {
			System.err.println("error : The array is full cant add");
		}
	}

	public void displayResortNames() {
		for (int i = 0; i < resortName.length; i++) {
			System.out.println("Resort Name : ".concat(resortName[i]));
		}
	}

}
