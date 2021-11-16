package com.xworkz.chocolate.operations;

public class WterFall {

	private String nation;
	private String[] waterFall = new String[5];
	private int waterFalNo = 0;

	public WterFall() {
		this("INDIA");
	}

	public WterFall(String nation) {
		this.nation = nation;
	}

	public void addWaterFalls(String name) {
		if (waterFalNo < waterFall.length) {
			this.waterFall[waterFalNo] = name;
			waterFalNo++;
		}
	}

	public void displayWaterFallName() {

		for (int i = 0; i < waterFall.length; i++) {
			System.out.println("Water fall name : " + waterFall[i]);
		}

	}

	public String getNation() {
		return nation;
	}
}
