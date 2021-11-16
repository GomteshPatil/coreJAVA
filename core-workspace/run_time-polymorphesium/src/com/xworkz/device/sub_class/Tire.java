package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.TireType;

public class Tire {
	private String brand;
	private Float price;
	private TireType type;

	public Tire() {
		System.out.println("Invoked tire no arg const");
	}

	public Tire(String brand, Float price, TireType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Tire");
		return "Tire toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Tire");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof Tire) {
				Tire casted = (Tire) obj;
				String brandToCheck = casted.getBrand();
				Float priceToCheck = casted.getPrice();
				if (this.brand.equals(brandToCheck) && this.price.equals(priceToCheck)) {
					System.out.println("The Tire you looking is found");
					return true;
				} else {
					System.err.println("Tire not found");
				}
			} else {
				System.err.println("You are not passing the Tire data type");
			}
		} else {
			System.err.println("You passing null need to pass Tire");
		}

		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public TireType getType() {
		return type;
	}

	public void setType(TireType type) {
		this.type = type;
	}
}
