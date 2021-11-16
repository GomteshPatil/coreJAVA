package com.xworkz.dp.dto;

public class BucketDTO {

	private String colour;
	private float size;
	private float price;
	private float maxWeight;
	private String company;
	
	public BucketDTO() {
		System.out.println("invoked  bucket no-arg const");
	}

	public BucketDTO(String colour, float size, float price, float maxWeight, String company) {
	
		this.colour = colour;
		this.size = size;
		this.price = price;
		this.maxWeight = maxWeight;
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setName(String colour) {
		this.colour = colour;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(float maxWeight) {
		this.maxWeight = maxWeight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
