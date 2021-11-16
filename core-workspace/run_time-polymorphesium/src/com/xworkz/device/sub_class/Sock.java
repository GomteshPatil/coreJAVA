package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.IceCreamFlavour;
import com.xworkz.device.sub_class.constants.SockMaterial;
import com.xworkz.device.sub_class.constants.SockSize;
import com.xworkz.device.sub_class.constants.SockType;

public class Sock {

	private Float price;
	private SockSize size;
	private SockMaterial material;
	private SockType type;

	public Sock() {
		System.out.println("Invoked no arg const of Sock");
	}

	public Sock(Float price, SockSize size, SockMaterial material, SockType type) {
		super();
		this.price = price;
		this.size = size;
		this.material = material;
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Sock");
		return "Sock toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Sock");
		return 87;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Sock) {
				System.out.println("ref that you passed is Sock type");
				Sock casted = (Sock) obj;
				Float priceToCheck = casted.getPrice();
				SockSize sizeToCheck = casted.getSize();
				if (this.price.equals(priceToCheck) && this.size.equals(sizeToCheck)) {
					System.out.println("Sock is found");
					return true;
				} else {
					System.err.println("Sock miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of Sock type");
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

	public SockSize getSize() {
		return size;
	}

	public void setSize(SockSize size) {
		this.size = size;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
