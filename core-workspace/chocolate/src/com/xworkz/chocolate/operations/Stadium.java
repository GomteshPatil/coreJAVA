package com.xworkz.chocolate.operations;

public class Stadium {

	private String place = "INDIA";
	private String[] stadiumNames = new String[6];
	private int stadiumNo = 0;

	public String getPlace() {
		return place;
	}

	public String[] getStadiumNames() {
		return stadiumNames;
	}

	public void addStadiumNames(String name) {
		if (stadiumNo < stadiumNames.length) {
			stadiumNames[stadiumNo++] = name;
		} else {
			System.err.println("Error : The array is full can not");

		}
	}

	public void deleteStadiumName(int no) {
		if (no >= 0 && no < this.stadiumNames.length) {
			this.stadiumNames[no] = null;
			System.out.println("Deleted index".concat(String.valueOf(no)));
		} else {
			System.err.println("can not abele to delete");
		}
	}

	public void updateStadiumName(int ind, String std) {
		if (ind >= 0 && ind < stadiumNames.length) {
			stadiumNames[ind] = std;
System.out.println("new value added at index ".concat(String.valueOf(ind)).concat(" and the updated value is : ".concat(std)));
		} else {
			System.err.println("Not abale to update index addeble up to ".concat(String.valueOf(stadiumNames.length)));
		}
	}

}
