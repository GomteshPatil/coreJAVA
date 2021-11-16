package com.xworkz.dp.dto;

public class CircusDTO {

	private String owner;
	private float ticketPrice;
	private int noOfAnimals;
	private int noOfShowsInDay;
	private float showDuration;

	public CircusDTO() {
		System.out.println("Invoked circus no-arg const");
	}

	public CircusDTO(String owner, float ticketPrice, int noOfAnimals, int noOfShowsInDay, float showDuration) {

		this.owner = owner;
		this.ticketPrice = ticketPrice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShowsInDay = noOfShowsInDay;
		this.showDuration = showDuration;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public int getNoOfShowsInDay() {
		return noOfShowsInDay;
	}

	public void setNoOfShowsInDay(int noOfShowsInDay) {
		this.noOfShowsInDay = noOfShowsInDay;
	}

	public float getShowDuration() {
		return showDuration;
	}

	public void setShowDuration(float showDuration) {
		this.showDuration = showDuration;
	}

}
