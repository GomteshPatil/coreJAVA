package com.xworkz.dp.dto;

public class ArmyDTO {

	private String country;
	private int militaryPersonnels;
	private int noOfFiterJet;
	private boolean aircraftCarriour;
	private int noOfTanks;
	private String specialForce;

	public ArmyDTO() {

	}

	public ArmyDTO(String country, int militaryPersonnels, int noOfFiterJet, boolean aircraftCarriour, int noOfTanks,
			String specialForce) {
		super();
		this.country = country;
		this.militaryPersonnels = militaryPersonnels;
		this.noOfFiterJet = noOfFiterJet;
		this.aircraftCarriour = aircraftCarriour;
		this.noOfTanks = noOfTanks;
		this.specialForce = specialForce;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMilitaryPersonnels() {
		return militaryPersonnels;
	}

	public void setMilitaryPersonnels(int militaryPersonnels) {
		this.militaryPersonnels = militaryPersonnels;
	}

	public int getNoOfFiterJet() {
		return noOfFiterJet;
	}

	public void setNoOfFiterJet(int noOfFiterJet) {
		this.noOfFiterJet = noOfFiterJet;
	}

	public boolean isAircraftCarriour() {
		return aircraftCarriour;
	}

	public void setAircraftCarriour(boolean aircraftCarriour) {
		this.aircraftCarriour = aircraftCarriour;
	}

	public int getNoOfTanks() {
		return noOfTanks;
	}

	public void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	public String getSpecialForce() {
		return specialForce;
	}

	public void setSpecialForce(String specialForce) {
		this.specialForce = specialForce;
	}

}
