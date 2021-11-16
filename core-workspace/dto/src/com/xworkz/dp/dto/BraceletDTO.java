package com.xworkz.dp.dto;

public class BraceletDTO {

	private String colour;
	private String material;
	private float price;
	private boolean gifted;
	private boolean gemUsed;
	
	public BraceletDTO() {
		System.out.println("Invoked BraceletDTO no-arg const");
	}

	public BraceletDTO(String colour, String material, float price, boolean gifted, boolean gemUsed) {
		super();
		this.colour = colour;
		this.material = material;
		this.price = price;
		this.gifted = gifted;
		this.gemUsed = gemUsed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

	public boolean isGemUsed() {
		return gemUsed;
	}

	public void setGemUsed(boolean gemUsed) {
		this.gemUsed = gemUsed;
	}
	
	
	
}
