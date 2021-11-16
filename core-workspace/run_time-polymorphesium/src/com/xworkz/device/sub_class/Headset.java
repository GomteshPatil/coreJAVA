package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.HeadsetType;

public class Headset {
	private String brand;
	private Float battary;
	private HeadsetType headsetType;
	private Float warranty;

	public Headset() {
		System.out.println("Invoked Headset no-arg const");
	}

	public Headset(String brand, float battary, HeadsetType headsetType, float warranty) {

		this.brand = brand;
		this.battary = battary;
		this.headsetType = headsetType;
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Headset");
		return "Headset toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Headset");
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Headset) {
				System.out.println("ref that you passed is Headset type");
				Headset casted = (Headset) obj;
				String brandCheck = casted.getBrand();
				Float warrantyCheck = casted.getWarranty();
				if (this.brand.equals(brandCheck) && this.warranty.equals(warrantyCheck)) {
					System.out.println("Headset is found");
					return true;
				} else {
					System.err.println("headset miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of headset type");
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

	public float getBattary() {
		return battary;
	}

	public void setBattary(float battary) {
		this.battary = battary;
	}

	public HeadsetType getHeadsetType() {
		return headsetType;
	}

	public void setHeadsetType(HeadsetType headsetType) {
		this.headsetType = headsetType;
	}

	public float getWarranty() {
		return warranty;
	}

	public void setWarranty(Float warranty) {
		this.warranty = warranty;
	}

}
