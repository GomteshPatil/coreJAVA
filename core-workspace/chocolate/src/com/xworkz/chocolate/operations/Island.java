package com.xworkz.chocolate.operations;

public class Island {

	private String nation;
	private String[] islandName = new String[5];
	private int islandNo = 0;

	public Island() {
		this("INDIA");
	}

	public Island(String nation) {
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void addIslandName(String name) {
		if (islandNo < islandName.length) {
			this.islandName[islandNo] = name;
			islandNo++;
		}

	}

	public void displayIslandNames() {
		for (int i = 0; i < islandName.length; i++) {
			System.out.println("Island Name : " + islandName[i]);
		}
	}

}
