package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.FishType;

public class Fish {

	private String name;
	private Float price;
	private String colour;
	private FishType type;

	public Fish() {
		System.out.println("Invoked Fish no-arg const");
	}

	public Fish(String name, Float price, String colour, FishType type) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Fish");
		return "Fish toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Fish");
		return 23;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof Fish) {
				Fish casted = (Fish) obj;
				String colourToCheck = casted.getColour();
				String nameToCheck = casted.getName();
				if (this.colour.equals(colourToCheck) && this.name.equals(nameToCheck)) {
					System.out.println("The fish you looking is found");
					return true;

				}
				else{
					System.err.println("Fish not found");
					}
			} else {
				System.err.println("You are not passing the fish data type");
			}
		} else {
			System.err.println("You passing null need to pass Fish");
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

}
