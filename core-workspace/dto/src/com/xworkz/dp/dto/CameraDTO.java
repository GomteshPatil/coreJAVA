package com.xworkz.dp.dto;

public class CameraDTO {

	private String company;
	private String type;
	private float batteryCapacity;
	private float waight;
	private float pixel;
	private float cost;

	public CameraDTO() {
		System.out.println("Invoked camera no arg const");
	}

	public CameraDTO(String company, String type, float batteryCapacity, float waight, float pixel, float cost) {
		super();
		this.company = company;
		this.type = type;
		this.batteryCapacity = batteryCapacity;
		this.waight = waight;
		this.pixel = pixel;
		this.cost = cost;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getWaight() {
		return waight;
	}

	public void setWaight(float waight) {
		this.waight = waight;
	}

	public float getPixel() {
		return pixel;
	}

	public void setPixel(float pixel) {
		this.pixel = pixel;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
