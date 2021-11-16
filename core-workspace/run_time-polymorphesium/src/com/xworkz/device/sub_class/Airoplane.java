package com.xworkz.device.sub_class;

public class Airoplane {

	private String company;
	private int number;
	private String govt;

	public Airoplane() {
		System.out.println("Invoked airoplane no arg const");
	}

	public Airoplane(String company, int number, String govt) {
		super();
		this.company = company;
		this.number = number;
		this.govt = govt;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Airoplane");
		return "Airoplane toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Airoplane");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof Airoplane) {
				Airoplane casted = (Airoplane) obj;
				String companyToCheck = casted.getCompany();
				String govtToCheck = casted.getGovt();
				if (this.company.equals(companyToCheck) && this.govt.equals(govtToCheck)) {
					System.out.println("The Airoplane you looking is found");
					return true;
				} else {
					System.err.println("Airoplane not found");
				}
			} else {
				System.err.println("You are not passing the Airoplane data type");
			}
		} else {
			System.err.println("You passing null need to pass Airoplane");
		}

		return false;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}

}
