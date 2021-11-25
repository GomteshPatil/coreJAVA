package com.xworkz.main.constants;

public class AirportDTO {

	private String airportName;
	private String planeName;
	private String location;
	private String type;

	public AirportDTO() {
		System.out.println("Invoked no-arg const of airport dto");
	}

	public AirportDTO(String airportName, String planeName, String location, String type) {

		this.airportName = airportName;
		this.planeName = planeName;
		this.location = location;
		this.type = type;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
