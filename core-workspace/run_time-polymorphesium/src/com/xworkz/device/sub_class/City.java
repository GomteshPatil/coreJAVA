package com.xworkz.device.sub_class;

public class City {
	private String name;
	private String stateName;
	private String countryName;

	public City() {
		System.out.println("Invoked City no arg const");
	}

	public City(String name, String stateName, String countryName) {
		super();
		this.name = name;
		this.stateName = stateName;
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from City");
		return "Stadium toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from City");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof City) {
				City casted = (City) obj;
				String stateToCheck = casted.getStateName();
				String nameToCheck = casted.getName();
				if (this.name.equals(nameToCheck) && this.stateName.equals(stateToCheck)) {
					System.out.println("The City you looking is found");
					return true;
				} else {
					System.err.println("City not found");
				}
			} else {
				System.err.println("You are not passing the City data type");
			}
		} else {
			System.err.println("You passing null need to pass City");
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
