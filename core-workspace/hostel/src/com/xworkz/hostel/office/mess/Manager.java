package com.xworkz.hostel.office.mess;

public class Manager {

	private String name;
	private int quartersRent;
	private float messExpences;
	private float currentBill;
	
	public int getQuartersRent() {
		return quartersRent;
	}

	public String getName() {
		return name;
	}
	
	public void setCurrentBill(float currentBill) {
		this.currentBill = currentBill;
	}
	
	public void setMessExpences(float messExpences) {
		this.messExpences = messExpences;
	}
	
	
	public float getMessExpences() {
		return messExpences;
	}
	
	public float getCurrentBill() {
		return currentBill;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuartersRent(int quartersRent) {
		this.quartersRent = quartersRent;
	}
	
	
	
}
