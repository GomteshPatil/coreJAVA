package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.BagColour;

public class Bag {

	private Float price;
	private BagColour bagColour;
	private Integer section;

	public Bag() {
		System.out.println("Invoked bag no-arg const");
	}

	public Bag(float price, BagColour bagColour, Integer section) {
		super();
		this.price = price;
		this.bagColour = bagColour;
		this.section = section;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Bag");
		return "Bag toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Bag");
		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Bag) {
				System.out.println("ref that you passed is Bag type");
				Bag casted = (Bag) obj;
				Float priceToCheck = casted.getPrice();
				BagColour colourToCheck = casted.getBagColour();
				if (this.price.equals(priceToCheck) && this.bagColour.equals(colourToCheck)) {
					System.out.println("Bag is found");
					return true;
				} else {
					System.err.println("Bag miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of Bag type");
			}
		} else {
			System.err.println("You passing null");
		}
		return false;
	}

	public float getPrice() {
		return price;
	}

	public BagColour getBagColour() {
		return bagColour;
	}

	public Integer getSection() {
		return section;
	}

}
