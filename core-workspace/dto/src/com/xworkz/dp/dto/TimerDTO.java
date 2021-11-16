package com.xworkz.dp.dto;

public class TimerDTO {

	private float correctTime;
	private char degital;
	private boolean bell;
	private String brand;
	
	public TimerDTO() {
		System.out.println("invoked timer no-arg cinst");
		
	}

	public TimerDTO(float correctTime, char degital, boolean bell, String brand) {
		super();
		this.correctTime = correctTime;
		this.degital = degital;
		this.bell = bell;
		this.brand = brand;
	}

	public float getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(float correctTime) {
		this.correctTime = correctTime;
	}

	public char getDegital() {
		return degital;
	}

	public void setDegital(char degital) {
		this.degital = degital;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
}
