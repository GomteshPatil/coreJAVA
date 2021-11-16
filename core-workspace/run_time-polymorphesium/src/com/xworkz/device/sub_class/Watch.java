package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.Type;

public class Watch {
	private String brand;
	private float price;
	private Type watchType;

	public Watch() {
		System.out.println("Invoked no arg-const of watch");
	}

	public Watch(String brand, float price, Type watchType) {
		// System.out.println("Invoked parametarized const");
		this.brand = brand;
		this.price = price;
		this.watchType = watchType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Type getWatchType() {
		return watchType;
	}

	public void setWatchType(Type watchType) {
		this.watchType = watchType;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from watch");
		return "Watch-toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Watch");
		return 13;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("ref that you passed is not a null");
			if (obj instanceof Watch) {
				System.out.println("ref that you passed is watch type");
				Watch casted = (Watch) obj;
				String brantToCheck = casted.getBrand();
				Type typeToCheck = casted.getWatchType();
				if (this.brand.equals(brantToCheck) && this.watchType.equals(typeToCheck)) {
					System.out.println("Yes the watch that you are looking is found");
					return true;

				} else {
					System.err.println("either brand or the type of watch is not matching");
				}

			} else {
				System.err.println("The ref that you are passing is not of type Watch");
			}

		} else {
			System.err.println("you are passing null");
		}

		return false;
	}

}
