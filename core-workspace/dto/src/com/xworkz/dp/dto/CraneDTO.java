package com.xworkz.dp.dto;

public class CraneDTO {

	private String company;
	private String purpose;
	private float hight;
	private String colour;
	private float lengthOfArm;
	private int noOfOperators;
	private int maintanceNeeded;
	private float waightCapacity;

	public CraneDTO() {
		System.out.println("Invoked no-arg const");
	}

	public CraneDTO(String company, String purpose, float hight, float lengthOfArm, int noOfOperators,
			int maintanceNeeded,float waightCapacity, String colour) {
		
		this.company = company;
		this.purpose = purpose;
		this.hight = hight;
		this.colour = colour;
		this.lengthOfArm = lengthOfArm;
		this.noOfOperators = noOfOperators;
		this.maintanceNeeded = maintanceNeeded;
		this.waightCapacity = waightCapacity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getLengthOfArm() {
		return lengthOfArm;
	}

	public void setLengthOfArm(float lengthOfArm) {
		this.lengthOfArm = lengthOfArm;
	}

	public int getNoOfOperators() {
		return noOfOperators;
	}

	public void setNoOfOperators(int noOfOperators) {
		this.noOfOperators = noOfOperators;
	}

	public int getMaintanceNeeded() {
		return maintanceNeeded;
	}

	public void setMaintanceNeeded(int maintanceNeeded) {
		this.maintanceNeeded = maintanceNeeded;
	}

	public float getWaightCapacity() {
		return waightCapacity;
	}

	public void setWaightCapacity(float waightCapacity) {
		this.waightCapacity = waightCapacity;
	}

}
