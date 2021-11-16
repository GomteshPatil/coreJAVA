package com.xworkz.dp.dto;

public class BusDriverDTO {

	private String state;
	private String name;
	private String location;
	private float starttime;
	private String depo;
	private String busCompany;
	private boolean affordable;

	public BusDriverDTO() {

		System.out.println("Invoked no-arg const");
	}

	public BusDriverDTO(String state, String name, String location, float starttime, String depo, String busCompany,
			boolean affordable) {
		super();
		this.state = state;
		this.name = name;
		this.location = location;
		this.starttime = starttime;
		this.depo = depo;
		this.busCompany = busCompany;
		this.affordable = affordable;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getStarttime() {
		return starttime;
	}

	public void setStarttime(float starttime) {
		this.starttime = starttime;
	}

	public String getDepo() {
		return depo;
	}

	public void setDepo(String depo) {
		this.depo = depo;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public boolean isAffordable() {
		return affordable;
	}

	public void setAffordable(boolean affordable) {
		this.affordable = affordable;
	}

}
