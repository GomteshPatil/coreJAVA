package com.xworkz.device.sub_class;

public class Food {
	private String name;
	private Float price;
	private String quantity;
	private Boolean quality;

	public Food() {
		System.out.println("Invoked no arg food const");
	}

	public Food(String name, Float price, String quantity, Boolean quality) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Food");
		return "Food toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Food");
		return 3;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof Food) {
				Food casted = (Food) obj;
				Float priceToCheck = casted.getPrice();
				String nameToCheck = casted.getName();
				if (this.name.equals(nameToCheck) && this.price.equals(priceToCheck)) {
					System.out.println("The Food you looking is found");
					return true;
				} else {
					System.err.println("Food not found");
				}
			} else {
				System.err.println("You are not passing the Food data type");
			}
		} else {
			System.err.println("You passing null need to pass Food");
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Boolean getQuality() {
		return quality;
	}

	public void setQuality(Boolean quality) {
		this.quality = quality;
	}

}
