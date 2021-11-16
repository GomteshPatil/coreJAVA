package com.xworkz.dp.dto;

public class DressCodeDTO {

	private String material;
	private String size;
	private String colour;
	private float price;
	private char gender;

	public DressCodeDTO() {
		System.out.println("Invoked dress codeDTO no-arg const");
	}

	public DressCodeDTO(String material, String size, String colour, float price, char gender) {
		super();
		this.material = material;
		this.size = size;
		this.colour = colour;
		this.price = price;
		this.gender = gender;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
