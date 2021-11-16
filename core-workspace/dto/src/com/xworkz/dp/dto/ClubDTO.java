package com.xworkz.dp.dto;

public class ClubDTO {

	private int noOfPeaple;
	private int noOfBOttle;
	private float rating;
	private float entryPrice;
	private int noOfStaf;

	public ClubDTO() {
		System.out.println("Invoked club no-arg const");

	}

	public ClubDTO(int noOfPeaple, int noOfBOttle, float rating, float entryPrice, int noOfStaf) {
		super();
		this.noOfPeaple = noOfPeaple;
		this.noOfBOttle = noOfBOttle;
		this.rating = rating;
		this.entryPrice = entryPrice;
		this.noOfStaf = noOfStaf;
	}

	public int getNoOfPeaple() {
		return noOfPeaple;
	}

	public void setNoOfPeaple(int noOfPeaple) {
		this.noOfPeaple = noOfPeaple;
	}

	public int getNoOfBOttle() {
		return noOfBOttle;
	}

	public void setNoOfBOttle(int noOfBOttle) {
		this.noOfBOttle = noOfBOttle;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(float entryPrice) {
		this.entryPrice = entryPrice;
	}

	public int getNoOfStaf() {
		return noOfStaf;
	}

	public void setNoOfStaf(int noOfStaf) {
		this.noOfStaf = noOfStaf;
	}
	
}