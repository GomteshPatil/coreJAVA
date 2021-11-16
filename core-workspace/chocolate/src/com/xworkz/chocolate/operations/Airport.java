package com.xworkz.chocolate.operations;

public class Airport {

	private String country = "INDIA";
	private String[] airportNames = new String[6];
	private int airportNo = 0;

	public String getCountry() {
		return country;
	}

	public String[] getAirportNames() {
		return airportNames;
	}

	public void addAirportNames(String port) {
		if (airportNo < airportNames.length) {
			airportNames[airportNo++] = port;
			System.out.println("airport added is :-->".concat(port));
		} else {
			System.err.println("Error : The array is full cant add more airports");
		}
	}

	public void deleteAirportName(int rock) {

		if (rock >= 0 && rock < this.airportNames.length) {
			this.airportNames[rock] = null;
			System.out.println("deleted index is :-->".concat(String.valueOf(rock)));
		} else {
			System.err.println("Error : value at index ".concat(String.valueOf(rock)).concat(" not abale to delete"));
		}
	}

	public void updateAirportName(int mi, String name) {
		if (mi >= 0 && mi < airportNames.length) {
			airportNames[mi] = name;
			System.out.println("Airport name is updated at index :--> "
					.concat(String.valueOf(mi).concat(" and updated value is : ".concat(name))));
		} else {
			System.err.println("Error : unable to update the value at given index");
		}
	}

}
