package com.xworkz.main.constants;

public class BusRouteDTO {
	private String busNo;
	private String startPoint;
	private String destination;
	private String driverName;

	public BusRouteDTO() {
		System.out.println("Invoked bus no-arg const");
	}

	public BusRouteDTO(String busNo, String startPoint, String destination, String driverName) {

		this.busNo = busNo;
		this.startPoint = startPoint;
		this.destination = destination;
		this.driverName = driverName;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
