package com.xworkz.dp.dto;

public class MetroStationDTO {

	private String metroStationName;
	private String route;
	private boolean elevator;
	private float openTime;
	private float closeTime;

	public MetroStationDTO() {
		System.out.println("Invoked metrostation no-arg consty");
	}

	public MetroStationDTO(String metroStationName, String route, boolean elevator, float openTime, float closeTime) {
		super();
		this.metroStationName = metroStationName;
		this.route = route;
		this.elevator = elevator;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getMetroStationName() {
		return metroStationName;
	}

	public void setMetroStationName(String metroStationName) {
		this.metroStationName = metroStationName;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	public float getOpenTime() {
		return openTime;
	}

	public void setOpenTime(float openTime) {
		this.openTime = openTime;
	}

	public float getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(float closeTime) {
		this.closeTime = closeTime;
	}

}
