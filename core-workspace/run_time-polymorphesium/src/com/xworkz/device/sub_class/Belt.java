package com.xworkz.device.sub_class;

public class Belt {
	
	private Float price;
	private String material;
	private Float size;
	private String gender;

	public Belt(Float price, String material, Float size, String gender) {
		super();
		this.price = price;
		this.material = material;
		this.size = size;
		this.gender = gender;
	}

	public Belt() {
		System.out.println("Invoked no arg const of belt");
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Belt");
		return "Belt toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Belt");
		return 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Shoe) {
				System.out.println("ref that you passed is Belt type");
				Belt casted = (Belt) obj;
				String materialToCheck = casted.getMaterial();
				Float priceToCheck = casted.getPrice();
				if (this.material.equals(materialToCheck) && this.price.equals(priceToCheck)) {
					System.out.println("Belt is found");
					return true;
				} else {
					System.err.println("Belt miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of Belt type");
			}
		} else {
			System.err.println("You passing null");
		}
		return false;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
