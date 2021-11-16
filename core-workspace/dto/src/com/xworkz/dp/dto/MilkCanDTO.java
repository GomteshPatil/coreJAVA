package com.xworkz.dp.dto;

public class MilkCanDTO {

	private float quantity;
	private String shape;
	private boolean quality;
	private String colour;
	private float price;

	public MilkCanDTO() {
		System.out.println("Invoked milkcan no-arg const");
	}

	public MilkCanDTO(float quantity, String shape, boolean quality, String colour, float price) {

		this.quantity = quantity;
		this.shape = shape;
		this.quality = quality;
		this.colour = colour;
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
