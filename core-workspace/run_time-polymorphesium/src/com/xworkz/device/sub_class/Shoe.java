package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.ShoeSize;
import com.xworkz.device.sub_class.constants.SockSize;

public class Shoe {
	private String brand;
	private String colour;
	private Character gender;
	private ShoeSize size;

	public Shoe() {
		System.out.println("Invoked shoe no-arg const");
	}

	public Shoe(String brand, String colour, Character gender, ShoeSize size) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
	}
	
	@Override
	public String toString() {
		System.out.println("Invoked toString from Shoe");
		return "Shoe toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Shoe");
		return 78;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Shoe) {
				System.out.println("ref that you passed is Shoe type");
				Shoe casted = (Shoe) obj;
				String brandToCheck = casted.getBrand();
				String colourToCheck = casted.getColour();
				if (this.brand.equals(brandToCheck) && this.colour.equals(colourToCheck)) {
					System.out.println("Shoe is found");
					return true;
				} else {
					System.err.println("Shoe miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of Shoe type");
			}
		} else {
			System.err.println("You passing null");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public ShoeSize getSize() {
		return size;
	}

	public void setSize(ShoeSize size) {
		this.size = size;
	}
}
