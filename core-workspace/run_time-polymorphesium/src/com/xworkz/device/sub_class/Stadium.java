package com.xworkz.device.sub_class;

public class Stadium {
	private String name;
	private String city;
	private Float area;

	public Stadium() {
		System.out.println("Invoked Stadium no-arg const");
	}

	public Stadium(String name, String city, Float area) {
		super();
		this.name = name;
		this.city = city;
		this.area = area;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Stadium");
		return "Stadium toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Stadium");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof Stadium) {
				Stadium casted = (Stadium) obj;
				String cityToCheck = casted.getCity();
				String nameToCheck = casted.getName();
				if (this.name.equals(nameToCheck) && this.city.equals(cityToCheck)) {
					System.out.println("The Stadium you looking is found");
					return true;
				} else {
					System.err.println("Stadium not found");
				}
			} else {
				System.err.println("You are not passing the Stadium data type");
			}
		} else {
			System.err.println("You passing null need to pass Stadium");
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Float getArea() {
		return area;
	}

	public void setArea(Float area) {
		this.area = area;
	}

}
