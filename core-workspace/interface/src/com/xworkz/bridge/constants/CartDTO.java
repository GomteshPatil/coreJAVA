package com.xworkz.bridge.constants;

public class CartDTO {

	private String name;
	private int quantity;
	private float price;
	private int totalItems;

	public CartDTO() {
		System.out.println("Invoked no-arg const of CartDTO");
	}

	public CartDTO(String name, int quantity, float price, int totalItems) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.totalItems = totalItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

}
